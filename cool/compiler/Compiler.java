package cool.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cool.lexer.*;
import cool.parser.*;

import java.io.*;
import java.util.ArrayList;

public class Compiler {
    // Annotates class nodes with the names of files where they are defined.
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }

        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;

        // True if any lexical or syntax errors occur.
        boolean lexicalSyntaxErrors = false;

        // Parse each input file and build one big parse tree out of
        // individual parse trees.
        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);

            // Lexer
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);

            // Token stream
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);

            // Test lexer only.
            // tokenStream.fill();
            // List<Token> tokens = tokenStream.getTokens();
            // tokens.stream().forEach(token -> {
            // var text = token.getText();
            // var name = CoolLexer.VOCABULARY.getSymbolicName(token.getType());

            // System.out.println(text + " : " + name);
            // // System.out.println(token);
            // });

            // Parser
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);

            // Customized error listener, for including file names in error
            // messages.
            var errorListener = new BaseErrorListener() {
                public boolean errors = false;

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                        Object offendingSymbol,
                        int line, int charPositionInLine,
                        String msg,
                        RecognitionException e) {
                    String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                            line + ":" + (charPositionInLine + 1) + ", ";

                    Token token = (Token) offendingSymbol;
                    if (token.getType() == CoolLexer.ERROR)
                        newMsg += "Lexical error: " + token.getText();
                    else
                        newMsg += "Syntax error: " + msg;

                    System.err.println(newMsg);
                    errors = true;
                }
            };

            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Actual parsing
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                // Add the current parse tree's children to the global tree.
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));

            // Annotate class nodes with file names, to be used later
            // in semantic error messages.
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                // The only ParserRuleContext children of the program node
                // are class nodes.
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }

            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }

        // Build AST
        var ast_constructor_visitor = new CoolParserBaseVisitor<ASTNode>() {
            Integer indent_level = 0;

            void print_ast(String node_name) {
                for (int i = 0; i < indent_level; i++) {
                    System.out.print("  ");
                }
                System.out.println(node_name);
            }

            // VISIT PROGRAM
            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                ArrayList<ClassDef> class_list = new ArrayList<ClassDef>();
                print_ast("program");

                for (var c : ctx.cl_class()) {
                    indent_level++;

                    class_list.add((ClassDef) visitClassDef((CoolParser.ClassDefContext) c));
                    indent_level--;
                }
                return new Program(class_list);
            }

            // VISIT DEFINITIONS
            @Override
            public ASTNode visitClassDef(CoolParser.ClassDefContext ctx) {
                // Print class and class name
                print_ast("class");
                indent_level++;
                print_ast(ctx.type.getText());

                // Check if class inherits and print
                if (ctx.inherit != null) {
                    print_ast(ctx.inherit.getText());
                }

                // Visit all class features
                ArrayList<Feature> feature_list = new ArrayList<Feature>();
                for (var f : ctx.feat_list) {
                    feature_list.add((Feature) visit(f));
                }
                indent_level--;
                return new ClassDef(ctx.type, ctx.inherit, feature_list);
            }

            @Override
            public ASTNode visitFuncDef(CoolParser.FuncDefContext ctx) {
                print_ast("method");
                indent_level++;
                print_ast(ctx.id.getText());

                // Visit all method formals
                ArrayList<Formal> formal_list = new ArrayList<Formal>();
                for (var f : ctx.formal_list) {
                    formal_list.add((Formal) visit(f));
                }
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitVarDef(CoolParser.VarDefContext ctx) {
                // Print attribute and attribute name
                print_ast("attribute");
                indent_level++;
                print_ast(ctx.id.getText());
                print_ast(ctx.type.getText());
                // Check if initialisation is being done
                if (ctx.init != null) {
                    Expression expr =  (Expression) visit(ctx.init);
                    indent_level--;
                    return new VarDef(ctx.type, ctx.id, expr);
                } else {
                    indent_level--;
                    return new VarDef(ctx.type, ctx.id, null);
                }
            }

            // VISIT EXPRESSIONS
            // VISIT LITERALS
            @Override
            public ASTNode visitClInteger(CoolParser.ClIntegerContext ctx) {
                print_ast(ctx.INTEGER().getText());
                return new ClInteger(ctx.INTEGER().getSymbol());
            }

            @Override
            public ASTNode visitClString(CoolParser.ClStringContext ctx) {
                print_ast(ctx.STRING().getText());
                return new ClString();
            }

            @Override
            public ASTNode visitBoolFalse(CoolParser.BoolFalseContext ctx) {
                print_ast(ctx.FALSE().getText());
                return new BoolFalse();
            }

            @Override
            public ASTNode visitBoolTrue(CoolParser.BoolTrueContext ctx) {
                print_ast(ctx.TRUE().getText());
                return visitChildren(ctx);
            }

            // VISIT OPERATIONS
            @Override
            public ASTNode visitMultiplication(CoolParser.MultiplicationContext ctx) {

                // Compute left hand expression
                Expression left = (Expression)visit(ctx.left);
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitDivison(CoolParser.DivisonContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitSubtraction(CoolParser.SubtractionContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitAddition(CoolParser.AdditionContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitLessThanEqual(CoolParser.LessThanEqualContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitFormal(CoolParser.FormalContext ctx) {
                print_ast("formal");
                indent_level++;
                print_ast(ctx.id.getText());
                print_ast(ctx.type.getText());

                return new Formal(ctx.id, ctx.type);
            }

            @Override
            public ASTNode visitWhileLoop(CoolParser.WhileLoopContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitObj_id(CoolParser.Obj_idContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitNewInstance(CoolParser.NewInstanceContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitParenExpr(CoolParser.ParenExprContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitOopDispatch(CoolParser.OopDispatchContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitNegateExpr(CoolParser.NegateExprContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitNotExpr(CoolParser.NotExprContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitVoidCheck(CoolParser.VoidCheckContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitLessThan(CoolParser.LessThanContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitBlock(CoolParser.BlockContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitSimpleAssign(CoolParser.SimpleAssignContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitFuncCall(CoolParser.FuncCallContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitEquality(CoolParser.EqualityContext ctx) {
                return visitChildren(ctx);
            }

            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                return visitChildren(ctx);
            }

        };

        ast_constructor_visitor.visit(globalTree);

    }
}
