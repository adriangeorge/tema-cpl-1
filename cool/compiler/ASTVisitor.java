package cool.compiler;

public interface ASTVisitor<T> {
    T visit(ClassDef classDef);

    T visit(Program program);

    T visit(FuncDef funcDef);

    T visit(VarDef varDef);

    T visit(Formal formal);

    T visit(Feature feature);

    T visit(ClInteger clInteger);
}
