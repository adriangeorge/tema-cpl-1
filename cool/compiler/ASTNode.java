package cool.compiler;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

// Representation of a node from the AST tree
public abstract class ASTNode {
    private int node_depth;

    // Functions used for AST representation in text
    public void setDepth(int node_depth) {
        this.node_depth = node_depth;
    }

    public int getDepth() {
        return node_depth;
    }

    // Print token type
    public void print_AST(Token content) {
        print_AST(content.getText(), 0);
    }

    public void print_AST(Token content, int relative_indent) {
        print_AST(content.getText(), relative_indent);
    }

    // Print string type
    public void print_AST(String content) {
        print_AST(content, 0);
    }

    public void print_AST(String content, int relative_indent) {
        String out = "";
        for (int i = 1; i < this.node_depth + relative_indent; i++) {
            out += "  ";
        }
        out += content;
        System.out.println(out);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return null;
    }
}

// DEFINITIONS ABSTRACT
abstract class Definition extends ASTNode {
}

class ClassDef extends Definition {

    Token type;
    Token inherit;
    List<Feature> features;

    public ClassDef(Token type, Token inherit, List<Feature> features) {
        this.type = type;
        this.features = features;
        this.inherit = inherit;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Formal extends Definition {
    Token id;
    Token type;

    Formal(Token id, Token type) {
        this.id = id;
        this.type = type;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// Class Features
class Feature extends Definition {
    Token id;
    List<Formal> formal_list;

    Feature(Token id, List<Formal> formal_list) {
        this.id = id;
        this.formal_list = formal_list;
    }
}

class FuncDef extends Feature {

    Expression body;
    Token type;
    public FuncDef(Token id, Token type, ArrayList<Formal> formal_list, Expression init) {
        super(id, formal_list);
        this.type = type;
        this.body = init;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class VarDef extends Feature {
    Token type;
    Expression init;

    public VarDef(Token id, Token type, Expression init) {
        super(id, null);
        this.type = type;
        this.init = init;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LocalVar extends Feature {
    Token type;
    Expression init;

    public LocalVar(Token id, Token type, Expression init) {
        super(id, null);
        this.init = init;
        this.type = type;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// EXPRESSIONS ABSTRACT
abstract class Expression extends ASTNode {
}

class OopDispatch extends Expression {

    Expression left;
    Token parent_type;
    Token method_id;
    ArrayList<Expression> param_list;

    public OopDispatch(Expression left, Token parent_type, Token method_id, ArrayList<Expression> param_list) {
        this.parent_type = parent_type;
        this.method_id = method_id;
        this.param_list = param_list;
        this.left = left;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

}

class FuncCall extends Expression {

    Token id;
    ArrayList<Expression> param_list;

    public FuncCall(Token id, ArrayList<Expression> param_list) {
        this.id = id;
        this.param_list = param_list;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class WhileLoop extends Expression {
    Expression cond_expr;
    Expression instr_expr;

    WhileLoop(Expression cond_expr, Expression instr_expr) {
        this.cond_expr = cond_expr;
        this.instr_expr = instr_expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Block extends Expression {
    ArrayList<Expression> expr_list;

    public Block(ArrayList<Expression> expr_list) {
        this.expr_list = expr_list;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Case extends Expression {
    Expression init;
    ArrayList<CaseBranch> cases;

    public Case(Expression init, ArrayList<CaseBranch> cases) {
        this.init = init;
        this.cases = cases;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class CaseBranch extends Expression {
    Expression expr;

    Token id;
    Token type;

    public CaseBranch(Expression expr, Token id, Token type) {
        this.id = id;
        this.type = type;
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class NewInstance extends Expression {
    Token type;

    NewInstance(Token type) {
        this.type = type;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class VoidCheck extends Expression {
    Expression expr;

    public VoidCheck(Expression expr) {
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Addition extends Expression {
    Expression left;
    Expression right;

    Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Subtraction extends Expression {
    Expression left;
    Expression right;

    Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Multiplication extends Expression {
    Expression left;
    Expression right;

    Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Division extends Expression {
    Expression left;
    Expression right;

    Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ComplExpr extends Expression {
    Expression operand;

    ComplExpr(Expression operand) {
        this.operand = operand;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LessThan extends Expression {
    Expression left;
    Expression right;

    LessThan(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LessThanEqual extends Expression {
    Expression left;
    Expression right;

    LessThanEqual(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Equality extends Expression {
    Expression left;
    Expression right;

    Equality(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class NotExpr extends Expression {
    Expression operand;

    NotExpr(Expression operand) {
        this.operand = operand;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ParenExpr extends Expression {

    Expression expression;

    public ParenExpr(Expression expression) {
        this.expression = expression;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ObjId extends Expression {

    Token id;

    ObjId(Token id) {
        this.id = id;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ClInteger extends Expression {
    Token val;

    ClInteger(Token val) {
        this.val = val;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ClString extends Expression {
    Token val;

    public ClString(Token val) {
        this.val = val;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class BoolTrue extends Expression {
    Token val;

    public BoolTrue(Token val) {
        this.val = val;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class BoolFalse extends Expression {
    Token val;

    public BoolFalse(Token val) {
        this.val = val;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class SimpleAssign extends Expression {
    Token id;
    Expression expr;

    public SimpleAssign(Token id, Expression expr) {
        this.id = id;
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ClIf extends Expression {

    Expression cond;
    Expression then_expr;
    Expression else_expr;

    public ClIf(Expression cond, Expression then_expr, Expression else_expr) {
        this.cond = cond;
        this.then_expr = then_expr;
        this.else_expr = else_expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Let extends Expression {
    ArrayList<Feature> let_list;
    Expression expr;
    
    public Let(ArrayList<Feature> let_list, Expression expr) {
        this.let_list = let_list;
        this.expr = expr;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
// PROGRAM ABSTRACT

class Program extends ASTNode {
    // A program is made up of one or more classes
    ArrayList<ClassDef> classes;

    Program(ArrayList<ClassDef> classes) {
        this.classes = classes;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}