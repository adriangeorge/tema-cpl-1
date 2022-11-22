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

feature
    : id=OBJ_ID LPAREN (formal_list+=formal (COMMA formal_list+=formal)*)? RPAREN COLON type=TYPE_ID LBRACE (f_body=expr)? RBRACE SEMI  #funcDef
    | id=OBJ_ID COLON type=TYPE_ID (ASSIGN init=expr)? SEMI                                                                             #varDef
    ;

formal
    : id=OBJ_ID COLON type=TYPE_ID
    ;
expr
    : id=OBJ_ID ASSIGN expr                                                                                                             #simpleAssign
    | left=expr (PARENT_CLASS type=TYPE_ID)? DOT LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN                                    #oopDispatch
    | id=OBJ_ID LPAREN (params+=expr (COMMA params+=expr)*)? RPAREN                                                                     #funcCall
    | WHILE cond_expr=expr LOOP instr_expr=expr POOL                                                                                    #whileLoop
    | LBRACE (expr)+ RBRACE                                                                                                             #block
    | CASE expr OF (formal CASE_EXPR expr)+ ESAC                                                                                        #case
    | NEW type=TYPE_ID                                                                                                                  #newInstance
    | ISVOID expr                                                                                                                       #voidCheck
    | left=expr PLUS right=expr                                                                                                         #addition
    | left=expr MINUS right=expr                                                                                                        #subtraction
    | left=expr MULT right=expr                                                                                                         #multiplication
    | left=expr DIV right=expr                                                                                                          #divison
    | NEGATE expr                                                                                                                       #negateExpr
    | left=expr LT right=expr                                                                                                           #lessThan
    | left=expr LE right=expr                                                                                                           #lessThanEqual
    | left=expr EQUAL right=expr                                                                                                        #equality
    | NOT expr                                                                                                                          #notExpr
    | LPAREN expr RPAREN                                                                                                                #parenExpr
    | OBJ_ID                                                                                                                            #obj_id
    | INTEGER                                                                                                                           #clInteger
    | STRING                                                                                                                            #clString
    | TRUE                                                                                                                              #boolTrue
    | FALSE                                                                                                                             #boolFalse
    ;
