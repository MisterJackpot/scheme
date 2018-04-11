package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'quote' )
            // InternalMyDsl.g:11:9: 'quote'
            {
            match("quote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'lambda' )
            // InternalMyDsl.g:12:9: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'if' )
            // InternalMyDsl.g:13:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'set!' )
            // InternalMyDsl.g:14:9: 'set!'
            {
            match("set!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'begin' )
            // InternalMyDsl.g:15:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'cond' )
            // InternalMyDsl.g:16:9: 'cond'
            {
            match("cond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'and' )
            // InternalMyDsl.g:17:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'or' )
            // InternalMyDsl.g:18:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'case' )
            // InternalMyDsl.g:19:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'let' )
            // InternalMyDsl.g:20:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'let*' )
            // InternalMyDsl.g:21:9: 'let*'
            {
            match("let*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'letrec' )
            // InternalMyDsl.g:22:9: 'letrec'
            {
            match("letrec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'do' )
            // InternalMyDsl.g:23:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'delay' )
            // InternalMyDsl.g:24:9: 'delay'
            {
            match("delay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'quasiquote' )
            // InternalMyDsl.g:25:9: 'quasiquote'
            {
            match("quasiquote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'Hello' )
            // InternalMyDsl.g:26:9: 'Hello'
            {
            match("Hello"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '!' )
            // InternalMyDsl.g:27:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:460:12: ( '0' .. '9' )
            // InternalMyDsl.g:460:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            int _type = RULE_LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:462:13: ( 'a' .. 'z' )
            // InternalMyDsl.g:462:15: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_WHITE_SPACE"
    public final void mRULE_WHITE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_WHITE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:464:18: ( ( ' ' | '\\n' ) )
            // InternalMyDsl.g:464:20: ( ' ' | '\\n' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHITE_SPACE"

    // $ANTLR start "RULE_DELIMITER"
    public final void mRULE_DELIMITER() throws RecognitionException {
        try {
            int _type = RULE_DELIMITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:466:16: ( ( RULE_WHITE_SPACE | '(' | ')' | '\"' | ';' ) )
            // InternalMyDsl.g:466:18: ( RULE_WHITE_SPACE | '(' | ')' | '\"' | ';' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)==' '||input.LA(1)=='\"'||(input.LA(1)>='(' && input.LA(1)<=')')||input.LA(1)==';' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DELIMITER"

    // $ANTLR start "RULE_SPECIAL__SUBSEQUENT"
    public final void mRULE_SPECIAL__SUBSEQUENT() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL__SUBSEQUENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:468:26: ( ( '.' | '+' | '-' ) )
            // InternalMyDsl.g:468:28: ( '.' | '+' | '-' )
            {
            if ( input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECIAL__SUBSEQUENT"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:470:14: ( ';' ( options {greedy=false; } : . )* '\\n' )
            // InternalMyDsl.g:470:16: ';' ( options {greedy=false; } : . )* '\\n'
            {
            match(';'); 
            // InternalMyDsl.g:470:20: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:470:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_PECULIAR__IDENTIFIER"
    public final void mRULE_PECULIAR__IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_PECULIAR__IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:472:27: ( ( '+' | '-' | '...' ) )
            // InternalMyDsl.g:472:29: ( '+' | '-' | '...' )
            {
            // InternalMyDsl.g:472:29: ( '+' | '-' | '...' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt2=1;
                }
                break;
            case '-':
                {
                alt2=2;
                }
                break;
            case '.':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:472:30: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:472:34: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:472:38: '...'
                    {
                    match("..."); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PECULIAR__IDENTIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:474:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:474:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:474:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:474:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:474:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:476:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:476:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:476:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:476:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:478:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:478:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:478:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:478:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:478:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:478:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:478:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:478:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:478:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:478:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:478:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:480:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:480:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:480:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:480:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:482:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:482:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:482:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:482:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:482:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:482:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:482:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:482:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:484:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:484:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:484:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:486:16: ( . )
            // InternalMyDsl.g:486:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DIGIT | RULE_LETTER | RULE_WHITE_SPACE | RULE_DELIMITER | RULE_SPECIAL__SUBSEQUENT | RULE_COMMENT | RULE_PECULIAR__IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=31;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMyDsl.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:123: RULE_LETTER
                {
                mRULE_LETTER(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:135: RULE_WHITE_SPACE
                {
                mRULE_WHITE_SPACE(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:152: RULE_DELIMITER
                {
                mRULE_DELIMITER(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:167: RULE_SPECIAL__SUBSEQUENT
                {
                mRULE_SPECIAL__SUBSEQUENT(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:192: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:205: RULE_PECULIAR__IDENTIFIER
                {
                mRULE_PECULIAR__IDENTIFIER(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:231: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:239: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:248: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:260: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:276: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:292: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:300: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\11\35\1\34\1\uffff\1\53\1\35\1\55\1\57\1\uffff\1\57\1\uffff\1\61\1\32\2\uffff\2\32\2\uffff\1\34\2\uffff\2\34\1\72\5\34\1\100\1\101\2\34\14\uffff\3\34\1\111\1\uffff\4\34\1\116\2\uffff\5\34\1\uffff\1\34\2\uffff\1\34\1\126\1\127\1\uffff\2\34\1\132\3\34\1\136\2\uffff\1\137\1\140\1\uffff\1\34\1\142\1\143\3\uffff\1\34\2\uffff\2\34\1\147\1\uffff";
    static final String DFA14_eofS =
        "\150\uffff";
    static final String DFA14_minS =
        "\1\0\11\60\1\145\1\uffff\2\60\1\11\1\0\1\uffff\1\0\1\uffff\1\56\1\101\2\uffff\1\0\1\52\2\uffff\1\141\2\uffff\1\155\1\164\1\60\1\164\1\147\1\156\1\163\1\144\2\60\2\154\14\uffff\1\164\1\163\1\142\1\52\1\uffff\1\41\1\151\1\144\1\145\1\60\2\uffff\1\141\1\154\1\145\1\151\1\144\1\uffff\1\145\2\uffff\1\156\2\60\1\uffff\1\171\1\157\1\60\1\161\1\141\1\143\1\60\2\uffff\2\60\1\uffff\1\165\2\60\3\uffff\1\157\2\uffff\1\164\1\145\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\11\172\1\145\1\uffff\1\71\1\172\1\40\1\uffff\1\uffff\1\uffff\1\uffff\1\56\1\172\2\uffff\1\uffff\1\57\2\uffff\1\157\2\uffff\1\155\1\164\1\172\1\164\1\147\1\156\1\163\1\144\2\172\2\154\14\uffff\1\164\1\163\1\142\1\172\1\uffff\1\41\1\151\1\144\1\145\1\172\2\uffff\1\141\1\154\1\145\1\151\1\144\1\uffff\1\145\2\uffff\1\156\2\172\1\uffff\1\171\1\157\1\172\1\161\1\141\1\143\1\172\2\uffff\2\172\1\uffff\1\165\2\172\3\uffff\1\157\2\uffff\1\164\1\145\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\13\uffff\1\21\4\uffff\1\26\1\uffff\1\26\2\uffff\1\31\1\25\2\uffff\1\36\1\37\1\uffff\1\31\1\23\14\uffff\1\21\1\22\1\32\1\24\1\36\1\25\1\27\1\26\1\33\1\30\1\34\1\35\4\uffff\1\3\5\uffff\1\10\1\15\5\uffff\1\13\1\uffff\1\12\1\4\3\uffff\1\7\7\uffff\1\6\1\11\2\uffff\1\1\3\uffff\1\5\1\16\1\20\1\uffff\1\2\1\14\3\uffff\1\17";
    static final String DFA14_specialS =
        "\1\1\16\uffff\1\3\1\uffff\1\0\5\uffff\1\2\120\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\32\1\31\1\16\2\32\1\31\22\32\1\16\1\13\1\21\4\32\1\27\2\26\1\32\1\20\1\32\1\22\1\23\1\30\12\14\1\32\1\17\5\32\7\25\1\12\22\25\3\32\1\24\1\25\1\32\1\7\1\5\1\6\1\11\4\15\1\3\2\15\1\2\2\15\1\10\1\15\1\1\1\15\1\4\7\15\uff85\32",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\24\34\1\33\5\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\1\36\3\34\1\37\25\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\5\34\1\40\24\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\41\25\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\42\25\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\1\44\15\34\1\43\13\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\45\14\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\46\10\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\4\34\1\50\11\34\1\47\13\34",
            "\1\51",
            "",
            "\12\54",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\2\56\2\uffff\1\56\22\uffff\1\56",
            "\0\60",
            "",
            "\0\62",
            "",
            "\1\63",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\62",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "\1\67\15\uffff\1\66",
            "",
            "",
            "\1\70",
            "\1\71",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107\5\uffff\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\110\10\34",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "",
            "",
            "\1\125",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\130",
            "\1\131",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\141",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DIGIT | RULE_LETTER | RULE_WHITE_SPACE | RULE_DELIMITER | RULE_SPECIAL__SUBSEQUENT | RULE_COMMENT | RULE_PECULIAR__IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 50;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='q') ) {s = 1;}

                        else if ( (LA14_0=='l') ) {s = 2;}

                        else if ( (LA14_0=='i') ) {s = 3;}

                        else if ( (LA14_0=='s') ) {s = 4;}

                        else if ( (LA14_0=='b') ) {s = 5;}

                        else if ( (LA14_0=='c') ) {s = 6;}

                        else if ( (LA14_0=='a') ) {s = 7;}

                        else if ( (LA14_0=='o') ) {s = 8;}

                        else if ( (LA14_0=='d') ) {s = 9;}

                        else if ( (LA14_0=='H') ) {s = 10;}

                        else if ( (LA14_0=='!') ) {s = 11;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 12;}

                        else if ( ((LA14_0>='e' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='n')||LA14_0=='p'||LA14_0=='r'||(LA14_0>='t' && LA14_0<='z')) ) {s = 13;}

                        else if ( (LA14_0=='\n'||LA14_0==' ') ) {s = 14;}

                        else if ( (LA14_0==';') ) {s = 15;}

                        else if ( (LA14_0=='+') ) {s = 16;}

                        else if ( (LA14_0=='\"') ) {s = 17;}

                        else if ( (LA14_0=='-') ) {s = 18;}

                        else if ( (LA14_0=='.') ) {s = 19;}

                        else if ( (LA14_0=='^') ) {s = 20;}

                        else if ( ((LA14_0>='A' && LA14_0<='G')||(LA14_0>='I' && LA14_0<='Z')||LA14_0=='_') ) {s = 21;}

                        else if ( ((LA14_0>='(' && LA14_0<=')')) ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( (LA14_0=='\t'||LA14_0=='\r') ) {s = 25;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||LA14_0=='*'||LA14_0==','||LA14_0==':'||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 50;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 48;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}