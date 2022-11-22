lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;	
}

@members{    
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}

// Chapter 10.1 Integers, Identifiers, and Special Notation
fragment LETTER_LOWER : [a-z];
fragment LETTER_UPPER : [A-Z];
fragment LETTER_ANY : [a-zA-Z];
fragment DIGIT : [0-9];

// Chapter 10.4 Keywords
// Classes
CL_CLASS: 'class';
INHERITS: 'inherits';
NEW: 'new';

// Conditionals
IF: 'if';
THEN: 'then';
ELSE: 'else';
FI:'fi';

// Case
CASE:'case';
ESAC:'esac';
OF:'of';

// Let
LET:'let';
IN:'in';

// Loop
WHILE:'while';
LOOP:'loop';
POOL:'pool';

// Relational
TRUE:'true';
FALSE:'false';
NOT:'not';
ISVOID:'isvoid';

// Identifiers

TYPE_ID : (LETTER_UPPER)(LETTER_ANY | '_' | DIGIT)*;
OBJ_ID : (LETTER_LOWER)(LETTER_ANY | '_' | DIGIT)*;

SELF : 'self';
SELF_TYPE : 'SELF_TYPE';

// Integer
INTEGER : DIGIT+;

// Chapter 10.2 Strings
STRING : '"' ('\\"' | .)*? '"';

// Chapter 10.3 Comments
LINE_COMMENT : '--' .*? '\n';
BLOCK_COMMENT : '(*' .*? '*)';

// Symbols
SEMI : ';';
DOT: '.';
COLON: ':';
COMMA : ',';
NEGATE : '~';
ASSIGN : '<-';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
EQUAL : '=';
LT : '<';
LE : '<=';
CASE_EXPR : '=>';
PARENT_CLASS: '@';

END_FILE : EOF;
// Chapter 10.5 White Space
WS
    :   [ \n\f\r\t]+ -> skip
    ; 