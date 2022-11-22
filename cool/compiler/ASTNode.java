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
    public FuncDef(Token id, List<Formal> formal_list, Expression init) {
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

// EXPRESSIONS ABSTRACT
abstract class Expression extends ASTNode {
}

class SimpleDispatch extends Expression {

}

class oopDispatch extends Expression {

}

class FuncCall extends Expression {
}

class WhileLoop extends Expression {
}

class Block extends Expression {
}

class Case extends Expression {
}

class NewInstance extends Expression {
}

class VoidCheck extends Expression {
}

class Addition extends Expression {
}

class Subtraction extends Expression {
}

class Multiplication extends Expression {
}

class Division extends Expression {
}

class NegateExpr extends Expression {
}

class LessThan extends Expression {
}

class LessThanEqual extends Expression {
}

class Equality extends Expression {
}

class NotExpr extends Expression {
}

class ParenExpr extends Expression {
}

class ObjId extends Expression {
}

class ClInteger extends Expression {
    Token val;

    ClInteger(Token val){
        this.val = val;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ClString extends Expression {
}

class BoolTrue extends Expression {
}

class BoolFalse extends Expression {
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