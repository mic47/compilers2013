grammar kuboj;

init: (declaration_function)* declaration_main_function;

//statement: (declaration_var SEMICOLON | array_initialization SEMICOLON | assignment SEMICOLON | struct_for | struct_if | expression SEMICOLON | return_call SEMICOLON)+;

statement: declaration_var SEMICOLON
         | array_initialization SEMICOLON
         | assignment SEMICOLON
         | struct_for
         | struct_if
         | expression SEMICOLON
         ;

simple_type: TYPE_INT
           | TYPE_STRING
           ;

type: simple_type                       
    | simple_type TYPE_ARRAY           
    | simple_type TYPE_ARRAY TYPE_ARRAY
    ;      

declaration_var: VAR type IDENTIFIER;

declaration_function: FUNCTION type IDENTIFIER LPAR argument_list RPAR function_body;

declaration_main_function: FUNCTION TYPE_INT MAIN LPAR RPAR function_body;

function_body: LBRACE (statement)* RETURN expression SEMICOLON RBRACE;

block: LBRACE (statement)* RBRACE;

array_initialization: IDENTIFIER EQ simple_type index_to_array; 

assignment: lvalue op=(EQ | PLUSEQ | MINUSEQ) expression;    

lvalue: IDENTIFIER
      | IDENTIFIER index_to_array
      ;
    
struct_for: FOR LPAR condition SEMICOLON assignment RPAR block;
    
struct_if: IF LPAR condition RPAR block (ELSE block)?;

expression: op=(SUB | ADD) expression            # Una
          | expression op=(DIV | MUL) expression # Mul
          | expression op=(ADD | SUB) expression # Add
          | expression MOD expression            # Mod
          | LPAR expression RPAR                 # Par
          | IDENTIFIER index_to_array            # Ind
          | function_call                        # Func
          | IDENTIFIER                           # Var
          | STRING                               # Str
          | INT                                  # Int
          ;

index_to_array: LBRACK expression RBRACK (LBRACK expression RBRACK)?;

function_call: IDENTIFIER LPAR (argument_list)? RPAR;

argument_list: expression (COMMA expression)*;

condition: expression op=(DOUBLEEQ | NOTEQ | LESSEQ | GREATEREQ | LESS | GREATER) expression;
           
TYPE_INT: 'int';
TYPE_STRING: 'string';
TYPE_ARRAY: '[]';
SEMICOLON: ';';
COMMA: ',';
VAR: 'var';
FOR: 'for';
RETURN: 'return';
FUNCTION: 'function';
IF: 'if';
ELSE: 'else';
LPAR: '(';
RPAR: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';
EQ: '=';
PLUSEQ: '+=';
MINUSEQ: '-=';
DOUBLEEQ: '==';
NOTEQ: '!=';
LESSEQ: '<=';
GREATEREQ: '=>';
LESS: '<';
GREATER: '>';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';
MAIN: 'main';
INT: [0-9]+;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' ~[\t\r\n]* '"';
WHITESPACE: [ \t\r\n] -> skip;