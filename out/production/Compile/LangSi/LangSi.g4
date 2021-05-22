grammar LangSi;

BOOLEAN:            'bool';
BREAK:              'break';
CHAR:               'char';
CONST:              'const';
CONTINUE:           'continue';
FLOAT:              'float';
IF:                 'if';
INT:                'int';
WHILE:              'while';
DEF:                'def';
RETURN:             'return';
PRINT:              'print';
MAIN:               '__main__()';

LETTERS:            ('a' .. 'z' | 'A' .. 'Z')+;
NUMBERS:            [0-9] ([0-9])*;
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT:            '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]* -> channel(HIDDEN);

compileUnit
    : consts? function*? main EOF
    ;

main
    : MAIN block
    ;

block
    : '{' (statement)* '}'
    ;
blockFunc
    :'{' (statement)* returnFunc ';' '}'
    ;


function
    : DEF types funcName '(' argsList ')' blockFunc
    ;

returnFunc
    : RETURN varName
    ;

funcName
    : LETTERS+ (LETTERS+|NUMBERS)*
    ;


consts
    : CONST variableDeclaration';' (CONST variableDeclaration ';')*
    ;


types
    : BOOLEAN
    | CHAR
    | INT
    | FLOAT
    ;

variableDeclaration
    : types varName ('=' expr)?
    ;

assignment
    : varName '=' expr
    ;

callFunctionList
    : varName
    | literal
    ;

callFunction
    : funcName '('(callFunctionList(',' callFunctionList)*)?')'
    ;

argsList
    : (variableDeclaration (',' variableDeclaration)*)?
    ;

exprList
    : (expr (',' expr)*)?
    ;

varName
    : LETTERS+ (LETTERS+|NUMBERS)*
    ;

statement
    : variableDeclaration ';'
    | expr ';'
    | print ';'
    | ifCondtion
    | assignment
    | whileCicle
    ;

print
    : PRINT '('printList ')'
    ;

printList
    : literal # PrintLiteral
    | varName # PrintVar
    ;

ifCondtion
    : IF '(' logicExprList ')'  ifBlock
    ;

ifBlock
    : '{' (ifStatement)* '}'
    ;

ifStatement
    : variableDeclaration ';'
    | expr ';'
    | print ';'
    | ifCondtion
    | assignment
    | whileCicle
    | breakContinue
    ;

breakContinue
    : BREAK ';'
    | CONTINUE ';'
    ;


whileCicle
    : WHILE '(' logicExprList ')' whileBlock
    ;

whileBlock
    : '{' (whileStatement)* '}'
    ;

whileStatement
    : variableDeclaration ';'
    | expr ';'
    | print ';'
    | ifCondtion
    | assignment
    | whileCicle
    ;

logicExprList
    : logicExpr (pob=('and' | 'or') logicExpr)*
    ;

logicExpr
    :   expr # ExpConclusion
    |   expr op = ('==' | '!=') expr # EqualsConclusion
    |   expr op = ('>' | '>=' )  expr # MoreThenConclusion
    |   expr op = ('<' | '<=' ) expr # LessThenConclusion
    ;

expr
    : assignment # AssigmentExpression
    | callFunction # CallFuncExpression
    | expr op = ('*' | '/' | '%') expr # MultipliesExpression
    | expr  op = ( '+' | '-' ) expr # SummExpression
    | varName # VarNameExpression
    | literal # LiteralExpression
    | '(' expr ')' # ParenExpression
    ;

literal
    : boolLiteral
    | intLiteral
    | floatLiteral
    | charLiteral
    ;

intLiteral
    : NUMBERS
    ;

boolLiteral
    : 'true'
    | 'false'
    ;

charLiteral
    : '\'' LETTERS '\''
    ;


floatLiteral
    :   NUMBERS '.' NUMBERS
    ;




