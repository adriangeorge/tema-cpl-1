parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}

program
    :   (class_list+=cl_class)+ EOF
    ;

cl_class
    : CL_CLASS type=TYPE_ID (INHERITS inherit=TYPE_ID)? LBRACE (feat_list+=feature)* RBRACE SEMI                                        #classDef
    ;

// formal used in feature
formal
    : id=OBJ_ID COLON type=TYPE_ID
    ;
feature
    : id=OBJ_ID LPAREN (formal_list+=formal (COMMA formal_list+=formal)*)? RPAREN COLON type=TYPE_ID LBRACE (f_body=expr)? RBRACE SEMI  #funcDef
    | id=OBJ_ID COLON type=TYPE_ID (ASSIGN init=expr)? SEMI                                                                             #varDef
    ;

// localVar used in let
localVar
    : id=OBJ_ID COLON type=TYPE_ID (ASSIGN expr)?
    ; 

// caseBranch used in case
caseBranch
    : id=OBJ_ID COLON type=TYPE_ID CASE_EXPR expr SEMI
    ;
expr
    // Function calls
    : left=expr (PARENT_CLASS p_type=TYPE_ID)? DOT method_id=OBJ_ID LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN                 #oopDispatch
    | id=OBJ_ID LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN                                                                     #funcCall
    // Conditionals & blocks
    | IF cond=expr THEN then_expr=expr ELSE else_expr=expr FI                                                                           #clIf
    | WHILE cond_expr=expr LOOP instr_expr=expr POOL                                                                                    #whileLoop
    | LBRACE (expr_list+=expr SEMI)+ RBRACE                                                                                             #block
    | LET other_vars+=localVar (COMMA other_vars+=localVar)* IN expr                                                                    #let
    | CASE init=expr OF (cases+=caseBranch)+ ESAC                                                                                       #case
    // Class instance creation and void check
    | NEW type=TYPE_ID                                                                                                                  #newInstance
    | ISVOID expr                                                                                                                       #voidCheck
    // Arithmetic ops
    | left=expr MULT right=expr                                                                                                         #multiplication
    | left=expr DIV right=expr                                                                                                          #division
    | left=expr PLUS right=expr                                                                                                         #addition
    | left=expr MINUS right=expr                                                                                                        #subtraction
    | COMPL expr                                                                                                                        #complExpr
    // Conditional ops
    | left=expr LT right=expr                                                                                                           #lessThan
    | left=expr LE right=expr                                                                                                           #lessThanEqual
    | left=expr EQUAL right=expr                                                                                                        #equality
    | NOT expr                                                                                                                          #notExpr
    // Assignment
    | id=OBJ_ID ASSIGN expr                                                                                                             #simpleAssign
    | LPAREN expr RPAREN                                                                                                                #parenExpr
    // Literals and identifier
    | OBJ_ID                                                                                                                            #obj_id
    | INTEGER                                                                                                                           #clInteger
    | STRING                                                                                                                            #clString
    | TRUE                                                                                                                              #boolTrue
    | FALSE                                                                                                                             #boolFalse
    ;
