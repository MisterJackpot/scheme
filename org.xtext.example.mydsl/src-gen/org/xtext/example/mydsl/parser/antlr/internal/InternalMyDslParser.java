package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WHITE_SPACE", "RULE_COMMENT", "RULE_LETTER", "RULE_DIGIT", "RULE_SPECIAL__SUBSEQUENT", "RULE_DELIMITER", "RULE_PECULIAR__IDENTIFIER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'quote'", "'lambda'", "'if'", "'set!'", "'begin'", "'cond'", "'and'", "'or'", "'case'", "'let'", "'let*'", "'letrec'", "'do'", "'delay'", "'quasiquote'"
    };
    public static final int RULE_STRING=13;
    public static final int RULE_SPECIAL__SUBSEQUENT=9;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=16;
    public static final int RULE_DIGIT=8;
    public static final int RULE_COMMENT=6;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_LETTER=7;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Greeting");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalMyDsl.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:107:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // InternalMyDsl.g:115:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleAtmosphere"
    // InternalMyDsl.g:145:1: entryRuleAtmosphere returns [String current=null] : iv_ruleAtmosphere= ruleAtmosphere EOF ;
    public final String entryRuleAtmosphere() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtmosphere = null;


        try {
            // InternalMyDsl.g:145:50: (iv_ruleAtmosphere= ruleAtmosphere EOF )
            // InternalMyDsl.g:146:2: iv_ruleAtmosphere= ruleAtmosphere EOF
            {
             newCompositeNode(grammarAccess.getAtmosphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtmosphere=ruleAtmosphere();

            state._fsp--;

             current =iv_ruleAtmosphere.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtmosphere"


    // $ANTLR start "ruleAtmosphere"
    // InternalMyDsl.g:152:1: ruleAtmosphere returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WHITE_SPACE_0= RULE_WHITE_SPACE | this_COMMENT_1= RULE_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleAtmosphere() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WHITE_SPACE_0=null;
        Token this_COMMENT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:158:2: ( (this_WHITE_SPACE_0= RULE_WHITE_SPACE | this_COMMENT_1= RULE_COMMENT ) )
            // InternalMyDsl.g:159:2: (this_WHITE_SPACE_0= RULE_WHITE_SPACE | this_COMMENT_1= RULE_COMMENT )
            {
            // InternalMyDsl.g:159:2: (this_WHITE_SPACE_0= RULE_WHITE_SPACE | this_COMMENT_1= RULE_COMMENT )
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
                    // InternalMyDsl.g:160:3: this_WHITE_SPACE_0= RULE_WHITE_SPACE
                    {
                    this_WHITE_SPACE_0=(Token)match(input,RULE_WHITE_SPACE,FOLLOW_2); 

                    			current.merge(this_WHITE_SPACE_0);
                    		

                    			newLeafNode(this_WHITE_SPACE_0, grammarAccess.getAtmosphereAccess().getWHITE_SPACETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:168:3: this_COMMENT_1= RULE_COMMENT
                    {
                    this_COMMENT_1=(Token)match(input,RULE_COMMENT,FOLLOW_2); 

                    			current.merge(this_COMMENT_1);
                    		

                    			newLeafNode(this_COMMENT_1, grammarAccess.getAtmosphereAccess().getCOMMENTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtmosphere"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:179:1: entryRuleInitial returns [String current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final String entryRuleInitial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitial = null;


        try {
            // InternalMyDsl.g:179:47: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyDsl.g:180:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:186:1: ruleInitial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_LETTER_0= RULE_LETTER ;
    public final AntlrDatatypeRuleToken ruleInitial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LETTER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:192:2: (this_LETTER_0= RULE_LETTER )
            // InternalMyDsl.g:193:2: this_LETTER_0= RULE_LETTER
            {
            this_LETTER_0=(Token)match(input,RULE_LETTER,FOLLOW_2); 

            		current.merge(this_LETTER_0);
            	

            		newLeafNode(this_LETTER_0, grammarAccess.getInitialAccess().getLETTERTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleSubsequent"
    // InternalMyDsl.g:203:1: entryRuleSubsequent returns [String current=null] : iv_ruleSubsequent= ruleSubsequent EOF ;
    public final String entryRuleSubsequent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSubsequent = null;


        try {
            // InternalMyDsl.g:203:50: (iv_ruleSubsequent= ruleSubsequent EOF )
            // InternalMyDsl.g:204:2: iv_ruleSubsequent= ruleSubsequent EOF
            {
             newCompositeNode(grammarAccess.getSubsequentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsequent=ruleSubsequent();

            state._fsp--;

             current =iv_ruleSubsequent.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsequent"


    // $ANTLR start "ruleSubsequent"
    // InternalMyDsl.g:210:1: ruleSubsequent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Initial_0= ruleInitial | this_DIGIT_1= RULE_DIGIT | this_SPECIAL__SUBSEQUENT_2= RULE_SPECIAL__SUBSEQUENT ) ;
    public final AntlrDatatypeRuleToken ruleSubsequent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_1=null;
        Token this_SPECIAL__SUBSEQUENT_2=null;
        AntlrDatatypeRuleToken this_Initial_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:216:2: ( (this_Initial_0= ruleInitial | this_DIGIT_1= RULE_DIGIT | this_SPECIAL__SUBSEQUENT_2= RULE_SPECIAL__SUBSEQUENT ) )
            // InternalMyDsl.g:217:2: (this_Initial_0= ruleInitial | this_DIGIT_1= RULE_DIGIT | this_SPECIAL__SUBSEQUENT_2= RULE_SPECIAL__SUBSEQUENT )
            {
            // InternalMyDsl.g:217:2: (this_Initial_0= ruleInitial | this_DIGIT_1= RULE_DIGIT | this_SPECIAL__SUBSEQUENT_2= RULE_SPECIAL__SUBSEQUENT )
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
                    // InternalMyDsl.g:218:3: this_Initial_0= ruleInitial
                    {

                    			newCompositeNode(grammarAccess.getSubsequentAccess().getInitialParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initial_0=ruleInitial();

                    state._fsp--;


                    			current.merge(this_Initial_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:229:3: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

                    			current.merge(this_DIGIT_1);
                    		

                    			newLeafNode(this_DIGIT_1, grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:237:3: this_SPECIAL__SUBSEQUENT_2= RULE_SPECIAL__SUBSEQUENT
                    {
                    this_SPECIAL__SUBSEQUENT_2=(Token)match(input,RULE_SPECIAL__SUBSEQUENT,FOLLOW_2); 

                    			current.merge(this_SPECIAL__SUBSEQUENT_2);
                    		

                    			newLeafNode(this_SPECIAL__SUBSEQUENT_2, grammarAccess.getSubsequentAccess().getSPECIAL__SUBSEQUENTTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsequent"


    // $ANTLR start "entryRuleExpression_Keyword"
    // InternalMyDsl.g:248:1: entryRuleExpression_Keyword returns [String current=null] : iv_ruleExpression_Keyword= ruleExpression_Keyword EOF ;
    public final String entryRuleExpression_Keyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression_Keyword = null;


        try {
            // InternalMyDsl.g:248:58: (iv_ruleExpression_Keyword= ruleExpression_Keyword EOF )
            // InternalMyDsl.g:249:2: iv_ruleExpression_Keyword= ruleExpression_Keyword EOF
            {
             newCompositeNode(grammarAccess.getExpression_KeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Keyword=ruleExpression_Keyword();

            state._fsp--;

             current =iv_ruleExpression_Keyword.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Keyword"


    // $ANTLR start "ruleExpression_Keyword"
    // InternalMyDsl.g:255:1: ruleExpression_Keyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'quote' | kw= 'lambda' | kw= 'if' | kw= 'set!' | kw= 'begin' | kw= 'cond' | kw= 'and' | kw= 'or' | kw= 'case' | kw= 'let' | kw= 'let*' | kw= 'letrec' | kw= 'do' | kw= 'delay' | kw= 'quasiquote' ) ;
    public final AntlrDatatypeRuleToken ruleExpression_Keyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:261:2: ( (kw= 'quote' | kw= 'lambda' | kw= 'if' | kw= 'set!' | kw= 'begin' | kw= 'cond' | kw= 'and' | kw= 'or' | kw= 'case' | kw= 'let' | kw= 'let*' | kw= 'letrec' | kw= 'do' | kw= 'delay' | kw= 'quasiquote' ) )
            // InternalMyDsl.g:262:2: (kw= 'quote' | kw= 'lambda' | kw= 'if' | kw= 'set!' | kw= 'begin' | kw= 'cond' | kw= 'and' | kw= 'or' | kw= 'case' | kw= 'let' | kw= 'let*' | kw= 'letrec' | kw= 'do' | kw= 'delay' | kw= 'quasiquote' )
            {
            // InternalMyDsl.g:262:2: (kw= 'quote' | kw= 'lambda' | kw= 'if' | kw= 'set!' | kw= 'begin' | kw= 'cond' | kw= 'and' | kw= 'or' | kw= 'case' | kw= 'let' | kw= 'let*' | kw= 'letrec' | kw= 'do' | kw= 'delay' | kw= 'quasiquote' )
            int alt4=15;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            case 27:
                {
                alt4=8;
                }
                break;
            case 28:
                {
                alt4=9;
                }
                break;
            case 29:
                {
                alt4=10;
                }
                break;
            case 30:
                {
                alt4=11;
                }
                break;
            case 31:
                {
                alt4=12;
                }
                break;
            case 32:
                {
                alt4=13;
                }
                break;
            case 33:
                {
                alt4=14;
                }
                break;
            case 34:
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
                    // InternalMyDsl.g:263:3: kw= 'quote'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getQuoteKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:269:3: kw= 'lambda'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getLambdaKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:275:3: kw= 'if'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getIfKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:281:3: kw= 'set!'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getSetKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:287:3: kw= 'begin'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getBeginKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:293:3: kw= 'cond'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getCondKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:299:3: kw= 'and'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getAndKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:305:3: kw= 'or'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getOrKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:311:3: kw= 'case'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getCaseKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:317:3: kw= 'let'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getLetKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:323:3: kw= 'let*'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getLetKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:329:3: kw= 'letrec'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getLetrecKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:335:3: kw= 'do'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getDoKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:341:3: kw= 'delay'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getDelayKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:347:3: kw= 'quasiquote'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getExpression_KeywordAccess().getQuasiquoteKeyword_14());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Keyword"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});

}