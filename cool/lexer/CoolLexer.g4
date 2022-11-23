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
STRING : '"' ('\\"' |  '\\' '\r'? '\n' | . )*? (
    '"' {
        // Remove quotes
        setText(getText().substring(1, getText().length()-1));

        // Replace special characters
        String cleanText = getText();
        cleanText = cleanText.replace("\\t", "\t");
        cleanText = cleanText.replace("\\\r\n", "\r\n");
        cleanText = cleanText.replace("\\n", "\n");
        cleanText = cleanText.replace("\\b", "\b");
        cleanText = cleanText.replace("\\f", "\f");
        // Removes only one \ in sequence
        cleanText = cleanText.replaceAll("\\\\(?!\\\\)", "");

        // Error checking
        if(getText().length() > 1024) {
            raiseError("String constant too long");
        } else if (getText().contains("\0")) {
            raiseError("String contains null character");
        } else {
            setText(cleanText);
        }
    } 
    | ('\r'? '\n') {raiseError("Unterminated string constant");}
    | EOF {raiseError("EOF in string constant");} )
    ;

// Chapter 10.3 Comments
BAD_COMMENT : '*)' { raiseError("Unmatched *)"); };
LINE_COMMENT : '--' .*? ( '\r'? '\n' | EOF) -> skip;
BLOCK_COMMENT : '(*' (BLOCK_COMMENT | .)*? 
(   '*)' { 
        skip();
    }
    | EOF { 
        raiseError("EOF in comment"); 
    }
);

// Symbols
SEMI : ';';
DOT: '.';
COLON: ':';
COMMA : ',';
COMPL : '~';
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

// If execution reached here, character is invalid
INVALID: . { raiseError("Invalid character: " + getText()); };