package cool.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cool.lexer.*;
import cool.parser.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
            public ASTNode visitFormal(CoolParser.FormalContext ctx) {
                print_ast("formal");
                indent_level++;
                print_ast(ctx.id.getText());
                print_ast(ctx.type.getText());
                indent_level--;
                return new Formal(ctx.id, ctx.type);
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
                print_ast(ctx.type.getText());

                // Check if function has body and visit it
                Expression func_body;
                if (ctx.f_body == null) {
                    func_body = null;
                } else {
                    func_body = (Expression) visit(ctx.f_body);
                }
                indent_level--;
                return new FuncDef(ctx.id, formal_list, func_body);
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
                    Expression expr = (Expression) visit(ctx.init);
                    indent_level--;
                    return new VarDef(ctx.type, ctx.id, expr);
                } else {
                    indent_level--;
                    return new VarDef(ctx.type, ctx.id, null);
                }
            }

            // VISIT EXPRESSIONS
            // Literals
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
                return new BoolTrue();
            }

            @Override
            public ASTNode visitObj_id(CoolParser.Obj_idContext ctx) {
                print_ast(ctx.OBJ_ID().getText());
                return new ObjId();
            }

            // Operations
            @Override
            public ASTNode visitMultiplication(CoolParser.MultiplicationContext ctx) {
                print_ast("*");
                indent_level++;
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);
                indent_level--;
                return new Multiplication();
            }

            @Override
            public ASTNode visitDivison(CoolParser.DivisonContext ctx) {

                // Increase indent before visiting operands
                print_ast("/");
                indent_level++;
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);
                indent_level--;
                return new Division();
            }

            @Override
            public ASTNode visitSubtraction(CoolParser.SubtractionContext ctx) {
                print_ast("-");
                indent_level++;
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);
                indent_level--;
                return new Subtraction();
            }

            @Override
            public ASTNode visitAddition(CoolParser.AdditionContext ctx) {
                print_ast("+");
                indent_level++;
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);
                indent_level--;
                return new Addition();
            }

            @Override
            public ASTNode visitParenExpr(CoolParser.ParenExprContext ctx) {
                return visit(ctx.expr());
            }

            @Override
            public ASTNode visitComplExpr(CoolParser.ComplExprContext ctx) {
                print_ast("~");
                indent_level++;
                Expression operand = (Expression) visit(ctx.expr());
                indent_level--;
                return new ComplExpr();
            }

            // Comparison
            @Override
            public ASTNode visitLessThanEqual(CoolParser.LessThanEqualContext ctx) {
                print_ast("<=");
                indent_level++;
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);
                indent_level--;
                return new LessThanEqual();
            }

            @Override
            public ASTNode visitLessThan(CoolParser.LessThanContext ctx) {
                print_ast("<");
                indent_level++;
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);
                indent_level--;
                return new LessThan();
            }

            @Override
            public ASTNode visitNotExpr(CoolParser.NotExprContext ctx) {
                print_ast("not");
                indent_level++;
                Expression operand = (Expression) visit(ctx.expr());
                indent_level--;
                return new NotExpr();
            }

            @Override
            public ASTNode visitEquality(CoolParser.EqualityContext ctx) {
                print_ast("=");
                indent_level++;
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);
                indent_level--;
                return new Equality();
            }

            // While
            @Override
            public ASTNode visitWhileLoop(CoolParser.WhileLoopContext ctx) {
                print_ast("while");
                indent_level++;
                Expression cond_expr = (Expression) visit(ctx.cond_expr);
                Expression instr_expr = (Expression) visit(ctx.instr_expr);
                indent_level--;

                return new WhileLoop();
            }

            // Class
            @Override
            public ASTNode visitNewInstance(CoolParser.NewInstanceContext ctx) {
                print_ast("new");
                Token type = ctx.type;
                indent_level++;
                print_ast(type.getText());
                indent_level--;
                return new NewInstance();
            }

            @Override
            public ASTNode visitOopDispatch(CoolParser.OopDispatchContext ctx) {

                print_ast(".");
                indent_level++;

                Expression left = (Expression) visit(ctx.left);

                if (ctx.p_type != null) {
                    print_ast(ctx.p_type.getText());
                }
                print_ast(ctx.method_id.getText());

                ArrayList<Expression> param_list = new ArrayList<Expression>();
                for (var p : ctx.params) {
                    param_list.add((Expression) visit(p));
                }

                indent_level--;
                return new oopDispatch();
            }

            @Override
            public ASTNode visitVoidCheck(CoolParser.VoidCheckContext ctx) {
                print_ast("isvoid");
                indent_level++;
                Expression expr = (Expression) visit(ctx.expr());
                indent_level--;
                return new VoidCheck();
            }

            // Blocks
            @Override
            public ASTNode visitLocalVar(CoolParser.LocalVarContext ctx) {
                print_ast("local");
                indent_level++;
                print_ast(ctx.id.getText());
                print_ast(ctx.type.getText());
                // Check if initialisation is being done
                if (ctx.expr() != null) {
                    Expression expr = (Expression) visit(ctx.expr());
                    indent_level--;
                    return new LocalVar(ctx.type, ctx.id, expr);
                } else {
                    indent_level--;
                    return new LocalVar(ctx.type, ctx.id, null);
                }
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                print_ast("let");

                indent_level++;
                ArrayList<Feature> let_list = new ArrayList<Feature>();
                for (var l : ctx.other_vars) {
                    let_list.add((Feature) visit(l));
                }

                Expression expr = (Expression) visit(ctx.expr());
                return new Let();
            }

            @Override
            public ASTNode visitBlock(CoolParser.BlockContext ctx) {
                return new Block();
            }

            // Case
            @Override
            public ASTNode visitCaseBranch(CoolParser.CaseBranchContext ctx) {
                print_ast(ctx.id.getText());
                print_ast(ctx.type.getText());
                Expression expr = (Expression)visit(ctx.expr());
                return new CaseBranch();
            }
            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                print_ast("case");
                indent_level++;
                Expression init = (Expression) visit(ctx.init);
                ArrayList<CaseBranch> cases = new ArrayList<>();
                for (var l : ctx.cases) {
                    print_ast("case branch");
                    indent_level++;
                    cases.add((CaseBranch) visit(l));
                    indent_level--;
                }
                return new Case();
            }

            @Override
            public ASTNode visitClIf(CoolParser.ClIfContext ctx) {

                print_ast("if");
                indent_level++;

                Expression cond = (Expression) visit(ctx.cond);
                Expression then_expr = (Expression) visit(ctx.then_expr);
                Expression else_expr = (Expression) visit(ctx.else_expr);

                return new ClIf();
            }
            // Others

            @Override
            public ASTNode visitSimpleAssign(CoolParser.SimpleAssignContext ctx) {
                print_ast("<-");
                indent_level++;
                print_ast(ctx.id.getText());
                Expression expr = (Expression) visit(ctx.expr());
                indent_level--;
                return new SimpleAssign(ctx.id, expr);
            }

            @Override
            public ASTNode visitFuncCall(CoolParser.FuncCallContext ctx) {
                print_ast("implicit dispatch");
                indent_level++;
                print_ast(ctx.id.getText());
                // Visit all method params
                ArrayList<Expression> param_list = new ArrayList<Expression>();

                for (var p : ctx.params) {
                    param_list.add((Expression) visit(p));
                }
                indent_level--;
                return new FuncCall();
            }

        };

        ast_constructor_visitor.visit(globalTree);

    }
}
