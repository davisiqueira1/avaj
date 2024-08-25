grammar Avaj;

start: (decl | stmt)* EOF;

decl:
	varDecl		
	| funDecl	;

varDecl:
	TYPE ID (ATRIB (expr | value))? ';' ;

funDecl:
	TYPE ID AP params? FP block ;

params: param (',' param)* ;

param: TYPE ID ;

block: AC stmt* FC;

stmt:
	exprStmt	
	| ifStmt		
	| elseStmt
	| whileStmt	
	| returnStmt	
	| inStmt	
	| outStmt	
	| varDecl	
	| block				;

exprStmt: expr ';' ;

expr: 
	value OP value
	| value OPR value
	| ID		
	| NUM
	| STRING
	| AP expr FP	
	| funCall		;

ifStmt:
	COND AP expr FP AC stmt FC (elseStmt)? ;

elseStmt:
	ELSE AC stmt FC;

whileStmt:
	WHILE AP expr FP stmt ;

returnStmt: RET (stmt | expr | ID | NUM | STRING)? ';' ;

inStmt: IN AP ID FP ';' ;

outStmt:
	OUT AP expr FP ';' ;


value:
	| ID		
	| NUM
	| STRING
	| AP expr FP	
	| funCall		;

funCall: ID AP args? FP ;

args: (expr) (',' expr)* ;

TYPE: 'tni' | 'taolf' | 'gnirts' | 'loob';
STRING: '"' .*? '"';
ATRIB: '=';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
OP: '/' | '*' | '+' | '-';
OPR: '==' | '!=' | '<' | '>' | '<=' | '>=';
OPCON: '<>';
IN: 'tupni';
OUT: 'tnirp';
RET: 'nruter';
COND: 'fi';
ELSE: 'esle';
WHILE: 'elihw';
NUM: DIGIT+ ('.' DIGIT+)?;
ID: CHAR (CHAR | DIGIT)*;
WS: [ \r\n\t]+ -> skip;
ERROR: .;

fragment CHAR: [a-zA-Z];
fragment DIGIT: [0-9];