/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
		(rule__Model__GreetingsAssignment)*
		{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGreeting
entryRuleGreeting
:
{ before(grammarAccess.getGreetingRule()); }
	 ruleGreeting
{ after(grammarAccess.getGreetingRule()); } 
	 EOF 
;

// Rule Greeting
ruleGreeting 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGreetingAccess().getGroup()); }
		(rule__Greeting__Group__0)
		{ after(grammarAccess.getGreetingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtmosphere
entryRuleAtmosphere
:
{ before(grammarAccess.getAtmosphereRule()); }
	 ruleAtmosphere
{ after(grammarAccess.getAtmosphereRule()); } 
	 EOF 
;

// Rule Atmosphere
ruleAtmosphere 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtmosphereAccess().getAlternatives()); }
		(rule__Atmosphere__Alternatives)
		{ after(grammarAccess.getAtmosphereAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInitial
entryRuleInitial
:
{ before(grammarAccess.getInitialRule()); }
	 ruleInitial
{ after(grammarAccess.getInitialRule()); } 
	 EOF 
;

// Rule Initial
ruleInitial 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitialAccess().getLETTERTerminalRuleCall()); }
		RULE_LETTER
		{ after(grammarAccess.getInitialAccess().getLETTERTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubsequent
entryRuleSubsequent
:
{ before(grammarAccess.getSubsequentRule()); }
	 ruleSubsequent
{ after(grammarAccess.getSubsequentRule()); } 
	 EOF 
;

// Rule Subsequent
ruleSubsequent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubsequentAccess().getAlternatives()); }
		(rule__Subsequent__Alternatives)
		{ after(grammarAccess.getSubsequentAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression_Keyword
entryRuleExpression_Keyword
:
{ before(grammarAccess.getExpression_KeywordRule()); }
	 ruleExpression_Keyword
{ after(grammarAccess.getExpression_KeywordRule()); } 
	 EOF 
;

// Rule Expression_Keyword
ruleExpression_Keyword 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getAlternatives()); }
		(rule__Expression_Keyword__Alternatives)
		{ after(grammarAccess.getExpression_KeywordAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atmosphere__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtmosphereAccess().getWHITE_SPACETerminalRuleCall_0()); }
		RULE_WHITE_SPACE
		{ after(grammarAccess.getAtmosphereAccess().getWHITE_SPACETerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtmosphereAccess().getCOMMENTTerminalRuleCall_1()); }
		RULE_COMMENT
		{ after(grammarAccess.getAtmosphereAccess().getCOMMENTTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Subsequent__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubsequentAccess().getInitialParserRuleCall_0()); }
		ruleInitial
		{ after(grammarAccess.getSubsequentAccess().getInitialParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1()); }
		RULE_DIGIT
		{ after(grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSubsequentAccess().getSPECIAL__SUBSEQUENTTerminalRuleCall_2()); }
		RULE_SPECIAL__SUBSEQUENT
		{ after(grammarAccess.getSubsequentAccess().getSPECIAL__SUBSEQUENTTerminalRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_Keyword__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getQuoteKeyword_0()); }
		'quote'
		{ after(grammarAccess.getExpression_KeywordAccess().getQuoteKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getLambdaKeyword_1()); }
		'lambda'
		{ after(grammarAccess.getExpression_KeywordAccess().getLambdaKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getIfKeyword_2()); }
		'if'
		{ after(grammarAccess.getExpression_KeywordAccess().getIfKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getSetKeyword_3()); }
		'set!'
		{ after(grammarAccess.getExpression_KeywordAccess().getSetKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getBeginKeyword_4()); }
		'begin'
		{ after(grammarAccess.getExpression_KeywordAccess().getBeginKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getCondKeyword_5()); }
		'cond'
		{ after(grammarAccess.getExpression_KeywordAccess().getCondKeyword_5()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getAndKeyword_6()); }
		'and'
		{ after(grammarAccess.getExpression_KeywordAccess().getAndKeyword_6()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getOrKeyword_7()); }
		'or'
		{ after(grammarAccess.getExpression_KeywordAccess().getOrKeyword_7()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getCaseKeyword_8()); }
		'case'
		{ after(grammarAccess.getExpression_KeywordAccess().getCaseKeyword_8()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getLetKeyword_9()); }
		'let'
		{ after(grammarAccess.getExpression_KeywordAccess().getLetKeyword_9()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getLetKeyword_10()); }
		'let*'
		{ after(grammarAccess.getExpression_KeywordAccess().getLetKeyword_10()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getLetrecKeyword_11()); }
		'letrec'
		{ after(grammarAccess.getExpression_KeywordAccess().getLetrecKeyword_11()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getDoKeyword_12()); }
		'do'
		{ after(grammarAccess.getExpression_KeywordAccess().getDoKeyword_12()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getDelayKeyword_13()); }
		'delay'
		{ after(grammarAccess.getExpression_KeywordAccess().getDelayKeyword_13()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_KeywordAccess().getQuasiquoteKeyword_14()); }
		'quasiquote'
		{ after(grammarAccess.getExpression_KeywordAccess().getQuasiquoteKeyword_14()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__0__Impl
	rule__Greeting__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); }
	'Hello'
	{ after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__1__Impl
	rule__Greeting__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getNameAssignment_1()); }
	(rule__Greeting__NameAssignment_1)
	{ after(grammarAccess.getGreetingAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); }
	'!'
	{ after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__GreetingsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
		ruleGreeting
		{ after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_DIGIT : '0'..'9';

RULE_LETTER : 'a'..'z';

RULE_WHITE_SPACE : (' '|'\n');

RULE_DELIMITER : (RULE_WHITE_SPACE|'('|')'|'"'|';');

RULE_SPECIAL__SUBSEQUENT : ('.'|'+'|'-');

RULE_COMMENT : ';' ( options {greedy=false;} : . )*'\n';

RULE_PECULIAR__IDENTIFIER : ('+'|'-'|'...');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
