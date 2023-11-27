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

NEWLINE : [\r\n]+ -> skip;
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;

//Parser
program : (statement)* EOF;

statement : assignment
          | ifStatement
          | printStatement
          | expression
          ;

var : INT | FLOAT | STRING;

compare : EQUALS | NOTEQUAL | LT | LTEQUAL | GT | GTEQUAL;

statementEnd : SEMICOLON;

assignment  : TYPE ID ASSING expression statementEnd;

expression  : ID (PLUS ID)* | var (PLUS var)* | ID (PLUS var)* | var (PLUS ID)* | var;

condition   : ID ( compare ) ID | var ( compare ) var;

printStatement : PRINT '(' expression ')' statementEnd;

//writeStatement : WRITE '(' expression ')' statementEnd;

ifStatement : IF '(' condition ')' '{' statement+ '}' (ELSE '{' statement+ '}')?;

//whileLoop   : WHILE '(' condition ')' statement statementEnd;

//doWhileLoop : DO statement WHILE '(' condition ')' statementEnd;