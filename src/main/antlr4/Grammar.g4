grammar Grammar;
//Lexer
TYPE : 'int' | 'float' | 'String';
ID : [a-z][A-Z_]*;
INT : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]+ | '.' [0-9]+ | [0-9]+ '.';
STRING : '"' .*? '"';
PLUS : '+';
ASSING : '=';
EQUALS : '==';
IF : 'if';
ELSE : 'else';
//WHILE : 'while';
//DO : 'do';
SEMICOLON : ';';
NOTEQUAL : '!=';
LT : '<';
LTEQUAL : '<=';
GT : '>';
GTEQUAL : '>=';
PRINT : 'print';
//WRITE : 'write';

NEWLINE : [\r\n\n]+;
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;

//Parser
program : (statement statementEnd)*;

statement : assignment
          | ifStatement
          | printStatement
          | expression
          ;

var : INT | FLOAT | STRING;

statementEnd : SEMICOLON | NEWLINE;

assignment  : TYPE ID ASSING expression statementEnd;

expression  : ID (PLUS ID)* | var (PLUS var)* | ID (PLUS var)* | var (PLUS ID)* | var;

condition   : expression (EQUALS | NOTEQUAL | LT | LTEQUAL | GT | GTEQUAL) expression;

printStatement : PRINT '(' expression ')' statementEnd;

//writeStatement : WRITE '(' expression ')' statementEnd;

ifStatement : IF '(' condition ')' '{' statement+ '}' (ELSE '{' statement+ '}')?;

//whileLoop   : WHILE '(' condition ')' statement statementEnd;

//doWhileLoop : DO statement WHILE '(' condition ')' statementEnd;