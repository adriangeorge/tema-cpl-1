package cool.compiler;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

// Representation of a node from the AST tree
public abstract class ASTNode {
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

class Feature extends Definition {
    Token id;
    List<Formal> formal_list;

    Feature(Token id, List<Formal> formal_list) {
        this.id = id;
        this.formal_list = formal_list;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class FuncDef extends Feature {
    public FuncDef(Token id, ArrayList<Formal> formal_list, Expression init) {
        super(id, formal_list);
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
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// EXPRESSIONS ABSTRACT
abstract class Expression extends ASTNode {

    public Expression() {
    }
}

class SimpleDispatch extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

}

class oopDispatch extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

}

class FuncCall extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class WhileLoop extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Block extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Case extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class CaseBranch extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class NewInstance extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class VoidCheck extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Addition extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Subtraction extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Multiplication extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Division extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ComplExpr extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LessThan extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LessThanEqual extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Equality extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class NotExpr extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ParenExpr extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ObjId extends Expression {
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
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class BoolTrue extends Expression {
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class BoolFalse extends Expression {
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
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Let extends Expression {
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