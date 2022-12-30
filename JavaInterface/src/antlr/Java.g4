grammar Java;

@header {
package antlr;
}

// Java Program
javaProgram:
	(packageDeclaration)? (importDeclaration)*? classDeclaration;

// public class Java<Integer> extends Abc {}
classDeclaration:
	accessSpecifier? 'class' Identifier typeParameters? (
		'extends' type
	)? ('implements' typeList)? classBody;

// public void foo() {}
methodDeclaration:
	accessSpecifier? type Identifier formalParameters methodDeclarationRest
	| 'void' Identifier formalParameters methodDeclarationRest;

// package test;
packageDeclaration: 'package' qualifiedName ';';

// import java.util.*;
importDeclaration: 'import' qualifiedName ';';

// /* comment */
comment: '/*' .*? '*/';

Identifier: [a-zA-Z][a-zA-Z0-9_]*;

type: Identifier genericParameters? arrayTypeParameters?;

arrayTypeParameters: ('[' ']')+;

genericParameters: '<' genericParameter* '>';

genericParameter: type ('<' typeList '>');

accessSpecifier: 'public' | 'protected' | 'private';

typeParameterList: typeParameter (',' typeParameter)*;

typeParameter: Identifier;

typeParameters: '<' typeParameterList '>';

typeList: type (',' type)*;

formalParameters: '(' formalParameterList? comment? ')';

formalParameterList: formalArgument (',' formalArgument)*;

formalArgument: type Identifier;

classBody: '{' (classBodyDeclaration)* '}';

classBodyDeclaration: classMemberDeclaration | ';';

classMemberDeclaration: methodDeclaration;

methodDeclarationRest:
	('throws' qualifiedNameList)? methodBody
	| 'throws' qualifiedNameList methodBody;

qualifiedNameList: qualifiedName (',' qualifiedName)*;

qualifiedName: Identifier ('.' Identifier)*;

methodBody: block | ';';

block: ('{' (blockStatement)* '}');

blockStatement: statement+;

statement: returnStatement;

returnStatement: 'return' expression? ';';

expression: Identifier;

WS: [ \t\r\n]+ -> skip;
