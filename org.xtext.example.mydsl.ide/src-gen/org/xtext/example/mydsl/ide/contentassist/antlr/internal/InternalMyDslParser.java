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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LETTER", "RULE_WHITE_SPACE", "RULE_COMMENT", "RULE_DIGIT", "RULE_SPECIAL__SUBSEQUENT", "RULE_ID", "RULE_DELIMITER", "RULE_PECULIAR__IDENTIFIER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'quote'", "'lambda'", "'if'", "'set!'", "'begin'", "'cond'", "'and'", "'or'", "'case'", "'let'", "'let*'", "'letrec'", "'do'", "'delay'", "'quasiquote'", "'Hello'", "'!'"
    };
    public static final int RULE_STRING=13;
    public static final int RULE_SPECIAL__SUBSEQUENT=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=9;
    public static final int RULE_WS=16;
    public static final int RULE_DIGIT=7;
    public static final int RULE_COMMENT=6;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_LETTER=4;
    public static final int RULE_DELIMITER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_PECULIAR__IDENTIFIER=11;
    public static final int RULE_WHITE_SPACE=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleGreeting EOF )
            // InternalMyDsl.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:87:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Greeting__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Greeting__Group__0 )
            // InternalMyDsl.g:94:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleAtmosphere"
    // InternalMyDsl.g:103:1: entryRuleAtmosphere : ruleAtmosphere EOF ;
    public final void entryRuleAtmosphere() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAtmosphere EOF )
            // InternalMyDsl.g:105:1: ruleAtmosphere EOF
            {
             before(grammarAccess.getAtmosphereRule()); 
            pushFollow(FOLLOW_1);
            ruleAtmosphere();

            state._fsp--;

             after(grammarAccess.getAtmosphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtmosphere"


    // $ANTLR start "ruleAtmosphere"
    // InternalMyDsl.g:112:1: ruleAtmosphere : ( ( rule__Atmosphere__Alternatives ) ) ;
    public final void ruleAtmosphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Atmosphere__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Atmosphere__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Atmosphere__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Atmosphere__Alternatives )
            {
             before(grammarAccess.getAtmosphereAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Atmosphere__Alternatives )
            // InternalMyDsl.g:119:4: rule__Atmosphere__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atmosphere__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtmosphereAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtmosphere"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:128:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleInitial EOF )
            // InternalMyDsl.g:130:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:137:1: ruleInitial : ( RULE_LETTER ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( RULE_LETTER ) )
            // InternalMyDsl.g:142:2: ( RULE_LETTER )
            {
            // InternalMyDsl.g:142:2: ( RULE_LETTER )
            // InternalMyDsl.g:143:3: RULE_LETTER
            {
             before(grammarAccess.getInitialAccess().getLETTERTerminalRuleCall()); 
            match(input,RULE_LETTER,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getLETTERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleSubsequent"
    // InternalMyDsl.g:153:1: entryRuleSubsequent : ruleSubsequent EOF ;
    public final void entryRuleSubsequent() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSubsequent EOF )
            // InternalMyDsl.g:155:1: ruleSubsequent EOF
            {
             before(grammarAccess.getSubsequentRule()); 
            pushFollow(FOLLOW_1);
            ruleSubsequent();

            state._fsp--;

             after(grammarAccess.getSubsequentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubsequent"


    // $ANTLR start "ruleSubsequent"
    // InternalMyDsl.g:162:1: ruleSubsequent : ( ( rule__Subsequent__Alternatives ) ) ;
    public final void ruleSubsequent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Subsequent__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Subsequent__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Subsequent__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Subsequent__Alternatives )
            {
             before(grammarAccess.getSubsequentAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Subsequent__Alternatives )
            // InternalMyDsl.g:169:4: rule__Subsequent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Subsequent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubsequentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsequent"


    // $ANTLR start "entryRuleExpression_Keyword"
    // InternalMyDsl.g:178:1: entryRuleExpression_Keyword : ruleExpression_Keyword EOF ;
    public final void entryRuleExpression_Keyword() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleExpression_Keyword EOF )
            // InternalMyDsl.g:180:1: ruleExpression_Keyword EOF
            {
             before(grammarAccess.getExpression_KeywordRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Keyword();

            state._fsp--;

             after(grammarAccess.getExpression_KeywordRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Keyword"


    // $ANTLR start "ruleExpression_Keyword"
    // InternalMyDsl.g:187:1: ruleExpression_Keyword : ( ( rule__Expression_Keyword__Alternatives ) ) ;
    public final void ruleExpression_Keyword() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Expression_Keyword__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Expression_Keyword__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Expression_Keyword__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Expression_Keyword__Alternatives )
            {
             before(grammarAccess.getExpression_KeywordAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Expression_Keyword__Alternatives )
            // InternalMyDsl.g:194:4: rule__Expression_Keyword__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Keyword__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression_KeywordAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Keyword"


    // $ANTLR start "rule__Atmosphere__Alternatives"
    // InternalMyDsl.g:202:1: rule__Atmosphere__Alternatives : ( ( RULE_WHITE_SPACE ) | ( RULE_COMMENT ) );
    public final void rule__Atmosphere__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( RULE_WHITE_SPACE ) | ( RULE_COMMENT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_WHITE_SPACE) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_COMMENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:207:2: ( RULE_WHITE_SPACE )
                    {
                    // InternalMyDsl.g:207:2: ( RULE_WHITE_SPACE )
                    // InternalMyDsl.g:208:3: RULE_WHITE_SPACE
                    {
                     before(grammarAccess.getAtmosphereAccess().getWHITE_SPACETerminalRuleCall_0()); 
                    match(input,RULE_WHITE_SPACE,FOLLOW_2); 
                     after(grammarAccess.getAtmosphereAccess().getWHITE_SPACETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( RULE_COMMENT )
                    {
                    // InternalMyDsl.g:213:2: ( RULE_COMMENT )
                    // InternalMyDsl.g:214:3: RULE_COMMENT
                    {
                     before(grammarAccess.getAtmosphereAccess().getCOMMENTTerminalRuleCall_1()); 
                    match(input,RULE_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getAtmosphereAccess().getCOMMENTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atmosphere__Alternatives"


    // $ANTLR start "rule__Subsequent__Alternatives"
    // InternalMyDsl.g:223:1: rule__Subsequent__Alternatives : ( ( ruleInitial ) | ( RULE_DIGIT ) | ( RULE_SPECIAL__SUBSEQUENT ) );
    public final void rule__Subsequent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( ( ruleInitial ) | ( RULE_DIGIT ) | ( RULE_SPECIAL__SUBSEQUENT ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_LETTER:
                {
                alt3=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt3=2;
                }
                break;
            case RULE_SPECIAL__SUBSEQUENT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:228:2: ( ruleInitial )
                    {
                    // InternalMyDsl.g:228:2: ( ruleInitial )
                    // InternalMyDsl.g:229:3: ruleInitial
                    {
                     before(grammarAccess.getSubsequentAccess().getInitialParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInitial();

                    state._fsp--;

                     after(grammarAccess.getSubsequentAccess().getInitialParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:234:2: ( RULE_DIGIT )
                    {
                    // InternalMyDsl.g:234:2: ( RULE_DIGIT )
                    // InternalMyDsl.g:235:3: RULE_DIGIT
                    {
                     before(grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1()); 
                    match(input,RULE_DIGIT,FOLLOW_2); 
                     after(grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:240:2: ( RULE_SPECIAL__SUBSEQUENT )
                    {
                    // InternalMyDsl.g:240:2: ( RULE_SPECIAL__SUBSEQUENT )
                    // InternalMyDsl.g:241:3: RULE_SPECIAL__SUBSEQUENT
                    {
                     before(grammarAccess.getSubsequentAccess().getSPECIAL__SUBSEQUENTTerminalRuleCall_2()); 
                    match(input,RULE_SPECIAL__SUBSEQUENT,FOLLOW_2); 
                     after(grammarAccess.getSubsequentAccess().getSPECIAL__SUBSEQUENTTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsequent__Alternatives"


    // $ANTLR start "rule__Expression_Keyword__Alternatives"
    // InternalMyDsl.g:250:1: rule__Expression_Keyword__Alternatives : ( ( 'quote' ) | ( 'lambda' ) | ( 'if' ) | ( 'set!' ) | ( 'begin' ) | ( 'cond' ) | ( 'and' ) | ( 'or' ) | ( 'case' ) | ( 'let' ) | ( 'let*' ) | ( 'letrec' ) | ( 'do' ) | ( 'delay' ) | ( 'quasiquote' ) );
    public final void rule__Expression_Keyword__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:254:1: ( ( 'quote' ) | ( 'lambda' ) | ( 'if' ) | ( 'set!' ) | ( 'begin' ) | ( 'cond' ) | ( 'and' ) | ( 'or' ) | ( 'case' ) | ( 'let' ) | ( 'let*' ) | ( 'letrec' ) | ( 'do' ) | ( 'delay' ) | ( 'quasiquote' ) )
            int alt4=15;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            case 25:
                {
                alt4=8;
                }
                break;
            case 26:
                {
                alt4=9;
                }
                break;
            case 27:
                {
                alt4=10;
                }
                break;
            case 28:
                {
                alt4=11;
                }
                break;
            case 29:
                {
                alt4=12;
                }
                break;
            case 30:
                {
                alt4=13;
                }
                break;
            case 31:
                {
                alt4=14;
                }
                break;
            case 32:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:255:2: ( 'quote' )
                    {
                    // InternalMyDsl.g:255:2: ( 'quote' )
                    // InternalMyDsl.g:256:3: 'quote'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getQuoteKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getQuoteKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:2: ( 'lambda' )
                    {
                    // InternalMyDsl.g:261:2: ( 'lambda' )
                    // InternalMyDsl.g:262:3: 'lambda'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getLambdaKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getLambdaKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:267:2: ( 'if' )
                    {
                    // InternalMyDsl.g:267:2: ( 'if' )
                    // InternalMyDsl.g:268:3: 'if'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getIfKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getIfKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:273:2: ( 'set!' )
                    {
                    // InternalMyDsl.g:273:2: ( 'set!' )
                    // InternalMyDsl.g:274:3: 'set!'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getSetKeyword_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getSetKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:279:2: ( 'begin' )
                    {
                    // InternalMyDsl.g:279:2: ( 'begin' )
                    // InternalMyDsl.g:280:3: 'begin'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getBeginKeyword_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getBeginKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:285:2: ( 'cond' )
                    {
                    // InternalMyDsl.g:285:2: ( 'cond' )
                    // InternalMyDsl.g:286:3: 'cond'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getCondKeyword_5()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getCondKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:291:2: ( 'and' )
                    {
                    // InternalMyDsl.g:291:2: ( 'and' )
                    // InternalMyDsl.g:292:3: 'and'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getAndKeyword_6()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getAndKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:297:2: ( 'or' )
                    {
                    // InternalMyDsl.g:297:2: ( 'or' )
                    // InternalMyDsl.g:298:3: 'or'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getOrKeyword_7()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getOrKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:303:2: ( 'case' )
                    {
                    // InternalMyDsl.g:303:2: ( 'case' )
                    // InternalMyDsl.g:304:3: 'case'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getCaseKeyword_8()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getCaseKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:309:2: ( 'let' )
                    {
                    // InternalMyDsl.g:309:2: ( 'let' )
                    // InternalMyDsl.g:310:3: 'let'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getLetKeyword_9()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getLetKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:315:2: ( 'let*' )
                    {
                    // InternalMyDsl.g:315:2: ( 'let*' )
                    // InternalMyDsl.g:316:3: 'let*'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getLetKeyword_10()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getLetKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:321:2: ( 'letrec' )
                    {
                    // InternalMyDsl.g:321:2: ( 'letrec' )
                    // InternalMyDsl.g:322:3: 'letrec'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getLetrecKeyword_11()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getLetrecKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:327:2: ( 'do' )
                    {
                    // InternalMyDsl.g:327:2: ( 'do' )
                    // InternalMyDsl.g:328:3: 'do'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getDoKeyword_12()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getDoKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:333:2: ( 'delay' )
                    {
                    // InternalMyDsl.g:333:2: ( 'delay' )
                    // InternalMyDsl.g:334:3: 'delay'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getDelayKeyword_13()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getDelayKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:339:2: ( 'quasiquote' )
                    {
                    // InternalMyDsl.g:339:2: ( 'quasiquote' )
                    // InternalMyDsl.g:340:3: 'quasiquote'
                    {
                     before(grammarAccess.getExpression_KeywordAccess().getQuasiquoteKeyword_14()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getExpression_KeywordAccess().getQuasiquoteKeyword_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Keyword__Alternatives"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalMyDsl.g:349:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalMyDsl.g:354:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalMyDsl.g:361:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( ( 'Hello' ) )
            // InternalMyDsl.g:366:1: ( 'Hello' )
            {
            // InternalMyDsl.g:366:1: ( 'Hello' )
            // InternalMyDsl.g:367:2: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalMyDsl.g:376:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalMyDsl.g:381:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalMyDsl.g:388:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalMyDsl.g:393:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:393:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalMyDsl.g:394:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:395:2: ( rule__Greeting__NameAssignment_1 )
            // InternalMyDsl.g:395:3: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalMyDsl.g:403:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( rule__Greeting__Group__2__Impl )
            // InternalMyDsl.g:408:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalMyDsl.g:414:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( ( '!' ) )
            // InternalMyDsl.g:419:1: ( '!' )
            {
            // InternalMyDsl.g:419:1: ( '!' )
            // InternalMyDsl.g:420:2: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalMyDsl.g:430:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ruleGreeting ) )
            // InternalMyDsl.g:435:2: ( ruleGreeting )
            {
            // InternalMyDsl.g:435:2: ( ruleGreeting )
            // InternalMyDsl.g:436:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalMyDsl.g:445:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:450:2: ( RULE_ID )
            {
            // InternalMyDsl.g:450:2: ( RULE_ID )
            // InternalMyDsl.g:451:3: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000000L});

}