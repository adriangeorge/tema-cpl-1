package cool.compiler;

public interface ASTVisitor<T> {
    T visit(ClassDef classDef);

    T visit(Program program);

    T visit(FuncDef funcDef);

    T visit(VarDef varDef);

    T visit(Formal formal);

    T visit(Feature feature);

    T visit(ClInteger clInteger);

    T visit(NewInstance newInstance);

    T visit(SimpleDispatch simpleDispatch);

    T visit(oopDispatch oopDispatch);

    T visit(VoidCheck voidCheck);

    T visit(FuncCall funcCall);

    T visit(ObjId funcCall);

    T visit(ParenExpr funcCall);

    T visit(NotExpr funcCall);

    T visit(Equality funcCall);

    T visit(LessThanEqual funcCall);

    T visit(LessThan funcCall);

    T visit(ComplExpr funcCall);

    T visit(Division funcCall);

    T visit(Multiplication funcCall);

    T visit(Subtraction funcCall);

    T visit(Addition funcCall);

    T visit(Case funcCall);

    T visit(Block funcCall);

    T visit(WhileLoop funcCall);

    T visit(BoolTrue funcCall);

    T visit(ClString funcCall);

    T visit(BoolFalse funcCall);

    T visit(SimpleAssign simpleAssign);

}
