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
            int parentheses_offset = 0;

            // VISIT PROGRAM
            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                ArrayList<ClassDef> class_list = new ArrayList<ClassDef>();
                // var rep = ast_representation("program", ctx.depth());
                for (var c : ctx.cl_class()) {
                    class_list.add((ClassDef) visitClassDef((CoolParser.ClassDefContext) c));
                }

                // Set depth and return object
                var o = new Program(class_list);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // VISIT DEFINITIONS
            @Override
            public ASTNode visitClassDef(CoolParser.ClassDefContext ctx) {
                // Visit all class features
                ArrayList<Feature> feature_list = new ArrayList<Feature>();
                for (var f : ctx.feat_list) {
                    feature_list.add((Feature) visit(f));
                }

                // Set depth and return object
                var o = new ClassDef(ctx.type, ctx.inherit, feature_list);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitFormal(CoolParser.FormalContext ctx) {
                // Set depth and return object
                var o = new Formal(ctx.id, ctx.type);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitFuncDef(CoolParser.FuncDefContext ctx) {
                // Visit all method formals
                ArrayList<Formal> formal_list = new ArrayList<Formal>();
                for (var f : ctx.formal_list) {
                    formal_list.add((Formal) visit(f));
                }

                // Check if function has body and visit it
                Expression func_body = null;
                if (ctx.f_body != null) {
                    func_body = (Expression) visit(ctx.f_body);
                }

                // Set depth and return object
                var o = new FuncDef(ctx.id, ctx.type, formal_list, func_body);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitVarDef(CoolParser.VarDefContext ctx) {
                // Check if initialisation is being done
                Expression expr = null;
                if (ctx.init != null) {
                    expr = (Expression) visit(ctx.init);
                }

                // Set depth and return object
                var o = new VarDef(ctx.id, ctx.type, expr);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // VISIT EXPRESSIONS
            // Literals
            @Override
            public ASTNode visitClInteger(CoolParser.ClIntegerContext ctx) {
                // Set depth and return object
                var o = new ClInteger(ctx.INTEGER().getSymbol());
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitClString(CoolParser.ClStringContext ctx) {
                // Set depth and return object
                var o = new ClString(ctx.STRING().getSymbol());
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitBoolFalse(CoolParser.BoolFalseContext ctx) {
                // var rep = ast_representation(ctx.FALSE().getText(), ctx.depth());
                // Set depth and return object
                var o = new BoolFalse(ctx.FALSE().getSymbol());
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitBoolTrue(CoolParser.BoolTrueContext ctx) {
                // Set depth and return object
                var o = new BoolTrue(ctx.TRUE().getSymbol());
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitObj_id(CoolParser.Obj_idContext ctx) {
                // Set depth and return object
                var o = new ObjId(ctx.OBJ_ID().getSymbol());
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // Operations
            @Override
            public ASTNode visitMultiplication(CoolParser.MultiplicationContext ctx) {
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);

                // Set depth and return object
                var o = new Multiplication(left, right);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitDivision(CoolParser.DivisionContext ctx) {
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);

                // Set depth and return object
                var o = new Division(left, right);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitSubtraction(CoolParser.SubtractionContext ctx) {

                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);

                // Set depth and return object
                var o = new Subtraction(left, right);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitAddition(CoolParser.AdditionContext ctx) {
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);

                // Set depth and return object
                var o = new Addition(left, right);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitParenExpr(CoolParser.ParenExprContext ctx) {
                // Parentheses break up the usage of ctx.depth() a little,
                // but I can compensate by using an offset each time an expression
                // in parantheses is encountered
                parentheses_offset++;
                Expression expression = (Expression) visit(ctx.expr());
                parentheses_offset--;
                var o = new ParenExpr(expression);
                return o;
            }

            @Override
            public ASTNode visitComplExpr(CoolParser.ComplExprContext ctx) {
                Expression operand = (Expression) visit(ctx.expr());

                // Set depth and return object
                var o = new ComplExpr(operand);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // Comparison
            @Override
            public ASTNode visitLessThanEqual(CoolParser.LessThanEqualContext ctx) {
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);

                // Set depth and return object
                var o = new LessThanEqual(left, right);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitLessThan(CoolParser.LessThanContext ctx) {
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);

                // Set depth and return object
                var o = new LessThan(left, right);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitNotExpr(CoolParser.NotExprContext ctx) {
                Expression operand = (Expression) visit(ctx.expr());

                // Set depth and return object
                var o = new NotExpr(operand);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitEquality(CoolParser.EqualityContext ctx) {
                Expression left = (Expression) visit(ctx.left);
                Expression right = (Expression) visit(ctx.right);

                // Set depth and return object
                var o = new Equality(left, right);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // While
            @Override
            public ASTNode visitWhileLoop(CoolParser.WhileLoopContext ctx) {
                Expression cond_expr = (Expression) visit(ctx.cond_expr);
                Expression instr_expr = (Expression) visit(ctx.instr_expr);

                // Set depth and return object
                var o = new WhileLoop(cond_expr, instr_expr);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // Class
            @Override
            public ASTNode visitNewInstance(CoolParser.NewInstanceContext ctx) {
                Token type = ctx.type;

                // Set depth and return object
                var o = new NewInstance(type);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitOopDispatch(CoolParser.OopDispatchContext ctx) {
                Expression left = (Expression) visit(ctx.left);

                ArrayList<Expression> param_list = new ArrayList<Expression>();
                for (var p : ctx.params) {
                    param_list.add((Expression) visit(p));
                }

                // Set depth and return object
                var o = new OopDispatch(left, ctx.p_type, ctx.method_id, param_list);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitVoidCheck(CoolParser.VoidCheckContext ctx) {
                Expression expr = (Expression) visit(ctx.expr());

                // Set depth and return object
                var o = new VoidCheck(expr);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // Blocks
            @Override
            public ASTNode visitLocalVar(CoolParser.LocalVarContext ctx) {
                // Check if initialisation is being done
                Expression expr = null;
                if (ctx.expr() != null) {
                    expr = (Expression) visit(ctx.expr());
                }

                // Set depth and return object
                var o = new LocalVar(ctx.id, ctx.type, expr);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                ArrayList<Feature> let_list = new ArrayList<Feature>();
                for (var l : ctx.other_vars) {
                    let_list.add((Feature) visit(l));
                }

                Expression expr = (Expression) visit(ctx.expr());

                // Set depth and return object
                var o = new Let(let_list, expr);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitBlock(CoolParser.BlockContext ctx) {
                ArrayList<Expression> expr_list = new ArrayList<Expression>();
                for (var e : ctx.expr_list) {
                    expr_list.add((Expression) visit(e));
                }
                // Set depth and return object
                var o = new Block(expr_list);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            // Case
            @Override
            public ASTNode visitCaseBranch(CoolParser.CaseBranchContext ctx) {
                Expression expr = (Expression) visit(ctx.expr());
                // Set depth and return object
                var o = new CaseBranch(expr, ctx.id, ctx.type);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                Expression init = (Expression) visit(ctx.init);
                ArrayList<CaseBranch> cases = new ArrayList<>();
                for (var l : ctx.cases) {
                    cases.add((CaseBranch) visit(l));
                }
                // Set depth and return object
                var o = new Case(init, cases);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitClIf(CoolParser.ClIfContext ctx) {

                Expression cond = (Expression) visit(ctx.cond);
                Expression then_expr = (Expression) visit(ctx.then_expr);
                Expression else_expr = (Expression) visit(ctx.else_expr);

                // Set depth and return object
                var o = new ClIf(cond, then_expr, else_expr);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }
            // Others

            @Override
            public ASTNode visitSimpleAssign(CoolParser.SimpleAssignContext ctx) {
                Expression expr = (Expression) visit(ctx.expr());

                // Set depth and return object
                var o = new SimpleAssign(ctx.id, expr);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

            @Override
            public ASTNode visitFuncCall(CoolParser.FuncCallContext ctx) {
                // Visit all method params
                ArrayList<Expression> param_list = new ArrayList<Expression>();

                for (var p : ctx.params) {
                    param_list.add((Expression) visit(p));
                }
                // Set depth and return object
                var o = new FuncCall(ctx.id, param_list);
                o.setDepth(ctx.depth() - parentheses_offset);
                return o;
            }

        };

        var constructed_ast = ast_constructor_visitor.visit(globalTree);
        var ast_print_visitor = new ASTVisitor<Void>() {

            @Override
            public Void visit(ClassDef a) {
                a.print_AST("class");
                a.print_AST(a.type, 1);

                if (a.inherit != null)
                    a.print_AST(a.inherit, 1);

                for (var f : a.features) {
                    f.accept(this);
                }
                return null;
            }

            @Override
            public Void visit(Program a) {
                a.print_AST("program");

                // Visit all class defs
                for (var c : a.classes) {
                    c.accept(this);
                }
                return null;
            }

            @Override
            public Void visit(FuncDef a) {
                a.print_AST("method");
                a.print_AST(a.id, 1);

                for (var f : a.formal_list) {
                    f.accept(this);
                }

                a.print_AST(a.type, 1);

                if (a.body != null) {
                    a.body.accept(this);
                }
                return null;
            }

            @Override
            public Void visit(VarDef a) {
                a.print_AST("attribute");
                a.print_AST(a.id, 1);
                a.print_AST(a.type, 1);

                if (a.init != null) {
                    a.init.accept(this);
                }
                return null;
            }

            @Override
            public Void visit(Formal a) {
                a.print_AST("formal");
                a.print_AST(a.id, 1);
                a.print_AST(a.type, 1);

                return null;
            }

            @Override
            public Void visit(ClInteger a) {
                a.print_AST(a.val);
                return null;
            }

            @Override
            public Void visit(NewInstance a) {
                a.print_AST("new");
                a.print_AST(a.type, 1);

                return null;
            }

            @Override
            public Void visit(OopDispatch a) {
                a.print_AST(".");
                a.left.accept(this);

                if (a.parent_type != null) {
                    a.print_AST(a.parent_type, 1);
                }
                a.print_AST(a.method_id, 1);
                for (var p : a.param_list) {
                    p.accept(this);
                }
                return null;
            }

            @Override
            public Void visit(VoidCheck a) {
                a.print_AST("isvoid");
                a.expr.accept(this);
                return null;
            }

            @Override
            public Void visit(FuncCall a) {
                a.print_AST("implicit dispatch");
                a.print_AST(a.id, 1);

                for (var p : a.param_list) {
                    p.accept(this);
                }

                return null;
            }

            @Override
            public Void visit(ObjId a) {
                a.print_AST(a.id);
                return null;
            }

            @Override
            public Void visit(ParenExpr a) {
                a.expression.accept(this);
                return null;
            }

            @Override
            public Void visit(NotExpr a) {
                a.print_AST("not");
                a.operand.accept(this);

                return null;
            }

            @Override
            public Void visit(Equality a) {
                a.print_AST("=");
                a.left.accept(this);
                a.right.accept(this);

                return null;
            }

            @Override
            public Void visit(LessThanEqual a) {
                a.print_AST("<=");
                a.left.accept(this);
                a.right.accept(this);
                return null;
            }

            @Override
            public Void visit(LessThan a) {
                a.print_AST("<");
                a.left.accept(this);
                a.right.accept(this);
                return null;
            }

            @Override
            public Void visit(ComplExpr a) {
                a.print_AST("~");
                a.operand.accept(this);
                return null;
            }

            @Override
            public Void visit(Division a) {
                a.print_AST("/");
                a.left.accept(this);
                a.right.accept(this);
                return null;
            }

            @Override
            public Void visit(Multiplication a) {
                a.print_AST("*");
                a.left.accept(this);
                a.right.accept(this);
                return null;
            }

            @Override
            public Void visit(Subtraction a) {
                a.print_AST("-");
                a.left.accept(this);
                a.right.accept(this);
                return null;
            }

            @Override
            public Void visit(Addition a) {
                a.print_AST("+");
                a.left.accept(this);
                a.right.accept(this);
                return null;
            }

            @Override
            public Void visit(Case a) {
                a.print_AST("case");
                a.init.accept(this);

                for (var c : a.cases) {

                    c.accept(this);
                }
                return null;
            }

            @Override
            public Void visit(CaseBranch a) {
                a.print_AST("case branch");
                a.print_AST(a.id, 1);
                a.print_AST(a.type, 1);
                a.expr.accept(this);

                return null;
            }

            @Override
            public Void visit(Block a) {
                a.print_AST("block");

                for (var e : a.expr_list) {
                    e.accept(this);
                }
                return null;
            }

            @Override
            public Void visit(WhileLoop a) {
                a.print_AST("while");

                a.cond_expr.accept(this);
                a.instr_expr.accept(this);
                return null;
            }

            @Override
            public Void visit(BoolTrue a) {
                a.print_AST(a.val);
                return null;
            }

            @Override
            public Void visit(ClString a) {
                a.print_AST(a.val);
                return null;
            }

            @Override
            public Void visit(BoolFalse a) {
                a.print_AST(a.val);
                return null;
            }

            @Override
            public Void visit(SimpleAssign a) {
                a.print_AST("<-");
                a.print_AST(a.id, 1);
                a.expr.accept(this);
                return null;
            }

            @Override
            public Void visit(ClIf a) {
                a.print_AST("if");

                a.cond.accept(this);
                a.then_expr.accept(this);
                a.else_expr.accept(this);
                return null;
            }

            @Override
            public Void visit(Let a) {
                a.print_AST("let");

                for (var l : a.let_list) {
                    l.accept(this);
                }

                a.expr.accept(this);
                return null;
            }

            @Override
            public Void visit(LocalVar a) {
                a.print_AST("local");
                a.print_AST(a.id, 1);
                a.print_AST(a.type, 1);

                if (a.init != null) {
                    a.init.accept(this);
                }
                return null;
            }

        };

        constructed_ast.accept(ast_print_visitor);
    }
}
