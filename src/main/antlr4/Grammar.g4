grammar Grammar;
//Lexer
ID : [A-Z_][a-z]*;
INT : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]+ | '.' [0-9]+ | [0-9]+ '.';
STRING : '"' .*? '"';
PLUS : '+';
EQUALS : '=';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
DO : 'do';
SEMICOLON : ';';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
NOTEQUAL : '!=';
LT : '<';
LTEQUAL : '<=';
GT : '>';
GTEQUAL : '>=';
PRINT : 'print';
WRITE : 'write';

WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;

//Parser
program : EOF | statement;

statement : variableDeclaration
          | assignment
          | ifStatement
          | whileLoop
          | doWhileLoop
          | writeStatement
          | printStatement
          ;

type : INT | FLOAT | STRING;

statementEnd : SEMICOLON;

variableDeclaration : type ID statementEnd;

expression  : ID (PLUS ID)*;

condition   : expression (EQUALS | NOTEQUAL | LT | LTEQUAL | GT | GTEQUAL) expression;

assignment  : type ID EQUALS expression statementEnd;

printStatement : PRINT LPAREN expression RPAREN statementEnd;

writeStatement : WRITE LPAREN expression RPAREN statementEnd;

ifStatement : IF LPAREN condition RPAREN LBRACE statement+ RBRACE (ELSE LBRACE statement+ RBRACE)? statementEnd;

whileLoop   : WHILE LPAREN condition RPAREN statement statementEnd;

doWhileLoop : DO statement WHILE LPAREN condition RPAREN statementEnd;