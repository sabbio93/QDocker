package xtext.qactor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.qactor.services.QADockerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQADockerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_VARID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'-testing'", "'TDDO'", "'Event'", "':'", "'Signal'", "'Token'", "'Dispatch'", "'Request'", "'Invitation'", "'Context'", "'ip'", "'-g'", "'-standalone'", "'-httpserver'", "'QActor'", "'context'", "'{'", "'Rules'", "'}'", "':-'", "','", "'.'", "'('", "')'", "'Actor'", "'<-'", "'is'", "'+'", "'!'", "'int'", "'='", "'String'", "'Action'", "'undoable'", "'maxtime'", "'arg'", "';'", "'Plan'", "'normal'", "'resumeLastPlan'", "'else'", "'['", "'not'", "']'", "'??'", "'!?'", "'execute'", "'with'", "'dosentence'", "'solve'", "'onFailSwitchTo'", "'demo'", "'actorOp'", "'dummyRobotMove'", "'println'", "'printCurrentEvent'", "'-memo'", "'printCurrentMessage'", "'memoCurrentEvent'", "'-lastonly'", "'memoCurrentMessage'", "'getActivationEvent'", "'getSensedEvent'", "'loadPlan'", "'runPlan'", "'suspendLastPlan'", "'repeatPlan'", "'switchToPlan'", "'endPlan'", "'endQActor'", "'addRule'", "'removeRule'", "'forward'", "'-m'", "'demand'", "'answHandle'", "'replyToCaller'", "'receiveMsg'", "'sender'", "'content'", "'receiveTheMsg'", "'m'", "'receiveAndSwitch'", "'->'", "'emit'", "'sense'", "'onMsg'", "'onEvent'", "'continue'", "'photo'", "'sound'", "'video'", "'delay'", "'answerEv'", "'EventHandler'", "'for'", "'-print'", "'memo'", "'forwardEvent'", "'currentEvent'", "'react'", "'or'", "'event'", "'when'", "'time'", "'host='", "'port='", "'file'", "'white'", "'gray'", "'blue'", "'green'", "'yellow'", "'cyan'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_VARID=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalQADockerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQADockerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQADockerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQADocker.g"; }



     	private QADockerGrammarAccess grammarAccess;

        public InternalQADockerParser(TokenStream input, QADockerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QActorSystem";
       	}

       	@Override
       	protected QADockerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQActorSystem"
    // InternalQADocker.g:65:1: entryRuleQActorSystem returns [EObject current=null] : iv_ruleQActorSystem= ruleQActorSystem EOF ;
    public final EObject entryRuleQActorSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQActorSystem = null;


        try {
            // InternalQADocker.g:65:53: (iv_ruleQActorSystem= ruleQActorSystem EOF )
            // InternalQADocker.g:66:2: iv_ruleQActorSystem= ruleQActorSystem EOF
            {
             newCompositeNode(grammarAccess.getQActorSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQActorSystem=ruleQActorSystem();

            state._fsp--;

             current =iv_ruleQActorSystem; 
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
    // $ANTLR end "entryRuleQActorSystem"


    // $ANTLR start "ruleQActorSystem"
    // InternalQADocker.g:72:1: ruleQActorSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_spec_1_0= ruleQActorSystemSpec ) ) ) ;
    public final EObject ruleQActorSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_spec_1_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:78:2: ( (otherlv_0= 'System' ( (lv_spec_1_0= ruleQActorSystemSpec ) ) ) )
            // InternalQADocker.g:79:2: (otherlv_0= 'System' ( (lv_spec_1_0= ruleQActorSystemSpec ) ) )
            {
            // InternalQADocker.g:79:2: (otherlv_0= 'System' ( (lv_spec_1_0= ruleQActorSystemSpec ) ) )
            // InternalQADocker.g:80:3: otherlv_0= 'System' ( (lv_spec_1_0= ruleQActorSystemSpec ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQActorSystemAccess().getSystemKeyword_0());
            		
            // InternalQADocker.g:84:3: ( (lv_spec_1_0= ruleQActorSystemSpec ) )
            // InternalQADocker.g:85:4: (lv_spec_1_0= ruleQActorSystemSpec )
            {
            // InternalQADocker.g:85:4: (lv_spec_1_0= ruleQActorSystemSpec )
            // InternalQADocker.g:86:5: lv_spec_1_0= ruleQActorSystemSpec
            {

            					newCompositeNode(grammarAccess.getQActorSystemAccess().getSpecQActorSystemSpecParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_spec_1_0=ruleQActorSystemSpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQActorSystemRule());
            					}
            					set(
            						current,
            						"spec",
            						lv_spec_1_0,
            						"xtext.qactor.QADocker.QActorSystemSpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleQActorSystem"


    // $ANTLR start "entryRuleQActorSystemSpec"
    // InternalQADocker.g:107:1: entryRuleQActorSystemSpec returns [EObject current=null] : iv_ruleQActorSystemSpec= ruleQActorSystemSpec EOF ;
    public final EObject entryRuleQActorSystemSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQActorSystemSpec = null;


        try {
            // InternalQADocker.g:107:57: (iv_ruleQActorSystemSpec= ruleQActorSystemSpec EOF )
            // InternalQADocker.g:108:2: iv_ruleQActorSystemSpec= ruleQActorSystemSpec EOF
            {
             newCompositeNode(grammarAccess.getQActorSystemSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQActorSystemSpec=ruleQActorSystemSpec();

            state._fsp--;

             current =iv_ruleQActorSystemSpec; 
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
    // $ANTLR end "entryRuleQActorSystemSpec"


    // $ANTLR start "ruleQActorSystemSpec"
    // InternalQADocker.g:114:1: ruleQActorSystemSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_testing_1_0= '-testing' ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* ( (lv_actor_4_0= ruleQActor ) )* ( (lv_robot_5_0= ruleRobot ) )? ) ;
    public final EObject ruleQActorSystemSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_testing_1_0=null;
        EObject lv_message_2_0 = null;

        EObject lv_context_3_0 = null;

        EObject lv_actor_4_0 = null;

        EObject lv_robot_5_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:120:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_testing_1_0= '-testing' ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* ( (lv_actor_4_0= ruleQActor ) )* ( (lv_robot_5_0= ruleRobot ) )? ) )
            // InternalQADocker.g:121:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_testing_1_0= '-testing' ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* ( (lv_actor_4_0= ruleQActor ) )* ( (lv_robot_5_0= ruleRobot ) )? )
            {
            // InternalQADocker.g:121:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_testing_1_0= '-testing' ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* ( (lv_actor_4_0= ruleQActor ) )* ( (lv_robot_5_0= ruleRobot ) )? )
            // InternalQADocker.g:122:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_testing_1_0= '-testing' ) )? ( (lv_message_2_0= ruleMessage ) )* ( (lv_context_3_0= ruleContext ) )* ( (lv_actor_4_0= ruleQActor ) )* ( (lv_robot_5_0= ruleRobot ) )?
            {
            // InternalQADocker.g:122:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalQADocker.g:123:4: (lv_name_0_0= RULE_ID )
            {
            // InternalQADocker.g:123:4: (lv_name_0_0= RULE_ID )
            // InternalQADocker.g:124:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQActorSystemSpecAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQActorSystemSpecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQADocker.g:140:3: ( (lv_testing_1_0= '-testing' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQADocker.g:141:4: (lv_testing_1_0= '-testing' )
                    {
                    // InternalQADocker.g:141:4: (lv_testing_1_0= '-testing' )
                    // InternalQADocker.g:142:5: lv_testing_1_0= '-testing'
                    {
                    lv_testing_1_0=(Token)match(input,13,FOLLOW_5); 

                    					newLeafNode(lv_testing_1_0, grammarAccess.getQActorSystemSpecAccess().getTestingTestingKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQActorSystemSpecRule());
                    					}
                    					setWithLastConsumed(current, "testing", true, "-testing");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:154:3: ( (lv_message_2_0= ruleMessage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||(LA2_0>=17 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQADocker.g:155:4: (lv_message_2_0= ruleMessage )
            	    {
            	    // InternalQADocker.g:155:4: (lv_message_2_0= ruleMessage )
            	    // InternalQADocker.g:156:5: lv_message_2_0= ruleMessage
            	    {

            	    					newCompositeNode(grammarAccess.getQActorSystemSpecAccess().getMessageMessageParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_message_2_0=ruleMessage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorSystemSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"message",
            	    						lv_message_2_0,
            	    						"xtext.qactor.QADocker.Message");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalQADocker.g:173:3: ( (lv_context_3_0= ruleContext ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQADocker.g:174:4: (lv_context_3_0= ruleContext )
            	    {
            	    // InternalQADocker.g:174:4: (lv_context_3_0= ruleContext )
            	    // InternalQADocker.g:175:5: lv_context_3_0= ruleContext
            	    {

            	    					newCompositeNode(grammarAccess.getQActorSystemSpecAccess().getContextContextParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_context_3_0=ruleContext();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorSystemSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"context",
            	    						lv_context_3_0,
            	    						"xtext.qactor.QADocker.Context");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalQADocker.g:192:3: ( (lv_actor_4_0= ruleQActor ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQADocker.g:193:4: (lv_actor_4_0= ruleQActor )
            	    {
            	    // InternalQADocker.g:193:4: (lv_actor_4_0= ruleQActor )
            	    // InternalQADocker.g:194:5: lv_actor_4_0= ruleQActor
            	    {

            	    					newCompositeNode(grammarAccess.getQActorSystemSpecAccess().getActorQActorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_actor_4_0=ruleQActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorSystemSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actor",
            	    						lv_actor_4_0,
            	    						"xtext.qactor.QADocker.QActor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalQADocker.g:211:3: ( (lv_robot_5_0= ruleRobot ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQADocker.g:212:4: (lv_robot_5_0= ruleRobot )
                    {
                    // InternalQADocker.g:212:4: (lv_robot_5_0= ruleRobot )
                    // InternalQADocker.g:213:5: lv_robot_5_0= ruleRobot
                    {

                    					newCompositeNode(grammarAccess.getQActorSystemSpecAccess().getRobotRobotParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_robot_5_0=ruleRobot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQActorSystemSpecRule());
                    					}
                    					set(
                    						current,
                    						"robot",
                    						lv_robot_5_0,
                    						"xtext.qactor.QADocker.Robot");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleQActorSystemSpec"


    // $ANTLR start "entryRuleRobot"
    // InternalQADocker.g:234:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalQADocker.g:234:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalQADocker.g:235:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalQADocker.g:241:1: ruleRobot returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_actor_1_0= ruleQActor ) ) otherlv_2= 'TDDO' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_actor_1_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:247:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_actor_1_0= ruleQActor ) ) otherlv_2= 'TDDO' ) )
            // InternalQADocker.g:248:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_actor_1_0= ruleQActor ) ) otherlv_2= 'TDDO' )
            {
            // InternalQADocker.g:248:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_actor_1_0= ruleQActor ) ) otherlv_2= 'TDDO' )
            // InternalQADocker.g:249:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_actor_1_0= ruleQActor ) ) otherlv_2= 'TDDO'
            {
            // InternalQADocker.g:249:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalQADocker.g:250:4: (lv_name_0_0= RULE_ID )
            {
            // InternalQADocker.g:250:4: (lv_name_0_0= RULE_ID )
            // InternalQADocker.g:251:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQADocker.g:267:3: ( (lv_actor_1_0= ruleQActor ) )
            // InternalQADocker.g:268:4: (lv_actor_1_0= ruleQActor )
            {
            // InternalQADocker.g:268:4: (lv_actor_1_0= ruleQActor )
            // InternalQADocker.g:269:5: lv_actor_1_0= ruleQActor
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getActorQActorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_actor_1_0=ruleQActor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"actor",
            						lv_actor_1_0,
            						"xtext.qactor.QADocker.QActor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getTDDOKeyword_2());
            		

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMessage"
    // InternalQADocker.g:294:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalQADocker.g:294:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalQADocker.g:295:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalQADocker.g:301:1: ruleMessage returns [EObject current=null] : (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_OutOnlyMessage_0 = null;

        EObject this_OutInMessage_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:307:2: ( (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage ) )
            // InternalQADocker.g:308:2: (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage )
            {
            // InternalQADocker.g:308:2: (this_OutOnlyMessage_0= ruleOutOnlyMessage | this_OutInMessage_1= ruleOutInMessage )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15||(LA6_0>=17 && LA6_0<=19)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQADocker.g:309:3: this_OutOnlyMessage_0= ruleOutOnlyMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getOutOnlyMessageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutOnlyMessage_0=ruleOutOnlyMessage();

                    state._fsp--;


                    			current = this_OutOnlyMessage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:318:3: this_OutInMessage_1= ruleOutInMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getOutInMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutInMessage_1=ruleOutInMessage();

                    state._fsp--;


                    			current = this_OutInMessage_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleOutOnlyMessage"
    // InternalQADocker.g:330:1: entryRuleOutOnlyMessage returns [EObject current=null] : iv_ruleOutOnlyMessage= ruleOutOnlyMessage EOF ;
    public final EObject entryRuleOutOnlyMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutOnlyMessage = null;


        try {
            // InternalQADocker.g:330:55: (iv_ruleOutOnlyMessage= ruleOutOnlyMessage EOF )
            // InternalQADocker.g:331:2: iv_ruleOutOnlyMessage= ruleOutOnlyMessage EOF
            {
             newCompositeNode(grammarAccess.getOutOnlyMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutOnlyMessage=ruleOutOnlyMessage();

            state._fsp--;

             current =iv_ruleOutOnlyMessage; 
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
    // $ANTLR end "entryRuleOutOnlyMessage"


    // $ANTLR start "ruleOutOnlyMessage"
    // InternalQADocker.g:337:1: ruleOutOnlyMessage returns [EObject current=null] : (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken ) ;
    public final EObject ruleOutOnlyMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Dispatch_0 = null;

        EObject this_Event_1 = null;

        EObject this_Signal_2 = null;

        EObject this_Token_3 = null;



        	enterRule();

        try {
            // InternalQADocker.g:343:2: ( (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken ) )
            // InternalQADocker.g:344:2: (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken )
            {
            // InternalQADocker.g:344:2: (this_Dispatch_0= ruleDispatch | this_Event_1= ruleEvent | this_Signal_2= ruleSignal | this_Token_3= ruleToken )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQADocker.g:345:3: this_Dispatch_0= ruleDispatch
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getDispatchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dispatch_0=ruleDispatch();

                    state._fsp--;


                    			current = this_Dispatch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:354:3: this_Event_1= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_1=ruleEvent();

                    state._fsp--;


                    			current = this_Event_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:363:3: this_Signal_2= ruleSignal
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getSignalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Signal_2=ruleSignal();

                    state._fsp--;


                    			current = this_Signal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:372:3: this_Token_3= ruleToken
                    {

                    			newCompositeNode(grammarAccess.getOutOnlyMessageAccess().getTokenParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Token_3=ruleToken();

                    state._fsp--;


                    			current = this_Token_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOutOnlyMessage"


    // $ANTLR start "entryRuleOutInMessage"
    // InternalQADocker.g:384:1: entryRuleOutInMessage returns [EObject current=null] : iv_ruleOutInMessage= ruleOutInMessage EOF ;
    public final EObject entryRuleOutInMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutInMessage = null;


        try {
            // InternalQADocker.g:384:53: (iv_ruleOutInMessage= ruleOutInMessage EOF )
            // InternalQADocker.g:385:2: iv_ruleOutInMessage= ruleOutInMessage EOF
            {
             newCompositeNode(grammarAccess.getOutInMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutInMessage=ruleOutInMessage();

            state._fsp--;

             current =iv_ruleOutInMessage; 
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
    // $ANTLR end "entryRuleOutInMessage"


    // $ANTLR start "ruleOutInMessage"
    // InternalQADocker.g:391:1: ruleOutInMessage returns [EObject current=null] : (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation ) ;
    public final EObject ruleOutInMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Request_0 = null;

        EObject this_Invitation_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:397:2: ( (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation ) )
            // InternalQADocker.g:398:2: (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation )
            {
            // InternalQADocker.g:398:2: (this_Request_0= ruleRequest | this_Invitation_1= ruleInvitation )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQADocker.g:399:3: this_Request_0= ruleRequest
                    {

                    			newCompositeNode(grammarAccess.getOutInMessageAccess().getRequestParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Request_0=ruleRequest();

                    state._fsp--;


                    			current = this_Request_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:408:3: this_Invitation_1= ruleInvitation
                    {

                    			newCompositeNode(grammarAccess.getOutInMessageAccess().getInvitationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Invitation_1=ruleInvitation();

                    state._fsp--;


                    			current = this_Invitation_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOutInMessage"


    // $ANTLR start "entryRuleEvent"
    // InternalQADocker.g:420:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalQADocker.g:420:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalQADocker.g:421:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalQADocker.g:427:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:433:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalQADocker.g:434:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalQADocker.g:434:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalQADocker.g:435:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalQADocker.g:439:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:440:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:440:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:441:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_2());
            		
            // InternalQADocker.g:461:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalQADocker.g:462:4: (lv_msg_3_0= rulePHead )
            {
            // InternalQADocker.g:462:4: (lv_msg_3_0= rulePHead )
            // InternalQADocker.g:463:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getEventAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleSignal"
    // InternalQADocker.g:484:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalQADocker.g:484:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalQADocker.g:485:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalQADocker.g:491:1: ruleSignal returns [EObject current=null] : (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:497:2: ( (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalQADocker.g:498:2: (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalQADocker.g:498:2: (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalQADocker.g:499:3: otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalAccess().getSignalKeyword_0());
            		
            // InternalQADocker.g:503:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:504:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:504:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:505:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSignalAccess().getColonKeyword_2());
            		
            // InternalQADocker.g:525:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalQADocker.g:526:4: (lv_msg_3_0= rulePHead )
            {
            // InternalQADocker.g:526:4: (lv_msg_3_0= rulePHead )
            // InternalQADocker.g:527:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getSignalAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignalRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleToken"
    // InternalQADocker.g:548:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalQADocker.g:548:46: (iv_ruleToken= ruleToken EOF )
            // InternalQADocker.g:549:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalQADocker.g:555:1: ruleToken returns [EObject current=null] : (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:561:2: ( (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalQADocker.g:562:2: (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalQADocker.g:562:2: (otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalQADocker.g:563:3: otherlv_0= 'Token' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTokenKeyword_0());
            		
            // InternalQADocker.g:567:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:568:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:568:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:569:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTokenAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getColonKeyword_2());
            		
            // InternalQADocker.g:589:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalQADocker.g:590:4: (lv_msg_3_0= rulePHead )
            {
            // InternalQADocker.g:590:4: (lv_msg_3_0= rulePHead )
            // InternalQADocker.g:591:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getTokenAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleDispatch"
    // InternalQADocker.g:612:1: entryRuleDispatch returns [EObject current=null] : iv_ruleDispatch= ruleDispatch EOF ;
    public final EObject entryRuleDispatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispatch = null;


        try {
            // InternalQADocker.g:612:49: (iv_ruleDispatch= ruleDispatch EOF )
            // InternalQADocker.g:613:2: iv_ruleDispatch= ruleDispatch EOF
            {
             newCompositeNode(grammarAccess.getDispatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDispatch=ruleDispatch();

            state._fsp--;

             current =iv_ruleDispatch; 
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
    // $ANTLR end "entryRuleDispatch"


    // $ANTLR start "ruleDispatch"
    // InternalQADocker.g:619:1: ruleDispatch returns [EObject current=null] : (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleDispatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:625:2: ( (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalQADocker.g:626:2: (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalQADocker.g:626:2: (otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalQADocker.g:627:3: otherlv_0= 'Dispatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDispatchAccess().getDispatchKeyword_0());
            		
            // InternalQADocker.g:631:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:632:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:632:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:633:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDispatchAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDispatchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDispatchAccess().getColonKeyword_2());
            		
            // InternalQADocker.g:653:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalQADocker.g:654:4: (lv_msg_3_0= rulePHead )
            {
            // InternalQADocker.g:654:4: (lv_msg_3_0= rulePHead )
            // InternalQADocker.g:655:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getDispatchAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDispatchRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDispatch"


    // $ANTLR start "entryRuleRequest"
    // InternalQADocker.g:676:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalQADocker.g:676:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalQADocker.g:677:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
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
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalQADocker.g:683:1: ruleRequest returns [EObject current=null] : (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:689:2: ( (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalQADocker.g:690:2: (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalQADocker.g:690:2: (otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalQADocker.g:691:3: otherlv_0= 'Request' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestAccess().getRequestKeyword_0());
            		
            // InternalQADocker.g:695:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:696:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:696:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:697:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequestAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestAccess().getColonKeyword_2());
            		
            // InternalQADocker.g:717:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalQADocker.g:718:4: (lv_msg_3_0= rulePHead )
            {
            // InternalQADocker.g:718:4: (lv_msg_3_0= rulePHead )
            // InternalQADocker.g:719:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getRequestAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleInvitation"
    // InternalQADocker.g:740:1: entryRuleInvitation returns [EObject current=null] : iv_ruleInvitation= ruleInvitation EOF ;
    public final EObject entryRuleInvitation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvitation = null;


        try {
            // InternalQADocker.g:740:51: (iv_ruleInvitation= ruleInvitation EOF )
            // InternalQADocker.g:741:2: iv_ruleInvitation= ruleInvitation EOF
            {
             newCompositeNode(grammarAccess.getInvitationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvitation=ruleInvitation();

            state._fsp--;

             current =iv_ruleInvitation; 
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
    // $ANTLR end "entryRuleInvitation"


    // $ANTLR start "ruleInvitation"
    // InternalQADocker.g:747:1: ruleInvitation returns [EObject current=null] : (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) ;
    public final EObject ruleInvitation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_msg_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:753:2: ( (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) ) )
            // InternalQADocker.g:754:2: (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            {
            // InternalQADocker.g:754:2: (otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) ) )
            // InternalQADocker.g:755:3: otherlv_0= 'Invitation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_msg_3_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInvitationAccess().getInvitationKeyword_0());
            		
            // InternalQADocker.g:759:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:760:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:760:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:761:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInvitationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvitationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getInvitationAccess().getColonKeyword_2());
            		
            // InternalQADocker.g:781:3: ( (lv_msg_3_0= rulePHead ) )
            // InternalQADocker.g:782:4: (lv_msg_3_0= rulePHead )
            {
            // InternalQADocker.g:782:4: (lv_msg_3_0= rulePHead )
            // InternalQADocker.g:783:5: lv_msg_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getInvitationAccess().getMsgPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_msg_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvitationRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_3_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleInvitation"


    // $ANTLR start "entryRuleContext"
    // InternalQADocker.g:804:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalQADocker.g:804:48: (iv_ruleContext= ruleContext EOF )
            // InternalQADocker.g:805:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalQADocker.g:811:1: ruleContext returns [EObject current=null] : (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? ( (lv_standalone_6_0= '-standalone' ) )? ( (lv_httpserver_7_0= '-httpserver' ) )? ( (lv_handler_8_0= ruleEventHandler ) )* ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_env_4_0=null;
        Token lv_standalone_6_0=null;
        Token lv_httpserver_7_0=null;
        EObject lv_ip_3_0 = null;

        Enumerator lv_color_5_0 = null;

        EObject lv_handler_8_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:817:2: ( (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? ( (lv_standalone_6_0= '-standalone' ) )? ( (lv_httpserver_7_0= '-httpserver' ) )? ( (lv_handler_8_0= ruleEventHandler ) )* ) )
            // InternalQADocker.g:818:2: (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? ( (lv_standalone_6_0= '-standalone' ) )? ( (lv_httpserver_7_0= '-httpserver' ) )? ( (lv_handler_8_0= ruleEventHandler ) )* )
            {
            // InternalQADocker.g:818:2: (otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? ( (lv_standalone_6_0= '-standalone' ) )? ( (lv_httpserver_7_0= '-httpserver' ) )? ( (lv_handler_8_0= ruleEventHandler ) )* )
            // InternalQADocker.g:819:3: otherlv_0= 'Context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ip' ( (lv_ip_3_0= ruleComponentIP ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? ( (lv_standalone_6_0= '-standalone' ) )? ( (lv_httpserver_7_0= '-httpserver' ) )? ( (lv_handler_8_0= ruleEventHandler ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalQADocker.g:823:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:824:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:824:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:825:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getIpKeyword_2());
            		
            // InternalQADocker.g:845:3: ( (lv_ip_3_0= ruleComponentIP ) )
            // InternalQADocker.g:846:4: (lv_ip_3_0= ruleComponentIP )
            {
            // InternalQADocker.g:846:4: (lv_ip_3_0= ruleComponentIP )
            // InternalQADocker.g:847:5: lv_ip_3_0= ruleComponentIP
            {

            					newCompositeNode(grammarAccess.getContextAccess().getIpComponentIPParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_ip_3_0=ruleComponentIP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_3_0,
            						"xtext.qactor.QADocker.ComponentIP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:864:3: ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQADocker.g:865:4: ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) )
                    {
                    // InternalQADocker.g:865:4: ( (lv_env_4_0= '-g' ) )
                    // InternalQADocker.g:866:5: (lv_env_4_0= '-g' )
                    {
                    // InternalQADocker.g:866:5: (lv_env_4_0= '-g' )
                    // InternalQADocker.g:867:6: lv_env_4_0= '-g'
                    {
                    lv_env_4_0=(Token)match(input,24,FOLLOW_15); 

                    						newLeafNode(lv_env_4_0, grammarAccess.getContextAccess().getEnvGKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    						setWithLastConsumed(current, "env", true, "-g");
                    					

                    }


                    }

                    // InternalQADocker.g:879:4: ( (lv_color_5_0= ruleWindowColor ) )
                    // InternalQADocker.g:880:5: (lv_color_5_0= ruleWindowColor )
                    {
                    // InternalQADocker.g:880:5: (lv_color_5_0= ruleWindowColor )
                    // InternalQADocker.g:881:6: lv_color_5_0= ruleWindowColor
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getColorWindowColorEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_color_5_0=ruleWindowColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_5_0,
                    							"xtext.qactor.QADocker.WindowColor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQADocker.g:899:3: ( (lv_standalone_6_0= '-standalone' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQADocker.g:900:4: (lv_standalone_6_0= '-standalone' )
                    {
                    // InternalQADocker.g:900:4: (lv_standalone_6_0= '-standalone' )
                    // InternalQADocker.g:901:5: lv_standalone_6_0= '-standalone'
                    {
                    lv_standalone_6_0=(Token)match(input,25,FOLLOW_17); 

                    					newLeafNode(lv_standalone_6_0, grammarAccess.getContextAccess().getStandaloneStandaloneKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextRule());
                    					}
                    					setWithLastConsumed(current, "standalone", true, "-standalone");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:913:3: ( (lv_httpserver_7_0= '-httpserver' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQADocker.g:914:4: (lv_httpserver_7_0= '-httpserver' )
                    {
                    // InternalQADocker.g:914:4: (lv_httpserver_7_0= '-httpserver' )
                    // InternalQADocker.g:915:5: lv_httpserver_7_0= '-httpserver'
                    {
                    lv_httpserver_7_0=(Token)match(input,26,FOLLOW_18); 

                    					newLeafNode(lv_httpserver_7_0, grammarAccess.getContextAccess().getHttpserverHttpserverKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextRule());
                    					}
                    					setWithLastConsumed(current, "httpserver", true, "-httpserver");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:927:3: ( (lv_handler_8_0= ruleEventHandler ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==107) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQADocker.g:928:4: (lv_handler_8_0= ruleEventHandler )
            	    {
            	    // InternalQADocker.g:928:4: (lv_handler_8_0= ruleEventHandler )
            	    // InternalQADocker.g:929:5: lv_handler_8_0= ruleEventHandler
            	    {

            	    					newCompositeNode(grammarAccess.getContextAccess().getHandlerEventHandlerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_handler_8_0=ruleEventHandler();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"handler",
            	    						lv_handler_8_0,
            	    						"xtext.qactor.QADocker.EventHandler");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleQActor"
    // InternalQADocker.g:950:1: entryRuleQActor returns [EObject current=null] : iv_ruleQActor= ruleQActor EOF ;
    public final EObject entryRuleQActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQActor = null;


        try {
            // InternalQADocker.g:950:47: (iv_ruleQActor= ruleQActor EOF )
            // InternalQADocker.g:951:2: iv_ruleQActor= ruleQActor EOF
            {
             newCompositeNode(grammarAccess.getQActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQActor=ruleQActor();

            state._fsp--;

             current =iv_ruleQActor; 
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
    // $ANTLR end "entryRuleQActor"


    // $ANTLR start "ruleQActor"
    // InternalQADocker.g:957:1: ruleQActor returns [EObject current=null] : (otherlv_0= 'QActor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? otherlv_6= '{' (otherlv_7= 'Rules' otherlv_8= '{' ( (lv_rules_9_0= ruleRule ) )* otherlv_10= '}' )? ( (lv_data_11_0= ruleData ) )* ( (lv_action_12_0= ruleAction ) )* ( (lv_plans_13_0= rulePlan ) )* otherlv_14= '}' ) ;
    public final EObject ruleQActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_env_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Enumerator lv_color_5_0 = null;

        EObject lv_rules_9_0 = null;

        EObject lv_data_11_0 = null;

        EObject lv_action_12_0 = null;

        EObject lv_plans_13_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:963:2: ( (otherlv_0= 'QActor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? otherlv_6= '{' (otherlv_7= 'Rules' otherlv_8= '{' ( (lv_rules_9_0= ruleRule ) )* otherlv_10= '}' )? ( (lv_data_11_0= ruleData ) )* ( (lv_action_12_0= ruleAction ) )* ( (lv_plans_13_0= rulePlan ) )* otherlv_14= '}' ) )
            // InternalQADocker.g:964:2: (otherlv_0= 'QActor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? otherlv_6= '{' (otherlv_7= 'Rules' otherlv_8= '{' ( (lv_rules_9_0= ruleRule ) )* otherlv_10= '}' )? ( (lv_data_11_0= ruleData ) )* ( (lv_action_12_0= ruleAction ) )* ( (lv_plans_13_0= rulePlan ) )* otherlv_14= '}' )
            {
            // InternalQADocker.g:964:2: (otherlv_0= 'QActor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? otherlv_6= '{' (otherlv_7= 'Rules' otherlv_8= '{' ( (lv_rules_9_0= ruleRule ) )* otherlv_10= '}' )? ( (lv_data_11_0= ruleData ) )* ( (lv_action_12_0= ruleAction ) )* ( (lv_plans_13_0= rulePlan ) )* otherlv_14= '}' )
            // InternalQADocker.g:965:3: otherlv_0= 'QActor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'context' ( (otherlv_3= RULE_ID ) ) ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )? otherlv_6= '{' (otherlv_7= 'Rules' otherlv_8= '{' ( (lv_rules_9_0= ruleRule ) )* otherlv_10= '}' )? ( (lv_data_11_0= ruleData ) )* ( (lv_action_12_0= ruleAction ) )* ( (lv_plans_13_0= rulePlan ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQActorAccess().getQActorKeyword_0());
            		
            // InternalQADocker.g:969:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:970:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:970:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:971:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQActorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getQActorAccess().getContextKeyword_2());
            		
            // InternalQADocker.g:991:3: ( (otherlv_3= RULE_ID ) )
            // InternalQADocker.g:992:4: (otherlv_3= RULE_ID )
            {
            // InternalQADocker.g:992:4: (otherlv_3= RULE_ID )
            // InternalQADocker.g:993:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQActorRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_3, grammarAccess.getQActorAccess().getContextContextCrossReference_3_0());
            				

            }


            }

            // InternalQADocker.g:1004:3: ( ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQADocker.g:1005:4: ( (lv_env_4_0= '-g' ) ) ( (lv_color_5_0= ruleWindowColor ) )
                    {
                    // InternalQADocker.g:1005:4: ( (lv_env_4_0= '-g' ) )
                    // InternalQADocker.g:1006:5: (lv_env_4_0= '-g' )
                    {
                    // InternalQADocker.g:1006:5: (lv_env_4_0= '-g' )
                    // InternalQADocker.g:1007:6: lv_env_4_0= '-g'
                    {
                    lv_env_4_0=(Token)match(input,24,FOLLOW_15); 

                    						newLeafNode(lv_env_4_0, grammarAccess.getQActorAccess().getEnvGKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQActorRule());
                    						}
                    						setWithLastConsumed(current, "env", true, "-g");
                    					

                    }


                    }

                    // InternalQADocker.g:1019:4: ( (lv_color_5_0= ruleWindowColor ) )
                    // InternalQADocker.g:1020:5: (lv_color_5_0= ruleWindowColor )
                    {
                    // InternalQADocker.g:1020:5: (lv_color_5_0= ruleWindowColor )
                    // InternalQADocker.g:1021:6: lv_color_5_0= ruleWindowColor
                    {

                    						newCompositeNode(grammarAccess.getQActorAccess().getColorWindowColorEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_color_5_0=ruleWindowColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQActorRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_5_0,
                    							"xtext.qactor.QADocker.WindowColor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getQActorAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalQADocker.g:1043:3: (otherlv_7= 'Rules' otherlv_8= '{' ( (lv_rules_9_0= ruleRule ) )* otherlv_10= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQADocker.g:1044:4: otherlv_7= 'Rules' otherlv_8= '{' ( (lv_rules_9_0= ruleRule ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getQActorAccess().getRulesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getQActorAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalQADocker.g:1052:4: ( (lv_rules_9_0= ruleRule ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_VARID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalQADocker.g:1053:5: (lv_rules_9_0= ruleRule )
                    	    {
                    	    // InternalQADocker.g:1053:5: (lv_rules_9_0= ruleRule )
                    	    // InternalQADocker.g:1054:6: lv_rules_9_0= ruleRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getQActorAccess().getRulesRuleParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_rules_9_0=ruleRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getQActorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rules",
                    	    							lv_rules_9_0,
                    	    							"xtext.qactor.QADocker.Rule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getQActorAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalQADocker.g:1076:3: ( (lv_data_11_0= ruleData ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42||LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQADocker.g:1077:4: (lv_data_11_0= ruleData )
            	    {
            	    // InternalQADocker.g:1077:4: (lv_data_11_0= ruleData )
            	    // InternalQADocker.g:1078:5: lv_data_11_0= ruleData
            	    {

            	    					newCompositeNode(grammarAccess.getQActorAccess().getDataDataParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_data_11_0=ruleData();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_11_0,
            	    						"xtext.qactor.QADocker.Data");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalQADocker.g:1095:3: ( (lv_action_12_0= ruleAction ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQADocker.g:1096:4: (lv_action_12_0= ruleAction )
            	    {
            	    // InternalQADocker.g:1096:4: (lv_action_12_0= ruleAction )
            	    // InternalQADocker.g:1097:5: lv_action_12_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getQActorAccess().getActionActionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_action_12_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"action",
            	    						lv_action_12_0,
            	    						"xtext.qactor.QADocker.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalQADocker.g:1114:3: ( (lv_plans_13_0= rulePlan ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQADocker.g:1115:4: (lv_plans_13_0= rulePlan )
            	    {
            	    // InternalQADocker.g:1115:4: (lv_plans_13_0= rulePlan )
            	    // InternalQADocker.g:1116:5: lv_plans_13_0= rulePlan
            	    {

            	    					newCompositeNode(grammarAccess.getQActorAccess().getPlansPlanParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_plans_13_0=rulePlan();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"plans",
            	    						lv_plans_13_0,
            	    						"xtext.qactor.QADocker.Plan");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_14=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getQActorAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleQActor"


    // $ANTLR start "entryRuleRule"
    // InternalQADocker.g:1141:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalQADocker.g:1141:45: (iv_ruleRule= ruleRule EOF )
            // InternalQADocker.g:1142:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalQADocker.g:1148:1: ruleRule returns [EObject current=null] : ( ( (lv_head_0_0= rulePHead ) ) (otherlv_1= ':-' ( (lv_body_2_0= rulePTerm ) ) (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )* )? otherlv_5= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_head_0_0 = null;

        EObject lv_body_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1154:2: ( ( ( (lv_head_0_0= rulePHead ) ) (otherlv_1= ':-' ( (lv_body_2_0= rulePTerm ) ) (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )* )? otherlv_5= '.' ) )
            // InternalQADocker.g:1155:2: ( ( (lv_head_0_0= rulePHead ) ) (otherlv_1= ':-' ( (lv_body_2_0= rulePTerm ) ) (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )* )? otherlv_5= '.' )
            {
            // InternalQADocker.g:1155:2: ( ( (lv_head_0_0= rulePHead ) ) (otherlv_1= ':-' ( (lv_body_2_0= rulePTerm ) ) (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )* )? otherlv_5= '.' )
            // InternalQADocker.g:1156:3: ( (lv_head_0_0= rulePHead ) ) (otherlv_1= ':-' ( (lv_body_2_0= rulePTerm ) ) (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )* )? otherlv_5= '.'
            {
            // InternalQADocker.g:1156:3: ( (lv_head_0_0= rulePHead ) )
            // InternalQADocker.g:1157:4: (lv_head_0_0= rulePHead )
            {
            // InternalQADocker.g:1157:4: (lv_head_0_0= rulePHead )
            // InternalQADocker.g:1158:5: lv_head_0_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getHeadPHeadParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_head_0_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_0_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:1175:3: (otherlv_1= ':-' ( (lv_body_2_0= rulePTerm ) ) (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQADocker.g:1176:4: otherlv_1= ':-' ( (lv_body_2_0= rulePTerm ) ) (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )*
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_1_0());
                    			
                    // InternalQADocker.g:1180:4: ( (lv_body_2_0= rulePTerm ) )
                    // InternalQADocker.g:1181:5: (lv_body_2_0= rulePTerm )
                    {
                    // InternalQADocker.g:1181:5: (lv_body_2_0= rulePTerm )
                    // InternalQADocker.g:1182:6: lv_body_2_0= rulePTerm
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getBodyPTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_body_2_0=rulePTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						add(
                    							current,
                    							"body",
                    							lv_body_2_0,
                    							"xtext.qactor.QADocker.PTerm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQADocker.g:1199:4: (otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==33) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalQADocker.g:1200:5: otherlv_3= ',' ( (lv_body_4_0= rulePTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_28); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalQADocker.g:1204:5: ( (lv_body_4_0= rulePTerm ) )
                    	    // InternalQADocker.g:1205:6: (lv_body_4_0= rulePTerm )
                    	    {
                    	    // InternalQADocker.g:1205:6: (lv_body_4_0= rulePTerm )
                    	    // InternalQADocker.g:1206:7: lv_body_4_0= rulePTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getBodyPTermParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_body_4_0=rulePTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"body",
                    	    								lv_body_4_0,
                    	    								"xtext.qactor.QADocker.PTerm");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePHead"
    // InternalQADocker.g:1233:1: entryRulePHead returns [EObject current=null] : iv_rulePHead= rulePHead EOF ;
    public final EObject entryRulePHead() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePHead = null;


        try {
            // InternalQADocker.g:1233:46: (iv_rulePHead= rulePHead EOF )
            // InternalQADocker.g:1234:2: iv_rulePHead= rulePHead EOF
            {
             newCompositeNode(grammarAccess.getPHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePHead=rulePHead();

            state._fsp--;

             current =iv_rulePHead; 
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
    // $ANTLR end "entryRulePHead"


    // $ANTLR start "rulePHead"
    // InternalQADocker.g:1240:1: rulePHead returns [EObject current=null] : (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct ) ;
    public final EObject rulePHead() throws RecognitionException {
        EObject current = null;

        EObject this_PAtom_0 = null;

        EObject this_PStruct_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1246:2: ( (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct ) )
            // InternalQADocker.g:1247:2: (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct )
            {
            // InternalQADocker.g:1247:2: (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_VARID)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==EOF||LA21_2==RULE_ID||LA21_2==15||(LA21_2>=17 && LA21_2<=22)||LA21_2==27||(LA21_2>=31 && LA21_2<=34)||LA21_2==36||(LA21_2>=49 && LA21_2<=50)||LA21_2==53||LA21_2==63||LA21_2==88||LA21_2==96||LA21_2==113||LA21_2==117) ) {
                    alt21=1;
                }
                else if ( (LA21_2==35) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalQADocker.g:1248:3: this_PAtom_0= rulePAtom
                    {

                    			newCompositeNode(grammarAccess.getPHeadAccess().getPAtomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtom_0=rulePAtom();

                    state._fsp--;


                    			current = this_PAtom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:1257:3: this_PStruct_1= rulePStruct
                    {

                    			newCompositeNode(grammarAccess.getPHeadAccess().getPStructParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PStruct_1=rulePStruct();

                    state._fsp--;


                    			current = this_PStruct_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePHead"


    // $ANTLR start "entryRulePTerm"
    // InternalQADocker.g:1269:1: entryRulePTerm returns [EObject current=null] : iv_rulePTerm= rulePTerm EOF ;
    public final EObject entryRulePTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePTerm = null;


        try {
            // InternalQADocker.g:1269:46: (iv_rulePTerm= rulePTerm EOF )
            // InternalQADocker.g:1270:2: iv_rulePTerm= rulePTerm EOF
            {
             newCompositeNode(grammarAccess.getPTermRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePTerm=rulePTerm();

            state._fsp--;

             current =iv_rulePTerm; 
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
    // $ANTLR end "entryRulePTerm"


    // $ANTLR start "rulePTerm"
    // InternalQADocker.g:1276:1: rulePTerm returns [EObject current=null] : (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PPredef_2= rulePPredef | this_PActorCall_3= rulePActorCall ) ;
    public final EObject rulePTerm() throws RecognitionException {
        EObject current = null;

        EObject this_PAtom_0 = null;

        EObject this_PStruct_1 = null;

        EObject this_PPredef_2 = null;

        EObject this_PActorCall_3 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1282:2: ( (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PPredef_2= rulePPredef | this_PActorCall_3= rulePActorCall ) )
            // InternalQADocker.g:1283:2: (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PPredef_2= rulePPredef | this_PActorCall_3= rulePActorCall )
            {
            // InternalQADocker.g:1283:2: (this_PAtom_0= rulePAtom | this_PStruct_1= rulePStruct | this_PPredef_2= rulePPredef | this_PActorCall_3= rulePActorCall )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
                {
                alt22=1;
                }
                break;
            case RULE_VARID:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||(LA22_2>=33 && LA22_2<=34)||LA22_2==36||LA22_2==56||LA22_2==108) ) {
                    alt22=1;
                }
                else if ( (LA22_2==39) ) {
                    alt22=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA22_3 = input.LA(2);

                if ( (LA22_3==35) ) {
                    alt22=2;
                }
                else if ( (LA22_3==EOF||(LA22_3>=33 && LA22_3<=34)||LA22_3==36||LA22_3==56||LA22_3==108) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            case 37:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalQADocker.g:1284:3: this_PAtom_0= rulePAtom
                    {

                    			newCompositeNode(grammarAccess.getPTermAccess().getPAtomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtom_0=rulePAtom();

                    state._fsp--;


                    			current = this_PAtom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:1293:3: this_PStruct_1= rulePStruct
                    {

                    			newCompositeNode(grammarAccess.getPTermAccess().getPStructParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PStruct_1=rulePStruct();

                    state._fsp--;


                    			current = this_PStruct_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:1302:3: this_PPredef_2= rulePPredef
                    {

                    			newCompositeNode(grammarAccess.getPTermAccess().getPPredefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PPredef_2=rulePPredef();

                    state._fsp--;


                    			current = this_PPredef_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:1311:3: this_PActorCall_3= rulePActorCall
                    {

                    			newCompositeNode(grammarAccess.getPTermAccess().getPActorCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PActorCall_3=rulePActorCall();

                    state._fsp--;


                    			current = this_PActorCall_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePTerm"


    // $ANTLR start "entryRulePAtom"
    // InternalQADocker.g:1323:1: entryRulePAtom returns [EObject current=null] : iv_rulePAtom= rulePAtom EOF ;
    public final EObject entryRulePAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtom = null;


        try {
            // InternalQADocker.g:1323:46: (iv_rulePAtom= rulePAtom EOF )
            // InternalQADocker.g:1324:2: iv_rulePAtom= rulePAtom EOF
            {
             newCompositeNode(grammarAccess.getPAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtom=rulePAtom();

            state._fsp--;

             current =iv_rulePAtom; 
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
    // $ANTLR end "entryRulePAtom"


    // $ANTLR start "rulePAtom"
    // InternalQADocker.g:1330:1: rulePAtom returns [EObject current=null] : (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic ) ;
    public final EObject rulePAtom() throws RecognitionException {
        EObject current = null;

        EObject this_PAtomString_0 = null;

        EObject this_Variable_1 = null;

        EObject this_PAtomNum_2 = null;

        EObject this_PAtomic_3 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1336:2: ( (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic ) )
            // InternalQADocker.g:1337:2: (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic )
            {
            // InternalQADocker.g:1337:2: (this_PAtomString_0= rulePAtomString | this_Variable_1= ruleVariable | this_PAtomNum_2= rulePAtomNum | this_PAtomic_3= rulePAtomic )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt23=1;
                }
                break;
            case RULE_VARID:
                {
                alt23=2;
                }
                break;
            case RULE_INT:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalQADocker.g:1338:3: this_PAtomString_0= rulePAtomString
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getPAtomStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtomString_0=rulePAtomString();

                    state._fsp--;


                    			current = this_PAtomString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:1347:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:1356:3: this_PAtomNum_2= rulePAtomNum
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getPAtomNumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtomNum_2=rulePAtomNum();

                    state._fsp--;


                    			current = this_PAtomNum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:1365:3: this_PAtomic_3= rulePAtomic
                    {

                    			newCompositeNode(grammarAccess.getPAtomAccess().getPAtomicParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtomic_3=rulePAtomic();

                    state._fsp--;


                    			current = this_PAtomic_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePAtom"


    // $ANTLR start "entryRulePAtomString"
    // InternalQADocker.g:1377:1: entryRulePAtomString returns [EObject current=null] : iv_rulePAtomString= rulePAtomString EOF ;
    public final EObject entryRulePAtomString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtomString = null;


        try {
            // InternalQADocker.g:1377:52: (iv_rulePAtomString= rulePAtomString EOF )
            // InternalQADocker.g:1378:2: iv_rulePAtomString= rulePAtomString EOF
            {
             newCompositeNode(grammarAccess.getPAtomStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtomString=rulePAtomString();

            state._fsp--;

             current =iv_rulePAtomString; 
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
    // $ANTLR end "entryRulePAtomString"


    // $ANTLR start "rulePAtomString"
    // InternalQADocker.g:1384:1: rulePAtomString returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject rulePAtomString() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:1390:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalQADocker.g:1391:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalQADocker.g:1391:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalQADocker.g:1392:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalQADocker.g:1392:3: (lv_val_0_0= RULE_STRING )
            // InternalQADocker.g:1393:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getPAtomStringAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPAtomStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "rulePAtomString"


    // $ANTLR start "entryRulePAtomic"
    // InternalQADocker.g:1412:1: entryRulePAtomic returns [EObject current=null] : iv_rulePAtomic= rulePAtomic EOF ;
    public final EObject entryRulePAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtomic = null;


        try {
            // InternalQADocker.g:1412:48: (iv_rulePAtomic= rulePAtomic EOF )
            // InternalQADocker.g:1413:2: iv_rulePAtomic= rulePAtomic EOF
            {
             newCompositeNode(grammarAccess.getPAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtomic=rulePAtomic();

            state._fsp--;

             current =iv_rulePAtomic; 
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
    // $ANTLR end "entryRulePAtomic"


    // $ANTLR start "rulePAtomic"
    // InternalQADocker.g:1419:1: rulePAtomic returns [EObject current=null] : ( (lv_val_0_0= RULE_ID ) ) ;
    public final EObject rulePAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:1425:2: ( ( (lv_val_0_0= RULE_ID ) ) )
            // InternalQADocker.g:1426:2: ( (lv_val_0_0= RULE_ID ) )
            {
            // InternalQADocker.g:1426:2: ( (lv_val_0_0= RULE_ID ) )
            // InternalQADocker.g:1427:3: (lv_val_0_0= RULE_ID )
            {
            // InternalQADocker.g:1427:3: (lv_val_0_0= RULE_ID )
            // InternalQADocker.g:1428:4: lv_val_0_0= RULE_ID
            {
            lv_val_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getPAtomicAccess().getValIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPAtomicRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


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
    // $ANTLR end "rulePAtomic"


    // $ANTLR start "entryRulePAtomNum"
    // InternalQADocker.g:1447:1: entryRulePAtomNum returns [EObject current=null] : iv_rulePAtomNum= rulePAtomNum EOF ;
    public final EObject entryRulePAtomNum() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtomNum = null;


        try {
            // InternalQADocker.g:1447:49: (iv_rulePAtomNum= rulePAtomNum EOF )
            // InternalQADocker.g:1448:2: iv_rulePAtomNum= rulePAtomNum EOF
            {
             newCompositeNode(grammarAccess.getPAtomNumRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtomNum=rulePAtomNum();

            state._fsp--;

             current =iv_rulePAtomNum; 
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
    // $ANTLR end "entryRulePAtomNum"


    // $ANTLR start "rulePAtomNum"
    // InternalQADocker.g:1454:1: rulePAtomNum returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject rulePAtomNum() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:1460:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalQADocker.g:1461:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalQADocker.g:1461:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalQADocker.g:1462:3: (lv_val_0_0= RULE_INT )
            {
            // InternalQADocker.g:1462:3: (lv_val_0_0= RULE_INT )
            // InternalQADocker.g:1463:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getPAtomNumAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPAtomNumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


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
    // $ANTLR end "rulePAtomNum"


    // $ANTLR start "entryRulePStruct"
    // InternalQADocker.g:1482:1: entryRulePStruct returns [EObject current=null] : iv_rulePStruct= rulePStruct EOF ;
    public final EObject entryRulePStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePStruct = null;


        try {
            // InternalQADocker.g:1482:48: (iv_rulePStruct= rulePStruct EOF )
            // InternalQADocker.g:1483:2: iv_rulePStruct= rulePStruct EOF
            {
             newCompositeNode(grammarAccess.getPStructRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePStruct=rulePStruct();

            state._fsp--;

             current =iv_rulePStruct; 
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
    // $ANTLR end "entryRulePStruct"


    // $ANTLR start "rulePStruct"
    // InternalQADocker.g:1489:1: rulePStruct returns [EObject current=null] : ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePTerm ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePTerm ) ) )* otherlv_5= ')' ) ;
    public final EObject rulePStruct() throws RecognitionException {
        EObject current = null;

        Token lv_functor_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_msgArg_2_0 = null;

        EObject lv_msgArg_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1495:2: ( ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePTerm ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePTerm ) ) )* otherlv_5= ')' ) )
            // InternalQADocker.g:1496:2: ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePTerm ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePTerm ) ) )* otherlv_5= ')' )
            {
            // InternalQADocker.g:1496:2: ( ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePTerm ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePTerm ) ) )* otherlv_5= ')' )
            // InternalQADocker.g:1497:3: ( (lv_functor_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_msgArg_2_0= rulePTerm ) )? (otherlv_3= ',' ( (lv_msgArg_4_0= rulePTerm ) ) )* otherlv_5= ')'
            {
            // InternalQADocker.g:1497:3: ( (lv_functor_0_0= RULE_ID ) )
            // InternalQADocker.g:1498:4: (lv_functor_0_0= RULE_ID )
            {
            // InternalQADocker.g:1498:4: (lv_functor_0_0= RULE_ID )
            // InternalQADocker.g:1499:5: lv_functor_0_0= RULE_ID
            {
            lv_functor_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_functor_0_0, grammarAccess.getPStructAccess().getFunctorIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPStructRule());
            					}
            					setWithLastConsumed(
            						current,
            						"functor",
            						lv_functor_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getPStructAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQADocker.g:1519:3: ( (lv_msgArg_2_0= rulePTerm ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_VARID)||LA24_0==37||LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQADocker.g:1520:4: (lv_msgArg_2_0= rulePTerm )
                    {
                    // InternalQADocker.g:1520:4: (lv_msgArg_2_0= rulePTerm )
                    // InternalQADocker.g:1521:5: lv_msgArg_2_0= rulePTerm
                    {

                    					newCompositeNode(grammarAccess.getPStructAccess().getMsgArgPTermParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_32);
                    lv_msgArg_2_0=rulePTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPStructRule());
                    					}
                    					add(
                    						current,
                    						"msgArg",
                    						lv_msgArg_2_0,
                    						"xtext.qactor.QADocker.PTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:1538:3: (otherlv_3= ',' ( (lv_msgArg_4_0= rulePTerm ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQADocker.g:1539:4: otherlv_3= ',' ( (lv_msgArg_4_0= rulePTerm ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_28); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPStructAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalQADocker.g:1543:4: ( (lv_msgArg_4_0= rulePTerm ) )
            	    // InternalQADocker.g:1544:5: (lv_msgArg_4_0= rulePTerm )
            	    {
            	    // InternalQADocker.g:1544:5: (lv_msgArg_4_0= rulePTerm )
            	    // InternalQADocker.g:1545:6: lv_msgArg_4_0= rulePTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPStructAccess().getMsgArgPTermParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_msgArg_4_0=rulePTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPStructRule());
            	    						}
            	    						add(
            	    							current,
            	    							"msgArg",
            	    							lv_msgArg_4_0,
            	    							"xtext.qactor.QADocker.PTerm");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPStructAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePStruct"


    // $ANTLR start "entryRulePActorCall"
    // InternalQADocker.g:1571:1: entryRulePActorCall returns [EObject current=null] : iv_rulePActorCall= rulePActorCall EOF ;
    public final EObject entryRulePActorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePActorCall = null;


        try {
            // InternalQADocker.g:1571:51: (iv_rulePActorCall= rulePActorCall EOF )
            // InternalQADocker.g:1572:2: iv_rulePActorCall= rulePActorCall EOF
            {
             newCompositeNode(grammarAccess.getPActorCallRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePActorCall=rulePActorCall();

            state._fsp--;

             current =iv_rulePActorCall; 
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
    // $ANTLR end "entryRulePActorCall"


    // $ANTLR start "rulePActorCall"
    // InternalQADocker.g:1578:1: rulePActorCall returns [EObject current=null] : (otherlv_0= 'Actor' otherlv_1= '<-' ( (lv_body_2_0= rulePStruct ) ) ) ;
    public final EObject rulePActorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1584:2: ( (otherlv_0= 'Actor' otherlv_1= '<-' ( (lv_body_2_0= rulePStruct ) ) ) )
            // InternalQADocker.g:1585:2: (otherlv_0= 'Actor' otherlv_1= '<-' ( (lv_body_2_0= rulePStruct ) ) )
            {
            // InternalQADocker.g:1585:2: (otherlv_0= 'Actor' otherlv_1= '<-' ( (lv_body_2_0= rulePStruct ) ) )
            // InternalQADocker.g:1586:3: otherlv_0= 'Actor' otherlv_1= '<-' ( (lv_body_2_0= rulePStruct ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getPActorCallAccess().getActorKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPActorCallAccess().getLessThanSignHyphenMinusKeyword_1());
            		
            // InternalQADocker.g:1594:3: ( (lv_body_2_0= rulePStruct ) )
            // InternalQADocker.g:1595:4: (lv_body_2_0= rulePStruct )
            {
            // InternalQADocker.g:1595:4: (lv_body_2_0= rulePStruct )
            // InternalQADocker.g:1596:5: lv_body_2_0= rulePStruct
            {

            					newCompositeNode(grammarAccess.getPActorCallAccess().getBodyPStructParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_2_0=rulePStruct();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPActorCallRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_2_0,
            						"xtext.qactor.QADocker.PStruct");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePActorCall"


    // $ANTLR start "entryRulePPredef"
    // InternalQADocker.g:1617:1: entryRulePPredef returns [EObject current=null] : iv_rulePPredef= rulePPredef EOF ;
    public final EObject entryRulePPredef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePPredef = null;


        try {
            // InternalQADocker.g:1617:48: (iv_rulePPredef= rulePPredef EOF )
            // InternalQADocker.g:1618:2: iv_rulePPredef= rulePPredef EOF
            {
             newCompositeNode(grammarAccess.getPPredefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePPredef=rulePPredef();

            state._fsp--;

             current =iv_rulePPredef; 
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
    // $ANTLR end "entryRulePPredef"


    // $ANTLR start "rulePPredef"
    // InternalQADocker.g:1624:1: rulePPredef returns [EObject current=null] : (this_PAtomCut_0= rulePAtomCut | this_PIs_1= rulePIs ) ;
    public final EObject rulePPredef() throws RecognitionException {
        EObject current = null;

        EObject this_PAtomCut_0 = null;

        EObject this_PIs_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1630:2: ( (this_PAtomCut_0= rulePAtomCut | this_PIs_1= rulePIs ) )
            // InternalQADocker.g:1631:2: (this_PAtomCut_0= rulePAtomCut | this_PIs_1= rulePIs )
            {
            // InternalQADocker.g:1631:2: (this_PAtomCut_0= rulePAtomCut | this_PIs_1= rulePIs )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_VARID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalQADocker.g:1632:3: this_PAtomCut_0= rulePAtomCut
                    {

                    			newCompositeNode(grammarAccess.getPPredefAccess().getPAtomCutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAtomCut_0=rulePAtomCut();

                    state._fsp--;


                    			current = this_PAtomCut_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:1641:3: this_PIs_1= rulePIs
                    {

                    			newCompositeNode(grammarAccess.getPPredefAccess().getPIsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PIs_1=rulePIs();

                    state._fsp--;


                    			current = this_PIs_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePPredef"


    // $ANTLR start "entryRulePIs"
    // InternalQADocker.g:1653:1: entryRulePIs returns [EObject current=null] : iv_rulePIs= rulePIs EOF ;
    public final EObject entryRulePIs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePIs = null;


        try {
            // InternalQADocker.g:1653:44: (iv_rulePIs= rulePIs EOF )
            // InternalQADocker.g:1654:2: iv_rulePIs= rulePIs EOF
            {
             newCompositeNode(grammarAccess.getPIsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePIs=rulePIs();

            state._fsp--;

             current =iv_rulePIs; 
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
    // $ANTLR end "entryRulePIs"


    // $ANTLR start "rulePIs"
    // InternalQADocker.g:1660:1: rulePIs returns [EObject current=null] : ( ( (lv_varout_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_varin_2_0= ruleVariable ) ) otherlv_3= '+' ( (lv_num_4_0= rulePAtomNum ) ) ) ;
    public final EObject rulePIs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_varout_0_0 = null;

        EObject lv_varin_2_0 = null;

        EObject lv_num_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1666:2: ( ( ( (lv_varout_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_varin_2_0= ruleVariable ) ) otherlv_3= '+' ( (lv_num_4_0= rulePAtomNum ) ) ) )
            // InternalQADocker.g:1667:2: ( ( (lv_varout_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_varin_2_0= ruleVariable ) ) otherlv_3= '+' ( (lv_num_4_0= rulePAtomNum ) ) )
            {
            // InternalQADocker.g:1667:2: ( ( (lv_varout_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_varin_2_0= ruleVariable ) ) otherlv_3= '+' ( (lv_num_4_0= rulePAtomNum ) ) )
            // InternalQADocker.g:1668:3: ( (lv_varout_0_0= ruleVariable ) ) otherlv_1= 'is' ( (lv_varin_2_0= ruleVariable ) ) otherlv_3= '+' ( (lv_num_4_0= rulePAtomNum ) )
            {
            // InternalQADocker.g:1668:3: ( (lv_varout_0_0= ruleVariable ) )
            // InternalQADocker.g:1669:4: (lv_varout_0_0= ruleVariable )
            {
            // InternalQADocker.g:1669:4: (lv_varout_0_0= ruleVariable )
            // InternalQADocker.g:1670:5: lv_varout_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getPIsAccess().getVaroutVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_varout_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPIsRule());
            					}
            					set(
            						current,
            						"varout",
            						lv_varout_0_0,
            						"xtext.qactor.QADocker.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPIsAccess().getIsKeyword_1());
            		
            // InternalQADocker.g:1691:3: ( (lv_varin_2_0= ruleVariable ) )
            // InternalQADocker.g:1692:4: (lv_varin_2_0= ruleVariable )
            {
            // InternalQADocker.g:1692:4: (lv_varin_2_0= ruleVariable )
            // InternalQADocker.g:1693:5: lv_varin_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getPIsAccess().getVarinVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_varin_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPIsRule());
            					}
            					set(
            						current,
            						"varin",
            						lv_varin_2_0,
            						"xtext.qactor.QADocker.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getPIsAccess().getPlusSignKeyword_3());
            		
            // InternalQADocker.g:1714:3: ( (lv_num_4_0= rulePAtomNum ) )
            // InternalQADocker.g:1715:4: (lv_num_4_0= rulePAtomNum )
            {
            // InternalQADocker.g:1715:4: (lv_num_4_0= rulePAtomNum )
            // InternalQADocker.g:1716:5: lv_num_4_0= rulePAtomNum
            {

            					newCompositeNode(grammarAccess.getPIsAccess().getNumPAtomNumParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_4_0=rulePAtomNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPIsRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_4_0,
            						"xtext.qactor.QADocker.PAtomNum");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePIs"


    // $ANTLR start "entryRulePAtomCut"
    // InternalQADocker.g:1737:1: entryRulePAtomCut returns [EObject current=null] : iv_rulePAtomCut= rulePAtomCut EOF ;
    public final EObject entryRulePAtomCut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAtomCut = null;


        try {
            // InternalQADocker.g:1737:49: (iv_rulePAtomCut= rulePAtomCut EOF )
            // InternalQADocker.g:1738:2: iv_rulePAtomCut= rulePAtomCut EOF
            {
             newCompositeNode(grammarAccess.getPAtomCutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAtomCut=rulePAtomCut();

            state._fsp--;

             current =iv_rulePAtomCut; 
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
    // $ANTLR end "entryRulePAtomCut"


    // $ANTLR start "rulePAtomCut"
    // InternalQADocker.g:1744:1: rulePAtomCut returns [EObject current=null] : ( () otherlv_1= '!' ) ;
    public final EObject rulePAtomCut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQADocker.g:1750:2: ( ( () otherlv_1= '!' ) )
            // InternalQADocker.g:1751:2: ( () otherlv_1= '!' )
            {
            // InternalQADocker.g:1751:2: ( () otherlv_1= '!' )
            // InternalQADocker.g:1752:3: () otherlv_1= '!'
            {
            // InternalQADocker.g:1752:3: ()
            // InternalQADocker.g:1753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPAtomCutAccess().getPAtomCutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPAtomCutAccess().getExclamationMarkKeyword_1());
            		

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
    // $ANTLR end "rulePAtomCut"


    // $ANTLR start "entryRuleData"
    // InternalQADocker.g:1767:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalQADocker.g:1767:45: (iv_ruleData= ruleData EOF )
            // InternalQADocker.g:1768:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalQADocker.g:1774:1: ruleData returns [EObject current=null] : (this_IntegerData_0= ruleIntegerData | this_StringData_1= ruleStringData ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerData_0 = null;

        EObject this_StringData_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1780:2: ( (this_IntegerData_0= ruleIntegerData | this_StringData_1= ruleStringData ) )
            // InternalQADocker.g:1781:2: (this_IntegerData_0= ruleIntegerData | this_StringData_1= ruleStringData )
            {
            // InternalQADocker.g:1781:2: (this_IntegerData_0= ruleIntegerData | this_StringData_1= ruleStringData )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            else if ( (LA27_0==44) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalQADocker.g:1782:3: this_IntegerData_0= ruleIntegerData
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getIntegerDataParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerData_0=ruleIntegerData();

                    state._fsp--;


                    			current = this_IntegerData_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:1791:3: this_StringData_1= ruleStringData
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getStringDataParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringData_1=ruleStringData();

                    state._fsp--;


                    			current = this_StringData_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleIntegerData"
    // InternalQADocker.g:1803:1: entryRuleIntegerData returns [EObject current=null] : iv_ruleIntegerData= ruleIntegerData EOF ;
    public final EObject entryRuleIntegerData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerData = null;


        try {
            // InternalQADocker.g:1803:52: (iv_ruleIntegerData= ruleIntegerData EOF )
            // InternalQADocker.g:1804:2: iv_ruleIntegerData= ruleIntegerData EOF
            {
             newCompositeNode(grammarAccess.getIntegerDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerData=ruleIntegerData();

            state._fsp--;

             current =iv_ruleIntegerData; 
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
    // $ANTLR end "entryRuleIntegerData"


    // $ANTLR start "ruleIntegerData"
    // InternalQADocker.g:1810:1: ruleIntegerData returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleIntegerData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:1816:2: ( ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) ) )
            // InternalQADocker.g:1817:2: ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )
            {
            // InternalQADocker.g:1817:2: ( () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) ) )
            // InternalQADocker.g:1818:3: () otherlv_1= 'int' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_INT ) )
            {
            // InternalQADocker.g:1818:3: ()
            // InternalQADocker.g:1819:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerDataAccess().getIntegerDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerDataAccess().getIntKeyword_1());
            		
            // InternalQADocker.g:1829:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQADocker.g:1830:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQADocker.g:1830:4: (lv_name_2_0= RULE_ID )
            // InternalQADocker.g:1831:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIntegerDataAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerDataAccess().getEqualsSignKeyword_3());
            		
            // InternalQADocker.g:1851:3: ( (lv_value_4_0= RULE_INT ) )
            // InternalQADocker.g:1852:4: (lv_value_4_0= RULE_INT )
            {
            // InternalQADocker.g:1852:4: (lv_value_4_0= RULE_INT )
            // InternalQADocker.g:1853:5: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getIntegerDataAccess().getValueINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // $ANTLR end "ruleIntegerData"


    // $ANTLR start "entryRuleStringData"
    // InternalQADocker.g:1873:1: entryRuleStringData returns [EObject current=null] : iv_ruleStringData= ruleStringData EOF ;
    public final EObject entryRuleStringData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringData = null;


        try {
            // InternalQADocker.g:1873:51: (iv_ruleStringData= ruleStringData EOF )
            // InternalQADocker.g:1874:2: iv_ruleStringData= ruleStringData EOF
            {
             newCompositeNode(grammarAccess.getStringDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringData=ruleStringData();

            state._fsp--;

             current =iv_ruleStringData; 
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
    // $ANTLR end "entryRuleStringData"


    // $ANTLR start "ruleStringData"
    // InternalQADocker.g:1880:1: ruleStringData returns [EObject current=null] : ( () otherlv_1= 'String' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:1886:2: ( ( () otherlv_1= 'String' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalQADocker.g:1887:2: ( () otherlv_1= 'String' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalQADocker.g:1887:2: ( () otherlv_1= 'String' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalQADocker.g:1888:3: () otherlv_1= 'String' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalQADocker.g:1888:3: ()
            // InternalQADocker.g:1889:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringDataAccess().getStringDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStringDataAccess().getStringKeyword_1());
            		
            // InternalQADocker.g:1899:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalQADocker.g:1900:4: (lv_name_2_0= RULE_ID )
            {
            // InternalQADocker.g:1900:4: (lv_name_2_0= RULE_ID )
            // InternalQADocker.g:1901:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_2_0, grammarAccess.getStringDataAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getStringDataAccess().getEqualsSignKeyword_3());
            		
            // InternalQADocker.g:1921:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalQADocker.g:1922:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalQADocker.g:1922:4: (lv_value_4_0= RULE_STRING )
            // InternalQADocker.g:1923:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getStringDataAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleStringData"


    // $ANTLR start "entryRuleAction"
    // InternalQADocker.g:1943:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalQADocker.g:1943:47: (iv_ruleAction= ruleAction EOF )
            // InternalQADocker.g:1944:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalQADocker.g:1950:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_undoable_2_0= 'undoable' ) )? (otherlv_3= 'maxtime' otherlv_4= '(' ( (lv_msec_5_0= RULE_INT ) ) otherlv_6= ')' ) (otherlv_7= 'arg' ( (lv_arg_8_0= rulePStruct ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_undoable_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_msec_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_arg_8_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:1956:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_undoable_2_0= 'undoable' ) )? (otherlv_3= 'maxtime' otherlv_4= '(' ( (lv_msec_5_0= RULE_INT ) ) otherlv_6= ')' ) (otherlv_7= 'arg' ( (lv_arg_8_0= rulePStruct ) ) )? otherlv_9= ';' ) )
            // InternalQADocker.g:1957:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_undoable_2_0= 'undoable' ) )? (otherlv_3= 'maxtime' otherlv_4= '(' ( (lv_msec_5_0= RULE_INT ) ) otherlv_6= ')' ) (otherlv_7= 'arg' ( (lv_arg_8_0= rulePStruct ) ) )? otherlv_9= ';' )
            {
            // InternalQADocker.g:1957:2: (otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_undoable_2_0= 'undoable' ) )? (otherlv_3= 'maxtime' otherlv_4= '(' ( (lv_msec_5_0= RULE_INT ) ) otherlv_6= ')' ) (otherlv_7= 'arg' ( (lv_arg_8_0= rulePStruct ) ) )? otherlv_9= ';' )
            // InternalQADocker.g:1958:3: otherlv_0= 'Action' ( (lv_name_1_0= RULE_ID ) ) ( (lv_undoable_2_0= 'undoable' ) )? (otherlv_3= 'maxtime' otherlv_4= '(' ( (lv_msec_5_0= RULE_INT ) ) otherlv_6= ')' ) (otherlv_7= 'arg' ( (lv_arg_8_0= rulePStruct ) ) )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalQADocker.g:1962:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:1963:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:1963:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:1964:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQADocker.g:1980:3: ( (lv_undoable_2_0= 'undoable' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQADocker.g:1981:4: (lv_undoable_2_0= 'undoable' )
                    {
                    // InternalQADocker.g:1981:4: (lv_undoable_2_0= 'undoable' )
                    // InternalQADocker.g:1982:5: lv_undoable_2_0= 'undoable'
                    {
                    lv_undoable_2_0=(Token)match(input,46,FOLLOW_41); 

                    					newLeafNode(lv_undoable_2_0, grammarAccess.getActionAccess().getUndoableUndoableKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "undoable", true, "undoable");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:1994:3: (otherlv_3= 'maxtime' otherlv_4= '(' ( (lv_msec_5_0= RULE_INT ) ) otherlv_6= ')' )
            // InternalQADocker.g:1995:4: otherlv_3= 'maxtime' otherlv_4= '(' ( (lv_msec_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,47,FOLLOW_30); 

            				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getMaxtimeKeyword_3_0());
            			
            otherlv_4=(Token)match(input,35,FOLLOW_37); 

            				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getLeftParenthesisKeyword_3_1());
            			
            // InternalQADocker.g:2003:4: ( (lv_msec_5_0= RULE_INT ) )
            // InternalQADocker.g:2004:5: (lv_msec_5_0= RULE_INT )
            {
            // InternalQADocker.g:2004:5: (lv_msec_5_0= RULE_INT )
            // InternalQADocker.g:2005:6: lv_msec_5_0= RULE_INT
            {
            lv_msec_5_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            						newLeafNode(lv_msec_5_0, grammarAccess.getActionAccess().getMsecINTTerminalRuleCall_3_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getActionRule());
            						}
            						setWithLastConsumed(
            							current,
            							"msec",
            							lv_msec_5_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_43); 

            				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_3_3());
            			

            }

            // InternalQADocker.g:2026:3: (otherlv_7= 'arg' ( (lv_arg_8_0= rulePStruct ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQADocker.g:2027:4: otherlv_7= 'arg' ( (lv_arg_8_0= rulePStruct ) )
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionAccess().getArgKeyword_4_0());
                    			
                    // InternalQADocker.g:2031:4: ( (lv_arg_8_0= rulePStruct ) )
                    // InternalQADocker.g:2032:5: (lv_arg_8_0= rulePStruct )
                    {
                    // InternalQADocker.g:2032:5: (lv_arg_8_0= rulePStruct )
                    // InternalQADocker.g:2033:6: lv_arg_8_0= rulePStruct
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getArgPStructParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_arg_8_0=rulePStruct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"arg",
                    							lv_arg_8_0,
                    							"xtext.qactor.QADocker.PStruct");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRulePlan"
    // InternalQADocker.g:2059:1: entryRulePlan returns [EObject current=null] : iv_rulePlan= rulePlan EOF ;
    public final EObject entryRulePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlan = null;


        try {
            // InternalQADocker.g:2059:45: (iv_rulePlan= rulePlan EOF )
            // InternalQADocker.g:2060:2: iv_rulePlan= rulePlan EOF
            {
             newCompositeNode(grammarAccess.getPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlan=rulePlan();

            state._fsp--;

             current =iv_rulePlan; 
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
    // $ANTLR end "entryRulePlan"


    // $ANTLR start "rulePlan"
    // InternalQADocker.g:2066:1: rulePlan returns [EObject current=null] : (otherlv_0= 'Plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_normal_2_0= 'normal' ) )? ( (lv_resume_3_0= 'resumeLastPlan' ) )? ( (lv_action_4_0= rulePlanAction ) ) (otherlv_5= ';' ( (lv_action_6_0= rulePlanAction ) ) )* ) ;
    public final EObject rulePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_normal_2_0=null;
        Token lv_resume_3_0=null;
        Token otherlv_5=null;
        EObject lv_action_4_0 = null;

        EObject lv_action_6_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2072:2: ( (otherlv_0= 'Plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_normal_2_0= 'normal' ) )? ( (lv_resume_3_0= 'resumeLastPlan' ) )? ( (lv_action_4_0= rulePlanAction ) ) (otherlv_5= ';' ( (lv_action_6_0= rulePlanAction ) ) )* ) )
            // InternalQADocker.g:2073:2: (otherlv_0= 'Plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_normal_2_0= 'normal' ) )? ( (lv_resume_3_0= 'resumeLastPlan' ) )? ( (lv_action_4_0= rulePlanAction ) ) (otherlv_5= ';' ( (lv_action_6_0= rulePlanAction ) ) )* )
            {
            // InternalQADocker.g:2073:2: (otherlv_0= 'Plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_normal_2_0= 'normal' ) )? ( (lv_resume_3_0= 'resumeLastPlan' ) )? ( (lv_action_4_0= rulePlanAction ) ) (otherlv_5= ';' ( (lv_action_6_0= rulePlanAction ) ) )* )
            // InternalQADocker.g:2074:3: otherlv_0= 'Plan' ( (lv_name_1_0= RULE_ID ) ) ( (lv_normal_2_0= 'normal' ) )? ( (lv_resume_3_0= 'resumeLastPlan' ) )? ( (lv_action_4_0= rulePlanAction ) ) (otherlv_5= ';' ( (lv_action_6_0= rulePlanAction ) ) )*
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlanAccess().getPlanKeyword_0());
            		
            // InternalQADocker.g:2078:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:2079:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:2079:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:2080:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQADocker.g:2096:3: ( (lv_normal_2_0= 'normal' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQADocker.g:2097:4: (lv_normal_2_0= 'normal' )
                    {
                    // InternalQADocker.g:2097:4: (lv_normal_2_0= 'normal' )
                    // InternalQADocker.g:2098:5: lv_normal_2_0= 'normal'
                    {
                    lv_normal_2_0=(Token)match(input,51,FOLLOW_45); 

                    					newLeafNode(lv_normal_2_0, grammarAccess.getPlanAccess().getNormalNormalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlanRule());
                    					}
                    					setWithLastConsumed(current, "normal", true, "normal");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:2110:3: ( (lv_resume_3_0= 'resumeLastPlan' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==52||LA31_1==54||LA31_1==59||(LA31_1>=61 && LA31_1<=62)||(LA31_1>=64 && LA31_1<=68)||(LA31_1>=70 && LA31_1<=71)||(LA31_1>=73 && LA31_1<=85)||LA31_1==87||(LA31_1>=89 && LA31_1<=90)||LA31_1==93||LA31_1==95||(LA31_1>=97 && LA31_1<=100)||(LA31_1>=102 && LA31_1<=105)) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalQADocker.g:2111:4: (lv_resume_3_0= 'resumeLastPlan' )
                    {
                    // InternalQADocker.g:2111:4: (lv_resume_3_0= 'resumeLastPlan' )
                    // InternalQADocker.g:2112:5: lv_resume_3_0= 'resumeLastPlan'
                    {
                    lv_resume_3_0=(Token)match(input,52,FOLLOW_45); 

                    					newLeafNode(lv_resume_3_0, grammarAccess.getPlanAccess().getResumeResumeLastPlanKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlanRule());
                    					}
                    					setWithLastConsumed(current, "resume", true, "resumeLastPlan");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:2124:3: ( (lv_action_4_0= rulePlanAction ) )
            // InternalQADocker.g:2125:4: (lv_action_4_0= rulePlanAction )
            {
            // InternalQADocker.g:2125:4: (lv_action_4_0= rulePlanAction )
            // InternalQADocker.g:2126:5: lv_action_4_0= rulePlanAction
            {

            					newCompositeNode(grammarAccess.getPlanAccess().getActionPlanActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_46);
            lv_action_4_0=rulePlanAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlanRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_4_0,
            						"xtext.qactor.QADocker.PlanAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:2143:3: (otherlv_5= ';' ( (lv_action_6_0= rulePlanAction ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalQADocker.g:2144:4: otherlv_5= ';' ( (lv_action_6_0= rulePlanAction ) )
            	    {
            	    otherlv_5=(Token)match(input,49,FOLLOW_45); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPlanAccess().getSemicolonKeyword_5_0());
            	    			
            	    // InternalQADocker.g:2148:4: ( (lv_action_6_0= rulePlanAction ) )
            	    // InternalQADocker.g:2149:5: (lv_action_6_0= rulePlanAction )
            	    {
            	    // InternalQADocker.g:2149:5: (lv_action_6_0= rulePlanAction )
            	    // InternalQADocker.g:2150:6: lv_action_6_0= rulePlanAction
            	    {

            	    						newCompositeNode(grammarAccess.getPlanAccess().getActionPlanActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_action_6_0=rulePlanAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlanRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_6_0,
            	    							"xtext.qactor.QADocker.PlanAction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
    // $ANTLR end "rulePlan"


    // $ANTLR start "entryRulePlanAction"
    // InternalQADocker.g:2172:1: entryRulePlanAction returns [EObject current=null] : iv_rulePlanAction= rulePlanAction EOF ;
    public final EObject entryRulePlanAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanAction = null;


        try {
            // InternalQADocker.g:2172:51: (iv_rulePlanAction= rulePlanAction EOF )
            // InternalQADocker.g:2173:2: iv_rulePlanAction= rulePlanAction EOF
            {
             newCompositeNode(grammarAccess.getPlanActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlanAction=rulePlanAction();

            state._fsp--;

             current =iv_rulePlanAction; 
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
    // $ANTLR end "entryRulePlanAction"


    // $ANTLR start "rulePlanAction"
    // InternalQADocker.g:2179:1: rulePlanAction returns [EObject current=null] : ( ( (lv_guard_0_0= ruleGuard ) )? ( (lv_move_1_0= ruleMove ) ) ( (lv_react_2_0= ruleReaction ) )? (otherlv_3= 'else' ( (lv_elsemove_4_0= ruleMove ) ) ( (lv_elsereact_5_0= ruleReaction ) )? )? ) ;
    public final EObject rulePlanAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_guard_0_0 = null;

        EObject lv_move_1_0 = null;

        EObject lv_react_2_0 = null;

        EObject lv_elsemove_4_0 = null;

        EObject lv_elsereact_5_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2185:2: ( ( ( (lv_guard_0_0= ruleGuard ) )? ( (lv_move_1_0= ruleMove ) ) ( (lv_react_2_0= ruleReaction ) )? (otherlv_3= 'else' ( (lv_elsemove_4_0= ruleMove ) ) ( (lv_elsereact_5_0= ruleReaction ) )? )? ) )
            // InternalQADocker.g:2186:2: ( ( (lv_guard_0_0= ruleGuard ) )? ( (lv_move_1_0= ruleMove ) ) ( (lv_react_2_0= ruleReaction ) )? (otherlv_3= 'else' ( (lv_elsemove_4_0= ruleMove ) ) ( (lv_elsereact_5_0= ruleReaction ) )? )? )
            {
            // InternalQADocker.g:2186:2: ( ( (lv_guard_0_0= ruleGuard ) )? ( (lv_move_1_0= ruleMove ) ) ( (lv_react_2_0= ruleReaction ) )? (otherlv_3= 'else' ( (lv_elsemove_4_0= ruleMove ) ) ( (lv_elsereact_5_0= ruleReaction ) )? )? )
            // InternalQADocker.g:2187:3: ( (lv_guard_0_0= ruleGuard ) )? ( (lv_move_1_0= ruleMove ) ) ( (lv_react_2_0= ruleReaction ) )? (otherlv_3= 'else' ( (lv_elsemove_4_0= ruleMove ) ) ( (lv_elsereact_5_0= ruleReaction ) )? )?
            {
            // InternalQADocker.g:2187:3: ( (lv_guard_0_0= ruleGuard ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQADocker.g:2188:4: (lv_guard_0_0= ruleGuard )
                    {
                    // InternalQADocker.g:2188:4: (lv_guard_0_0= ruleGuard )
                    // InternalQADocker.g:2189:5: lv_guard_0_0= ruleGuard
                    {

                    					newCompositeNode(grammarAccess.getPlanActionAccess().getGuardGuardParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_45);
                    lv_guard_0_0=ruleGuard();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlanActionRule());
                    					}
                    					set(
                    						current,
                    						"guard",
                    						lv_guard_0_0,
                    						"xtext.qactor.QADocker.Guard");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:2206:3: ( (lv_move_1_0= ruleMove ) )
            // InternalQADocker.g:2207:4: (lv_move_1_0= ruleMove )
            {
            // InternalQADocker.g:2207:4: (lv_move_1_0= ruleMove )
            // InternalQADocker.g:2208:5: lv_move_1_0= ruleMove
            {

            					newCompositeNode(grammarAccess.getPlanActionAccess().getMoveMoveParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_move_1_0=ruleMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlanActionRule());
            					}
            					set(
            						current,
            						"move",
            						lv_move_1_0,
            						"xtext.qactor.QADocker.Move");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:2225:3: ( (lv_react_2_0= ruleReaction ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==113) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQADocker.g:2226:4: (lv_react_2_0= ruleReaction )
                    {
                    // InternalQADocker.g:2226:4: (lv_react_2_0= ruleReaction )
                    // InternalQADocker.g:2227:5: lv_react_2_0= ruleReaction
                    {

                    					newCompositeNode(grammarAccess.getPlanActionAccess().getReactReactionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_48);
                    lv_react_2_0=ruleReaction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlanActionRule());
                    					}
                    					set(
                    						current,
                    						"react",
                    						lv_react_2_0,
                    						"xtext.qactor.QADocker.Reaction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:2244:3: (otherlv_3= 'else' ( (lv_elsemove_4_0= ruleMove ) ) ( (lv_elsereact_5_0= ruleReaction ) )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==53) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQADocker.g:2245:4: otherlv_3= 'else' ( (lv_elsemove_4_0= ruleMove ) ) ( (lv_elsereact_5_0= ruleReaction ) )?
                    {
                    otherlv_3=(Token)match(input,53,FOLLOW_45); 

                    				newLeafNode(otherlv_3, grammarAccess.getPlanActionAccess().getElseKeyword_3_0());
                    			
                    // InternalQADocker.g:2249:4: ( (lv_elsemove_4_0= ruleMove ) )
                    // InternalQADocker.g:2250:5: (lv_elsemove_4_0= ruleMove )
                    {
                    // InternalQADocker.g:2250:5: (lv_elsemove_4_0= ruleMove )
                    // InternalQADocker.g:2251:6: lv_elsemove_4_0= ruleMove
                    {

                    						newCompositeNode(grammarAccess.getPlanActionAccess().getElsemoveMoveParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_elsemove_4_0=ruleMove();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlanActionRule());
                    						}
                    						set(
                    							current,
                    							"elsemove",
                    							lv_elsemove_4_0,
                    							"xtext.qactor.QADocker.Move");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQADocker.g:2268:4: ( (lv_elsereact_5_0= ruleReaction ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==113) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalQADocker.g:2269:5: (lv_elsereact_5_0= ruleReaction )
                            {
                            // InternalQADocker.g:2269:5: (lv_elsereact_5_0= ruleReaction )
                            // InternalQADocker.g:2270:6: lv_elsereact_5_0= ruleReaction
                            {

                            						newCompositeNode(grammarAccess.getPlanActionAccess().getElsereactReactionParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_elsereact_5_0=ruleReaction();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPlanActionRule());
                            						}
                            						set(
                            							current,
                            							"elsereact",
                            							lv_elsereact_5_0,
                            							"xtext.qactor.QADocker.Reaction");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "rulePlanAction"


    // $ANTLR start "entryRuleGuard"
    // InternalQADocker.g:2292:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // InternalQADocker.g:2292:46: (iv_ruleGuard= ruleGuard EOF )
            // InternalQADocker.g:2293:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalQADocker.g:2299:1: ruleGuard returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_not_2_0= 'not' ) )? ( (lv_guardspec_3_0= ruleGuardPredicate ) ) otherlv_4= ']' ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_not_2_0=null;
        Token otherlv_4=null;
        EObject lv_guardspec_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2305:2: ( ( () otherlv_1= '[' ( (lv_not_2_0= 'not' ) )? ( (lv_guardspec_3_0= ruleGuardPredicate ) ) otherlv_4= ']' ) )
            // InternalQADocker.g:2306:2: ( () otherlv_1= '[' ( (lv_not_2_0= 'not' ) )? ( (lv_guardspec_3_0= ruleGuardPredicate ) ) otherlv_4= ']' )
            {
            // InternalQADocker.g:2306:2: ( () otherlv_1= '[' ( (lv_not_2_0= 'not' ) )? ( (lv_guardspec_3_0= ruleGuardPredicate ) ) otherlv_4= ']' )
            // InternalQADocker.g:2307:3: () otherlv_1= '[' ( (lv_not_2_0= 'not' ) )? ( (lv_guardspec_3_0= ruleGuardPredicate ) ) otherlv_4= ']'
            {
            // InternalQADocker.g:2307:3: ()
            // InternalQADocker.g:2308:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuardAccess().getGuardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalQADocker.g:2318:3: ( (lv_not_2_0= 'not' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQADocker.g:2319:4: (lv_not_2_0= 'not' )
                    {
                    // InternalQADocker.g:2319:4: (lv_not_2_0= 'not' )
                    // InternalQADocker.g:2320:5: lv_not_2_0= 'not'
                    {
                    lv_not_2_0=(Token)match(input,55,FOLLOW_50); 

                    					newLeafNode(lv_not_2_0, grammarAccess.getGuardAccess().getNotNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGuardRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:2332:3: ( (lv_guardspec_3_0= ruleGuardPredicate ) )
            // InternalQADocker.g:2333:4: (lv_guardspec_3_0= ruleGuardPredicate )
            {
            // InternalQADocker.g:2333:4: (lv_guardspec_3_0= ruleGuardPredicate )
            // InternalQADocker.g:2334:5: lv_guardspec_3_0= ruleGuardPredicate
            {

            					newCompositeNode(grammarAccess.getGuardAccess().getGuardspecGuardPredicateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
            lv_guardspec_3_0=ruleGuardPredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardRule());
            					}
            					set(
            						current,
            						"guardspec",
            						lv_guardspec_3_0,
            						"xtext.qactor.QADocker.GuardPredicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGuardAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleGuardPredicate"
    // InternalQADocker.g:2359:1: entryRuleGuardPredicate returns [EObject current=null] : iv_ruleGuardPredicate= ruleGuardPredicate EOF ;
    public final EObject entryRuleGuardPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardPredicate = null;


        try {
            // InternalQADocker.g:2359:55: (iv_ruleGuardPredicate= ruleGuardPredicate EOF )
            // InternalQADocker.g:2360:2: iv_ruleGuardPredicate= ruleGuardPredicate EOF
            {
             newCompositeNode(grammarAccess.getGuardPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardPredicate=ruleGuardPredicate();

            state._fsp--;

             current =iv_ruleGuardPredicate; 
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
    // $ANTLR end "entryRuleGuardPredicate"


    // $ANTLR start "ruleGuardPredicate"
    // InternalQADocker.g:2366:1: ruleGuardPredicate returns [EObject current=null] : (this_GuardPredicateStable_0= ruleGuardPredicateStable | this_GuardPredicateRemovable_1= ruleGuardPredicateRemovable ) ;
    public final EObject ruleGuardPredicate() throws RecognitionException {
        EObject current = null;

        EObject this_GuardPredicateStable_0 = null;

        EObject this_GuardPredicateRemovable_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2372:2: ( (this_GuardPredicateStable_0= ruleGuardPredicateStable | this_GuardPredicateRemovable_1= ruleGuardPredicateRemovable ) )
            // InternalQADocker.g:2373:2: (this_GuardPredicateStable_0= ruleGuardPredicateStable | this_GuardPredicateRemovable_1= ruleGuardPredicateRemovable )
            {
            // InternalQADocker.g:2373:2: (this_GuardPredicateStable_0= ruleGuardPredicateStable | this_GuardPredicateRemovable_1= ruleGuardPredicateRemovable )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==58) ) {
                alt38=1;
            }
            else if ( (LA38_0==57) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalQADocker.g:2374:3: this_GuardPredicateStable_0= ruleGuardPredicateStable
                    {

                    			newCompositeNode(grammarAccess.getGuardPredicateAccess().getGuardPredicateStableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GuardPredicateStable_0=ruleGuardPredicateStable();

                    state._fsp--;


                    			current = this_GuardPredicateStable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:2383:3: this_GuardPredicateRemovable_1= ruleGuardPredicateRemovable
                    {

                    			newCompositeNode(grammarAccess.getGuardPredicateAccess().getGuardPredicateRemovableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GuardPredicateRemovable_1=ruleGuardPredicateRemovable();

                    state._fsp--;


                    			current = this_GuardPredicateRemovable_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleGuardPredicate"


    // $ANTLR start "entryRuleGuardPredicateRemovable"
    // InternalQADocker.g:2395:1: entryRuleGuardPredicateRemovable returns [EObject current=null] : iv_ruleGuardPredicateRemovable= ruleGuardPredicateRemovable EOF ;
    public final EObject entryRuleGuardPredicateRemovable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardPredicateRemovable = null;


        try {
            // InternalQADocker.g:2395:64: (iv_ruleGuardPredicateRemovable= ruleGuardPredicateRemovable EOF )
            // InternalQADocker.g:2396:2: iv_ruleGuardPredicateRemovable= ruleGuardPredicateRemovable EOF
            {
             newCompositeNode(grammarAccess.getGuardPredicateRemovableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardPredicateRemovable=ruleGuardPredicateRemovable();

            state._fsp--;

             current =iv_ruleGuardPredicateRemovable; 
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
    // $ANTLR end "entryRuleGuardPredicateRemovable"


    // $ANTLR start "ruleGuardPredicateRemovable"
    // InternalQADocker.g:2402:1: ruleGuardPredicateRemovable returns [EObject current=null] : ( () otherlv_1= '??' ( (lv_pred_2_0= rulePTerm ) ) ) ;
    public final EObject ruleGuardPredicateRemovable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2408:2: ( ( () otherlv_1= '??' ( (lv_pred_2_0= rulePTerm ) ) ) )
            // InternalQADocker.g:2409:2: ( () otherlv_1= '??' ( (lv_pred_2_0= rulePTerm ) ) )
            {
            // InternalQADocker.g:2409:2: ( () otherlv_1= '??' ( (lv_pred_2_0= rulePTerm ) ) )
            // InternalQADocker.g:2410:3: () otherlv_1= '??' ( (lv_pred_2_0= rulePTerm ) )
            {
            // InternalQADocker.g:2410:3: ()
            // InternalQADocker.g:2411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuardPredicateRemovableAccess().getGuardPredicateRemovableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardPredicateRemovableAccess().getQuestionMarkQuestionMarkKeyword_1());
            		
            // InternalQADocker.g:2421:3: ( (lv_pred_2_0= rulePTerm ) )
            // InternalQADocker.g:2422:4: (lv_pred_2_0= rulePTerm )
            {
            // InternalQADocker.g:2422:4: (lv_pred_2_0= rulePTerm )
            // InternalQADocker.g:2423:5: lv_pred_2_0= rulePTerm
            {

            					newCompositeNode(grammarAccess.getGuardPredicateRemovableAccess().getPredPTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pred_2_0=rulePTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardPredicateRemovableRule());
            					}
            					set(
            						current,
            						"pred",
            						lv_pred_2_0,
            						"xtext.qactor.QADocker.PTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleGuardPredicateRemovable"


    // $ANTLR start "entryRuleGuardPredicateStable"
    // InternalQADocker.g:2444:1: entryRuleGuardPredicateStable returns [EObject current=null] : iv_ruleGuardPredicateStable= ruleGuardPredicateStable EOF ;
    public final EObject entryRuleGuardPredicateStable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardPredicateStable = null;


        try {
            // InternalQADocker.g:2444:61: (iv_ruleGuardPredicateStable= ruleGuardPredicateStable EOF )
            // InternalQADocker.g:2445:2: iv_ruleGuardPredicateStable= ruleGuardPredicateStable EOF
            {
             newCompositeNode(grammarAccess.getGuardPredicateStableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardPredicateStable=ruleGuardPredicateStable();

            state._fsp--;

             current =iv_ruleGuardPredicateStable; 
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
    // $ANTLR end "entryRuleGuardPredicateStable"


    // $ANTLR start "ruleGuardPredicateStable"
    // InternalQADocker.g:2451:1: ruleGuardPredicateStable returns [EObject current=null] : ( () otherlv_1= '!?' ( (lv_pred_2_0= rulePTerm ) ) ) ;
    public final EObject ruleGuardPredicateStable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pred_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2457:2: ( ( () otherlv_1= '!?' ( (lv_pred_2_0= rulePTerm ) ) ) )
            // InternalQADocker.g:2458:2: ( () otherlv_1= '!?' ( (lv_pred_2_0= rulePTerm ) ) )
            {
            // InternalQADocker.g:2458:2: ( () otherlv_1= '!?' ( (lv_pred_2_0= rulePTerm ) ) )
            // InternalQADocker.g:2459:3: () otherlv_1= '!?' ( (lv_pred_2_0= rulePTerm ) )
            {
            // InternalQADocker.g:2459:3: ()
            // InternalQADocker.g:2460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuardPredicateStableAccess().getGuardPredicateStableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getGuardPredicateStableAccess().getExclamationMarkQuestionMarkKeyword_1());
            		
            // InternalQADocker.g:2470:3: ( (lv_pred_2_0= rulePTerm ) )
            // InternalQADocker.g:2471:4: (lv_pred_2_0= rulePTerm )
            {
            // InternalQADocker.g:2471:4: (lv_pred_2_0= rulePTerm )
            // InternalQADocker.g:2472:5: lv_pred_2_0= rulePTerm
            {

            					newCompositeNode(grammarAccess.getGuardPredicateStableAccess().getPredPTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pred_2_0=rulePTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGuardPredicateStableRule());
            					}
            					set(
            						current,
            						"pred",
            						lv_pred_2_0,
            						"xtext.qactor.QADocker.PTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleGuardPredicateStable"


    // $ANTLR start "entryRuleMove"
    // InternalQADocker.g:2493:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalQADocker.g:2493:45: (iv_ruleMove= ruleMove EOF )
            // InternalQADocker.g:2494:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalQADocker.g:2500:1: ruleMove returns [EObject current=null] : (this_ActionMove_0= ruleActionMove | this_MessageMove_1= ruleMessageMove | this_ExtensionMove_2= ruleExtensionMove | this_BasicMove_3= ruleBasicMove | this_PlanMove_4= rulePlanMove | this_GuardMove_5= ruleGuardMove | this_BasicRobotMove_6= ruleBasicRobotMove ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        EObject this_ActionMove_0 = null;

        EObject this_MessageMove_1 = null;

        EObject this_ExtensionMove_2 = null;

        EObject this_BasicMove_3 = null;

        EObject this_PlanMove_4 = null;

        EObject this_GuardMove_5 = null;

        EObject this_BasicRobotMove_6 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2506:2: ( (this_ActionMove_0= ruleActionMove | this_MessageMove_1= ruleMessageMove | this_ExtensionMove_2= ruleExtensionMove | this_BasicMove_3= ruleBasicMove | this_PlanMove_4= rulePlanMove | this_GuardMove_5= ruleGuardMove | this_BasicRobotMove_6= ruleBasicRobotMove ) )
            // InternalQADocker.g:2507:2: (this_ActionMove_0= ruleActionMove | this_MessageMove_1= ruleMessageMove | this_ExtensionMove_2= ruleExtensionMove | this_BasicMove_3= ruleBasicMove | this_PlanMove_4= rulePlanMove | this_GuardMove_5= ruleGuardMove | this_BasicRobotMove_6= ruleBasicRobotMove )
            {
            // InternalQADocker.g:2507:2: (this_ActionMove_0= ruleActionMove | this_MessageMove_1= ruleMessageMove | this_ExtensionMove_2= ruleExtensionMove | this_BasicMove_3= ruleBasicMove | this_PlanMove_4= rulePlanMove | this_GuardMove_5= ruleGuardMove | this_BasicRobotMove_6= ruleBasicRobotMove )
            int alt39=7;
            switch ( input.LA(1) ) {
            case 59:
            case 61:
            case 62:
            case 64:
            case 65:
                {
                alt39=1;
                }
                break;
            case 85:
            case 87:
            case 89:
            case 90:
            case 93:
            case 95:
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt39=2;
                }
                break;
            case 102:
            case 103:
            case 104:
            case 105:
                {
                alt39=3;
                }
                break;
            case 67:
            case 68:
            case 70:
            case 71:
            case 73:
                {
                alt39=4;
                }
                break;
            case 52:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt39=5;
                }
                break;
            case 83:
            case 84:
                {
                alt39=6;
                }
                break;
            case 66:
                {
                alt39=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalQADocker.g:2508:3: this_ActionMove_0= ruleActionMove
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getActionMoveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionMove_0=ruleActionMove();

                    state._fsp--;


                    			current = this_ActionMove_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:2517:3: this_MessageMove_1= ruleMessageMove
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getMessageMoveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageMove_1=ruleMessageMove();

                    state._fsp--;


                    			current = this_MessageMove_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:2526:3: this_ExtensionMove_2= ruleExtensionMove
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getExtensionMoveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExtensionMove_2=ruleExtensionMove();

                    state._fsp--;


                    			current = this_ExtensionMove_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:2535:3: this_BasicMove_3= ruleBasicMove
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getBasicMoveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicMove_3=ruleBasicMove();

                    state._fsp--;


                    			current = this_BasicMove_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQADocker.g:2544:3: this_PlanMove_4= rulePlanMove
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getPlanMoveParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlanMove_4=rulePlanMove();

                    state._fsp--;


                    			current = this_PlanMove_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQADocker.g:2553:3: this_GuardMove_5= ruleGuardMove
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getGuardMoveParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GuardMove_5=ruleGuardMove();

                    state._fsp--;


                    			current = this_GuardMove_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQADocker.g:2562:3: this_BasicRobotMove_6= ruleBasicRobotMove
                    {

                    			newCompositeNode(grammarAccess.getMoveAccess().getBasicRobotMoveParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicRobotMove_6=ruleBasicRobotMove();

                    state._fsp--;


                    			current = this_BasicRobotMove_6;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleActionMove"
    // InternalQADocker.g:2574:1: entryRuleActionMove returns [EObject current=null] : iv_ruleActionMove= ruleActionMove EOF ;
    public final EObject entryRuleActionMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionMove = null;


        try {
            // InternalQADocker.g:2574:51: (iv_ruleActionMove= ruleActionMove EOF )
            // InternalQADocker.g:2575:2: iv_ruleActionMove= ruleActionMove EOF
            {
             newCompositeNode(grammarAccess.getActionMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionMove=ruleActionMove();

            state._fsp--;

             current =iv_ruleActionMove; 
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
    // $ANTLR end "entryRuleActionMove"


    // $ANTLR start "ruleActionMove"
    // InternalQADocker.g:2581:1: ruleActionMove returns [EObject current=null] : (this_ExecuteAction_0= ruleExecuteAction | this_SolveGoal_1= ruleSolveGoal | this_Demo_2= ruleDemo | this_ActorOp_3= ruleActorOp ) ;
    public final EObject ruleActionMove() throws RecognitionException {
        EObject current = null;

        EObject this_ExecuteAction_0 = null;

        EObject this_SolveGoal_1 = null;

        EObject this_Demo_2 = null;

        EObject this_ActorOp_3 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2587:2: ( (this_ExecuteAction_0= ruleExecuteAction | this_SolveGoal_1= ruleSolveGoal | this_Demo_2= ruleDemo | this_ActorOp_3= ruleActorOp ) )
            // InternalQADocker.g:2588:2: (this_ExecuteAction_0= ruleExecuteAction | this_SolveGoal_1= ruleSolveGoal | this_Demo_2= ruleDemo | this_ActorOp_3= ruleActorOp )
            {
            // InternalQADocker.g:2588:2: (this_ExecuteAction_0= ruleExecuteAction | this_SolveGoal_1= ruleSolveGoal | this_Demo_2= ruleDemo | this_ActorOp_3= ruleActorOp )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 59:
            case 61:
                {
                alt40=1;
                }
                break;
            case 62:
                {
                alt40=2;
                }
                break;
            case 64:
                {
                alt40=3;
                }
                break;
            case 65:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalQADocker.g:2589:3: this_ExecuteAction_0= ruleExecuteAction
                    {

                    			newCompositeNode(grammarAccess.getActionMoveAccess().getExecuteActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecuteAction_0=ruleExecuteAction();

                    state._fsp--;


                    			current = this_ExecuteAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:2598:3: this_SolveGoal_1= ruleSolveGoal
                    {

                    			newCompositeNode(grammarAccess.getActionMoveAccess().getSolveGoalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SolveGoal_1=ruleSolveGoal();

                    state._fsp--;


                    			current = this_SolveGoal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:2607:3: this_Demo_2= ruleDemo
                    {

                    			newCompositeNode(grammarAccess.getActionMoveAccess().getDemoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Demo_2=ruleDemo();

                    state._fsp--;


                    			current = this_Demo_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:2616:3: this_ActorOp_3= ruleActorOp
                    {

                    			newCompositeNode(grammarAccess.getActionMoveAccess().getActorOpParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActorOp_3=ruleActorOp();

                    state._fsp--;


                    			current = this_ActorOp_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleActionMove"


    // $ANTLR start "entryRuleExecuteAction"
    // InternalQADocker.g:2628:1: entryRuleExecuteAction returns [EObject current=null] : iv_ruleExecuteAction= ruleExecuteAction EOF ;
    public final EObject entryRuleExecuteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecuteAction = null;


        try {
            // InternalQADocker.g:2628:54: (iv_ruleExecuteAction= ruleExecuteAction EOF )
            // InternalQADocker.g:2629:2: iv_ruleExecuteAction= ruleExecuteAction EOF
            {
             newCompositeNode(grammarAccess.getExecuteActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecuteAction=ruleExecuteAction();

            state._fsp--;

             current =iv_ruleExecuteAction; 
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
    // $ANTLR end "entryRuleExecuteAction"


    // $ANTLR start "ruleExecuteAction"
    // InternalQADocker.g:2635:1: ruleExecuteAction returns [EObject current=null] : ( ( () otherlv_1= 'execute' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )? ) | (otherlv_5= 'dosentence' ( (lv_sentence_6_0= rulePHead ) ) ) ) ;
    public final EObject ruleExecuteAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_4_0 = null;

        EObject lv_sentence_6_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2641:2: ( ( ( () otherlv_1= 'execute' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )? ) | (otherlv_5= 'dosentence' ( (lv_sentence_6_0= rulePHead ) ) ) ) )
            // InternalQADocker.g:2642:2: ( ( () otherlv_1= 'execute' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )? ) | (otherlv_5= 'dosentence' ( (lv_sentence_6_0= rulePHead ) ) ) )
            {
            // InternalQADocker.g:2642:2: ( ( () otherlv_1= 'execute' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )? ) | (otherlv_5= 'dosentence' ( (lv_sentence_6_0= rulePHead ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            else if ( (LA42_0==61) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalQADocker.g:2643:3: ( () otherlv_1= 'execute' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )? )
                    {
                    // InternalQADocker.g:2643:3: ( () otherlv_1= 'execute' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )? )
                    // InternalQADocker.g:2644:4: () otherlv_1= 'execute' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )?
                    {
                    // InternalQADocker.g:2644:4: ()
                    // InternalQADocker.g:2645:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExecuteActionAccess().getExecuteActionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getExecuteActionAccess().getExecuteKeyword_0_1());
                    			
                    // InternalQADocker.g:2655:4: ( (otherlv_2= RULE_ID ) )
                    // InternalQADocker.g:2656:5: (otherlv_2= RULE_ID )
                    {
                    // InternalQADocker.g:2656:5: (otherlv_2= RULE_ID )
                    // InternalQADocker.g:2657:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExecuteActionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_52); 

                    						newLeafNode(otherlv_2, grammarAccess.getExecuteActionAccess().getActionActionCrossReference_0_2_0());
                    					

                    }


                    }

                    // InternalQADocker.g:2668:4: (otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==60) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalQADocker.g:2669:5: otherlv_3= 'with' ( (lv_arg_4_0= rulePHead ) )
                            {
                            otherlv_3=(Token)match(input,60,FOLLOW_11); 

                            					newLeafNode(otherlv_3, grammarAccess.getExecuteActionAccess().getWithKeyword_0_3_0());
                            				
                            // InternalQADocker.g:2673:5: ( (lv_arg_4_0= rulePHead ) )
                            // InternalQADocker.g:2674:6: (lv_arg_4_0= rulePHead )
                            {
                            // InternalQADocker.g:2674:6: (lv_arg_4_0= rulePHead )
                            // InternalQADocker.g:2675:7: lv_arg_4_0= rulePHead
                            {

                            							newCompositeNode(grammarAccess.getExecuteActionAccess().getArgPHeadParserRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_arg_4_0=rulePHead();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getExecuteActionRule());
                            							}
                            							set(
                            								current,
                            								"arg",
                            								lv_arg_4_0,
                            								"xtext.qactor.QADocker.PHead");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:2695:3: (otherlv_5= 'dosentence' ( (lv_sentence_6_0= rulePHead ) ) )
                    {
                    // InternalQADocker.g:2695:3: (otherlv_5= 'dosentence' ( (lv_sentence_6_0= rulePHead ) ) )
                    // InternalQADocker.g:2696:4: otherlv_5= 'dosentence' ( (lv_sentence_6_0= rulePHead ) )
                    {
                    otherlv_5=(Token)match(input,61,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getExecuteActionAccess().getDosentenceKeyword_1_0());
                    			
                    // InternalQADocker.g:2700:4: ( (lv_sentence_6_0= rulePHead ) )
                    // InternalQADocker.g:2701:5: (lv_sentence_6_0= rulePHead )
                    {
                    // InternalQADocker.g:2701:5: (lv_sentence_6_0= rulePHead )
                    // InternalQADocker.g:2702:6: lv_sentence_6_0= rulePHead
                    {

                    						newCompositeNode(grammarAccess.getExecuteActionAccess().getSentencePHeadParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_6_0=rulePHead();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExecuteActionRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_6_0,
                    							"xtext.qactor.QADocker.PHead");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleExecuteAction"


    // $ANTLR start "entryRuleSolveGoal"
    // InternalQADocker.g:2724:1: entryRuleSolveGoal returns [EObject current=null] : iv_ruleSolveGoal= ruleSolveGoal EOF ;
    public final EObject entryRuleSolveGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolveGoal = null;


        try {
            // InternalQADocker.g:2724:50: (iv_ruleSolveGoal= ruleSolveGoal EOF )
            // InternalQADocker.g:2725:2: iv_ruleSolveGoal= ruleSolveGoal EOF
            {
             newCompositeNode(grammarAccess.getSolveGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolveGoal=ruleSolveGoal();

            state._fsp--;

             current =iv_ruleSolveGoal; 
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
    // $ANTLR end "entryRuleSolveGoal"


    // $ANTLR start "ruleSolveGoal"
    // InternalQADocker.g:2731:1: ruleSolveGoal returns [EObject current=null] : ( () otherlv_1= 'solve' ( (lv_goal_2_0= rulePHead ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) (otherlv_4= 'onFailSwitchTo' ( (otherlv_5= RULE_ID ) ) )? ) ;
    public final EObject ruleSolveGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_goal_2_0 = null;

        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2737:2: ( ( () otherlv_1= 'solve' ( (lv_goal_2_0= rulePHead ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) (otherlv_4= 'onFailSwitchTo' ( (otherlv_5= RULE_ID ) ) )? ) )
            // InternalQADocker.g:2738:2: ( () otherlv_1= 'solve' ( (lv_goal_2_0= rulePHead ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) (otherlv_4= 'onFailSwitchTo' ( (otherlv_5= RULE_ID ) ) )? )
            {
            // InternalQADocker.g:2738:2: ( () otherlv_1= 'solve' ( (lv_goal_2_0= rulePHead ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) (otherlv_4= 'onFailSwitchTo' ( (otherlv_5= RULE_ID ) ) )? )
            // InternalQADocker.g:2739:3: () otherlv_1= 'solve' ( (lv_goal_2_0= rulePHead ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) (otherlv_4= 'onFailSwitchTo' ( (otherlv_5= RULE_ID ) ) )?
            {
            // InternalQADocker.g:2739:3: ()
            // InternalQADocker.g:2740:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSolveGoalAccess().getSolveGoalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSolveGoalAccess().getSolveKeyword_1());
            		
            // InternalQADocker.g:2750:3: ( (lv_goal_2_0= rulePHead ) )
            // InternalQADocker.g:2751:4: (lv_goal_2_0= rulePHead )
            {
            // InternalQADocker.g:2751:4: (lv_goal_2_0= rulePHead )
            // InternalQADocker.g:2752:5: lv_goal_2_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getSolveGoalAccess().getGoalPHeadParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_goal_2_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolveGoalRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_2_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:2769:3: ( (lv_duration_3_0= ruleTimeLimit ) )
            // InternalQADocker.g:2770:4: (lv_duration_3_0= ruleTimeLimit )
            {
            // InternalQADocker.g:2770:4: (lv_duration_3_0= ruleTimeLimit )
            // InternalQADocker.g:2771:5: lv_duration_3_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getSolveGoalAccess().getDurationTimeLimitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_54);
            lv_duration_3_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolveGoalRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:2788:3: (otherlv_4= 'onFailSwitchTo' ( (otherlv_5= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==63) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQADocker.g:2789:4: otherlv_4= 'onFailSwitchTo' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSolveGoalAccess().getOnFailSwitchToKeyword_4_0());
                    			
                    // InternalQADocker.g:2793:4: ( (otherlv_5= RULE_ID ) )
                    // InternalQADocker.g:2794:5: (otherlv_5= RULE_ID )
                    {
                    // InternalQADocker.g:2794:5: (otherlv_5= RULE_ID )
                    // InternalQADocker.g:2795:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSolveGoalRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getSolveGoalAccess().getPlanPlanCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleSolveGoal"


    // $ANTLR start "entryRuleDemo"
    // InternalQADocker.g:2811:1: entryRuleDemo returns [EObject current=null] : iv_ruleDemo= ruleDemo EOF ;
    public final EObject entryRuleDemo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDemo = null;


        try {
            // InternalQADocker.g:2811:45: (iv_ruleDemo= ruleDemo EOF )
            // InternalQADocker.g:2812:2: iv_ruleDemo= ruleDemo EOF
            {
             newCompositeNode(grammarAccess.getDemoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDemo=ruleDemo();

            state._fsp--;

             current =iv_ruleDemo; 
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
    // $ANTLR end "entryRuleDemo"


    // $ANTLR start "ruleDemo"
    // InternalQADocker.g:2818:1: ruleDemo returns [EObject current=null] : ( () otherlv_1= 'demo' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleDemo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_goal_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2824:2: ( ( () otherlv_1= 'demo' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalQADocker.g:2825:2: ( () otherlv_1= 'demo' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalQADocker.g:2825:2: ( () otherlv_1= 'demo' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalQADocker.g:2826:3: () otherlv_1= 'demo' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalQADocker.g:2826:3: ()
            // InternalQADocker.g:2827:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDemoAccess().getDemoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDemoAccess().getDemoKeyword_1());
            		
            // InternalQADocker.g:2837:3: ( (lv_goal_2_0= rulePHead ) )
            // InternalQADocker.g:2838:4: (lv_goal_2_0= rulePHead )
            {
            // InternalQADocker.g:2838:4: (lv_goal_2_0= rulePHead )
            // InternalQADocker.g:2839:5: lv_goal_2_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getDemoAccess().getGoalPHeadParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_goal_2_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDemoRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_2_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:2856:3: (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==63) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQADocker.g:2857:4: otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDemoAccess().getOnFailSwitchToKeyword_3_0());
                    			
                    // InternalQADocker.g:2861:4: ( (otherlv_4= RULE_ID ) )
                    // InternalQADocker.g:2862:5: (otherlv_4= RULE_ID )
                    {
                    // InternalQADocker.g:2862:5: (otherlv_4= RULE_ID )
                    // InternalQADocker.g:2863:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDemoRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getDemoAccess().getPlanPlanCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleDemo"


    // $ANTLR start "entryRuleActorOp"
    // InternalQADocker.g:2879:1: entryRuleActorOp returns [EObject current=null] : iv_ruleActorOp= ruleActorOp EOF ;
    public final EObject entryRuleActorOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorOp = null;


        try {
            // InternalQADocker.g:2879:48: (iv_ruleActorOp= ruleActorOp EOF )
            // InternalQADocker.g:2880:2: iv_ruleActorOp= ruleActorOp EOF
            {
             newCompositeNode(grammarAccess.getActorOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActorOp=ruleActorOp();

            state._fsp--;

             current =iv_ruleActorOp; 
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
    // $ANTLR end "entryRuleActorOp"


    // $ANTLR start "ruleActorOp"
    // InternalQADocker.g:2886:1: ruleActorOp returns [EObject current=null] : ( () otherlv_1= 'actorOp' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleActorOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_goal_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2892:2: ( ( () otherlv_1= 'actorOp' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalQADocker.g:2893:2: ( () otherlv_1= 'actorOp' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalQADocker.g:2893:2: ( () otherlv_1= 'actorOp' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalQADocker.g:2894:3: () otherlv_1= 'actorOp' ( (lv_goal_2_0= rulePHead ) ) (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalQADocker.g:2894:3: ()
            // InternalQADocker.g:2895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorOpAccess().getActorOpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getActorOpAccess().getActorOpKeyword_1());
            		
            // InternalQADocker.g:2905:3: ( (lv_goal_2_0= rulePHead ) )
            // InternalQADocker.g:2906:4: (lv_goal_2_0= rulePHead )
            {
            // InternalQADocker.g:2906:4: (lv_goal_2_0= rulePHead )
            // InternalQADocker.g:2907:5: lv_goal_2_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getActorOpAccess().getGoalPHeadParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_goal_2_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorOpRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_2_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:2924:3: (otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==63) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQADocker.g:2925:4: otherlv_3= 'onFailSwitchTo' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getActorOpAccess().getOnFailSwitchToKeyword_3_0());
                    			
                    // InternalQADocker.g:2929:4: ( (otherlv_4= RULE_ID ) )
                    // InternalQADocker.g:2930:5: (otherlv_4= RULE_ID )
                    {
                    // InternalQADocker.g:2930:5: (otherlv_4= RULE_ID )
                    // InternalQADocker.g:2931:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorOpRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getActorOpAccess().getPlanPlanCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleActorOp"


    // $ANTLR start "entryRuleBasicRobotMove"
    // InternalQADocker.g:2947:1: entryRuleBasicRobotMove returns [EObject current=null] : iv_ruleBasicRobotMove= ruleBasicRobotMove EOF ;
    public final EObject entryRuleBasicRobotMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicRobotMove = null;


        try {
            // InternalQADocker.g:2947:55: (iv_ruleBasicRobotMove= ruleBasicRobotMove EOF )
            // InternalQADocker.g:2948:2: iv_ruleBasicRobotMove= ruleBasicRobotMove EOF
            {
             newCompositeNode(grammarAccess.getBasicRobotMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicRobotMove=ruleBasicRobotMove();

            state._fsp--;

             current =iv_ruleBasicRobotMove; 
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
    // $ANTLR end "entryRuleBasicRobotMove"


    // $ANTLR start "ruleBasicRobotMove"
    // InternalQADocker.g:2954:1: ruleBasicRobotMove returns [EObject current=null] : ( () otherlv_1= 'dummyRobotMove' ) ;
    public final EObject ruleBasicRobotMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQADocker.g:2960:2: ( ( () otherlv_1= 'dummyRobotMove' ) )
            // InternalQADocker.g:2961:2: ( () otherlv_1= 'dummyRobotMove' )
            {
            // InternalQADocker.g:2961:2: ( () otherlv_1= 'dummyRobotMove' )
            // InternalQADocker.g:2962:3: () otherlv_1= 'dummyRobotMove'
            {
            // InternalQADocker.g:2962:3: ()
            // InternalQADocker.g:2963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBasicRobotMoveAccess().getBasicRobotMoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBasicRobotMoveAccess().getDummyRobotMoveKeyword_1());
            		

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
    // $ANTLR end "ruleBasicRobotMove"


    // $ANTLR start "entryRuleBasicMove"
    // InternalQADocker.g:2977:1: entryRuleBasicMove returns [EObject current=null] : iv_ruleBasicMove= ruleBasicMove EOF ;
    public final EObject entryRuleBasicMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicMove = null;


        try {
            // InternalQADocker.g:2977:50: (iv_ruleBasicMove= ruleBasicMove EOF )
            // InternalQADocker.g:2978:2: iv_ruleBasicMove= ruleBasicMove EOF
            {
             newCompositeNode(grammarAccess.getBasicMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicMove=ruleBasicMove();

            state._fsp--;

             current =iv_ruleBasicMove; 
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
    // $ANTLR end "entryRuleBasicMove"


    // $ANTLR start "ruleBasicMove"
    // InternalQADocker.g:2984:1: ruleBasicMove returns [EObject current=null] : (this_Print_0= rulePrint | this_PrintCurrentEvent_1= rulePrintCurrentEvent | this_PrintCurrentMessage_2= rulePrintCurrentMessage | this_MemoCurrentEvent_3= ruleMemoCurrentEvent | this_MemoCurrentMessage_4= ruleMemoCurrentMessage ) ;
    public final EObject ruleBasicMove() throws RecognitionException {
        EObject current = null;

        EObject this_Print_0 = null;

        EObject this_PrintCurrentEvent_1 = null;

        EObject this_PrintCurrentMessage_2 = null;

        EObject this_MemoCurrentEvent_3 = null;

        EObject this_MemoCurrentMessage_4 = null;



        	enterRule();

        try {
            // InternalQADocker.g:2990:2: ( (this_Print_0= rulePrint | this_PrintCurrentEvent_1= rulePrintCurrentEvent | this_PrintCurrentMessage_2= rulePrintCurrentMessage | this_MemoCurrentEvent_3= ruleMemoCurrentEvent | this_MemoCurrentMessage_4= ruleMemoCurrentMessage ) )
            // InternalQADocker.g:2991:2: (this_Print_0= rulePrint | this_PrintCurrentEvent_1= rulePrintCurrentEvent | this_PrintCurrentMessage_2= rulePrintCurrentMessage | this_MemoCurrentEvent_3= ruleMemoCurrentEvent | this_MemoCurrentMessage_4= ruleMemoCurrentMessage )
            {
            // InternalQADocker.g:2991:2: (this_Print_0= rulePrint | this_PrintCurrentEvent_1= rulePrintCurrentEvent | this_PrintCurrentMessage_2= rulePrintCurrentMessage | this_MemoCurrentEvent_3= ruleMemoCurrentEvent | this_MemoCurrentMessage_4= ruleMemoCurrentMessage )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt46=1;
                }
                break;
            case 68:
                {
                alt46=2;
                }
                break;
            case 70:
                {
                alt46=3;
                }
                break;
            case 71:
                {
                alt46=4;
                }
                break;
            case 73:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalQADocker.g:2992:3: this_Print_0= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getBasicMoveAccess().getPrintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_0=rulePrint();

                    state._fsp--;


                    			current = this_Print_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:3001:3: this_PrintCurrentEvent_1= rulePrintCurrentEvent
                    {

                    			newCompositeNode(grammarAccess.getBasicMoveAccess().getPrintCurrentEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintCurrentEvent_1=rulePrintCurrentEvent();

                    state._fsp--;


                    			current = this_PrintCurrentEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:3010:3: this_PrintCurrentMessage_2= rulePrintCurrentMessage
                    {

                    			newCompositeNode(grammarAccess.getBasicMoveAccess().getPrintCurrentMessageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrintCurrentMessage_2=rulePrintCurrentMessage();

                    state._fsp--;


                    			current = this_PrintCurrentMessage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:3019:3: this_MemoCurrentEvent_3= ruleMemoCurrentEvent
                    {

                    			newCompositeNode(grammarAccess.getBasicMoveAccess().getMemoCurrentEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemoCurrentEvent_3=ruleMemoCurrentEvent();

                    state._fsp--;


                    			current = this_MemoCurrentEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQADocker.g:3028:3: this_MemoCurrentMessage_4= ruleMemoCurrentMessage
                    {

                    			newCompositeNode(grammarAccess.getBasicMoveAccess().getMemoCurrentMessageParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemoCurrentMessage_4=ruleMemoCurrentMessage();

                    state._fsp--;


                    			current = this_MemoCurrentMessage_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleBasicMove"


    // $ANTLR start "entryRulePrint"
    // InternalQADocker.g:3040:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalQADocker.g:3040:46: (iv_rulePrint= rulePrint EOF )
            // InternalQADocker.g:3041:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalQADocker.g:3047:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_args_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3053:2: ( ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' ) )
            // InternalQADocker.g:3054:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' )
            {
            // InternalQADocker.g:3054:2: ( () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')' )
            // InternalQADocker.g:3055:3: () otherlv_1= 'println' otherlv_2= '(' ( (lv_args_3_0= rulePHead ) ) otherlv_4= ')'
            {
            // InternalQADocker.g:3055:3: ()
            // InternalQADocker.g:3056:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintAccess().getPrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintlnKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_2());
            		
            // InternalQADocker.g:3070:3: ( (lv_args_3_0= rulePHead ) )
            // InternalQADocker.g:3071:4: (lv_args_3_0= rulePHead )
            {
            // InternalQADocker.g:3071:4: (lv_args_3_0= rulePHead )
            // InternalQADocker.g:3072:5: lv_args_3_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getArgsPHeadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_args_3_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_3_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPrintAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRulePrintCurrentEvent"
    // InternalQADocker.g:3097:1: entryRulePrintCurrentEvent returns [EObject current=null] : iv_rulePrintCurrentEvent= rulePrintCurrentEvent EOF ;
    public final EObject entryRulePrintCurrentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCurrentEvent = null;


        try {
            // InternalQADocker.g:3097:58: (iv_rulePrintCurrentEvent= rulePrintCurrentEvent EOF )
            // InternalQADocker.g:3098:2: iv_rulePrintCurrentEvent= rulePrintCurrentEvent EOF
            {
             newCompositeNode(grammarAccess.getPrintCurrentEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintCurrentEvent=rulePrintCurrentEvent();

            state._fsp--;

             current =iv_rulePrintCurrentEvent; 
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
    // $ANTLR end "entryRulePrintCurrentEvent"


    // $ANTLR start "rulePrintCurrentEvent"
    // InternalQADocker.g:3104:1: rulePrintCurrentEvent returns [EObject current=null] : ( () otherlv_1= 'printCurrentEvent' ( (lv_memo_2_0= '-memo' ) )? ) ;
    public final EObject rulePrintCurrentEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_memo_2_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:3110:2: ( ( () otherlv_1= 'printCurrentEvent' ( (lv_memo_2_0= '-memo' ) )? ) )
            // InternalQADocker.g:3111:2: ( () otherlv_1= 'printCurrentEvent' ( (lv_memo_2_0= '-memo' ) )? )
            {
            // InternalQADocker.g:3111:2: ( () otherlv_1= 'printCurrentEvent' ( (lv_memo_2_0= '-memo' ) )? )
            // InternalQADocker.g:3112:3: () otherlv_1= 'printCurrentEvent' ( (lv_memo_2_0= '-memo' ) )?
            {
            // InternalQADocker.g:3112:3: ()
            // InternalQADocker.g:3113:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintCurrentEventAccess().getPrintCurrentEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintCurrentEventAccess().getPrintCurrentEventKeyword_1());
            		
            // InternalQADocker.g:3123:3: ( (lv_memo_2_0= '-memo' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==69) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQADocker.g:3124:4: (lv_memo_2_0= '-memo' )
                    {
                    // InternalQADocker.g:3124:4: (lv_memo_2_0= '-memo' )
                    // InternalQADocker.g:3125:5: lv_memo_2_0= '-memo'
                    {
                    lv_memo_2_0=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_memo_2_0, grammarAccess.getPrintCurrentEventAccess().getMemoMemoKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrintCurrentEventRule());
                    					}
                    					setWithLastConsumed(current, "memo", true, "-memo");
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "rulePrintCurrentEvent"


    // $ANTLR start "entryRulePrintCurrentMessage"
    // InternalQADocker.g:3141:1: entryRulePrintCurrentMessage returns [EObject current=null] : iv_rulePrintCurrentMessage= rulePrintCurrentMessage EOF ;
    public final EObject entryRulePrintCurrentMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintCurrentMessage = null;


        try {
            // InternalQADocker.g:3141:60: (iv_rulePrintCurrentMessage= rulePrintCurrentMessage EOF )
            // InternalQADocker.g:3142:2: iv_rulePrintCurrentMessage= rulePrintCurrentMessage EOF
            {
             newCompositeNode(grammarAccess.getPrintCurrentMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrintCurrentMessage=rulePrintCurrentMessage();

            state._fsp--;

             current =iv_rulePrintCurrentMessage; 
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
    // $ANTLR end "entryRulePrintCurrentMessage"


    // $ANTLR start "rulePrintCurrentMessage"
    // InternalQADocker.g:3148:1: rulePrintCurrentMessage returns [EObject current=null] : ( () otherlv_1= 'printCurrentMessage' ( (lv_memo_2_0= '-memo' ) )? ) ;
    public final EObject rulePrintCurrentMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_memo_2_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:3154:2: ( ( () otherlv_1= 'printCurrentMessage' ( (lv_memo_2_0= '-memo' ) )? ) )
            // InternalQADocker.g:3155:2: ( () otherlv_1= 'printCurrentMessage' ( (lv_memo_2_0= '-memo' ) )? )
            {
            // InternalQADocker.g:3155:2: ( () otherlv_1= 'printCurrentMessage' ( (lv_memo_2_0= '-memo' ) )? )
            // InternalQADocker.g:3156:3: () otherlv_1= 'printCurrentMessage' ( (lv_memo_2_0= '-memo' ) )?
            {
            // InternalQADocker.g:3156:3: ()
            // InternalQADocker.g:3157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintCurrentMessageAccess().getPrintCurrentMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintCurrentMessageAccess().getPrintCurrentMessageKeyword_1());
            		
            // InternalQADocker.g:3167:3: ( (lv_memo_2_0= '-memo' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==69) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQADocker.g:3168:4: (lv_memo_2_0= '-memo' )
                    {
                    // InternalQADocker.g:3168:4: (lv_memo_2_0= '-memo' )
                    // InternalQADocker.g:3169:5: lv_memo_2_0= '-memo'
                    {
                    lv_memo_2_0=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_memo_2_0, grammarAccess.getPrintCurrentMessageAccess().getMemoMemoKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrintCurrentMessageRule());
                    					}
                    					setWithLastConsumed(current, "memo", true, "-memo");
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "rulePrintCurrentMessage"


    // $ANTLR start "entryRuleMemoCurrentEvent"
    // InternalQADocker.g:3185:1: entryRuleMemoCurrentEvent returns [EObject current=null] : iv_ruleMemoCurrentEvent= ruleMemoCurrentEvent EOF ;
    public final EObject entryRuleMemoCurrentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoCurrentEvent = null;


        try {
            // InternalQADocker.g:3185:57: (iv_ruleMemoCurrentEvent= ruleMemoCurrentEvent EOF )
            // InternalQADocker.g:3186:2: iv_ruleMemoCurrentEvent= ruleMemoCurrentEvent EOF
            {
             newCompositeNode(grammarAccess.getMemoCurrentEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoCurrentEvent=ruleMemoCurrentEvent();

            state._fsp--;

             current =iv_ruleMemoCurrentEvent; 
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
    // $ANTLR end "entryRuleMemoCurrentEvent"


    // $ANTLR start "ruleMemoCurrentEvent"
    // InternalQADocker.g:3192:1: ruleMemoCurrentEvent returns [EObject current=null] : ( () otherlv_1= 'memoCurrentEvent' ( (lv_lastonly_2_0= '-lastonly' ) )? ) ;
    public final EObject ruleMemoCurrentEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lastonly_2_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:3198:2: ( ( () otherlv_1= 'memoCurrentEvent' ( (lv_lastonly_2_0= '-lastonly' ) )? ) )
            // InternalQADocker.g:3199:2: ( () otherlv_1= 'memoCurrentEvent' ( (lv_lastonly_2_0= '-lastonly' ) )? )
            {
            // InternalQADocker.g:3199:2: ( () otherlv_1= 'memoCurrentEvent' ( (lv_lastonly_2_0= '-lastonly' ) )? )
            // InternalQADocker.g:3200:3: () otherlv_1= 'memoCurrentEvent' ( (lv_lastonly_2_0= '-lastonly' ) )?
            {
            // InternalQADocker.g:3200:3: ()
            // InternalQADocker.g:3201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoCurrentEventAccess().getMemoCurrentEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoCurrentEventAccess().getMemoCurrentEventKeyword_1());
            		
            // InternalQADocker.g:3211:3: ( (lv_lastonly_2_0= '-lastonly' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalQADocker.g:3212:4: (lv_lastonly_2_0= '-lastonly' )
                    {
                    // InternalQADocker.g:3212:4: (lv_lastonly_2_0= '-lastonly' )
                    // InternalQADocker.g:3213:5: lv_lastonly_2_0= '-lastonly'
                    {
                    lv_lastonly_2_0=(Token)match(input,72,FOLLOW_2); 

                    					newLeafNode(lv_lastonly_2_0, grammarAccess.getMemoCurrentEventAccess().getLastonlyLastonlyKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemoCurrentEventRule());
                    					}
                    					setWithLastConsumed(current, "lastonly", true, "-lastonly");
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleMemoCurrentEvent"


    // $ANTLR start "entryRuleMemoCurrentMessage"
    // InternalQADocker.g:3229:1: entryRuleMemoCurrentMessage returns [EObject current=null] : iv_ruleMemoCurrentMessage= ruleMemoCurrentMessage EOF ;
    public final EObject entryRuleMemoCurrentMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoCurrentMessage = null;


        try {
            // InternalQADocker.g:3229:59: (iv_ruleMemoCurrentMessage= ruleMemoCurrentMessage EOF )
            // InternalQADocker.g:3230:2: iv_ruleMemoCurrentMessage= ruleMemoCurrentMessage EOF
            {
             newCompositeNode(grammarAccess.getMemoCurrentMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoCurrentMessage=ruleMemoCurrentMessage();

            state._fsp--;

             current =iv_ruleMemoCurrentMessage; 
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
    // $ANTLR end "entryRuleMemoCurrentMessage"


    // $ANTLR start "ruleMemoCurrentMessage"
    // InternalQADocker.g:3236:1: ruleMemoCurrentMessage returns [EObject current=null] : ( () otherlv_1= 'memoCurrentMessage' ( (lv_lastonly_2_0= '-lastonly' ) )? ) ;
    public final EObject ruleMemoCurrentMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_lastonly_2_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:3242:2: ( ( () otherlv_1= 'memoCurrentMessage' ( (lv_lastonly_2_0= '-lastonly' ) )? ) )
            // InternalQADocker.g:3243:2: ( () otherlv_1= 'memoCurrentMessage' ( (lv_lastonly_2_0= '-lastonly' ) )? )
            {
            // InternalQADocker.g:3243:2: ( () otherlv_1= 'memoCurrentMessage' ( (lv_lastonly_2_0= '-lastonly' ) )? )
            // InternalQADocker.g:3244:3: () otherlv_1= 'memoCurrentMessage' ( (lv_lastonly_2_0= '-lastonly' ) )?
            {
            // InternalQADocker.g:3244:3: ()
            // InternalQADocker.g:3245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoCurrentMessageAccess().getMemoCurrentMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoCurrentMessageAccess().getMemoCurrentMessageKeyword_1());
            		
            // InternalQADocker.g:3255:3: ( (lv_lastonly_2_0= '-lastonly' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQADocker.g:3256:4: (lv_lastonly_2_0= '-lastonly' )
                    {
                    // InternalQADocker.g:3256:4: (lv_lastonly_2_0= '-lastonly' )
                    // InternalQADocker.g:3257:5: lv_lastonly_2_0= '-lastonly'
                    {
                    lv_lastonly_2_0=(Token)match(input,72,FOLLOW_2); 

                    					newLeafNode(lv_lastonly_2_0, grammarAccess.getMemoCurrentMessageAccess().getLastonlyLastonlyKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMemoCurrentMessageRule());
                    					}
                    					setWithLastConsumed(current, "lastonly", true, "-lastonly");
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleMemoCurrentMessage"


    // $ANTLR start "entryRulePlanMove"
    // InternalQADocker.g:3273:1: entryRulePlanMove returns [EObject current=null] : iv_rulePlanMove= rulePlanMove EOF ;
    public final EObject entryRulePlanMove() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanMove = null;


        try {
            // InternalQADocker.g:3273:49: (iv_rulePlanMove= rulePlanMove EOF )
            // InternalQADocker.g:3274:2: iv_rulePlanMove= rulePlanMove EOF
            {
             newCompositeNode(grammarAccess.getPlanMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlanMove=rulePlanMove();

            state._fsp--;

             current =iv_rulePlanMove; 
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
    // $ANTLR end "entryRulePlanMove"


    // $ANTLR start "rulePlanMove"
    // InternalQADocker.g:3280:1: rulePlanMove returns [EObject current=null] : (this_GetActivationEvent_0= ruleGetActivationEvent | this_GetSensedEvent_1= ruleGetSensedEvent | this_LoadPlan_2= ruleLoadPlan | this_RunPlan_3= ruleRunPlan | this_ResumePlan_4= ruleResumePlan | this_RepeatPlan_5= ruleRepeatPlan | this_SwitchPlan_6= ruleSwitchPlan | this_SuspendPlan_7= ruleSuspendPlan | this_EndPlan_8= ruleEndPlan | this_EndActor_9= ruleEndActor ) ;
    public final EObject rulePlanMove() throws RecognitionException {
        EObject current = null;

        EObject this_GetActivationEvent_0 = null;

        EObject this_GetSensedEvent_1 = null;

        EObject this_LoadPlan_2 = null;

        EObject this_RunPlan_3 = null;

        EObject this_ResumePlan_4 = null;

        EObject this_RepeatPlan_5 = null;

        EObject this_SwitchPlan_6 = null;

        EObject this_SuspendPlan_7 = null;

        EObject this_EndPlan_8 = null;

        EObject this_EndActor_9 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3286:2: ( (this_GetActivationEvent_0= ruleGetActivationEvent | this_GetSensedEvent_1= ruleGetSensedEvent | this_LoadPlan_2= ruleLoadPlan | this_RunPlan_3= ruleRunPlan | this_ResumePlan_4= ruleResumePlan | this_RepeatPlan_5= ruleRepeatPlan | this_SwitchPlan_6= ruleSwitchPlan | this_SuspendPlan_7= ruleSuspendPlan | this_EndPlan_8= ruleEndPlan | this_EndActor_9= ruleEndActor ) )
            // InternalQADocker.g:3287:2: (this_GetActivationEvent_0= ruleGetActivationEvent | this_GetSensedEvent_1= ruleGetSensedEvent | this_LoadPlan_2= ruleLoadPlan | this_RunPlan_3= ruleRunPlan | this_ResumePlan_4= ruleResumePlan | this_RepeatPlan_5= ruleRepeatPlan | this_SwitchPlan_6= ruleSwitchPlan | this_SuspendPlan_7= ruleSuspendPlan | this_EndPlan_8= ruleEndPlan | this_EndActor_9= ruleEndActor )
            {
            // InternalQADocker.g:3287:2: (this_GetActivationEvent_0= ruleGetActivationEvent | this_GetSensedEvent_1= ruleGetSensedEvent | this_LoadPlan_2= ruleLoadPlan | this_RunPlan_3= ruleRunPlan | this_ResumePlan_4= ruleResumePlan | this_RepeatPlan_5= ruleRepeatPlan | this_SwitchPlan_6= ruleSwitchPlan | this_SuspendPlan_7= ruleSuspendPlan | this_EndPlan_8= ruleEndPlan | this_EndActor_9= ruleEndActor )
            int alt51=10;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt51=1;
                }
                break;
            case 75:
                {
                alt51=2;
                }
                break;
            case 76:
                {
                alt51=3;
                }
                break;
            case 77:
                {
                alt51=4;
                }
                break;
            case 52:
                {
                alt51=5;
                }
                break;
            case 79:
                {
                alt51=6;
                }
                break;
            case 80:
                {
                alt51=7;
                }
                break;
            case 78:
                {
                alt51=8;
                }
                break;
            case 81:
                {
                alt51=9;
                }
                break;
            case 82:
                {
                alt51=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalQADocker.g:3288:3: this_GetActivationEvent_0= ruleGetActivationEvent
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getGetActivationEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetActivationEvent_0=ruleGetActivationEvent();

                    state._fsp--;


                    			current = this_GetActivationEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:3297:3: this_GetSensedEvent_1= ruleGetSensedEvent
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getGetSensedEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetSensedEvent_1=ruleGetSensedEvent();

                    state._fsp--;


                    			current = this_GetSensedEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:3306:3: this_LoadPlan_2= ruleLoadPlan
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getLoadPlanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadPlan_2=ruleLoadPlan();

                    state._fsp--;


                    			current = this_LoadPlan_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:3315:3: this_RunPlan_3= ruleRunPlan
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getRunPlanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunPlan_3=ruleRunPlan();

                    state._fsp--;


                    			current = this_RunPlan_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQADocker.g:3324:3: this_ResumePlan_4= ruleResumePlan
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getResumePlanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ResumePlan_4=ruleResumePlan();

                    state._fsp--;


                    			current = this_ResumePlan_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQADocker.g:3333:3: this_RepeatPlan_5= ruleRepeatPlan
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getRepeatPlanParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatPlan_5=ruleRepeatPlan();

                    state._fsp--;


                    			current = this_RepeatPlan_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQADocker.g:3342:3: this_SwitchPlan_6= ruleSwitchPlan
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getSwitchPlanParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SwitchPlan_6=ruleSwitchPlan();

                    state._fsp--;


                    			current = this_SwitchPlan_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalQADocker.g:3351:3: this_SuspendPlan_7= ruleSuspendPlan
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getSuspendPlanParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuspendPlan_7=ruleSuspendPlan();

                    state._fsp--;


                    			current = this_SuspendPlan_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalQADocker.g:3360:3: this_EndPlan_8= ruleEndPlan
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getEndPlanParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndPlan_8=ruleEndPlan();

                    state._fsp--;


                    			current = this_EndPlan_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalQADocker.g:3369:3: this_EndActor_9= ruleEndActor
                    {

                    			newCompositeNode(grammarAccess.getPlanMoveAccess().getEndActorParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndActor_9=ruleEndActor();

                    state._fsp--;


                    			current = this_EndActor_9;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePlanMove"


    // $ANTLR start "entryRuleGetActivationEvent"
    // InternalQADocker.g:3381:1: entryRuleGetActivationEvent returns [EObject current=null] : iv_ruleGetActivationEvent= ruleGetActivationEvent EOF ;
    public final EObject entryRuleGetActivationEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetActivationEvent = null;


        try {
            // InternalQADocker.g:3381:59: (iv_ruleGetActivationEvent= ruleGetActivationEvent EOF )
            // InternalQADocker.g:3382:2: iv_ruleGetActivationEvent= ruleGetActivationEvent EOF
            {
             newCompositeNode(grammarAccess.getGetActivationEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetActivationEvent=ruleGetActivationEvent();

            state._fsp--;

             current =iv_ruleGetActivationEvent; 
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
    // $ANTLR end "entryRuleGetActivationEvent"


    // $ANTLR start "ruleGetActivationEvent"
    // InternalQADocker.g:3388:1: ruleGetActivationEvent returns [EObject current=null] : ( () otherlv_1= 'getActivationEvent' ( (lv_var_2_0= ruleVariable ) ) ) ;
    public final EObject ruleGetActivationEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3394:2: ( ( () otherlv_1= 'getActivationEvent' ( (lv_var_2_0= ruleVariable ) ) ) )
            // InternalQADocker.g:3395:2: ( () otherlv_1= 'getActivationEvent' ( (lv_var_2_0= ruleVariable ) ) )
            {
            // InternalQADocker.g:3395:2: ( () otherlv_1= 'getActivationEvent' ( (lv_var_2_0= ruleVariable ) ) )
            // InternalQADocker.g:3396:3: () otherlv_1= 'getActivationEvent' ( (lv_var_2_0= ruleVariable ) )
            {
            // InternalQADocker.g:3396:3: ()
            // InternalQADocker.g:3397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGetActivationEventAccess().getGetActivationEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getGetActivationEventAccess().getGetActivationEventKeyword_1());
            		
            // InternalQADocker.g:3407:3: ( (lv_var_2_0= ruleVariable ) )
            // InternalQADocker.g:3408:4: (lv_var_2_0= ruleVariable )
            {
            // InternalQADocker.g:3408:4: (lv_var_2_0= ruleVariable )
            // InternalQADocker.g:3409:5: lv_var_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGetActivationEventAccess().getVarVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetActivationEventRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"xtext.qactor.QADocker.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleGetActivationEvent"


    // $ANTLR start "entryRuleGetSensedEvent"
    // InternalQADocker.g:3430:1: entryRuleGetSensedEvent returns [EObject current=null] : iv_ruleGetSensedEvent= ruleGetSensedEvent EOF ;
    public final EObject entryRuleGetSensedEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetSensedEvent = null;


        try {
            // InternalQADocker.g:3430:55: (iv_ruleGetSensedEvent= ruleGetSensedEvent EOF )
            // InternalQADocker.g:3431:2: iv_ruleGetSensedEvent= ruleGetSensedEvent EOF
            {
             newCompositeNode(grammarAccess.getGetSensedEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetSensedEvent=ruleGetSensedEvent();

            state._fsp--;

             current =iv_ruleGetSensedEvent; 
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
    // $ANTLR end "entryRuleGetSensedEvent"


    // $ANTLR start "ruleGetSensedEvent"
    // InternalQADocker.g:3437:1: ruleGetSensedEvent returns [EObject current=null] : ( () otherlv_1= 'getSensedEvent' ( (lv_var_2_0= ruleVariable ) ) ) ;
    public final EObject ruleGetSensedEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3443:2: ( ( () otherlv_1= 'getSensedEvent' ( (lv_var_2_0= ruleVariable ) ) ) )
            // InternalQADocker.g:3444:2: ( () otherlv_1= 'getSensedEvent' ( (lv_var_2_0= ruleVariable ) ) )
            {
            // InternalQADocker.g:3444:2: ( () otherlv_1= 'getSensedEvent' ( (lv_var_2_0= ruleVariable ) ) )
            // InternalQADocker.g:3445:3: () otherlv_1= 'getSensedEvent' ( (lv_var_2_0= ruleVariable ) )
            {
            // InternalQADocker.g:3445:3: ()
            // InternalQADocker.g:3446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGetSensedEventAccess().getGetSensedEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getGetSensedEventAccess().getGetSensedEventKeyword_1());
            		
            // InternalQADocker.g:3456:3: ( (lv_var_2_0= ruleVariable ) )
            // InternalQADocker.g:3457:4: (lv_var_2_0= ruleVariable )
            {
            // InternalQADocker.g:3457:4: (lv_var_2_0= ruleVariable )
            // InternalQADocker.g:3458:5: lv_var_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getGetSensedEventAccess().getVarVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_var_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetSensedEventRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"xtext.qactor.QADocker.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleGetSensedEvent"


    // $ANTLR start "entryRuleLoadPlan"
    // InternalQADocker.g:3479:1: entryRuleLoadPlan returns [EObject current=null] : iv_ruleLoadPlan= ruleLoadPlan EOF ;
    public final EObject entryRuleLoadPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadPlan = null;


        try {
            // InternalQADocker.g:3479:49: (iv_ruleLoadPlan= ruleLoadPlan EOF )
            // InternalQADocker.g:3480:2: iv_ruleLoadPlan= ruleLoadPlan EOF
            {
             newCompositeNode(grammarAccess.getLoadPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadPlan=ruleLoadPlan();

            state._fsp--;

             current =iv_ruleLoadPlan; 
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
    // $ANTLR end "entryRuleLoadPlan"


    // $ANTLR start "ruleLoadPlan"
    // InternalQADocker.g:3486:1: ruleLoadPlan returns [EObject current=null] : ( () otherlv_1= 'loadPlan' ( (lv_fname_2_0= ruleVarOrString ) ) ) ;
    public final EObject ruleLoadPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fname_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3492:2: ( ( () otherlv_1= 'loadPlan' ( (lv_fname_2_0= ruleVarOrString ) ) ) )
            // InternalQADocker.g:3493:2: ( () otherlv_1= 'loadPlan' ( (lv_fname_2_0= ruleVarOrString ) ) )
            {
            // InternalQADocker.g:3493:2: ( () otherlv_1= 'loadPlan' ( (lv_fname_2_0= ruleVarOrString ) ) )
            // InternalQADocker.g:3494:3: () otherlv_1= 'loadPlan' ( (lv_fname_2_0= ruleVarOrString ) )
            {
            // InternalQADocker.g:3494:3: ()
            // InternalQADocker.g:3495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadPlanAccess().getLoadPlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadPlanAccess().getLoadPlanKeyword_1());
            		
            // InternalQADocker.g:3505:3: ( (lv_fname_2_0= ruleVarOrString ) )
            // InternalQADocker.g:3506:4: (lv_fname_2_0= ruleVarOrString )
            {
            // InternalQADocker.g:3506:4: (lv_fname_2_0= ruleVarOrString )
            // InternalQADocker.g:3507:5: lv_fname_2_0= ruleVarOrString
            {

            					newCompositeNode(grammarAccess.getLoadPlanAccess().getFnameVarOrStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_fname_2_0=ruleVarOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadPlanRule());
            					}
            					set(
            						current,
            						"fname",
            						lv_fname_2_0,
            						"xtext.qactor.QADocker.VarOrString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleLoadPlan"


    // $ANTLR start "entryRuleRunPlan"
    // InternalQADocker.g:3528:1: entryRuleRunPlan returns [EObject current=null] : iv_ruleRunPlan= ruleRunPlan EOF ;
    public final EObject entryRuleRunPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunPlan = null;


        try {
            // InternalQADocker.g:3528:48: (iv_ruleRunPlan= ruleRunPlan EOF )
            // InternalQADocker.g:3529:2: iv_ruleRunPlan= ruleRunPlan EOF
            {
             newCompositeNode(grammarAccess.getRunPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunPlan=ruleRunPlan();

            state._fsp--;

             current =iv_ruleRunPlan; 
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
    // $ANTLR end "entryRuleRunPlan"


    // $ANTLR start "ruleRunPlan"
    // InternalQADocker.g:3535:1: ruleRunPlan returns [EObject current=null] : ( () otherlv_1= 'runPlan' ( (lv_plainid_2_0= ruleVarOrAtomic ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) ) ;
    public final EObject ruleRunPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_plainid_2_0 = null;

        EObject lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3541:2: ( ( () otherlv_1= 'runPlan' ( (lv_plainid_2_0= ruleVarOrAtomic ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) ) )
            // InternalQADocker.g:3542:2: ( () otherlv_1= 'runPlan' ( (lv_plainid_2_0= ruleVarOrAtomic ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) )
            {
            // InternalQADocker.g:3542:2: ( () otherlv_1= 'runPlan' ( (lv_plainid_2_0= ruleVarOrAtomic ) ) ( (lv_duration_3_0= ruleTimeLimit ) ) )
            // InternalQADocker.g:3543:3: () otherlv_1= 'runPlan' ( (lv_plainid_2_0= ruleVarOrAtomic ) ) ( (lv_duration_3_0= ruleTimeLimit ) )
            {
            // InternalQADocker.g:3543:3: ()
            // InternalQADocker.g:3544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunPlanAccess().getRunPlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRunPlanAccess().getRunPlanKeyword_1());
            		
            // InternalQADocker.g:3554:3: ( (lv_plainid_2_0= ruleVarOrAtomic ) )
            // InternalQADocker.g:3555:4: (lv_plainid_2_0= ruleVarOrAtomic )
            {
            // InternalQADocker.g:3555:4: (lv_plainid_2_0= ruleVarOrAtomic )
            // InternalQADocker.g:3556:5: lv_plainid_2_0= ruleVarOrAtomic
            {

            					newCompositeNode(grammarAccess.getRunPlanAccess().getPlainidVarOrAtomicParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_53);
            lv_plainid_2_0=ruleVarOrAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunPlanRule());
            					}
            					set(
            						current,
            						"plainid",
            						lv_plainid_2_0,
            						"xtext.qactor.QADocker.VarOrAtomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:3573:3: ( (lv_duration_3_0= ruleTimeLimit ) )
            // InternalQADocker.g:3574:4: (lv_duration_3_0= ruleTimeLimit )
            {
            // InternalQADocker.g:3574:4: (lv_duration_3_0= ruleTimeLimit )
            // InternalQADocker.g:3575:5: lv_duration_3_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getRunPlanAccess().getDurationTimeLimitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_duration_3_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunPlanRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleRunPlan"


    // $ANTLR start "entryRuleResumePlan"
    // InternalQADocker.g:3596:1: entryRuleResumePlan returns [EObject current=null] : iv_ruleResumePlan= ruleResumePlan EOF ;
    public final EObject entryRuleResumePlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResumePlan = null;


        try {
            // InternalQADocker.g:3596:51: (iv_ruleResumePlan= ruleResumePlan EOF )
            // InternalQADocker.g:3597:2: iv_ruleResumePlan= ruleResumePlan EOF
            {
             newCompositeNode(grammarAccess.getResumePlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResumePlan=ruleResumePlan();

            state._fsp--;

             current =iv_ruleResumePlan; 
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
    // $ANTLR end "entryRuleResumePlan"


    // $ANTLR start "ruleResumePlan"
    // InternalQADocker.g:3603:1: ruleResumePlan returns [EObject current=null] : ( () otherlv_1= 'resumeLastPlan' ) ;
    public final EObject ruleResumePlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQADocker.g:3609:2: ( ( () otherlv_1= 'resumeLastPlan' ) )
            // InternalQADocker.g:3610:2: ( () otherlv_1= 'resumeLastPlan' )
            {
            // InternalQADocker.g:3610:2: ( () otherlv_1= 'resumeLastPlan' )
            // InternalQADocker.g:3611:3: () otherlv_1= 'resumeLastPlan'
            {
            // InternalQADocker.g:3611:3: ()
            // InternalQADocker.g:3612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResumePlanAccess().getResumePlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getResumePlanAccess().getResumeLastPlanKeyword_1());
            		

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
    // $ANTLR end "ruleResumePlan"


    // $ANTLR start "entryRuleSuspendPlan"
    // InternalQADocker.g:3626:1: entryRuleSuspendPlan returns [EObject current=null] : iv_ruleSuspendPlan= ruleSuspendPlan EOF ;
    public final EObject entryRuleSuspendPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendPlan = null;


        try {
            // InternalQADocker.g:3626:52: (iv_ruleSuspendPlan= ruleSuspendPlan EOF )
            // InternalQADocker.g:3627:2: iv_ruleSuspendPlan= ruleSuspendPlan EOF
            {
             newCompositeNode(grammarAccess.getSuspendPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuspendPlan=ruleSuspendPlan();

            state._fsp--;

             current =iv_ruleSuspendPlan; 
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
    // $ANTLR end "entryRuleSuspendPlan"


    // $ANTLR start "ruleSuspendPlan"
    // InternalQADocker.g:3633:1: ruleSuspendPlan returns [EObject current=null] : ( () otherlv_1= 'suspendLastPlan' ) ;
    public final EObject ruleSuspendPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQADocker.g:3639:2: ( ( () otherlv_1= 'suspendLastPlan' ) )
            // InternalQADocker.g:3640:2: ( () otherlv_1= 'suspendLastPlan' )
            {
            // InternalQADocker.g:3640:2: ( () otherlv_1= 'suspendLastPlan' )
            // InternalQADocker.g:3641:3: () otherlv_1= 'suspendLastPlan'
            {
            // InternalQADocker.g:3641:3: ()
            // InternalQADocker.g:3642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSuspendPlanAccess().getSuspendPlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSuspendPlanAccess().getSuspendLastPlanKeyword_1());
            		

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
    // $ANTLR end "ruleSuspendPlan"


    // $ANTLR start "entryRuleRepeatPlan"
    // InternalQADocker.g:3656:1: entryRuleRepeatPlan returns [EObject current=null] : iv_ruleRepeatPlan= ruleRepeatPlan EOF ;
    public final EObject entryRuleRepeatPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatPlan = null;


        try {
            // InternalQADocker.g:3656:51: (iv_ruleRepeatPlan= ruleRepeatPlan EOF )
            // InternalQADocker.g:3657:2: iv_ruleRepeatPlan= ruleRepeatPlan EOF
            {
             newCompositeNode(grammarAccess.getRepeatPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatPlan=ruleRepeatPlan();

            state._fsp--;

             current =iv_ruleRepeatPlan; 
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
    // $ANTLR end "entryRuleRepeatPlan"


    // $ANTLR start "ruleRepeatPlan"
    // InternalQADocker.g:3663:1: ruleRepeatPlan returns [EObject current=null] : ( () otherlv_1= 'repeatPlan' ( (lv_niter_2_0= ruleVarOrInt ) )? ) ;
    public final EObject ruleRepeatPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_niter_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3669:2: ( ( () otherlv_1= 'repeatPlan' ( (lv_niter_2_0= ruleVarOrInt ) )? ) )
            // InternalQADocker.g:3670:2: ( () otherlv_1= 'repeatPlan' ( (lv_niter_2_0= ruleVarOrInt ) )? )
            {
            // InternalQADocker.g:3670:2: ( () otherlv_1= 'repeatPlan' ( (lv_niter_2_0= ruleVarOrInt ) )? )
            // InternalQADocker.g:3671:3: () otherlv_1= 'repeatPlan' ( (lv_niter_2_0= ruleVarOrInt ) )?
            {
            // InternalQADocker.g:3671:3: ()
            // InternalQADocker.g:3672:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepeatPlanAccess().getRepeatPlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatPlanAccess().getRepeatPlanKeyword_1());
            		
            // InternalQADocker.g:3682:3: ( (lv_niter_2_0= ruleVarOrInt ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_INT && LA52_0<=RULE_VARID)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQADocker.g:3683:4: (lv_niter_2_0= ruleVarOrInt )
                    {
                    // InternalQADocker.g:3683:4: (lv_niter_2_0= ruleVarOrInt )
                    // InternalQADocker.g:3684:5: lv_niter_2_0= ruleVarOrInt
                    {

                    					newCompositeNode(grammarAccess.getRepeatPlanAccess().getNiterVarOrIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_niter_2_0=ruleVarOrInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepeatPlanRule());
                    					}
                    					set(
                    						current,
                    						"niter",
                    						lv_niter_2_0,
                    						"xtext.qactor.QADocker.VarOrInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleRepeatPlan"


    // $ANTLR start "entryRuleSwitchPlan"
    // InternalQADocker.g:3705:1: entryRuleSwitchPlan returns [EObject current=null] : iv_ruleSwitchPlan= ruleSwitchPlan EOF ;
    public final EObject entryRuleSwitchPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchPlan = null;


        try {
            // InternalQADocker.g:3705:51: (iv_ruleSwitchPlan= ruleSwitchPlan EOF )
            // InternalQADocker.g:3706:2: iv_ruleSwitchPlan= ruleSwitchPlan EOF
            {
             newCompositeNode(grammarAccess.getSwitchPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitchPlan=ruleSwitchPlan();

            state._fsp--;

             current =iv_ruleSwitchPlan; 
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
    // $ANTLR end "entryRuleSwitchPlan"


    // $ANTLR start "ruleSwitchPlan"
    // InternalQADocker.g:3712:1: ruleSwitchPlan returns [EObject current=null] : ( () otherlv_1= 'switchToPlan' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleSwitchPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQADocker.g:3718:2: ( ( () otherlv_1= 'switchToPlan' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalQADocker.g:3719:2: ( () otherlv_1= 'switchToPlan' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalQADocker.g:3719:2: ( () otherlv_1= 'switchToPlan' ( (otherlv_2= RULE_ID ) ) )
            // InternalQADocker.g:3720:3: () otherlv_1= 'switchToPlan' ( (otherlv_2= RULE_ID ) )
            {
            // InternalQADocker.g:3720:3: ()
            // InternalQADocker.g:3721:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSwitchPlanAccess().getSwitchPlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSwitchPlanAccess().getSwitchToPlanKeyword_1());
            		
            // InternalQADocker.g:3731:3: ( (otherlv_2= RULE_ID ) )
            // InternalQADocker.g:3732:4: (otherlv_2= RULE_ID )
            {
            // InternalQADocker.g:3732:4: (otherlv_2= RULE_ID )
            // InternalQADocker.g:3733:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSwitchPlanRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getSwitchPlanAccess().getPlanPlanCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleSwitchPlan"


    // $ANTLR start "entryRuleEndPlan"
    // InternalQADocker.g:3748:1: entryRuleEndPlan returns [EObject current=null] : iv_ruleEndPlan= ruleEndPlan EOF ;
    public final EObject entryRuleEndPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndPlan = null;


        try {
            // InternalQADocker.g:3748:48: (iv_ruleEndPlan= ruleEndPlan EOF )
            // InternalQADocker.g:3749:2: iv_ruleEndPlan= ruleEndPlan EOF
            {
             newCompositeNode(grammarAccess.getEndPlanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndPlan=ruleEndPlan();

            state._fsp--;

             current =iv_ruleEndPlan; 
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
    // $ANTLR end "entryRuleEndPlan"


    // $ANTLR start "ruleEndPlan"
    // InternalQADocker.g:3755:1: ruleEndPlan returns [EObject current=null] : ( () otherlv_1= 'endPlan' ( (lv_msg_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEndPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_msg_2_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:3761:2: ( ( () otherlv_1= 'endPlan' ( (lv_msg_2_0= RULE_STRING ) ) ) )
            // InternalQADocker.g:3762:2: ( () otherlv_1= 'endPlan' ( (lv_msg_2_0= RULE_STRING ) ) )
            {
            // InternalQADocker.g:3762:2: ( () otherlv_1= 'endPlan' ( (lv_msg_2_0= RULE_STRING ) ) )
            // InternalQADocker.g:3763:3: () otherlv_1= 'endPlan' ( (lv_msg_2_0= RULE_STRING ) )
            {
            // InternalQADocker.g:3763:3: ()
            // InternalQADocker.g:3764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndPlanAccess().getEndPlanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getEndPlanAccess().getEndPlanKeyword_1());
            		
            // InternalQADocker.g:3774:3: ( (lv_msg_2_0= RULE_STRING ) )
            // InternalQADocker.g:3775:4: (lv_msg_2_0= RULE_STRING )
            {
            // InternalQADocker.g:3775:4: (lv_msg_2_0= RULE_STRING )
            // InternalQADocker.g:3776:5: lv_msg_2_0= RULE_STRING
            {
            lv_msg_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_msg_2_0, grammarAccess.getEndPlanAccess().getMsgSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndPlanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"msg",
            						lv_msg_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleEndPlan"


    // $ANTLR start "entryRuleEndActor"
    // InternalQADocker.g:3796:1: entryRuleEndActor returns [EObject current=null] : iv_ruleEndActor= ruleEndActor EOF ;
    public final EObject entryRuleEndActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndActor = null;


        try {
            // InternalQADocker.g:3796:49: (iv_ruleEndActor= ruleEndActor EOF )
            // InternalQADocker.g:3797:2: iv_ruleEndActor= ruleEndActor EOF
            {
             newCompositeNode(grammarAccess.getEndActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndActor=ruleEndActor();

            state._fsp--;

             current =iv_ruleEndActor; 
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
    // $ANTLR end "entryRuleEndActor"


    // $ANTLR start "ruleEndActor"
    // InternalQADocker.g:3803:1: ruleEndActor returns [EObject current=null] : ( () otherlv_1= 'endQActor' ( (lv_msg_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEndActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_msg_2_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:3809:2: ( ( () otherlv_1= 'endQActor' ( (lv_msg_2_0= RULE_STRING ) ) ) )
            // InternalQADocker.g:3810:2: ( () otherlv_1= 'endQActor' ( (lv_msg_2_0= RULE_STRING ) ) )
            {
            // InternalQADocker.g:3810:2: ( () otherlv_1= 'endQActor' ( (lv_msg_2_0= RULE_STRING ) ) )
            // InternalQADocker.g:3811:3: () otherlv_1= 'endQActor' ( (lv_msg_2_0= RULE_STRING ) )
            {
            // InternalQADocker.g:3811:3: ()
            // InternalQADocker.g:3812:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndActorAccess().getEndActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getEndActorAccess().getEndQActorKeyword_1());
            		
            // InternalQADocker.g:3822:3: ( (lv_msg_2_0= RULE_STRING ) )
            // InternalQADocker.g:3823:4: (lv_msg_2_0= RULE_STRING )
            {
            // InternalQADocker.g:3823:4: (lv_msg_2_0= RULE_STRING )
            // InternalQADocker.g:3824:5: lv_msg_2_0= RULE_STRING
            {
            lv_msg_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_msg_2_0, grammarAccess.getEndActorAccess().getMsgSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"msg",
            						lv_msg_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleEndActor"


    // $ANTLR start "entryRuleGuardMove"
    // InternalQADocker.g:3844:1: entryRuleGuardMove returns [EObject current=null] : iv_ruleGuardMove= ruleGuardMove EOF ;
    public final EObject entryRuleGuardMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardMove = null;


        try {
            // InternalQADocker.g:3844:50: (iv_ruleGuardMove= ruleGuardMove EOF )
            // InternalQADocker.g:3845:2: iv_ruleGuardMove= ruleGuardMove EOF
            {
             newCompositeNode(grammarAccess.getGuardMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuardMove=ruleGuardMove();

            state._fsp--;

             current =iv_ruleGuardMove; 
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
    // $ANTLR end "entryRuleGuardMove"


    // $ANTLR start "ruleGuardMove"
    // InternalQADocker.g:3851:1: ruleGuardMove returns [EObject current=null] : (this_AddRule_0= ruleAddRule | this_RemoveRule_1= ruleRemoveRule ) ;
    public final EObject ruleGuardMove() throws RecognitionException {
        EObject current = null;

        EObject this_AddRule_0 = null;

        EObject this_RemoveRule_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3857:2: ( (this_AddRule_0= ruleAddRule | this_RemoveRule_1= ruleRemoveRule ) )
            // InternalQADocker.g:3858:2: (this_AddRule_0= ruleAddRule | this_RemoveRule_1= ruleRemoveRule )
            {
            // InternalQADocker.g:3858:2: (this_AddRule_0= ruleAddRule | this_RemoveRule_1= ruleRemoveRule )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==83) ) {
                alt53=1;
            }
            else if ( (LA53_0==84) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalQADocker.g:3859:3: this_AddRule_0= ruleAddRule
                    {

                    			newCompositeNode(grammarAccess.getGuardMoveAccess().getAddRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRule_0=ruleAddRule();

                    state._fsp--;


                    			current = this_AddRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:3868:3: this_RemoveRule_1= ruleRemoveRule
                    {

                    			newCompositeNode(grammarAccess.getGuardMoveAccess().getRemoveRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveRule_1=ruleRemoveRule();

                    state._fsp--;


                    			current = this_RemoveRule_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleGuardMove"


    // $ANTLR start "entryRuleAddRule"
    // InternalQADocker.g:3880:1: entryRuleAddRule returns [EObject current=null] : iv_ruleAddRule= ruleAddRule EOF ;
    public final EObject entryRuleAddRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRule = null;


        try {
            // InternalQADocker.g:3880:48: (iv_ruleAddRule= ruleAddRule EOF )
            // InternalQADocker.g:3881:2: iv_ruleAddRule= ruleAddRule EOF
            {
             newCompositeNode(grammarAccess.getAddRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddRule=ruleAddRule();

            state._fsp--;

             current =iv_ruleAddRule; 
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
    // $ANTLR end "entryRuleAddRule"


    // $ANTLR start "ruleAddRule"
    // InternalQADocker.g:3887:1: ruleAddRule returns [EObject current=null] : ( () otherlv_1= 'addRule' ( (lv_rule_2_0= rulePHead ) ) ) ;
    public final EObject ruleAddRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3893:2: ( ( () otherlv_1= 'addRule' ( (lv_rule_2_0= rulePHead ) ) ) )
            // InternalQADocker.g:3894:2: ( () otherlv_1= 'addRule' ( (lv_rule_2_0= rulePHead ) ) )
            {
            // InternalQADocker.g:3894:2: ( () otherlv_1= 'addRule' ( (lv_rule_2_0= rulePHead ) ) )
            // InternalQADocker.g:3895:3: () otherlv_1= 'addRule' ( (lv_rule_2_0= rulePHead ) )
            {
            // InternalQADocker.g:3895:3: ()
            // InternalQADocker.g:3896:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddRuleAccess().getAddRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAddRuleAccess().getAddRuleKeyword_1());
            		
            // InternalQADocker.g:3906:3: ( (lv_rule_2_0= rulePHead ) )
            // InternalQADocker.g:3907:4: (lv_rule_2_0= rulePHead )
            {
            // InternalQADocker.g:3907:4: (lv_rule_2_0= rulePHead )
            // InternalQADocker.g:3908:5: lv_rule_2_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getAddRuleAccess().getRulePHeadParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_2_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRuleRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleAddRule"


    // $ANTLR start "entryRuleRemoveRule"
    // InternalQADocker.g:3929:1: entryRuleRemoveRule returns [EObject current=null] : iv_ruleRemoveRule= ruleRemoveRule EOF ;
    public final EObject entryRuleRemoveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveRule = null;


        try {
            // InternalQADocker.g:3929:51: (iv_ruleRemoveRule= ruleRemoveRule EOF )
            // InternalQADocker.g:3930:2: iv_ruleRemoveRule= ruleRemoveRule EOF
            {
             newCompositeNode(grammarAccess.getRemoveRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveRule=ruleRemoveRule();

            state._fsp--;

             current =iv_ruleRemoveRule; 
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
    // $ANTLR end "entryRuleRemoveRule"


    // $ANTLR start "ruleRemoveRule"
    // InternalQADocker.g:3936:1: ruleRemoveRule returns [EObject current=null] : ( () otherlv_1= 'removeRule' ( (lv_rule_2_0= rulePHead ) ) ) ;
    public final EObject ruleRemoveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3942:2: ( ( () otherlv_1= 'removeRule' ( (lv_rule_2_0= rulePHead ) ) ) )
            // InternalQADocker.g:3943:2: ( () otherlv_1= 'removeRule' ( (lv_rule_2_0= rulePHead ) ) )
            {
            // InternalQADocker.g:3943:2: ( () otherlv_1= 'removeRule' ( (lv_rule_2_0= rulePHead ) ) )
            // InternalQADocker.g:3944:3: () otherlv_1= 'removeRule' ( (lv_rule_2_0= rulePHead ) )
            {
            // InternalQADocker.g:3944:3: ()
            // InternalQADocker.g:3945:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRemoveRuleAccess().getRemoveRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveRuleAccess().getRemoveRuleKeyword_1());
            		
            // InternalQADocker.g:3955:3: ( (lv_rule_2_0= rulePHead ) )
            // InternalQADocker.g:3956:4: (lv_rule_2_0= rulePHead )
            {
            // InternalQADocker.g:3956:4: (lv_rule_2_0= rulePHead )
            // InternalQADocker.g:3957:5: lv_rule_2_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getRemoveRuleAccess().getRulePHeadParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_2_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveRuleRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleRemoveRule"


    // $ANTLR start "entryRuleMessageMove"
    // InternalQADocker.g:3978:1: entryRuleMessageMove returns [EObject current=null] : iv_ruleMessageMove= ruleMessageMove EOF ;
    public final EObject entryRuleMessageMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageMove = null;


        try {
            // InternalQADocker.g:3978:52: (iv_ruleMessageMove= ruleMessageMove EOF )
            // InternalQADocker.g:3979:2: iv_ruleMessageMove= ruleMessageMove EOF
            {
             newCompositeNode(grammarAccess.getMessageMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageMove=ruleMessageMove();

            state._fsp--;

             current =iv_ruleMessageMove; 
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
    // $ANTLR end "entryRuleMessageMove"


    // $ANTLR start "ruleMessageMove"
    // InternalQADocker.g:3985:1: ruleMessageMove returns [EObject current=null] : (this_SendDispatch_0= ruleSendDispatch | this_SendRequest_1= ruleSendRequest | this_ReplyToCaller_2= ruleReplyToCaller | this_ReceiveMsg_3= ruleReceiveMsg | this_OnReceiveMsg_4= ruleOnReceiveMsg | this_MsgSelect_5= ruleMsgSelect | this_RaiseEvent_6= ruleRaiseEvent | this_SenseEvent_7= ruleSenseEvent | this_MsgSwitch_8= ruleMsgSwitch | this_EventSwitch_9= ruleEventSwitch ) ;
    public final EObject ruleMessageMove() throws RecognitionException {
        EObject current = null;

        EObject this_SendDispatch_0 = null;

        EObject this_SendRequest_1 = null;

        EObject this_ReplyToCaller_2 = null;

        EObject this_ReceiveMsg_3 = null;

        EObject this_OnReceiveMsg_4 = null;

        EObject this_MsgSelect_5 = null;

        EObject this_RaiseEvent_6 = null;

        EObject this_SenseEvent_7 = null;

        EObject this_MsgSwitch_8 = null;

        EObject this_EventSwitch_9 = null;



        	enterRule();

        try {
            // InternalQADocker.g:3991:2: ( (this_SendDispatch_0= ruleSendDispatch | this_SendRequest_1= ruleSendRequest | this_ReplyToCaller_2= ruleReplyToCaller | this_ReceiveMsg_3= ruleReceiveMsg | this_OnReceiveMsg_4= ruleOnReceiveMsg | this_MsgSelect_5= ruleMsgSelect | this_RaiseEvent_6= ruleRaiseEvent | this_SenseEvent_7= ruleSenseEvent | this_MsgSwitch_8= ruleMsgSwitch | this_EventSwitch_9= ruleEventSwitch ) )
            // InternalQADocker.g:3992:2: (this_SendDispatch_0= ruleSendDispatch | this_SendRequest_1= ruleSendRequest | this_ReplyToCaller_2= ruleReplyToCaller | this_ReceiveMsg_3= ruleReceiveMsg | this_OnReceiveMsg_4= ruleOnReceiveMsg | this_MsgSelect_5= ruleMsgSelect | this_RaiseEvent_6= ruleRaiseEvent | this_SenseEvent_7= ruleSenseEvent | this_MsgSwitch_8= ruleMsgSwitch | this_EventSwitch_9= ruleEventSwitch )
            {
            // InternalQADocker.g:3992:2: (this_SendDispatch_0= ruleSendDispatch | this_SendRequest_1= ruleSendRequest | this_ReplyToCaller_2= ruleReplyToCaller | this_ReceiveMsg_3= ruleReceiveMsg | this_OnReceiveMsg_4= ruleOnReceiveMsg | this_MsgSelect_5= ruleMsgSelect | this_RaiseEvent_6= ruleRaiseEvent | this_SenseEvent_7= ruleSenseEvent | this_MsgSwitch_8= ruleMsgSwitch | this_EventSwitch_9= ruleEventSwitch )
            int alt54=10;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt54=1;
                }
                break;
            case 87:
                {
                alt54=2;
                }
                break;
            case 89:
                {
                alt54=3;
                }
                break;
            case 90:
                {
                alt54=4;
                }
                break;
            case 93:
                {
                alt54=5;
                }
                break;
            case 95:
                {
                alt54=6;
                }
                break;
            case 97:
                {
                alt54=7;
                }
                break;
            case 98:
                {
                alt54=8;
                }
                break;
            case 99:
                {
                alt54=9;
                }
                break;
            case 100:
                {
                alt54=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalQADocker.g:3993:3: this_SendDispatch_0= ruleSendDispatch
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getSendDispatchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendDispatch_0=ruleSendDispatch();

                    state._fsp--;


                    			current = this_SendDispatch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:4002:3: this_SendRequest_1= ruleSendRequest
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getSendRequestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendRequest_1=ruleSendRequest();

                    state._fsp--;


                    			current = this_SendRequest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:4011:3: this_ReplyToCaller_2= ruleReplyToCaller
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getReplyToCallerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReplyToCaller_2=ruleReplyToCaller();

                    state._fsp--;


                    			current = this_ReplyToCaller_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:4020:3: this_ReceiveMsg_3= ruleReceiveMsg
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getReceiveMsgParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReceiveMsg_3=ruleReceiveMsg();

                    state._fsp--;


                    			current = this_ReceiveMsg_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQADocker.g:4029:3: this_OnReceiveMsg_4= ruleOnReceiveMsg
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getOnReceiveMsgParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnReceiveMsg_4=ruleOnReceiveMsg();

                    state._fsp--;


                    			current = this_OnReceiveMsg_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalQADocker.g:4038:3: this_MsgSelect_5= ruleMsgSelect
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getMsgSelectParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MsgSelect_5=ruleMsgSelect();

                    state._fsp--;


                    			current = this_MsgSelect_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalQADocker.g:4047:3: this_RaiseEvent_6= ruleRaiseEvent
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getRaiseEventParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RaiseEvent_6=ruleRaiseEvent();

                    state._fsp--;


                    			current = this_RaiseEvent_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalQADocker.g:4056:3: this_SenseEvent_7= ruleSenseEvent
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getSenseEventParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SenseEvent_7=ruleSenseEvent();

                    state._fsp--;


                    			current = this_SenseEvent_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalQADocker.g:4065:3: this_MsgSwitch_8= ruleMsgSwitch
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getMsgSwitchParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MsgSwitch_8=ruleMsgSwitch();

                    state._fsp--;


                    			current = this_MsgSwitch_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalQADocker.g:4074:3: this_EventSwitch_9= ruleEventSwitch
                    {

                    			newCompositeNode(grammarAccess.getMessageMoveAccess().getEventSwitchParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventSwitch_9=ruleEventSwitch();

                    state._fsp--;


                    			current = this_EventSwitch_9;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleMessageMove"


    // $ANTLR start "entryRuleSendDispatch"
    // InternalQADocker.g:4086:1: entryRuleSendDispatch returns [EObject current=null] : iv_ruleSendDispatch= ruleSendDispatch EOF ;
    public final EObject entryRuleSendDispatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendDispatch = null;


        try {
            // InternalQADocker.g:4086:53: (iv_ruleSendDispatch= ruleSendDispatch EOF )
            // InternalQADocker.g:4087:2: iv_ruleSendDispatch= ruleSendDispatch EOF
            {
             newCompositeNode(grammarAccess.getSendDispatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendDispatch=ruleSendDispatch();

            state._fsp--;

             current =iv_ruleSendDispatch; 
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
    // $ANTLR end "entryRuleSendDispatch"


    // $ANTLR start "ruleSendDispatch"
    // InternalQADocker.g:4093:1: ruleSendDispatch returns [EObject current=null] : ( () otherlv_1= 'forward' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) ) ;
    public final EObject ruleSendDispatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_val_6_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4099:2: ( ( () otherlv_1= 'forward' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) ) )
            // InternalQADocker.g:4100:2: ( () otherlv_1= 'forward' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) )
            {
            // InternalQADocker.g:4100:2: ( () otherlv_1= 'forward' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) )
            // InternalQADocker.g:4101:3: () otherlv_1= 'forward' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) )
            {
            // InternalQADocker.g:4101:3: ()
            // InternalQADocker.g:4102:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendDispatchAccess().getSendDispatchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getSendDispatchAccess().getForwardKeyword_1());
            		
            // InternalQADocker.g:4112:3: ( (lv_dest_2_0= ruleVarOrQactor ) )
            // InternalQADocker.g:4113:4: (lv_dest_2_0= ruleVarOrQactor )
            {
            // InternalQADocker.g:4113:4: (lv_dest_2_0= ruleVarOrQactor )
            // InternalQADocker.g:4114:5: lv_dest_2_0= ruleVarOrQactor
            {

            					newCompositeNode(grammarAccess.getSendDispatchAccess().getDestVarOrQactorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_60);
            lv_dest_2_0=ruleVarOrQactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendDispatchRule());
            					}
            					set(
            						current,
            						"dest",
            						lv_dest_2_0,
            						"xtext.qactor.QADocker.VarOrQactor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSendDispatchAccess().getMKeyword_3());
            		
            // InternalQADocker.g:4135:3: ( (otherlv_4= RULE_ID ) )
            // InternalQADocker.g:4136:4: (otherlv_4= RULE_ID )
            {
            // InternalQADocker.g:4136:4: (otherlv_4= RULE_ID )
            // InternalQADocker.g:4137:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendDispatchRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getSendDispatchAccess().getMsgrefMessageCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSendDispatchAccess().getColonKeyword_5());
            		
            // InternalQADocker.g:4152:3: ( (lv_val_6_0= rulePHead ) )
            // InternalQADocker.g:4153:4: (lv_val_6_0= rulePHead )
            {
            // InternalQADocker.g:4153:4: (lv_val_6_0= rulePHead )
            // InternalQADocker.g:4154:5: lv_val_6_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getSendDispatchAccess().getValPHeadParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_6_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendDispatchRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_6_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleSendDispatch"


    // $ANTLR start "entryRuleSendRequest"
    // InternalQADocker.g:4175:1: entryRuleSendRequest returns [EObject current=null] : iv_ruleSendRequest= ruleSendRequest EOF ;
    public final EObject entryRuleSendRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendRequest = null;


        try {
            // InternalQADocker.g:4175:52: (iv_ruleSendRequest= ruleSendRequest EOF )
            // InternalQADocker.g:4176:2: iv_ruleSendRequest= ruleSendRequest EOF
            {
             newCompositeNode(grammarAccess.getSendRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendRequest=ruleSendRequest();

            state._fsp--;

             current =iv_ruleSendRequest; 
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
    // $ANTLR end "entryRuleSendRequest"


    // $ANTLR start "ruleSendRequest"
    // InternalQADocker.g:4182:1: ruleSendRequest returns [EObject current=null] : ( () otherlv_1= 'demand' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) (otherlv_7= 'answHandle' )? ) ;
    public final EObject ruleSendRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_dest_2_0 = null;

        EObject lv_val_6_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4188:2: ( ( () otherlv_1= 'demand' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) (otherlv_7= 'answHandle' )? ) )
            // InternalQADocker.g:4189:2: ( () otherlv_1= 'demand' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) (otherlv_7= 'answHandle' )? )
            {
            // InternalQADocker.g:4189:2: ( () otherlv_1= 'demand' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) (otherlv_7= 'answHandle' )? )
            // InternalQADocker.g:4190:3: () otherlv_1= 'demand' ( (lv_dest_2_0= ruleVarOrQactor ) ) otherlv_3= '-m' ( (otherlv_4= RULE_ID ) ) otherlv_5= ':' ( (lv_val_6_0= rulePHead ) ) (otherlv_7= 'answHandle' )?
            {
            // InternalQADocker.g:4190:3: ()
            // InternalQADocker.g:4191:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSendRequestAccess().getSendRequestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getSendRequestAccess().getDemandKeyword_1());
            		
            // InternalQADocker.g:4201:3: ( (lv_dest_2_0= ruleVarOrQactor ) )
            // InternalQADocker.g:4202:4: (lv_dest_2_0= ruleVarOrQactor )
            {
            // InternalQADocker.g:4202:4: (lv_dest_2_0= ruleVarOrQactor )
            // InternalQADocker.g:4203:5: lv_dest_2_0= ruleVarOrQactor
            {

            					newCompositeNode(grammarAccess.getSendRequestAccess().getDestVarOrQactorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_60);
            lv_dest_2_0=ruleVarOrQactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendRequestRule());
            					}
            					set(
            						current,
            						"dest",
            						lv_dest_2_0,
            						"xtext.qactor.QADocker.VarOrQactor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSendRequestAccess().getMKeyword_3());
            		
            // InternalQADocker.g:4224:3: ( (otherlv_4= RULE_ID ) )
            // InternalQADocker.g:4225:4: (otherlv_4= RULE_ID )
            {
            // InternalQADocker.g:4225:4: (otherlv_4= RULE_ID )
            // InternalQADocker.g:4226:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendRequestRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getSendRequestAccess().getMsgrefMessageCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getSendRequestAccess().getColonKeyword_5());
            		
            // InternalQADocker.g:4241:3: ( (lv_val_6_0= rulePHead ) )
            // InternalQADocker.g:4242:4: (lv_val_6_0= rulePHead )
            {
            // InternalQADocker.g:4242:4: (lv_val_6_0= rulePHead )
            // InternalQADocker.g:4243:5: lv_val_6_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getSendRequestAccess().getValPHeadParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_61);
            lv_val_6_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendRequestRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_6_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:4260:3: (otherlv_7= 'answHandle' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==88) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQADocker.g:4261:4: otherlv_7= 'answHandle'
                    {
                    otherlv_7=(Token)match(input,88,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSendRequestAccess().getAnswHandleKeyword_7());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleSendRequest"


    // $ANTLR start "entryRuleReplyToCaller"
    // InternalQADocker.g:4270:1: entryRuleReplyToCaller returns [EObject current=null] : iv_ruleReplyToCaller= ruleReplyToCaller EOF ;
    public final EObject entryRuleReplyToCaller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplyToCaller = null;


        try {
            // InternalQADocker.g:4270:54: (iv_ruleReplyToCaller= ruleReplyToCaller EOF )
            // InternalQADocker.g:4271:2: iv_ruleReplyToCaller= ruleReplyToCaller EOF
            {
             newCompositeNode(grammarAccess.getReplyToCallerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReplyToCaller=ruleReplyToCaller();

            state._fsp--;

             current =iv_ruleReplyToCaller; 
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
    // $ANTLR end "entryRuleReplyToCaller"


    // $ANTLR start "ruleReplyToCaller"
    // InternalQADocker.g:4277:1: ruleReplyToCaller returns [EObject current=null] : ( () otherlv_1= 'replyToCaller' otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) ) ;
    public final EObject ruleReplyToCaller() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_val_5_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4283:2: ( ( () otherlv_1= 'replyToCaller' otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) ) )
            // InternalQADocker.g:4284:2: ( () otherlv_1= 'replyToCaller' otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) )
            {
            // InternalQADocker.g:4284:2: ( () otherlv_1= 'replyToCaller' otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) ) )
            // InternalQADocker.g:4285:3: () otherlv_1= 'replyToCaller' otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_val_5_0= rulePHead ) )
            {
            // InternalQADocker.g:4285:3: ()
            // InternalQADocker.g:4286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReplyToCallerAccess().getReplyToCallerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getReplyToCallerAccess().getReplyToCallerKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getReplyToCallerAccess().getMKeyword_2());
            		
            // InternalQADocker.g:4300:3: ( (otherlv_3= RULE_ID ) )
            // InternalQADocker.g:4301:4: (otherlv_3= RULE_ID )
            {
            // InternalQADocker.g:4301:4: (otherlv_3= RULE_ID )
            // InternalQADocker.g:4302:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReplyToCallerRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getReplyToCallerAccess().getMsgrefMessageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getReplyToCallerAccess().getColonKeyword_4());
            		
            // InternalQADocker.g:4317:3: ( (lv_val_5_0= rulePHead ) )
            // InternalQADocker.g:4318:4: (lv_val_5_0= rulePHead )
            {
            // InternalQADocker.g:4318:4: (lv_val_5_0= rulePHead )
            // InternalQADocker.g:4319:5: lv_val_5_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getReplyToCallerAccess().getValPHeadParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_5_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReplyToCallerRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_5_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleReplyToCaller"


    // $ANTLR start "entryRuleReceiveMsg"
    // InternalQADocker.g:4340:1: entryRuleReceiveMsg returns [EObject current=null] : iv_ruleReceiveMsg= ruleReceiveMsg EOF ;
    public final EObject entryRuleReceiveMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiveMsg = null;


        try {
            // InternalQADocker.g:4340:51: (iv_ruleReceiveMsg= ruleReceiveMsg EOF )
            // InternalQADocker.g:4341:2: iv_ruleReceiveMsg= ruleReceiveMsg EOF
            {
             newCompositeNode(grammarAccess.getReceiveMsgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceiveMsg=ruleReceiveMsg();

            state._fsp--;

             current =iv_ruleReceiveMsg; 
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
    // $ANTLR end "entryRuleReceiveMsg"


    // $ANTLR start "ruleReceiveMsg"
    // InternalQADocker.g:4347:1: ruleReceiveMsg returns [EObject current=null] : ( () otherlv_1= 'receiveMsg' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_spec_3_0= ruleMsgSpec ) )? ) ;
    public final EObject ruleReceiveMsg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_duration_2_0 = null;

        EObject lv_spec_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4353:2: ( ( () otherlv_1= 'receiveMsg' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_spec_3_0= ruleMsgSpec ) )? ) )
            // InternalQADocker.g:4354:2: ( () otherlv_1= 'receiveMsg' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_spec_3_0= ruleMsgSpec ) )? )
            {
            // InternalQADocker.g:4354:2: ( () otherlv_1= 'receiveMsg' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_spec_3_0= ruleMsgSpec ) )? )
            // InternalQADocker.g:4355:3: () otherlv_1= 'receiveMsg' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_spec_3_0= ruleMsgSpec ) )?
            {
            // InternalQADocker.g:4355:3: ()
            // InternalQADocker.g:4356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReceiveMsgAccess().getReceiveMsgAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getReceiveMsgAccess().getReceiveMsgKeyword_1());
            		
            // InternalQADocker.g:4366:3: ( (lv_duration_2_0= ruleTimeLimit ) )
            // InternalQADocker.g:4367:4: (lv_duration_2_0= ruleTimeLimit )
            {
            // InternalQADocker.g:4367:4: (lv_duration_2_0= ruleTimeLimit )
            // InternalQADocker.g:4368:5: lv_duration_2_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getReceiveMsgAccess().getDurationTimeLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_62);
            lv_duration_2_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReceiveMsgRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:4385:3: ( (lv_spec_3_0= ruleMsgSpec ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==86) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQADocker.g:4386:4: (lv_spec_3_0= ruleMsgSpec )
                    {
                    // InternalQADocker.g:4386:4: (lv_spec_3_0= ruleMsgSpec )
                    // InternalQADocker.g:4387:5: lv_spec_3_0= ruleMsgSpec
                    {

                    					newCompositeNode(grammarAccess.getReceiveMsgAccess().getSpecMsgSpecParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_spec_3_0=ruleMsgSpec();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReceiveMsgRule());
                    					}
                    					set(
                    						current,
                    						"spec",
                    						lv_spec_3_0,
                    						"xtext.qactor.QADocker.MsgSpec");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleReceiveMsg"


    // $ANTLR start "entryRuleMsgSpec"
    // InternalQADocker.g:4408:1: entryRuleMsgSpec returns [EObject current=null] : iv_ruleMsgSpec= ruleMsgSpec EOF ;
    public final EObject entryRuleMsgSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsgSpec = null;


        try {
            // InternalQADocker.g:4408:48: (iv_ruleMsgSpec= ruleMsgSpec EOF )
            // InternalQADocker.g:4409:2: iv_ruleMsgSpec= ruleMsgSpec EOF
            {
             newCompositeNode(grammarAccess.getMsgSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMsgSpec=ruleMsgSpec();

            state._fsp--;

             current =iv_ruleMsgSpec; 
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
    // $ANTLR end "entryRuleMsgSpec"


    // $ANTLR start "ruleMsgSpec"
    // InternalQADocker.g:4415:1: ruleMsgSpec returns [EObject current=null] : (otherlv_0= '-m' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'sender' ( (lv_sender_3_0= ruleVarOrAtomic ) ) otherlv_4= 'content' ( (lv_content_5_0= rulePHead ) ) ) ;
    public final EObject ruleMsgSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sender_3_0 = null;

        EObject lv_content_5_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4421:2: ( (otherlv_0= '-m' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'sender' ( (lv_sender_3_0= ruleVarOrAtomic ) ) otherlv_4= 'content' ( (lv_content_5_0= rulePHead ) ) ) )
            // InternalQADocker.g:4422:2: (otherlv_0= '-m' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'sender' ( (lv_sender_3_0= ruleVarOrAtomic ) ) otherlv_4= 'content' ( (lv_content_5_0= rulePHead ) ) )
            {
            // InternalQADocker.g:4422:2: (otherlv_0= '-m' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'sender' ( (lv_sender_3_0= ruleVarOrAtomic ) ) otherlv_4= 'content' ( (lv_content_5_0= rulePHead ) ) )
            // InternalQADocker.g:4423:3: otherlv_0= '-m' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'sender' ( (lv_sender_3_0= ruleVarOrAtomic ) ) otherlv_4= 'content' ( (lv_content_5_0= rulePHead ) )
            {
            otherlv_0=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMsgSpecAccess().getMKeyword_0());
            		
            // InternalQADocker.g:4427:3: ( (otherlv_1= RULE_ID ) )
            // InternalQADocker.g:4428:4: (otherlv_1= RULE_ID )
            {
            // InternalQADocker.g:4428:4: (otherlv_1= RULE_ID )
            // InternalQADocker.g:4429:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMsgSpecRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(otherlv_1, grammarAccess.getMsgSpecAccess().getMsgMessageCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,91,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMsgSpecAccess().getSenderKeyword_2());
            		
            // InternalQADocker.g:4444:3: ( (lv_sender_3_0= ruleVarOrAtomic ) )
            // InternalQADocker.g:4445:4: (lv_sender_3_0= ruleVarOrAtomic )
            {
            // InternalQADocker.g:4445:4: (lv_sender_3_0= ruleVarOrAtomic )
            // InternalQADocker.g:4446:5: lv_sender_3_0= ruleVarOrAtomic
            {

            					newCompositeNode(grammarAccess.getMsgSpecAccess().getSenderVarOrAtomicParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_64);
            lv_sender_3_0=ruleVarOrAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMsgSpecRule());
            					}
            					set(
            						current,
            						"sender",
            						lv_sender_3_0,
            						"xtext.qactor.QADocker.VarOrAtomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,92,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMsgSpecAccess().getContentKeyword_4());
            		
            // InternalQADocker.g:4467:3: ( (lv_content_5_0= rulePHead ) )
            // InternalQADocker.g:4468:4: (lv_content_5_0= rulePHead )
            {
            // InternalQADocker.g:4468:4: (lv_content_5_0= rulePHead )
            // InternalQADocker.g:4469:5: lv_content_5_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getMsgSpecAccess().getContentPHeadParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_5_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMsgSpecRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_5_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleMsgSpec"


    // $ANTLR start "entryRuleOnReceiveMsg"
    // InternalQADocker.g:4490:1: entryRuleOnReceiveMsg returns [EObject current=null] : iv_ruleOnReceiveMsg= ruleOnReceiveMsg EOF ;
    public final EObject entryRuleOnReceiveMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnReceiveMsg = null;


        try {
            // InternalQADocker.g:4490:53: (iv_ruleOnReceiveMsg= ruleOnReceiveMsg EOF )
            // InternalQADocker.g:4491:2: iv_ruleOnReceiveMsg= ruleOnReceiveMsg EOF
            {
             newCompositeNode(grammarAccess.getOnReceiveMsgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnReceiveMsg=ruleOnReceiveMsg();

            state._fsp--;

             current =iv_ruleOnReceiveMsg; 
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
    // $ANTLR end "entryRuleOnReceiveMsg"


    // $ANTLR start "ruleOnReceiveMsg"
    // InternalQADocker.g:4497:1: ruleOnReceiveMsg returns [EObject current=null] : ( () otherlv_1= 'receiveTheMsg' otherlv_2= 'm' otherlv_3= '(' ( (lv_msgid_4_0= rulePHead ) ) otherlv_5= ',' ( (lv_msgtype_6_0= rulePHead ) ) otherlv_7= ',' ( (lv_msgsender_8_0= rulePHead ) ) otherlv_9= ',' ( (lv_msgreceiver_10_0= rulePHead ) ) otherlv_11= ',' ( (lv_msgcontent_12_0= rulePHead ) ) otherlv_13= ',' ( (lv_msgseqnum_14_0= rulePHead ) ) otherlv_15= ')' ( (lv_duration_16_0= ruleTimeLimit ) ) ) ;
    public final EObject ruleOnReceiveMsg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_msgid_4_0 = null;

        EObject lv_msgtype_6_0 = null;

        EObject lv_msgsender_8_0 = null;

        EObject lv_msgreceiver_10_0 = null;

        EObject lv_msgcontent_12_0 = null;

        EObject lv_msgseqnum_14_0 = null;

        EObject lv_duration_16_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4503:2: ( ( () otherlv_1= 'receiveTheMsg' otherlv_2= 'm' otherlv_3= '(' ( (lv_msgid_4_0= rulePHead ) ) otherlv_5= ',' ( (lv_msgtype_6_0= rulePHead ) ) otherlv_7= ',' ( (lv_msgsender_8_0= rulePHead ) ) otherlv_9= ',' ( (lv_msgreceiver_10_0= rulePHead ) ) otherlv_11= ',' ( (lv_msgcontent_12_0= rulePHead ) ) otherlv_13= ',' ( (lv_msgseqnum_14_0= rulePHead ) ) otherlv_15= ')' ( (lv_duration_16_0= ruleTimeLimit ) ) ) )
            // InternalQADocker.g:4504:2: ( () otherlv_1= 'receiveTheMsg' otherlv_2= 'm' otherlv_3= '(' ( (lv_msgid_4_0= rulePHead ) ) otherlv_5= ',' ( (lv_msgtype_6_0= rulePHead ) ) otherlv_7= ',' ( (lv_msgsender_8_0= rulePHead ) ) otherlv_9= ',' ( (lv_msgreceiver_10_0= rulePHead ) ) otherlv_11= ',' ( (lv_msgcontent_12_0= rulePHead ) ) otherlv_13= ',' ( (lv_msgseqnum_14_0= rulePHead ) ) otherlv_15= ')' ( (lv_duration_16_0= ruleTimeLimit ) ) )
            {
            // InternalQADocker.g:4504:2: ( () otherlv_1= 'receiveTheMsg' otherlv_2= 'm' otherlv_3= '(' ( (lv_msgid_4_0= rulePHead ) ) otherlv_5= ',' ( (lv_msgtype_6_0= rulePHead ) ) otherlv_7= ',' ( (lv_msgsender_8_0= rulePHead ) ) otherlv_9= ',' ( (lv_msgreceiver_10_0= rulePHead ) ) otherlv_11= ',' ( (lv_msgcontent_12_0= rulePHead ) ) otherlv_13= ',' ( (lv_msgseqnum_14_0= rulePHead ) ) otherlv_15= ')' ( (lv_duration_16_0= ruleTimeLimit ) ) )
            // InternalQADocker.g:4505:3: () otherlv_1= 'receiveTheMsg' otherlv_2= 'm' otherlv_3= '(' ( (lv_msgid_4_0= rulePHead ) ) otherlv_5= ',' ( (lv_msgtype_6_0= rulePHead ) ) otherlv_7= ',' ( (lv_msgsender_8_0= rulePHead ) ) otherlv_9= ',' ( (lv_msgreceiver_10_0= rulePHead ) ) otherlv_11= ',' ( (lv_msgcontent_12_0= rulePHead ) ) otherlv_13= ',' ( (lv_msgseqnum_14_0= rulePHead ) ) otherlv_15= ')' ( (lv_duration_16_0= ruleTimeLimit ) )
            {
            // InternalQADocker.g:4505:3: ()
            // InternalQADocker.g:4506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnReceiveMsgAccess().getOnReceiveMsgAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getOnReceiveMsgAccess().getReceiveTheMsgKeyword_1());
            		
            otherlv_2=(Token)match(input,94,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOnReceiveMsgAccess().getMKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getOnReceiveMsgAccess().getLeftParenthesisKeyword_3());
            		
            // InternalQADocker.g:4524:3: ( (lv_msgid_4_0= rulePHead ) )
            // InternalQADocker.g:4525:4: (lv_msgid_4_0= rulePHead )
            {
            // InternalQADocker.g:4525:4: (lv_msgid_4_0= rulePHead )
            // InternalQADocker.g:4526:5: lv_msgid_4_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getOnReceiveMsgAccess().getMsgidPHeadParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_66);
            lv_msgid_4_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnReceiveMsgRule());
            					}
            					set(
            						current,
            						"msgid",
            						lv_msgid_4_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getOnReceiveMsgAccess().getCommaKeyword_5());
            		
            // InternalQADocker.g:4547:3: ( (lv_msgtype_6_0= rulePHead ) )
            // InternalQADocker.g:4548:4: (lv_msgtype_6_0= rulePHead )
            {
            // InternalQADocker.g:4548:4: (lv_msgtype_6_0= rulePHead )
            // InternalQADocker.g:4549:5: lv_msgtype_6_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getOnReceiveMsgAccess().getMsgtypePHeadParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_66);
            lv_msgtype_6_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnReceiveMsgRule());
            					}
            					set(
            						current,
            						"msgtype",
            						lv_msgtype_6_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getOnReceiveMsgAccess().getCommaKeyword_7());
            		
            // InternalQADocker.g:4570:3: ( (lv_msgsender_8_0= rulePHead ) )
            // InternalQADocker.g:4571:4: (lv_msgsender_8_0= rulePHead )
            {
            // InternalQADocker.g:4571:4: (lv_msgsender_8_0= rulePHead )
            // InternalQADocker.g:4572:5: lv_msgsender_8_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getOnReceiveMsgAccess().getMsgsenderPHeadParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_66);
            lv_msgsender_8_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnReceiveMsgRule());
            					}
            					set(
            						current,
            						"msgsender",
            						lv_msgsender_8_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getOnReceiveMsgAccess().getCommaKeyword_9());
            		
            // InternalQADocker.g:4593:3: ( (lv_msgreceiver_10_0= rulePHead ) )
            // InternalQADocker.g:4594:4: (lv_msgreceiver_10_0= rulePHead )
            {
            // InternalQADocker.g:4594:4: (lv_msgreceiver_10_0= rulePHead )
            // InternalQADocker.g:4595:5: lv_msgreceiver_10_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getOnReceiveMsgAccess().getMsgreceiverPHeadParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_66);
            lv_msgreceiver_10_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnReceiveMsgRule());
            					}
            					set(
            						current,
            						"msgreceiver",
            						lv_msgreceiver_10_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getOnReceiveMsgAccess().getCommaKeyword_11());
            		
            // InternalQADocker.g:4616:3: ( (lv_msgcontent_12_0= rulePHead ) )
            // InternalQADocker.g:4617:4: (lv_msgcontent_12_0= rulePHead )
            {
            // InternalQADocker.g:4617:4: (lv_msgcontent_12_0= rulePHead )
            // InternalQADocker.g:4618:5: lv_msgcontent_12_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getOnReceiveMsgAccess().getMsgcontentPHeadParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_66);
            lv_msgcontent_12_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnReceiveMsgRule());
            					}
            					set(
            						current,
            						"msgcontent",
            						lv_msgcontent_12_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getOnReceiveMsgAccess().getCommaKeyword_13());
            		
            // InternalQADocker.g:4639:3: ( (lv_msgseqnum_14_0= rulePHead ) )
            // InternalQADocker.g:4640:4: (lv_msgseqnum_14_0= rulePHead )
            {
            // InternalQADocker.g:4640:4: (lv_msgseqnum_14_0= rulePHead )
            // InternalQADocker.g:4641:5: lv_msgseqnum_14_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getOnReceiveMsgAccess().getMsgseqnumPHeadParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_42);
            lv_msgseqnum_14_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnReceiveMsgRule());
            					}
            					set(
            						current,
            						"msgseqnum",
            						lv_msgseqnum_14_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,36,FOLLOW_53); 

            			newLeafNode(otherlv_15, grammarAccess.getOnReceiveMsgAccess().getRightParenthesisKeyword_15());
            		
            // InternalQADocker.g:4662:3: ( (lv_duration_16_0= ruleTimeLimit ) )
            // InternalQADocker.g:4663:4: (lv_duration_16_0= ruleTimeLimit )
            {
            // InternalQADocker.g:4663:4: (lv_duration_16_0= ruleTimeLimit )
            // InternalQADocker.g:4664:5: lv_duration_16_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getOnReceiveMsgAccess().getDurationTimeLimitParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_2);
            lv_duration_16_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnReceiveMsgRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_16_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleOnReceiveMsg"


    // $ANTLR start "entryRuleMsgSelect"
    // InternalQADocker.g:4685:1: entryRuleMsgSelect returns [EObject current=null] : iv_ruleMsgSelect= ruleMsgSelect EOF ;
    public final EObject entryRuleMsgSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsgSelect = null;


        try {
            // InternalQADocker.g:4685:50: (iv_ruleMsgSelect= ruleMsgSelect EOF )
            // InternalQADocker.g:4686:2: iv_ruleMsgSelect= ruleMsgSelect EOF
            {
             newCompositeNode(grammarAccess.getMsgSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMsgSelect=ruleMsgSelect();

            state._fsp--;

             current =iv_ruleMsgSelect; 
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
    // $ANTLR end "entryRuleMsgSelect"


    // $ANTLR start "ruleMsgSelect"
    // InternalQADocker.g:4692:1: ruleMsgSelect returns [EObject current=null] : ( () otherlv_1= 'receiveAndSwitch' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ;
    public final EObject ruleMsgSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4698:2: ( ( () otherlv_1= 'receiveAndSwitch' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) )
            // InternalQADocker.g:4699:2: ( () otherlv_1= 'receiveAndSwitch' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            {
            // InternalQADocker.g:4699:2: ( () otherlv_1= 'receiveAndSwitch' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
            // InternalQADocker.g:4700:3: () otherlv_1= 'receiveAndSwitch' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            {
            // InternalQADocker.g:4700:3: ()
            // InternalQADocker.g:4701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMsgSelectAccess().getMsgSelectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getMsgSelectAccess().getReceiveAndSwitchKeyword_1());
            		
            // InternalQADocker.g:4711:3: ( (lv_duration_2_0= ruleTimeLimit ) )
            // InternalQADocker.g:4712:4: (lv_duration_2_0= ruleTimeLimit )
            {
            // InternalQADocker.g:4712:4: (lv_duration_2_0= ruleTimeLimit )
            // InternalQADocker.g:4713:5: lv_duration_2_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getMsgSelectAccess().getDurationTimeLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_duration_2_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMsgSelectRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:4730:3: ( (otherlv_3= RULE_ID ) )
            // InternalQADocker.g:4731:4: (otherlv_3= RULE_ID )
            {
            // InternalQADocker.g:4731:4: (otherlv_3= RULE_ID )
            // InternalQADocker.g:4732:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMsgSelectRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_67); 

            					newLeafNode(otherlv_3, grammarAccess.getMsgSelectAccess().getMessagesMessageCrossReference_3_0());
            				

            }


            }

            // InternalQADocker.g:4743:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==33) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalQADocker.g:4744:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMsgSelectAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalQADocker.g:4748:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalQADocker.g:4749:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalQADocker.g:4749:5: (otherlv_5= RULE_ID )
            	    // InternalQADocker.g:4750:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMsgSelectRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_67); 

            	    						newLeafNode(otherlv_5, grammarAccess.getMsgSelectAccess().getMessagesMessageCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_6=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMsgSelectAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalQADocker.g:4766:3: ( (otherlv_7= RULE_ID ) )
            // InternalQADocker.g:4767:4: (otherlv_7= RULE_ID )
            {
            // InternalQADocker.g:4767:4: (otherlv_7= RULE_ID )
            // InternalQADocker.g:4768:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMsgSelectRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_68); 

            					newLeafNode(otherlv_7, grammarAccess.getMsgSelectAccess().getPlansPlanCrossReference_6_0());
            				

            }


            }

            // InternalQADocker.g:4779:3: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==33) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalQADocker.g:4780:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getMsgSelectAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalQADocker.g:4784:4: ( (otherlv_9= RULE_ID ) )
            	    // InternalQADocker.g:4785:5: (otherlv_9= RULE_ID )
            	    {
            	    // InternalQADocker.g:4785:5: (otherlv_9= RULE_ID )
            	    // InternalQADocker.g:4786:6: otherlv_9= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMsgSelectRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_68); 

            	    						newLeafNode(otherlv_9, grammarAccess.getMsgSelectAccess().getPlansPlanCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


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
    // $ANTLR end "ruleMsgSelect"


    // $ANTLR start "entryRuleRaiseEvent"
    // InternalQADocker.g:4802:1: entryRuleRaiseEvent returns [EObject current=null] : iv_ruleRaiseEvent= ruleRaiseEvent EOF ;
    public final EObject entryRuleRaiseEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseEvent = null;


        try {
            // InternalQADocker.g:4802:51: (iv_ruleRaiseEvent= ruleRaiseEvent EOF )
            // InternalQADocker.g:4803:2: iv_ruleRaiseEvent= ruleRaiseEvent EOF
            {
             newCompositeNode(grammarAccess.getRaiseEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiseEvent=ruleRaiseEvent();

            state._fsp--;

             current =iv_ruleRaiseEvent; 
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
    // $ANTLR end "entryRuleRaiseEvent"


    // $ANTLR start "ruleRaiseEvent"
    // InternalQADocker.g:4809:1: ruleRaiseEvent returns [EObject current=null] : ( () otherlv_1= 'emit' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_content_4_0= rulePHead ) ) ) ;
    public final EObject ruleRaiseEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_content_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4815:2: ( ( () otherlv_1= 'emit' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_content_4_0= rulePHead ) ) ) )
            // InternalQADocker.g:4816:2: ( () otherlv_1= 'emit' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_content_4_0= rulePHead ) ) )
            {
            // InternalQADocker.g:4816:2: ( () otherlv_1= 'emit' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_content_4_0= rulePHead ) ) )
            // InternalQADocker.g:4817:3: () otherlv_1= 'emit' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_content_4_0= rulePHead ) )
            {
            // InternalQADocker.g:4817:3: ()
            // InternalQADocker.g:4818:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRaiseEventAccess().getRaiseEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRaiseEventAccess().getEmitKeyword_1());
            		
            // InternalQADocker.g:4828:3: ( (otherlv_2= RULE_ID ) )
            // InternalQADocker.g:4829:4: (otherlv_2= RULE_ID )
            {
            // InternalQADocker.g:4829:4: (otherlv_2= RULE_ID )
            // InternalQADocker.g:4830:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRaiseEventRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getRaiseEventAccess().getEvEventCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRaiseEventAccess().getColonKeyword_3());
            		
            // InternalQADocker.g:4845:3: ( (lv_content_4_0= rulePHead ) )
            // InternalQADocker.g:4846:4: (lv_content_4_0= rulePHead )
            {
            // InternalQADocker.g:4846:4: (lv_content_4_0= rulePHead )
            // InternalQADocker.g:4847:5: lv_content_4_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getRaiseEventAccess().getContentPHeadParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_content_4_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRaiseEventRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_4_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleRaiseEvent"


    // $ANTLR start "entryRuleSenseEvent"
    // InternalQADocker.g:4868:1: entryRuleSenseEvent returns [EObject current=null] : iv_ruleSenseEvent= ruleSenseEvent EOF ;
    public final EObject entryRuleSenseEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenseEvent = null;


        try {
            // InternalQADocker.g:4868:51: (iv_ruleSenseEvent= ruleSenseEvent EOF )
            // InternalQADocker.g:4869:2: iv_ruleSenseEvent= ruleSenseEvent EOF
            {
             newCompositeNode(grammarAccess.getSenseEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSenseEvent=ruleSenseEvent();

            state._fsp--;

             current =iv_ruleSenseEvent; 
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
    // $ANTLR end "entryRuleSenseEvent"


    // $ANTLR start "ruleSenseEvent"
    // InternalQADocker.g:4875:1: ruleSenseEvent returns [EObject current=null] : ( () otherlv_1= 'sense' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (lv_plans_7_0= ruleContinuation ) ) (otherlv_8= ',' ( (lv_plans_9_0= ruleContinuation ) ) )* ) ;
    public final EObject ruleSenseEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_duration_2_0 = null;

        EObject lv_plans_7_0 = null;

        EObject lv_plans_9_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:4881:2: ( ( () otherlv_1= 'sense' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (lv_plans_7_0= ruleContinuation ) ) (otherlv_8= ',' ( (lv_plans_9_0= ruleContinuation ) ) )* ) )
            // InternalQADocker.g:4882:2: ( () otherlv_1= 'sense' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (lv_plans_7_0= ruleContinuation ) ) (otherlv_8= ',' ( (lv_plans_9_0= ruleContinuation ) ) )* )
            {
            // InternalQADocker.g:4882:2: ( () otherlv_1= 'sense' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (lv_plans_7_0= ruleContinuation ) ) (otherlv_8= ',' ( (lv_plans_9_0= ruleContinuation ) ) )* )
            // InternalQADocker.g:4883:3: () otherlv_1= 'sense' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '->' ( (lv_plans_7_0= ruleContinuation ) ) (otherlv_8= ',' ( (lv_plans_9_0= ruleContinuation ) ) )*
            {
            // InternalQADocker.g:4883:3: ()
            // InternalQADocker.g:4884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSenseEventAccess().getSenseEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getSenseEventAccess().getSenseKeyword_1());
            		
            // InternalQADocker.g:4894:3: ( (lv_duration_2_0= ruleTimeLimit ) )
            // InternalQADocker.g:4895:4: (lv_duration_2_0= ruleTimeLimit )
            {
            // InternalQADocker.g:4895:4: (lv_duration_2_0= ruleTimeLimit )
            // InternalQADocker.g:4896:5: lv_duration_2_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getSenseEventAccess().getDurationTimeLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_duration_2_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSenseEventRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:4913:3: ( (otherlv_3= RULE_ID ) )
            // InternalQADocker.g:4914:4: (otherlv_3= RULE_ID )
            {
            // InternalQADocker.g:4914:4: (otherlv_3= RULE_ID )
            // InternalQADocker.g:4915:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSenseEventRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_67); 

            					newLeafNode(otherlv_3, grammarAccess.getSenseEventAccess().getEventsEventCrossReference_3_0());
            				

            }


            }

            // InternalQADocker.g:4926:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==33) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalQADocker.g:4927:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSenseEventAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalQADocker.g:4931:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalQADocker.g:4932:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalQADocker.g:4932:5: (otherlv_5= RULE_ID )
            	    // InternalQADocker.g:4933:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSenseEventRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_67); 

            	    						newLeafNode(otherlv_5, grammarAccess.getSenseEventAccess().getEventsEventCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_6=(Token)match(input,96,FOLLOW_69); 

            			newLeafNode(otherlv_6, grammarAccess.getSenseEventAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalQADocker.g:4949:3: ( (lv_plans_7_0= ruleContinuation ) )
            // InternalQADocker.g:4950:4: (lv_plans_7_0= ruleContinuation )
            {
            // InternalQADocker.g:4950:4: (lv_plans_7_0= ruleContinuation )
            // InternalQADocker.g:4951:5: lv_plans_7_0= ruleContinuation
            {

            					newCompositeNode(grammarAccess.getSenseEventAccess().getPlansContinuationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_68);
            lv_plans_7_0=ruleContinuation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSenseEventRule());
            					}
            					add(
            						current,
            						"plans",
            						lv_plans_7_0,
            						"xtext.qactor.QADocker.Continuation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:4968:3: (otherlv_8= ',' ( (lv_plans_9_0= ruleContinuation ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==33) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalQADocker.g:4969:4: otherlv_8= ',' ( (lv_plans_9_0= ruleContinuation ) )
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_69); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSenseEventAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalQADocker.g:4973:4: ( (lv_plans_9_0= ruleContinuation ) )
            	    // InternalQADocker.g:4974:5: (lv_plans_9_0= ruleContinuation )
            	    {
            	    // InternalQADocker.g:4974:5: (lv_plans_9_0= ruleContinuation )
            	    // InternalQADocker.g:4975:6: lv_plans_9_0= ruleContinuation
            	    {

            	    						newCompositeNode(grammarAccess.getSenseEventAccess().getPlansContinuationParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_68);
            	    lv_plans_9_0=ruleContinuation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSenseEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plans",
            	    							lv_plans_9_0,
            	    							"xtext.qactor.QADocker.Continuation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


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
    // $ANTLR end "ruleSenseEvent"


    // $ANTLR start "entryRuleMsgSwitch"
    // InternalQADocker.g:4997:1: entryRuleMsgSwitch returns [EObject current=null] : iv_ruleMsgSwitch= ruleMsgSwitch EOF ;
    public final EObject entryRuleMsgSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsgSwitch = null;


        try {
            // InternalQADocker.g:4997:50: (iv_ruleMsgSwitch= ruleMsgSwitch EOF )
            // InternalQADocker.g:4998:2: iv_ruleMsgSwitch= ruleMsgSwitch EOF
            {
             newCompositeNode(grammarAccess.getMsgSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMsgSwitch=ruleMsgSwitch();

            state._fsp--;

             current =iv_ruleMsgSwitch; 
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
    // $ANTLR end "entryRuleMsgSwitch"


    // $ANTLR start "ruleMsgSwitch"
    // InternalQADocker.g:5004:1: ruleMsgSwitch returns [EObject current=null] : ( () otherlv_1= 'onMsg' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) ) ;
    public final EObject ruleMsgSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_msg_4_0 = null;

        EObject lv_move_6_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5010:2: ( ( () otherlv_1= 'onMsg' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) ) )
            // InternalQADocker.g:5011:2: ( () otherlv_1= 'onMsg' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) )
            {
            // InternalQADocker.g:5011:2: ( () otherlv_1= 'onMsg' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) )
            // InternalQADocker.g:5012:3: () otherlv_1= 'onMsg' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) )
            {
            // InternalQADocker.g:5012:3: ()
            // InternalQADocker.g:5013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMsgSwitchAccess().getMsgSwitchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMsgSwitchAccess().getOnMsgKeyword_1());
            		
            // InternalQADocker.g:5023:3: ( (otherlv_2= RULE_ID ) )
            // InternalQADocker.g:5024:4: (otherlv_2= RULE_ID )
            {
            // InternalQADocker.g:5024:4: (otherlv_2= RULE_ID )
            // InternalQADocker.g:5025:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMsgSwitchRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getMsgSwitchAccess().getMessageMessageCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getMsgSwitchAccess().getColonKeyword_3());
            		
            // InternalQADocker.g:5040:3: ( (lv_msg_4_0= rulePHead ) )
            // InternalQADocker.g:5041:4: (lv_msg_4_0= rulePHead )
            {
            // InternalQADocker.g:5041:4: (lv_msg_4_0= rulePHead )
            // InternalQADocker.g:5042:5: lv_msg_4_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getMsgSwitchAccess().getMsgPHeadParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_70);
            lv_msg_4_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMsgSwitchRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_4_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,96,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getMsgSwitchAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalQADocker.g:5063:3: ( (lv_move_6_0= ruleMove ) )
            // InternalQADocker.g:5064:4: (lv_move_6_0= ruleMove )
            {
            // InternalQADocker.g:5064:4: (lv_move_6_0= ruleMove )
            // InternalQADocker.g:5065:5: lv_move_6_0= ruleMove
            {

            					newCompositeNode(grammarAccess.getMsgSwitchAccess().getMoveMoveParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_move_6_0=ruleMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMsgSwitchRule());
            					}
            					set(
            						current,
            						"move",
            						lv_move_6_0,
            						"xtext.qactor.QADocker.Move");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleMsgSwitch"


    // $ANTLR start "entryRuleEventSwitch"
    // InternalQADocker.g:5086:1: entryRuleEventSwitch returns [EObject current=null] : iv_ruleEventSwitch= ruleEventSwitch EOF ;
    public final EObject entryRuleEventSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSwitch = null;


        try {
            // InternalQADocker.g:5086:52: (iv_ruleEventSwitch= ruleEventSwitch EOF )
            // InternalQADocker.g:5087:2: iv_ruleEventSwitch= ruleEventSwitch EOF
            {
             newCompositeNode(grammarAccess.getEventSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventSwitch=ruleEventSwitch();

            state._fsp--;

             current =iv_ruleEventSwitch; 
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
    // $ANTLR end "entryRuleEventSwitch"


    // $ANTLR start "ruleEventSwitch"
    // InternalQADocker.g:5093:1: ruleEventSwitch returns [EObject current=null] : ( () otherlv_1= 'onEvent' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) ) ;
    public final EObject ruleEventSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_msg_4_0 = null;

        EObject lv_move_6_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5099:2: ( ( () otherlv_1= 'onEvent' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) ) )
            // InternalQADocker.g:5100:2: ( () otherlv_1= 'onEvent' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) )
            {
            // InternalQADocker.g:5100:2: ( () otherlv_1= 'onEvent' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) ) )
            // InternalQADocker.g:5101:3: () otherlv_1= 'onEvent' ( (otherlv_2= RULE_ID ) ) otherlv_3= ':' ( (lv_msg_4_0= rulePHead ) ) otherlv_5= '->' ( (lv_move_6_0= ruleMove ) )
            {
            // InternalQADocker.g:5101:3: ()
            // InternalQADocker.g:5102:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventSwitchAccess().getEventSwitchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventSwitchAccess().getOnEventKeyword_1());
            		
            // InternalQADocker.g:5112:3: ( (otherlv_2= RULE_ID ) )
            // InternalQADocker.g:5113:4: (otherlv_2= RULE_ID )
            {
            // InternalQADocker.g:5113:4: (otherlv_2= RULE_ID )
            // InternalQADocker.g:5114:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventSwitchRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getEventSwitchAccess().getEventEventCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEventSwitchAccess().getColonKeyword_3());
            		
            // InternalQADocker.g:5129:3: ( (lv_msg_4_0= rulePHead ) )
            // InternalQADocker.g:5130:4: (lv_msg_4_0= rulePHead )
            {
            // InternalQADocker.g:5130:4: (lv_msg_4_0= rulePHead )
            // InternalQADocker.g:5131:5: lv_msg_4_0= rulePHead
            {

            					newCompositeNode(grammarAccess.getEventSwitchAccess().getMsgPHeadParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_70);
            lv_msg_4_0=rulePHead();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSwitchRule());
            					}
            					set(
            						current,
            						"msg",
            						lv_msg_4_0,
            						"xtext.qactor.QADocker.PHead");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,96,FOLLOW_45); 

            			newLeafNode(otherlv_5, grammarAccess.getEventSwitchAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalQADocker.g:5152:3: ( (lv_move_6_0= ruleMove ) )
            // InternalQADocker.g:5153:4: (lv_move_6_0= ruleMove )
            {
            // InternalQADocker.g:5153:4: (lv_move_6_0= ruleMove )
            // InternalQADocker.g:5154:5: lv_move_6_0= ruleMove
            {

            					newCompositeNode(grammarAccess.getEventSwitchAccess().getMoveMoveParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_move_6_0=ruleMove();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSwitchRule());
            					}
            					set(
            						current,
            						"move",
            						lv_move_6_0,
            						"xtext.qactor.QADocker.Move");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleEventSwitch"


    // $ANTLR start "entryRuleContinuation"
    // InternalQADocker.g:5175:1: entryRuleContinuation returns [EObject current=null] : iv_ruleContinuation= ruleContinuation EOF ;
    public final EObject entryRuleContinuation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuation = null;


        try {
            // InternalQADocker.g:5175:53: (iv_ruleContinuation= ruleContinuation EOF )
            // InternalQADocker.g:5176:2: iv_ruleContinuation= ruleContinuation EOF
            {
             newCompositeNode(grammarAccess.getContinuationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinuation=ruleContinuation();

            state._fsp--;

             current =iv_ruleContinuation; 
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
    // $ANTLR end "entryRuleContinuation"


    // $ANTLR start "ruleContinuation"
    // InternalQADocker.g:5182:1: ruleContinuation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nane_1_0= 'continue' ) ) ) ;
    public final EObject ruleContinuation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nane_1_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:5188:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nane_1_0= 'continue' ) ) ) )
            // InternalQADocker.g:5189:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nane_1_0= 'continue' ) ) )
            {
            // InternalQADocker.g:5189:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_nane_1_0= 'continue' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==101) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalQADocker.g:5190:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalQADocker.g:5190:3: ( (otherlv_0= RULE_ID ) )
                    // InternalQADocker.g:5191:4: (otherlv_0= RULE_ID )
                    {
                    // InternalQADocker.g:5191:4: (otherlv_0= RULE_ID )
                    // InternalQADocker.g:5192:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContinuationRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getContinuationAccess().getPlanPlanCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:5204:3: ( (lv_nane_1_0= 'continue' ) )
                    {
                    // InternalQADocker.g:5204:3: ( (lv_nane_1_0= 'continue' ) )
                    // InternalQADocker.g:5205:4: (lv_nane_1_0= 'continue' )
                    {
                    // InternalQADocker.g:5205:4: (lv_nane_1_0= 'continue' )
                    // InternalQADocker.g:5206:5: lv_nane_1_0= 'continue'
                    {
                    lv_nane_1_0=(Token)match(input,101,FOLLOW_2); 

                    					newLeafNode(lv_nane_1_0, grammarAccess.getContinuationAccess().getNaneContinueKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContinuationRule());
                    					}
                    					setWithLastConsumed(current, "nane", lv_nane_1_0, "continue");
                    				

                    }


                    }


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
    // $ANTLR end "ruleContinuation"


    // $ANTLR start "entryRuleExtensionMove"
    // InternalQADocker.g:5222:1: entryRuleExtensionMove returns [EObject current=null] : iv_ruleExtensionMove= ruleExtensionMove EOF ;
    public final EObject entryRuleExtensionMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionMove = null;


        try {
            // InternalQADocker.g:5222:54: (iv_ruleExtensionMove= ruleExtensionMove EOF )
            // InternalQADocker.g:5223:2: iv_ruleExtensionMove= ruleExtensionMove EOF
            {
             newCompositeNode(grammarAccess.getExtensionMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionMove=ruleExtensionMove();

            state._fsp--;

             current =iv_ruleExtensionMove; 
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
    // $ANTLR end "entryRuleExtensionMove"


    // $ANTLR start "ruleExtensionMove"
    // InternalQADocker.g:5229:1: ruleExtensionMove returns [EObject current=null] : (this_Photo_0= rulePhoto | this_Sound_1= ruleSound | this_Video_2= ruleVideo | this_Delay_3= ruleDelay ) ;
    public final EObject ruleExtensionMove() throws RecognitionException {
        EObject current = null;

        EObject this_Photo_0 = null;

        EObject this_Sound_1 = null;

        EObject this_Video_2 = null;

        EObject this_Delay_3 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5235:2: ( (this_Photo_0= rulePhoto | this_Sound_1= ruleSound | this_Video_2= ruleVideo | this_Delay_3= ruleDelay ) )
            // InternalQADocker.g:5236:2: (this_Photo_0= rulePhoto | this_Sound_1= ruleSound | this_Video_2= ruleVideo | this_Delay_3= ruleDelay )
            {
            // InternalQADocker.g:5236:2: (this_Photo_0= rulePhoto | this_Sound_1= ruleSound | this_Video_2= ruleVideo | this_Delay_3= ruleDelay )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt62=1;
                }
                break;
            case 103:
                {
                alt62=2;
                }
                break;
            case 104:
                {
                alt62=3;
                }
                break;
            case 105:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalQADocker.g:5237:3: this_Photo_0= rulePhoto
                    {

                    			newCompositeNode(grammarAccess.getExtensionMoveAccess().getPhotoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Photo_0=rulePhoto();

                    state._fsp--;


                    			current = this_Photo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:5246:3: this_Sound_1= ruleSound
                    {

                    			newCompositeNode(grammarAccess.getExtensionMoveAccess().getSoundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sound_1=ruleSound();

                    state._fsp--;


                    			current = this_Sound_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:5255:3: this_Video_2= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getExtensionMoveAccess().getVideoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_2=ruleVideo();

                    state._fsp--;


                    			current = this_Video_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:5264:3: this_Delay_3= ruleDelay
                    {

                    			newCompositeNode(grammarAccess.getExtensionMoveAccess().getDelayParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delay_3=ruleDelay();

                    state._fsp--;


                    			current = this_Delay_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleExtensionMove"


    // $ANTLR start "entryRulePhoto"
    // InternalQADocker.g:5276:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalQADocker.g:5276:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalQADocker.g:5277:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
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
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // InternalQADocker.g:5283:1: rulePhoto returns [EObject current=null] : ( () otherlv_1= 'photo' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_duration_2_0 = null;

        EObject lv_destfile_3_0 = null;

        EObject lv_answerEvent_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5289:2: ( ( () otherlv_1= 'photo' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? ) )
            // InternalQADocker.g:5290:2: ( () otherlv_1= 'photo' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? )
            {
            // InternalQADocker.g:5290:2: ( () otherlv_1= 'photo' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? )
            // InternalQADocker.g:5291:3: () otherlv_1= 'photo' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )?
            {
            // InternalQADocker.g:5291:3: ()
            // InternalQADocker.g:5292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhotoAccess().getPhotoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getPhotoAccess().getPhotoKeyword_1());
            		
            // InternalQADocker.g:5302:3: ( (lv_duration_2_0= ruleTimeLimit ) )
            // InternalQADocker.g:5303:4: (lv_duration_2_0= ruleTimeLimit )
            {
            // InternalQADocker.g:5303:4: (lv_duration_2_0= ruleTimeLimit )
            // InternalQADocker.g:5304:5: lv_duration_2_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getPhotoAccess().getDurationTimeLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_71);
            lv_duration_2_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhotoRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:5321:3: ( (lv_destfile_3_0= ruleMoveFile ) )
            // InternalQADocker.g:5322:4: (lv_destfile_3_0= ruleMoveFile )
            {
            // InternalQADocker.g:5322:4: (lv_destfile_3_0= ruleMoveFile )
            // InternalQADocker.g:5323:5: lv_destfile_3_0= ruleMoveFile
            {

            					newCompositeNode(grammarAccess.getPhotoAccess().getDestfileMoveFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_72);
            lv_destfile_3_0=ruleMoveFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhotoRule());
            					}
            					set(
            						current,
            						"destfile",
            						lv_destfile_3_0,
            						"xtext.qactor.QADocker.MoveFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:5340:3: ( (lv_answerEvent_4_0= ruleAnswerEvent ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==106) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalQADocker.g:5341:4: (lv_answerEvent_4_0= ruleAnswerEvent )
                    {
                    // InternalQADocker.g:5341:4: (lv_answerEvent_4_0= ruleAnswerEvent )
                    // InternalQADocker.g:5342:5: lv_answerEvent_4_0= ruleAnswerEvent
                    {

                    					newCompositeNode(grammarAccess.getPhotoAccess().getAnswerEventAnswerEventParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_answerEvent_4_0=ruleAnswerEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPhotoRule());
                    					}
                    					set(
                    						current,
                    						"answerEvent",
                    						lv_answerEvent_4_0,
                    						"xtext.qactor.QADocker.AnswerEvent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "rulePhoto"


    // $ANTLR start "entryRuleSound"
    // InternalQADocker.g:5363:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalQADocker.g:5363:46: (iv_ruleSound= ruleSound EOF )
            // InternalQADocker.g:5364:2: iv_ruleSound= ruleSound EOF
            {
             newCompositeNode(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSound=ruleSound();

            state._fsp--;

             current =iv_ruleSound; 
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
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalQADocker.g:5370:1: ruleSound returns [EObject current=null] : ( () otherlv_1= 'sound' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_srcfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_duration_2_0 = null;

        EObject lv_srcfile_3_0 = null;

        EObject lv_answerEvent_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5376:2: ( ( () otherlv_1= 'sound' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_srcfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? ) )
            // InternalQADocker.g:5377:2: ( () otherlv_1= 'sound' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_srcfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? )
            {
            // InternalQADocker.g:5377:2: ( () otherlv_1= 'sound' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_srcfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? )
            // InternalQADocker.g:5378:3: () otherlv_1= 'sound' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_srcfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )?
            {
            // InternalQADocker.g:5378:3: ()
            // InternalQADocker.g:5379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoundAccess().getSoundAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundAccess().getSoundKeyword_1());
            		
            // InternalQADocker.g:5389:3: ( (lv_duration_2_0= ruleTimeLimit ) )
            // InternalQADocker.g:5390:4: (lv_duration_2_0= ruleTimeLimit )
            {
            // InternalQADocker.g:5390:4: (lv_duration_2_0= ruleTimeLimit )
            // InternalQADocker.g:5391:5: lv_duration_2_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getDurationTimeLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_71);
            lv_duration_2_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:5408:3: ( (lv_srcfile_3_0= ruleMoveFile ) )
            // InternalQADocker.g:5409:4: (lv_srcfile_3_0= ruleMoveFile )
            {
            // InternalQADocker.g:5409:4: (lv_srcfile_3_0= ruleMoveFile )
            // InternalQADocker.g:5410:5: lv_srcfile_3_0= ruleMoveFile
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getSrcfileMoveFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_72);
            lv_srcfile_3_0=ruleMoveFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundRule());
            					}
            					set(
            						current,
            						"srcfile",
            						lv_srcfile_3_0,
            						"xtext.qactor.QADocker.MoveFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:5427:3: ( (lv_answerEvent_4_0= ruleAnswerEvent ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==106) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalQADocker.g:5428:4: (lv_answerEvent_4_0= ruleAnswerEvent )
                    {
                    // InternalQADocker.g:5428:4: (lv_answerEvent_4_0= ruleAnswerEvent )
                    // InternalQADocker.g:5429:5: lv_answerEvent_4_0= ruleAnswerEvent
                    {

                    					newCompositeNode(grammarAccess.getSoundAccess().getAnswerEventAnswerEventParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_answerEvent_4_0=ruleAnswerEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSoundRule());
                    					}
                    					set(
                    						current,
                    						"answerEvent",
                    						lv_answerEvent_4_0,
                    						"xtext.qactor.QADocker.AnswerEvent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleVideo"
    // InternalQADocker.g:5450:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalQADocker.g:5450:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalQADocker.g:5451:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalQADocker.g:5457:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'video' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_duration_2_0 = null;

        EObject lv_destfile_3_0 = null;

        EObject lv_answerEvent_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5463:2: ( ( () otherlv_1= 'video' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? ) )
            // InternalQADocker.g:5464:2: ( () otherlv_1= 'video' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? )
            {
            // InternalQADocker.g:5464:2: ( () otherlv_1= 'video' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )? )
            // InternalQADocker.g:5465:3: () otherlv_1= 'video' ( (lv_duration_2_0= ruleTimeLimit ) ) ( (lv_destfile_3_0= ruleMoveFile ) ) ( (lv_answerEvent_4_0= ruleAnswerEvent ) )?
            {
            // InternalQADocker.g:5465:3: ()
            // InternalQADocker.g:5466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            // InternalQADocker.g:5476:3: ( (lv_duration_2_0= ruleTimeLimit ) )
            // InternalQADocker.g:5477:4: (lv_duration_2_0= ruleTimeLimit )
            {
            // InternalQADocker.g:5477:4: (lv_duration_2_0= ruleTimeLimit )
            // InternalQADocker.g:5478:5: lv_duration_2_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getDurationTimeLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_71);
            lv_duration_2_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:5495:3: ( (lv_destfile_3_0= ruleMoveFile ) )
            // InternalQADocker.g:5496:4: (lv_destfile_3_0= ruleMoveFile )
            {
            // InternalQADocker.g:5496:4: (lv_destfile_3_0= ruleMoveFile )
            // InternalQADocker.g:5497:5: lv_destfile_3_0= ruleMoveFile
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getDestfileMoveFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_72);
            lv_destfile_3_0=ruleMoveFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"destfile",
            						lv_destfile_3_0,
            						"xtext.qactor.QADocker.MoveFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:5514:3: ( (lv_answerEvent_4_0= ruleAnswerEvent ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==106) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalQADocker.g:5515:4: (lv_answerEvent_4_0= ruleAnswerEvent )
                    {
                    // InternalQADocker.g:5515:4: (lv_answerEvent_4_0= ruleAnswerEvent )
                    // InternalQADocker.g:5516:5: lv_answerEvent_4_0= ruleAnswerEvent
                    {

                    					newCompositeNode(grammarAccess.getVideoAccess().getAnswerEventAnswerEventParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_answerEvent_4_0=ruleAnswerEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoRule());
                    					}
                    					set(
                    						current,
                    						"answerEvent",
                    						lv_answerEvent_4_0,
                    						"xtext.qactor.QADocker.AnswerEvent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleDelay"
    // InternalQADocker.g:5537:1: entryRuleDelay returns [EObject current=null] : iv_ruleDelay= ruleDelay EOF ;
    public final EObject entryRuleDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelay = null;


        try {
            // InternalQADocker.g:5537:46: (iv_ruleDelay= ruleDelay EOF )
            // InternalQADocker.g:5538:2: iv_ruleDelay= ruleDelay EOF
            {
             newCompositeNode(grammarAccess.getDelayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelay=ruleDelay();

            state._fsp--;

             current =iv_ruleDelay; 
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
    // $ANTLR end "entryRuleDelay"


    // $ANTLR start "ruleDelay"
    // InternalQADocker.g:5544:1: ruleDelay returns [EObject current=null] : ( () otherlv_1= 'delay' ( (lv_duration_2_0= ruleTimeLimit ) ) ) ;
    public final EObject ruleDelay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_duration_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5550:2: ( ( () otherlv_1= 'delay' ( (lv_duration_2_0= ruleTimeLimit ) ) ) )
            // InternalQADocker.g:5551:2: ( () otherlv_1= 'delay' ( (lv_duration_2_0= ruleTimeLimit ) ) )
            {
            // InternalQADocker.g:5551:2: ( () otherlv_1= 'delay' ( (lv_duration_2_0= ruleTimeLimit ) ) )
            // InternalQADocker.g:5552:3: () otherlv_1= 'delay' ( (lv_duration_2_0= ruleTimeLimit ) )
            {
            // InternalQADocker.g:5552:3: ()
            // InternalQADocker.g:5553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDelayAccess().getDelayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getDelayAccess().getDelayKeyword_1());
            		
            // InternalQADocker.g:5563:3: ( (lv_duration_2_0= ruleTimeLimit ) )
            // InternalQADocker.g:5564:4: (lv_duration_2_0= ruleTimeLimit )
            {
            // InternalQADocker.g:5564:4: (lv_duration_2_0= ruleTimeLimit )
            // InternalQADocker.g:5565:5: lv_duration_2_0= ruleTimeLimit
            {

            					newCompositeNode(grammarAccess.getDelayAccess().getDurationTimeLimitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_duration_2_0=ruleTimeLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelayRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"xtext.qactor.QADocker.TimeLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDelay"


    // $ANTLR start "entryRuleAnswerEvent"
    // InternalQADocker.g:5586:1: entryRuleAnswerEvent returns [EObject current=null] : iv_ruleAnswerEvent= ruleAnswerEvent EOF ;
    public final EObject entryRuleAnswerEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswerEvent = null;


        try {
            // InternalQADocker.g:5586:52: (iv_ruleAnswerEvent= ruleAnswerEvent EOF )
            // InternalQADocker.g:5587:2: iv_ruleAnswerEvent= ruleAnswerEvent EOF
            {
             newCompositeNode(grammarAccess.getAnswerEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnswerEvent=ruleAnswerEvent();

            state._fsp--;

             current =iv_ruleAnswerEvent; 
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
    // $ANTLR end "entryRuleAnswerEvent"


    // $ANTLR start "ruleAnswerEvent"
    // InternalQADocker.g:5593:1: ruleAnswerEvent returns [EObject current=null] : (otherlv_0= 'answerEv' ( (lv_evName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAnswerEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_evName_1_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:5599:2: ( (otherlv_0= 'answerEv' ( (lv_evName_1_0= RULE_ID ) ) ) )
            // InternalQADocker.g:5600:2: (otherlv_0= 'answerEv' ( (lv_evName_1_0= RULE_ID ) ) )
            {
            // InternalQADocker.g:5600:2: (otherlv_0= 'answerEv' ( (lv_evName_1_0= RULE_ID ) ) )
            // InternalQADocker.g:5601:3: otherlv_0= 'answerEv' ( (lv_evName_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnswerEventAccess().getAnswerEvKeyword_0());
            		
            // InternalQADocker.g:5605:3: ( (lv_evName_1_0= RULE_ID ) )
            // InternalQADocker.g:5606:4: (lv_evName_1_0= RULE_ID )
            {
            // InternalQADocker.g:5606:4: (lv_evName_1_0= RULE_ID )
            // InternalQADocker.g:5607:5: lv_evName_1_0= RULE_ID
            {
            lv_evName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_evName_1_0, grammarAccess.getAnswerEventAccess().getEvNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnswerEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"evName",
            						lv_evName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleAnswerEvent"


    // $ANTLR start "entryRuleEventHandler"
    // InternalQADocker.g:5627:1: entryRuleEventHandler returns [EObject current=null] : iv_ruleEventHandler= ruleEventHandler EOF ;
    public final EObject entryRuleEventHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandler = null;


        try {
            // InternalQADocker.g:5627:53: (iv_ruleEventHandler= ruleEventHandler EOF )
            // InternalQADocker.g:5628:2: iv_ruleEventHandler= ruleEventHandler EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventHandler=ruleEventHandler();

            state._fsp--;

             current =iv_ruleEventHandler; 
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
    // $ANTLR end "entryRuleEventHandler"


    // $ANTLR start "ruleEventHandler"
    // InternalQADocker.g:5634:1: ruleEventHandler returns [EObject current=null] : (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_print_6_0= '-print' ) )? (otherlv_7= '{' ( (lv_body_8_0= ruleEventHandlerBody ) ) otherlv_9= '}' )? otherlv_10= ';' ) ;
    public final EObject ruleEventHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_print_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5640:2: ( (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_print_6_0= '-print' ) )? (otherlv_7= '{' ( (lv_body_8_0= ruleEventHandlerBody ) ) otherlv_9= '}' )? otherlv_10= ';' ) )
            // InternalQADocker.g:5641:2: (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_print_6_0= '-print' ) )? (otherlv_7= '{' ( (lv_body_8_0= ruleEventHandlerBody ) ) otherlv_9= '}' )? otherlv_10= ';' )
            {
            // InternalQADocker.g:5641:2: (otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_print_6_0= '-print' ) )? (otherlv_7= '{' ( (lv_body_8_0= ruleEventHandlerBody ) ) otherlv_9= '}' )? otherlv_10= ';' )
            // InternalQADocker.g:5642:3: otherlv_0= 'EventHandler' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_print_6_0= '-print' ) )? (otherlv_7= '{' ( (lv_body_8_0= ruleEventHandlerBody ) ) otherlv_9= '}' )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventHandlerAccess().getEventHandlerKeyword_0());
            		
            // InternalQADocker.g:5646:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQADocker.g:5647:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQADocker.g:5647:4: (lv_name_1_0= RULE_ID )
            // InternalQADocker.g:5648:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_73); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventHandlerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventHandlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQADocker.g:5664:3: (otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==108) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalQADocker.g:5665:4: otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,108,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventHandlerAccess().getForKeyword_2_0());
                    			
                    // InternalQADocker.g:5669:4: ( (otherlv_3= RULE_ID ) )
                    // InternalQADocker.g:5670:5: (otherlv_3= RULE_ID )
                    {
                    // InternalQADocker.g:5670:5: (otherlv_3= RULE_ID )
                    // InternalQADocker.g:5671:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventHandlerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_74); 

                    						newLeafNode(otherlv_3, grammarAccess.getEventHandlerAccess().getEventsEventCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalQADocker.g:5682:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==33) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalQADocker.g:5683:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEventHandlerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalQADocker.g:5687:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalQADocker.g:5688:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalQADocker.g:5688:6: (otherlv_5= RULE_ID )
                    	    // InternalQADocker.g:5689:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventHandlerRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_74); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getEventHandlerAccess().getEventsEventCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalQADocker.g:5702:3: ( (lv_print_6_0= '-print' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==109) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalQADocker.g:5703:4: (lv_print_6_0= '-print' )
                    {
                    // InternalQADocker.g:5703:4: (lv_print_6_0= '-print' )
                    // InternalQADocker.g:5704:5: lv_print_6_0= '-print'
                    {
                    lv_print_6_0=(Token)match(input,109,FOLLOW_75); 

                    					newLeafNode(lv_print_6_0, grammarAccess.getEventHandlerAccess().getPrintPrintKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEventHandlerRule());
                    					}
                    					setWithLastConsumed(current, "print", true, "-print");
                    				

                    }


                    }
                    break;

            }

            // InternalQADocker.g:5716:3: (otherlv_7= '{' ( (lv_body_8_0= ruleEventHandlerBody ) ) otherlv_9= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==29) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalQADocker.g:5717:4: otherlv_7= '{' ( (lv_body_8_0= ruleEventHandlerBody ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_76); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventHandlerAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalQADocker.g:5721:4: ( (lv_body_8_0= ruleEventHandlerBody ) )
                    // InternalQADocker.g:5722:5: (lv_body_8_0= ruleEventHandlerBody )
                    {
                    // InternalQADocker.g:5722:5: (lv_body_8_0= ruleEventHandlerBody )
                    // InternalQADocker.g:5723:6: lv_body_8_0= ruleEventHandlerBody
                    {

                    						newCompositeNode(grammarAccess.getEventHandlerAccess().getBodyEventHandlerBodyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_body_8_0=ruleEventHandlerBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventHandlerRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_8_0,
                    							"xtext.qactor.QADocker.EventHandlerBody");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,31,FOLLOW_44); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventHandlerAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEventHandlerAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleEventHandler"


    // $ANTLR start "entryRuleEventHandlerBody"
    // InternalQADocker.g:5753:1: entryRuleEventHandlerBody returns [EObject current=null] : iv_ruleEventHandlerBody= ruleEventHandlerBody EOF ;
    public final EObject entryRuleEventHandlerBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandlerBody = null;


        try {
            // InternalQADocker.g:5753:57: (iv_ruleEventHandlerBody= ruleEventHandlerBody EOF )
            // InternalQADocker.g:5754:2: iv_ruleEventHandlerBody= ruleEventHandlerBody EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventHandlerBody=ruleEventHandlerBody();

            state._fsp--;

             current =iv_ruleEventHandlerBody; 
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
    // $ANTLR end "entryRuleEventHandlerBody"


    // $ANTLR start "ruleEventHandlerBody"
    // InternalQADocker.g:5760:1: ruleEventHandlerBody returns [EObject current=null] : ( ( (lv_op_0_0= ruleEventHandlerOperation ) ) (otherlv_1= ';' ( (lv_op_2_0= ruleEventHandlerOperation ) ) )* ) ;
    public final EObject ruleEventHandlerBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5766:2: ( ( ( (lv_op_0_0= ruleEventHandlerOperation ) ) (otherlv_1= ';' ( (lv_op_2_0= ruleEventHandlerOperation ) ) )* ) )
            // InternalQADocker.g:5767:2: ( ( (lv_op_0_0= ruleEventHandlerOperation ) ) (otherlv_1= ';' ( (lv_op_2_0= ruleEventHandlerOperation ) ) )* )
            {
            // InternalQADocker.g:5767:2: ( ( (lv_op_0_0= ruleEventHandlerOperation ) ) (otherlv_1= ';' ( (lv_op_2_0= ruleEventHandlerOperation ) ) )* )
            // InternalQADocker.g:5768:3: ( (lv_op_0_0= ruleEventHandlerOperation ) ) (otherlv_1= ';' ( (lv_op_2_0= ruleEventHandlerOperation ) ) )*
            {
            // InternalQADocker.g:5768:3: ( (lv_op_0_0= ruleEventHandlerOperation ) )
            // InternalQADocker.g:5769:4: (lv_op_0_0= ruleEventHandlerOperation )
            {
            // InternalQADocker.g:5769:4: (lv_op_0_0= ruleEventHandlerOperation )
            // InternalQADocker.g:5770:5: lv_op_0_0= ruleEventHandlerOperation
            {

            					newCompositeNode(grammarAccess.getEventHandlerBodyAccess().getOpEventHandlerOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_46);
            lv_op_0_0=ruleEventHandlerOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventHandlerBodyRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_0_0,
            						"xtext.qactor.QADocker.EventHandlerOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:5787:3: (otherlv_1= ';' ( (lv_op_2_0= ruleEventHandlerOperation ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==49) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalQADocker.g:5788:4: otherlv_1= ';' ( (lv_op_2_0= ruleEventHandlerOperation ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_76); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEventHandlerBodyAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalQADocker.g:5792:4: ( (lv_op_2_0= ruleEventHandlerOperation ) )
            	    // InternalQADocker.g:5793:5: (lv_op_2_0= ruleEventHandlerOperation )
            	    {
            	    // InternalQADocker.g:5793:5: (lv_op_2_0= ruleEventHandlerOperation )
            	    // InternalQADocker.g:5794:6: lv_op_2_0= ruleEventHandlerOperation
            	    {

            	    						newCompositeNode(grammarAccess.getEventHandlerBodyAccess().getOpEventHandlerOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_op_2_0=ruleEventHandlerOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventHandlerBodyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"xtext.qactor.QADocker.EventHandlerOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


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
    // $ANTLR end "ruleEventHandlerBody"


    // $ANTLR start "entryRuleEventHandlerOperation"
    // InternalQADocker.g:5816:1: entryRuleEventHandlerOperation returns [EObject current=null] : iv_ruleEventHandlerOperation= ruleEventHandlerOperation EOF ;
    public final EObject entryRuleEventHandlerOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventHandlerOperation = null;


        try {
            // InternalQADocker.g:5816:62: (iv_ruleEventHandlerOperation= ruleEventHandlerOperation EOF )
            // InternalQADocker.g:5817:2: iv_ruleEventHandlerOperation= ruleEventHandlerOperation EOF
            {
             newCompositeNode(grammarAccess.getEventHandlerOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventHandlerOperation=ruleEventHandlerOperation();

            state._fsp--;

             current =iv_ruleEventHandlerOperation; 
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
    // $ANTLR end "entryRuleEventHandlerOperation"


    // $ANTLR start "ruleEventHandlerOperation"
    // InternalQADocker.g:5823:1: ruleEventHandlerOperation returns [EObject current=null] : (this_MemoOperation_0= ruleMemoOperation | this_SolveOperation_1= ruleSolveOperation | this_RaiseEvent_2= ruleRaiseEvent | this_SendEventAsDispatch_3= ruleSendEventAsDispatch ) ;
    public final EObject ruleEventHandlerOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MemoOperation_0 = null;

        EObject this_SolveOperation_1 = null;

        EObject this_RaiseEvent_2 = null;

        EObject this_SendEventAsDispatch_3 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5829:2: ( (this_MemoOperation_0= ruleMemoOperation | this_SolveOperation_1= ruleSolveOperation | this_RaiseEvent_2= ruleRaiseEvent | this_SendEventAsDispatch_3= ruleSendEventAsDispatch ) )
            // InternalQADocker.g:5830:2: (this_MemoOperation_0= ruleMemoOperation | this_SolveOperation_1= ruleSolveOperation | this_RaiseEvent_2= ruleRaiseEvent | this_SendEventAsDispatch_3= ruleSendEventAsDispatch )
            {
            // InternalQADocker.g:5830:2: (this_MemoOperation_0= ruleMemoOperation | this_SolveOperation_1= ruleSolveOperation | this_RaiseEvent_2= ruleRaiseEvent | this_SendEventAsDispatch_3= ruleSendEventAsDispatch )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 71:
            case 110:
                {
                alt71=1;
                }
                break;
            case 62:
                {
                alt71=2;
                }
                break;
            case 97:
                {
                alt71=3;
                }
                break;
            case 111:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalQADocker.g:5831:3: this_MemoOperation_0= ruleMemoOperation
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerOperationAccess().getMemoOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemoOperation_0=ruleMemoOperation();

                    state._fsp--;


                    			current = this_MemoOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:5840:3: this_SolveOperation_1= ruleSolveOperation
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerOperationAccess().getSolveOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SolveOperation_1=ruleSolveOperation();

                    state._fsp--;


                    			current = this_SolveOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQADocker.g:5849:3: this_RaiseEvent_2= ruleRaiseEvent
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerOperationAccess().getRaiseEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RaiseEvent_2=ruleRaiseEvent();

                    state._fsp--;


                    			current = this_RaiseEvent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQADocker.g:5858:3: this_SendEventAsDispatch_3= ruleSendEventAsDispatch
                    {

                    			newCompositeNode(grammarAccess.getEventHandlerOperationAccess().getSendEventAsDispatchParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendEventAsDispatch_3=ruleSendEventAsDispatch();

                    state._fsp--;


                    			current = this_SendEventAsDispatch_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEventHandlerOperation"


    // $ANTLR start "entryRuleMemoOperation"
    // InternalQADocker.g:5870:1: entryRuleMemoOperation returns [EObject current=null] : iv_ruleMemoOperation= ruleMemoOperation EOF ;
    public final EObject entryRuleMemoOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoOperation = null;


        try {
            // InternalQADocker.g:5870:54: (iv_ruleMemoOperation= ruleMemoOperation EOF )
            // InternalQADocker.g:5871:2: iv_ruleMemoOperation= ruleMemoOperation EOF
            {
             newCompositeNode(grammarAccess.getMemoOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoOperation=ruleMemoOperation();

            state._fsp--;

             current =iv_ruleMemoOperation; 
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
    // $ANTLR end "entryRuleMemoOperation"


    // $ANTLR start "ruleMemoOperation"
    // InternalQADocker.g:5877:1: ruleMemoOperation returns [EObject current=null] : ( (otherlv_0= 'memo' ( (lv_rule_1_0= ruleMemoRule ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject ruleMemoOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_rule_1_0 = null;

        EObject lv_doMemo_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5883:2: ( ( (otherlv_0= 'memo' ( (lv_rule_1_0= ruleMemoRule ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) ) ) )
            // InternalQADocker.g:5884:2: ( (otherlv_0= 'memo' ( (lv_rule_1_0= ruleMemoRule ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) ) )
            {
            // InternalQADocker.g:5884:2: ( (otherlv_0= 'memo' ( (lv_rule_1_0= ruleMemoRule ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) | ( ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==110) ) {
                alt72=1;
            }
            else if ( (LA72_0==71) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalQADocker.g:5885:3: (otherlv_0= 'memo' ( (lv_rule_1_0= ruleMemoRule ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalQADocker.g:5885:3: (otherlv_0= 'memo' ( (lv_rule_1_0= ruleMemoRule ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
                    // InternalQADocker.g:5886:4: otherlv_0= 'memo' ( (lv_rule_1_0= ruleMemoRule ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,110,FOLLOW_78); 

                    				newLeafNode(otherlv_0, grammarAccess.getMemoOperationAccess().getMemoKeyword_0_0());
                    			
                    // InternalQADocker.g:5890:4: ( (lv_rule_1_0= ruleMemoRule ) )
                    // InternalQADocker.g:5891:5: (lv_rule_1_0= ruleMemoRule )
                    {
                    // InternalQADocker.g:5891:5: (lv_rule_1_0= ruleMemoRule )
                    // InternalQADocker.g:5892:6: lv_rule_1_0= ruleMemoRule
                    {

                    						newCompositeNode(grammarAccess.getMemoOperationAccess().getRuleMemoRuleParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_rule_1_0=ruleMemoRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemoOperationRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_1_0,
                    							"xtext.qactor.QADocker.MemoRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,108,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMemoOperationAccess().getForKeyword_0_2());
                    			
                    // InternalQADocker.g:5913:4: ( (otherlv_3= RULE_ID ) )
                    // InternalQADocker.g:5914:5: (otherlv_3= RULE_ID )
                    {
                    // InternalQADocker.g:5914:5: (otherlv_3= RULE_ID )
                    // InternalQADocker.g:5915:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemoOperationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getMemoOperationAccess().getActorQActorCrossReference_0_3_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:5928:3: ( ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalQADocker.g:5928:3: ( ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) ) )
                    // InternalQADocker.g:5929:4: ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) ) otherlv_5= 'for' ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalQADocker.g:5929:4: ( (lv_doMemo_4_0= ruleMemoCurrentEvent ) )
                    // InternalQADocker.g:5930:5: (lv_doMemo_4_0= ruleMemoCurrentEvent )
                    {
                    // InternalQADocker.g:5930:5: (lv_doMemo_4_0= ruleMemoCurrentEvent )
                    // InternalQADocker.g:5931:6: lv_doMemo_4_0= ruleMemoCurrentEvent
                    {

                    						newCompositeNode(grammarAccess.getMemoOperationAccess().getDoMemoMemoCurrentEventParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_doMemo_4_0=ruleMemoCurrentEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemoOperationRule());
                    						}
                    						set(
                    							current,
                    							"doMemo",
                    							lv_doMemo_4_0,
                    							"xtext.qactor.QADocker.MemoCurrentEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,108,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMemoOperationAccess().getForKeyword_1_1());
                    			
                    // InternalQADocker.g:5952:4: ( (otherlv_6= RULE_ID ) )
                    // InternalQADocker.g:5953:5: (otherlv_6= RULE_ID )
                    {
                    // InternalQADocker.g:5953:5: (otherlv_6= RULE_ID )
                    // InternalQADocker.g:5954:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemoOperationRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getMemoOperationAccess().getActorQActorCrossReference_1_2_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleMemoOperation"


    // $ANTLR start "entryRuleSolveOperation"
    // InternalQADocker.g:5970:1: entryRuleSolveOperation returns [EObject current=null] : iv_ruleSolveOperation= ruleSolveOperation EOF ;
    public final EObject entryRuleSolveOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolveOperation = null;


        try {
            // InternalQADocker.g:5970:55: (iv_ruleSolveOperation= ruleSolveOperation EOF )
            // InternalQADocker.g:5971:2: iv_ruleSolveOperation= ruleSolveOperation EOF
            {
             newCompositeNode(grammarAccess.getSolveOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolveOperation=ruleSolveOperation();

            state._fsp--;

             current =iv_ruleSolveOperation; 
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
    // $ANTLR end "entryRuleSolveOperation"


    // $ANTLR start "ruleSolveOperation"
    // InternalQADocker.g:5977:1: ruleSolveOperation returns [EObject current=null] : (otherlv_0= 'solve' ( (lv_goal_1_0= rulePTerm ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSolveOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_goal_1_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:5983:2: ( (otherlv_0= 'solve' ( (lv_goal_1_0= rulePTerm ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalQADocker.g:5984:2: (otherlv_0= 'solve' ( (lv_goal_1_0= rulePTerm ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalQADocker.g:5984:2: (otherlv_0= 'solve' ( (lv_goal_1_0= rulePTerm ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // InternalQADocker.g:5985:3: otherlv_0= 'solve' ( (lv_goal_1_0= rulePTerm ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getSolveOperationAccess().getSolveKeyword_0());
            		
            // InternalQADocker.g:5989:3: ( (lv_goal_1_0= rulePTerm ) )
            // InternalQADocker.g:5990:4: (lv_goal_1_0= rulePTerm )
            {
            // InternalQADocker.g:5990:4: (lv_goal_1_0= rulePTerm )
            // InternalQADocker.g:5991:5: lv_goal_1_0= rulePTerm
            {

            					newCompositeNode(grammarAccess.getSolveOperationAccess().getGoalPTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_79);
            lv_goal_1_0=rulePTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolveOperationRule());
            					}
            					set(
            						current,
            						"goal",
            						lv_goal_1_0,
            						"xtext.qactor.QADocker.PTerm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,108,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSolveOperationAccess().getForKeyword_2());
            		
            // InternalQADocker.g:6012:3: ( (otherlv_3= RULE_ID ) )
            // InternalQADocker.g:6013:4: (otherlv_3= RULE_ID )
            {
            // InternalQADocker.g:6013:4: (otherlv_3= RULE_ID )
            // InternalQADocker.g:6014:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSolveOperationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getSolveOperationAccess().getActorQActorCrossReference_3_0());
            				

            }


            }


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
    // $ANTLR end "ruleSolveOperation"


    // $ANTLR start "entryRuleSendEventAsDispatch"
    // InternalQADocker.g:6029:1: entryRuleSendEventAsDispatch returns [EObject current=null] : iv_ruleSendEventAsDispatch= ruleSendEventAsDispatch EOF ;
    public final EObject entryRuleSendEventAsDispatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendEventAsDispatch = null;


        try {
            // InternalQADocker.g:6029:60: (iv_ruleSendEventAsDispatch= ruleSendEventAsDispatch EOF )
            // InternalQADocker.g:6030:2: iv_ruleSendEventAsDispatch= ruleSendEventAsDispatch EOF
            {
             newCompositeNode(grammarAccess.getSendEventAsDispatchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendEventAsDispatch=ruleSendEventAsDispatch();

            state._fsp--;

             current =iv_ruleSendEventAsDispatch; 
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
    // $ANTLR end "entryRuleSendEventAsDispatch"


    // $ANTLR start "ruleSendEventAsDispatch"
    // InternalQADocker.g:6036:1: ruleSendEventAsDispatch returns [EObject current=null] : (otherlv_0= 'forwardEvent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSendEventAsDispatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQADocker.g:6042:2: ( (otherlv_0= 'forwardEvent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalQADocker.g:6043:2: (otherlv_0= 'forwardEvent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalQADocker.g:6043:2: (otherlv_0= 'forwardEvent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) ) )
            // InternalQADocker.g:6044:3: otherlv_0= 'forwardEvent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '-m' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSendEventAsDispatchAccess().getForwardEventKeyword_0());
            		
            // InternalQADocker.g:6048:3: ( (otherlv_1= RULE_ID ) )
            // InternalQADocker.g:6049:4: (otherlv_1= RULE_ID )
            {
            // InternalQADocker.g:6049:4: (otherlv_1= RULE_ID )
            // InternalQADocker.g:6050:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendEventAsDispatchRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(otherlv_1, grammarAccess.getSendEventAsDispatchAccess().getActorQActorCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSendEventAsDispatchAccess().getMKeyword_2());
            		
            // InternalQADocker.g:6065:3: ( (otherlv_3= RULE_ID ) )
            // InternalQADocker.g:6066:4: (otherlv_3= RULE_ID )
            {
            // InternalQADocker.g:6066:4: (otherlv_3= RULE_ID )
            // InternalQADocker.g:6067:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendEventAsDispatchRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getSendEventAsDispatchAccess().getMsgrefMessageCrossReference_3_0());
            				

            }


            }


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
    // $ANTLR end "ruleSendEventAsDispatch"


    // $ANTLR start "entryRuleMemoRule"
    // InternalQADocker.g:6082:1: entryRuleMemoRule returns [EObject current=null] : iv_ruleMemoRule= ruleMemoRule EOF ;
    public final EObject entryRuleMemoRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoRule = null;


        try {
            // InternalQADocker.g:6082:49: (iv_ruleMemoRule= ruleMemoRule EOF )
            // InternalQADocker.g:6083:2: iv_ruleMemoRule= ruleMemoRule EOF
            {
             newCompositeNode(grammarAccess.getMemoRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoRule=ruleMemoRule();

            state._fsp--;

             current =iv_ruleMemoRule; 
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
    // $ANTLR end "entryRuleMemoRule"


    // $ANTLR start "ruleMemoRule"
    // InternalQADocker.g:6089:1: ruleMemoRule returns [EObject current=null] : this_MemoEvent_0= ruleMemoEvent ;
    public final EObject ruleMemoRule() throws RecognitionException {
        EObject current = null;

        EObject this_MemoEvent_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6095:2: (this_MemoEvent_0= ruleMemoEvent )
            // InternalQADocker.g:6096:2: this_MemoEvent_0= ruleMemoEvent
            {

            		newCompositeNode(grammarAccess.getMemoRuleAccess().getMemoEventParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MemoEvent_0=ruleMemoEvent();

            state._fsp--;


            		current = this_MemoEvent_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleMemoRule"


    // $ANTLR start "entryRuleMemoEvent"
    // InternalQADocker.g:6107:1: entryRuleMemoEvent returns [EObject current=null] : iv_ruleMemoEvent= ruleMemoEvent EOF ;
    public final EObject entryRuleMemoEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoEvent = null;


        try {
            // InternalQADocker.g:6107:50: (iv_ruleMemoEvent= ruleMemoEvent EOF )
            // InternalQADocker.g:6108:2: iv_ruleMemoEvent= ruleMemoEvent EOF
            {
             newCompositeNode(grammarAccess.getMemoEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoEvent=ruleMemoEvent();

            state._fsp--;

             current =iv_ruleMemoEvent; 
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
    // $ANTLR end "entryRuleMemoEvent"


    // $ANTLR start "ruleMemoEvent"
    // InternalQADocker.g:6114:1: ruleMemoEvent returns [EObject current=null] : ( () otherlv_1= 'currentEvent' ) ;
    public final EObject ruleMemoEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQADocker.g:6120:2: ( ( () otherlv_1= 'currentEvent' ) )
            // InternalQADocker.g:6121:2: ( () otherlv_1= 'currentEvent' )
            {
            // InternalQADocker.g:6121:2: ( () otherlv_1= 'currentEvent' )
            // InternalQADocker.g:6122:3: () otherlv_1= 'currentEvent'
            {
            // InternalQADocker.g:6122:3: ()
            // InternalQADocker.g:6123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoEventAccess().getMemoEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMemoEventAccess().getCurrentEventKeyword_1());
            		

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
    // $ANTLR end "ruleMemoEvent"


    // $ANTLR start "entryRuleReaction"
    // InternalQADocker.g:6137:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // InternalQADocker.g:6137:49: (iv_ruleReaction= ruleReaction EOF )
            // InternalQADocker.g:6138:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalQADocker.g:6144:1: ruleReaction returns [EObject current=null] : ( () otherlv_1= 'react' ( (lv_alarms_2_0= ruleAlarmEvent ) ) (otherlv_3= 'or' ( (lv_alarms_4_0= ruleAlarmEvent ) ) )* ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_alarms_2_0 = null;

        EObject lv_alarms_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6150:2: ( ( () otherlv_1= 'react' ( (lv_alarms_2_0= ruleAlarmEvent ) ) (otherlv_3= 'or' ( (lv_alarms_4_0= ruleAlarmEvent ) ) )* ) )
            // InternalQADocker.g:6151:2: ( () otherlv_1= 'react' ( (lv_alarms_2_0= ruleAlarmEvent ) ) (otherlv_3= 'or' ( (lv_alarms_4_0= ruleAlarmEvent ) ) )* )
            {
            // InternalQADocker.g:6151:2: ( () otherlv_1= 'react' ( (lv_alarms_2_0= ruleAlarmEvent ) ) (otherlv_3= 'or' ( (lv_alarms_4_0= ruleAlarmEvent ) ) )* )
            // InternalQADocker.g:6152:3: () otherlv_1= 'react' ( (lv_alarms_2_0= ruleAlarmEvent ) ) (otherlv_3= 'or' ( (lv_alarms_4_0= ruleAlarmEvent ) ) )*
            {
            // InternalQADocker.g:6152:3: ()
            // InternalQADocker.g:6153:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReactionAccess().getReactionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getReactionAccess().getReactKeyword_1());
            		
            // InternalQADocker.g:6163:3: ( (lv_alarms_2_0= ruleAlarmEvent ) )
            // InternalQADocker.g:6164:4: (lv_alarms_2_0= ruleAlarmEvent )
            {
            // InternalQADocker.g:6164:4: (lv_alarms_2_0= ruleAlarmEvent )
            // InternalQADocker.g:6165:5: lv_alarms_2_0= ruleAlarmEvent
            {

            					newCompositeNode(grammarAccess.getReactionAccess().getAlarmsAlarmEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_81);
            lv_alarms_2_0=ruleAlarmEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactionRule());
            					}
            					add(
            						current,
            						"alarms",
            						lv_alarms_2_0,
            						"xtext.qactor.QADocker.AlarmEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQADocker.g:6182:3: (otherlv_3= 'or' ( (lv_alarms_4_0= ruleAlarmEvent ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==114) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalQADocker.g:6183:4: otherlv_3= 'or' ( (lv_alarms_4_0= ruleAlarmEvent ) )
            	    {
            	    otherlv_3=(Token)match(input,114,FOLLOW_80); 

            	    				newLeafNode(otherlv_3, grammarAccess.getReactionAccess().getOrKeyword_3_0());
            	    			
            	    // InternalQADocker.g:6187:4: ( (lv_alarms_4_0= ruleAlarmEvent ) )
            	    // InternalQADocker.g:6188:5: (lv_alarms_4_0= ruleAlarmEvent )
            	    {
            	    // InternalQADocker.g:6188:5: (lv_alarms_4_0= ruleAlarmEvent )
            	    // InternalQADocker.g:6189:6: lv_alarms_4_0= ruleAlarmEvent
            	    {

            	    						newCompositeNode(grammarAccess.getReactionAccess().getAlarmsAlarmEventParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_alarms_4_0=ruleAlarmEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getReactionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"alarms",
            	    							lv_alarms_4_0,
            	    							"xtext.qactor.QADocker.AlarmEvent");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleAlarmEvent"
    // InternalQADocker.g:6211:1: entryRuleAlarmEvent returns [EObject current=null] : iv_ruleAlarmEvent= ruleAlarmEvent EOF ;
    public final EObject entryRuleAlarmEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmEvent = null;


        try {
            // InternalQADocker.g:6211:51: (iv_ruleAlarmEvent= ruleAlarmEvent EOF )
            // InternalQADocker.g:6212:2: iv_ruleAlarmEvent= ruleAlarmEvent EOF
            {
             newCompositeNode(grammarAccess.getAlarmEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmEvent=ruleAlarmEvent();

            state._fsp--;

             current =iv_ruleAlarmEvent; 
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
    // $ANTLR end "entryRuleAlarmEvent"


    // $ANTLR start "ruleAlarmEvent"
    // InternalQADocker.g:6218:1: ruleAlarmEvent returns [EObject current=null] : (this_NormalEvent_0= ruleNormalEvent | this_ContinueEvent_1= ruleContinueEvent ) ;
    public final EObject ruleAlarmEvent() throws RecognitionException {
        EObject current = null;

        EObject this_NormalEvent_0 = null;

        EObject this_ContinueEvent_1 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6224:2: ( (this_NormalEvent_0= ruleNormalEvent | this_ContinueEvent_1= ruleContinueEvent ) )
            // InternalQADocker.g:6225:2: (this_NormalEvent_0= ruleNormalEvent | this_ContinueEvent_1= ruleContinueEvent )
            {
            // InternalQADocker.g:6225:2: (this_NormalEvent_0= ruleNormalEvent | this_ContinueEvent_1= ruleContinueEvent )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==115) ) {
                alt74=1;
            }
            else if ( (LA74_0==116) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalQADocker.g:6226:3: this_NormalEvent_0= ruleNormalEvent
                    {

                    			newCompositeNode(grammarAccess.getAlarmEventAccess().getNormalEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NormalEvent_0=ruleNormalEvent();

                    state._fsp--;


                    			current = this_NormalEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQADocker.g:6235:3: this_ContinueEvent_1= ruleContinueEvent
                    {

                    			newCompositeNode(grammarAccess.getAlarmEventAccess().getContinueEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContinueEvent_1=ruleContinueEvent();

                    state._fsp--;


                    			current = this_ContinueEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAlarmEvent"


    // $ANTLR start "entryRuleNormalEvent"
    // InternalQADocker.g:6247:1: entryRuleNormalEvent returns [EObject current=null] : iv_ruleNormalEvent= ruleNormalEvent EOF ;
    public final EObject entryRuleNormalEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalEvent = null;


        try {
            // InternalQADocker.g:6247:52: (iv_ruleNormalEvent= ruleNormalEvent EOF )
            // InternalQADocker.g:6248:2: iv_ruleNormalEvent= ruleNormalEvent EOF
            {
             newCompositeNode(grammarAccess.getNormalEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalEvent=ruleNormalEvent();

            state._fsp--;

             current =iv_ruleNormalEvent; 
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
    // $ANTLR end "entryRuleNormalEvent"


    // $ANTLR start "ruleNormalEvent"
    // InternalQADocker.g:6254:1: ruleNormalEvent returns [EObject current=null] : ( () otherlv_1= 'event' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleNormalEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQADocker.g:6260:2: ( ( () otherlv_1= 'event' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalQADocker.g:6261:2: ( () otherlv_1= 'event' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalQADocker.g:6261:2: ( () otherlv_1= 'event' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalQADocker.g:6262:3: () otherlv_1= 'event' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            // InternalQADocker.g:6262:3: ()
            // InternalQADocker.g:6263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalEventAccess().getNormalEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,115,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalEventAccess().getEventKeyword_1());
            		
            // InternalQADocker.g:6273:3: ( (otherlv_2= RULE_ID ) )
            // InternalQADocker.g:6274:4: (otherlv_2= RULE_ID )
            {
            // InternalQADocker.g:6274:4: (otherlv_2= RULE_ID )
            // InternalQADocker.g:6275:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalEventRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_70); 

            					newLeafNode(otherlv_2, grammarAccess.getNormalEventAccess().getEvEventCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,96,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getNormalEventAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalQADocker.g:6290:3: ( (otherlv_4= RULE_ID ) )
            // InternalQADocker.g:6291:4: (otherlv_4= RULE_ID )
            {
            // InternalQADocker.g:6291:4: (otherlv_4= RULE_ID )
            // InternalQADocker.g:6292:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNormalEventRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getNormalEventAccess().getPlanRefPlanCrossReference_4_0());
            				

            }


            }


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
    // $ANTLR end "ruleNormalEvent"


    // $ANTLR start "entryRuleContinueEvent"
    // InternalQADocker.g:6307:1: entryRuleContinueEvent returns [EObject current=null] : iv_ruleContinueEvent= ruleContinueEvent EOF ;
    public final EObject entryRuleContinueEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinueEvent = null;


        try {
            // InternalQADocker.g:6307:54: (iv_ruleContinueEvent= ruleContinueEvent EOF )
            // InternalQADocker.g:6308:2: iv_ruleContinueEvent= ruleContinueEvent EOF
            {
             newCompositeNode(grammarAccess.getContinueEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinueEvent=ruleContinueEvent();

            state._fsp--;

             current =iv_ruleContinueEvent; 
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
    // $ANTLR end "entryRuleContinueEvent"


    // $ANTLR start "ruleContinueEvent"
    // InternalQADocker.g:6314:1: ruleContinueEvent returns [EObject current=null] : ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleContinueEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQADocker.g:6320:2: ( ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalQADocker.g:6321:2: ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalQADocker.g:6321:2: ( () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) ) )
            // InternalQADocker.g:6322:3: () otherlv_1= 'when' ( (otherlv_2= RULE_ID ) )
            {
            // InternalQADocker.g:6322:3: ()
            // InternalQADocker.g:6323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContinueEventAccess().getContinueEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContinueEventAccess().getWhenKeyword_1());
            		
            // InternalQADocker.g:6333:3: ( (otherlv_2= RULE_ID ) )
            // InternalQADocker.g:6334:4: (otherlv_2= RULE_ID )
            {
            // InternalQADocker.g:6334:4: (otherlv_2= RULE_ID )
            // InternalQADocker.g:6335:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContinueEventRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getContinueEventAccess().getEvOccurEventCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleContinueEvent"


    // $ANTLR start "entryRuleVarOrQactor"
    // InternalQADocker.g:6350:1: entryRuleVarOrQactor returns [EObject current=null] : iv_ruleVarOrQactor= ruleVarOrQactor EOF ;
    public final EObject entryRuleVarOrQactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarOrQactor = null;


        try {
            // InternalQADocker.g:6350:52: (iv_ruleVarOrQactor= ruleVarOrQactor EOF )
            // InternalQADocker.g:6351:2: iv_ruleVarOrQactor= ruleVarOrQactor EOF
            {
             newCompositeNode(grammarAccess.getVarOrQactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarOrQactor=ruleVarOrQactor();

            state._fsp--;

             current =iv_ruleVarOrQactor; 
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
    // $ANTLR end "entryRuleVarOrQactor"


    // $ANTLR start "ruleVarOrQactor"
    // InternalQADocker.g:6357:1: ruleVarOrQactor returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVarOrQactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6363:2: ( ( ( (lv_var_0_0= ruleVariable ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalQADocker.g:6364:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalQADocker.g:6364:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_VARID) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalQADocker.g:6365:3: ( (lv_var_0_0= ruleVariable ) )
                    {
                    // InternalQADocker.g:6365:3: ( (lv_var_0_0= ruleVariable ) )
                    // InternalQADocker.g:6366:4: (lv_var_0_0= ruleVariable )
                    {
                    // InternalQADocker.g:6366:4: (lv_var_0_0= ruleVariable )
                    // InternalQADocker.g:6367:5: lv_var_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getVarOrQactorAccess().getVarVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarOrQactorRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"xtext.qactor.QADocker.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:6385:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalQADocker.g:6385:3: ( (otherlv_1= RULE_ID ) )
                    // InternalQADocker.g:6386:4: (otherlv_1= RULE_ID )
                    {
                    // InternalQADocker.g:6386:4: (otherlv_1= RULE_ID )
                    // InternalQADocker.g:6387:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVarOrQactorRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getVarOrQactorAccess().getDestQActorCrossReference_1_0());
                    				

                    }


                    }


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
    // $ANTLR end "ruleVarOrQactor"


    // $ANTLR start "entryRuleVarOrInt"
    // InternalQADocker.g:6402:1: entryRuleVarOrInt returns [EObject current=null] : iv_ruleVarOrInt= ruleVarOrInt EOF ;
    public final EObject entryRuleVarOrInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarOrInt = null;


        try {
            // InternalQADocker.g:6402:49: (iv_ruleVarOrInt= ruleVarOrInt EOF )
            // InternalQADocker.g:6403:2: iv_ruleVarOrInt= ruleVarOrInt EOF
            {
             newCompositeNode(grammarAccess.getVarOrIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarOrInt=ruleVarOrInt();

            state._fsp--;

             current =iv_ruleVarOrInt; 
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
    // $ANTLR end "entryRuleVarOrInt"


    // $ANTLR start "ruleVarOrInt"
    // InternalQADocker.g:6409:1: ruleVarOrInt returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_INT ) ) ) ;
    public final EObject ruleVarOrInt() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6415:2: ( ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_INT ) ) ) )
            // InternalQADocker.g:6416:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_INT ) ) )
            {
            // InternalQADocker.g:6416:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_INT ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_VARID) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_INT) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalQADocker.g:6417:3: ( (lv_var_0_0= ruleVariable ) )
                    {
                    // InternalQADocker.g:6417:3: ( (lv_var_0_0= ruleVariable ) )
                    // InternalQADocker.g:6418:4: (lv_var_0_0= ruleVariable )
                    {
                    // InternalQADocker.g:6418:4: (lv_var_0_0= ruleVariable )
                    // InternalQADocker.g:6419:5: lv_var_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getVarOrIntAccess().getVarVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarOrIntRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"xtext.qactor.QADocker.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:6437:3: ( (lv_const_1_0= RULE_INT ) )
                    {
                    // InternalQADocker.g:6437:3: ( (lv_const_1_0= RULE_INT ) )
                    // InternalQADocker.g:6438:4: (lv_const_1_0= RULE_INT )
                    {
                    // InternalQADocker.g:6438:4: (lv_const_1_0= RULE_INT )
                    // InternalQADocker.g:6439:5: lv_const_1_0= RULE_INT
                    {
                    lv_const_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_const_1_0, grammarAccess.getVarOrIntAccess().getConstINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVarOrIntRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"const",
                    						lv_const_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


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
    // $ANTLR end "ruleVarOrInt"


    // $ANTLR start "entryRuleVarOrAtomic"
    // InternalQADocker.g:6459:1: entryRuleVarOrAtomic returns [EObject current=null] : iv_ruleVarOrAtomic= ruleVarOrAtomic EOF ;
    public final EObject entryRuleVarOrAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarOrAtomic = null;


        try {
            // InternalQADocker.g:6459:52: (iv_ruleVarOrAtomic= ruleVarOrAtomic EOF )
            // InternalQADocker.g:6460:2: iv_ruleVarOrAtomic= ruleVarOrAtomic EOF
            {
             newCompositeNode(grammarAccess.getVarOrAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarOrAtomic=ruleVarOrAtomic();

            state._fsp--;

             current =iv_ruleVarOrAtomic; 
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
    // $ANTLR end "entryRuleVarOrAtomic"


    // $ANTLR start "ruleVarOrAtomic"
    // InternalQADocker.g:6466:1: ruleVarOrAtomic returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= rulePAtomic ) ) ) ;
    public final EObject ruleVarOrAtomic() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_const_1_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6472:2: ( ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= rulePAtomic ) ) ) )
            // InternalQADocker.g:6473:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= rulePAtomic ) ) )
            {
            // InternalQADocker.g:6473:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= rulePAtomic ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_VARID) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_ID) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalQADocker.g:6474:3: ( (lv_var_0_0= ruleVariable ) )
                    {
                    // InternalQADocker.g:6474:3: ( (lv_var_0_0= ruleVariable ) )
                    // InternalQADocker.g:6475:4: (lv_var_0_0= ruleVariable )
                    {
                    // InternalQADocker.g:6475:4: (lv_var_0_0= ruleVariable )
                    // InternalQADocker.g:6476:5: lv_var_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getVarOrAtomicAccess().getVarVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarOrAtomicRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"xtext.qactor.QADocker.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:6494:3: ( (lv_const_1_0= rulePAtomic ) )
                    {
                    // InternalQADocker.g:6494:3: ( (lv_const_1_0= rulePAtomic ) )
                    // InternalQADocker.g:6495:4: (lv_const_1_0= rulePAtomic )
                    {
                    // InternalQADocker.g:6495:4: (lv_const_1_0= rulePAtomic )
                    // InternalQADocker.g:6496:5: lv_const_1_0= rulePAtomic
                    {

                    					newCompositeNode(grammarAccess.getVarOrAtomicAccess().getConstPAtomicParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_const_1_0=rulePAtomic();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarOrAtomicRule());
                    					}
                    					set(
                    						current,
                    						"const",
                    						lv_const_1_0,
                    						"xtext.qactor.QADocker.PAtomic");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleVarOrAtomic"


    // $ANTLR start "entryRuleVarOrString"
    // InternalQADocker.g:6517:1: entryRuleVarOrString returns [EObject current=null] : iv_ruleVarOrString= ruleVarOrString EOF ;
    public final EObject entryRuleVarOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarOrString = null;


        try {
            // InternalQADocker.g:6517:52: (iv_ruleVarOrString= ruleVarOrString EOF )
            // InternalQADocker.g:6518:2: iv_ruleVarOrString= ruleVarOrString EOF
            {
             newCompositeNode(grammarAccess.getVarOrStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarOrString=ruleVarOrString();

            state._fsp--;

             current =iv_ruleVarOrString; 
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
    // $ANTLR end "entryRuleVarOrString"


    // $ANTLR start "ruleVarOrString"
    // InternalQADocker.g:6524:1: ruleVarOrString returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVarOrString() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        EObject lv_var_0_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6530:2: ( ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_STRING ) ) ) )
            // InternalQADocker.g:6531:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_STRING ) ) )
            {
            // InternalQADocker.g:6531:2: ( ( (lv_var_0_0= ruleVariable ) ) | ( (lv_const_1_0= RULE_STRING ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_VARID) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_STRING) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalQADocker.g:6532:3: ( (lv_var_0_0= ruleVariable ) )
                    {
                    // InternalQADocker.g:6532:3: ( (lv_var_0_0= ruleVariable ) )
                    // InternalQADocker.g:6533:4: (lv_var_0_0= ruleVariable )
                    {
                    // InternalQADocker.g:6533:4: (lv_var_0_0= ruleVariable )
                    // InternalQADocker.g:6534:5: lv_var_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getVarOrStringAccess().getVarVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarOrStringRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_0_0,
                    						"xtext.qactor.QADocker.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:6552:3: ( (lv_const_1_0= RULE_STRING ) )
                    {
                    // InternalQADocker.g:6552:3: ( (lv_const_1_0= RULE_STRING ) )
                    // InternalQADocker.g:6553:4: (lv_const_1_0= RULE_STRING )
                    {
                    // InternalQADocker.g:6553:4: (lv_const_1_0= RULE_STRING )
                    // InternalQADocker.g:6554:5: lv_const_1_0= RULE_STRING
                    {
                    lv_const_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_const_1_0, grammarAccess.getVarOrStringAccess().getConstSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVarOrStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"const",
                    						lv_const_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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
    // $ANTLR end "ruleVarOrString"


    // $ANTLR start "entryRuleVariable"
    // InternalQADocker.g:6574:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalQADocker.g:6574:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalQADocker.g:6575:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalQADocker.g:6581:1: ruleVariable returns [EObject current=null] : ( () ( (lv_varName_1_0= RULE_VARID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_varName_1_0=null;


        	enterRule();

        try {
            // InternalQADocker.g:6587:2: ( ( () ( (lv_varName_1_0= RULE_VARID ) ) ) )
            // InternalQADocker.g:6588:2: ( () ( (lv_varName_1_0= RULE_VARID ) ) )
            {
            // InternalQADocker.g:6588:2: ( () ( (lv_varName_1_0= RULE_VARID ) ) )
            // InternalQADocker.g:6589:3: () ( (lv_varName_1_0= RULE_VARID ) )
            {
            // InternalQADocker.g:6589:3: ()
            // InternalQADocker.g:6590:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalQADocker.g:6596:3: ( (lv_varName_1_0= RULE_VARID ) )
            // InternalQADocker.g:6597:4: (lv_varName_1_0= RULE_VARID )
            {
            // InternalQADocker.g:6597:4: (lv_varName_1_0= RULE_VARID )
            // InternalQADocker.g:6598:5: lv_varName_1_0= RULE_VARID
            {
            lv_varName_1_0=(Token)match(input,RULE_VARID,FOLLOW_2); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getVariableAccess().getVarNameVARIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"xtext.qactor.QADocker.VARID");
            				

            }


            }


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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTimeLimit"
    // InternalQADocker.g:6618:1: entryRuleTimeLimit returns [EObject current=null] : iv_ruleTimeLimit= ruleTimeLimit EOF ;
    public final EObject entryRuleTimeLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLimit = null;


        try {
            // InternalQADocker.g:6618:50: (iv_ruleTimeLimit= ruleTimeLimit EOF )
            // InternalQADocker.g:6619:2: iv_ruleTimeLimit= ruleTimeLimit EOF
            {
             newCompositeNode(grammarAccess.getTimeLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeLimit=ruleTimeLimit();

            state._fsp--;

             current =iv_ruleTimeLimit; 
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
    // $ANTLR end "entryRuleTimeLimit"


    // $ANTLR start "ruleTimeLimit"
    // InternalQADocker.g:6625:1: ruleTimeLimit returns [EObject current=null] : ( () otherlv_1= 'time' otherlv_2= '(' ( ( (lv_msec_3_0= RULE_INT ) ) | ( (lv_var_4_0= ruleVariable ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleTimeLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_msec_3_0=null;
        Token otherlv_5=null;
        EObject lv_var_4_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6631:2: ( ( () otherlv_1= 'time' otherlv_2= '(' ( ( (lv_msec_3_0= RULE_INT ) ) | ( (lv_var_4_0= ruleVariable ) ) ) otherlv_5= ')' ) )
            // InternalQADocker.g:6632:2: ( () otherlv_1= 'time' otherlv_2= '(' ( ( (lv_msec_3_0= RULE_INT ) ) | ( (lv_var_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            {
            // InternalQADocker.g:6632:2: ( () otherlv_1= 'time' otherlv_2= '(' ( ( (lv_msec_3_0= RULE_INT ) ) | ( (lv_var_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            // InternalQADocker.g:6633:3: () otherlv_1= 'time' otherlv_2= '(' ( ( (lv_msec_3_0= RULE_INT ) ) | ( (lv_var_4_0= ruleVariable ) ) ) otherlv_5= ')'
            {
            // InternalQADocker.g:6633:3: ()
            // InternalQADocker.g:6634:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeLimitAccess().getTimeLimitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,117,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeLimitAccess().getTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_82); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeLimitAccess().getLeftParenthesisKeyword_2());
            		
            // InternalQADocker.g:6648:3: ( ( (lv_msec_3_0= RULE_INT ) ) | ( (lv_var_4_0= ruleVariable ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_VARID) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalQADocker.g:6649:4: ( (lv_msec_3_0= RULE_INT ) )
                    {
                    // InternalQADocker.g:6649:4: ( (lv_msec_3_0= RULE_INT ) )
                    // InternalQADocker.g:6650:5: (lv_msec_3_0= RULE_INT )
                    {
                    // InternalQADocker.g:6650:5: (lv_msec_3_0= RULE_INT )
                    // InternalQADocker.g:6651:6: lv_msec_3_0= RULE_INT
                    {
                    lv_msec_3_0=(Token)match(input,RULE_INT,FOLLOW_42); 

                    						newLeafNode(lv_msec_3_0, grammarAccess.getTimeLimitAccess().getMsecINTTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msec",
                    							lv_msec_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:6668:4: ( (lv_var_4_0= ruleVariable ) )
                    {
                    // InternalQADocker.g:6668:4: ( (lv_var_4_0= ruleVariable ) )
                    // InternalQADocker.g:6669:5: (lv_var_4_0= ruleVariable )
                    {
                    // InternalQADocker.g:6669:5: (lv_var_4_0= ruleVariable )
                    // InternalQADocker.g:6670:6: lv_var_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getTimeLimitAccess().getVarVariableParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_var_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeLimitRule());
                    						}
                    						set(
                    							current,
                    							"var",
                    							lv_var_4_0,
                    							"xtext.qactor.QADocker.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeLimitAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleTimeLimit"


    // $ANTLR start "entryRuleComponentIP"
    // InternalQADocker.g:6696:1: entryRuleComponentIP returns [EObject current=null] : iv_ruleComponentIP= ruleComponentIP EOF ;
    public final EObject entryRuleComponentIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentIP = null;


        try {
            // InternalQADocker.g:6696:52: (iv_ruleComponentIP= ruleComponentIP EOF )
            // InternalQADocker.g:6697:2: iv_ruleComponentIP= ruleComponentIP EOF
            {
             newCompositeNode(grammarAccess.getComponentIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentIP=ruleComponentIP();

            state._fsp--;

             current =iv_ruleComponentIP; 
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
    // $ANTLR end "entryRuleComponentIP"


    // $ANTLR start "ruleComponentIP"
    // InternalQADocker.g:6703:1: ruleComponentIP returns [EObject current=null] : ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' ) ;
    public final EObject ruleComponentIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_host_3_0=null;
        Token otherlv_4=null;
        Token lv_port_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalQADocker.g:6709:2: ( ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' ) )
            // InternalQADocker.g:6710:2: ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' )
            {
            // InternalQADocker.g:6710:2: ( () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']' )
            // InternalQADocker.g:6711:3: () otherlv_1= '[' otherlv_2= 'host=' ( (lv_host_3_0= RULE_STRING ) ) otherlv_4= 'port=' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= ']'
            {
            // InternalQADocker.g:6711:3: ()
            // InternalQADocker.g:6712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentIPAccess().getComponentIPAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentIPAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,118,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentIPAccess().getHostKeyword_2());
            		
            // InternalQADocker.g:6726:3: ( (lv_host_3_0= RULE_STRING ) )
            // InternalQADocker.g:6727:4: (lv_host_3_0= RULE_STRING )
            {
            // InternalQADocker.g:6727:4: (lv_host_3_0= RULE_STRING )
            // InternalQADocker.g:6728:5: lv_host_3_0= RULE_STRING
            {
            lv_host_3_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

            					newLeafNode(lv_host_3_0, grammarAccess.getComponentIPAccess().getHostSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"host",
            						lv_host_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,119,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentIPAccess().getPortKeyword_4());
            		
            // InternalQADocker.g:6748:3: ( (lv_port_5_0= RULE_INT ) )
            // InternalQADocker.g:6749:4: (lv_port_5_0= RULE_INT )
            {
            // InternalQADocker.g:6749:4: (lv_port_5_0= RULE_INT )
            // InternalQADocker.g:6750:5: lv_port_5_0= RULE_INT
            {
            lv_port_5_0=(Token)match(input,RULE_INT,FOLLOW_51); 

            					newLeafNode(lv_port_5_0, grammarAccess.getComponentIPAccess().getPortINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentIPAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleComponentIP"


    // $ANTLR start "entryRuleMoveFile"
    // InternalQADocker.g:6774:1: entryRuleMoveFile returns [EObject current=null] : iv_ruleMoveFile= ruleMoveFile EOF ;
    public final EObject entryRuleMoveFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveFile = null;


        try {
            // InternalQADocker.g:6774:49: (iv_ruleMoveFile= ruleMoveFile EOF )
            // InternalQADocker.g:6775:2: iv_ruleMoveFile= ruleMoveFile EOF
            {
             newCompositeNode(grammarAccess.getMoveFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveFile=ruleMoveFile();

            state._fsp--;

             current =iv_ruleMoveFile; 
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
    // $ANTLR end "entryRuleMoveFile"


    // $ANTLR start "ruleMoveFile"
    // InternalQADocker.g:6781:1: ruleMoveFile returns [EObject current=null] : ( () otherlv_1= 'file' otherlv_2= '(' ( (lv_fname_3_0= ruleVarOrString ) ) otherlv_4= ')' ) ;
    public final EObject ruleMoveFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fname_3_0 = null;



        	enterRule();

        try {
            // InternalQADocker.g:6787:2: ( ( () otherlv_1= 'file' otherlv_2= '(' ( (lv_fname_3_0= ruleVarOrString ) ) otherlv_4= ')' ) )
            // InternalQADocker.g:6788:2: ( () otherlv_1= 'file' otherlv_2= '(' ( (lv_fname_3_0= ruleVarOrString ) ) otherlv_4= ')' )
            {
            // InternalQADocker.g:6788:2: ( () otherlv_1= 'file' otherlv_2= '(' ( (lv_fname_3_0= ruleVarOrString ) ) otherlv_4= ')' )
            // InternalQADocker.g:6789:3: () otherlv_1= 'file' otherlv_2= '(' ( (lv_fname_3_0= ruleVarOrString ) ) otherlv_4= ')'
            {
            // InternalQADocker.g:6789:3: ()
            // InternalQADocker.g:6790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveFileAccess().getMoveFileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,120,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveFileAccess().getFileKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveFileAccess().getLeftParenthesisKeyword_2());
            		
            // InternalQADocker.g:6804:3: ( (lv_fname_3_0= ruleVarOrString ) )
            // InternalQADocker.g:6805:4: (lv_fname_3_0= ruleVarOrString )
            {
            // InternalQADocker.g:6805:4: (lv_fname_3_0= ruleVarOrString )
            // InternalQADocker.g:6806:5: lv_fname_3_0= ruleVarOrString
            {

            					newCompositeNode(grammarAccess.getMoveFileAccess().getFnameVarOrStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_fname_3_0=ruleVarOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveFileRule());
            					}
            					set(
            						current,
            						"fname",
            						lv_fname_3_0,
            						"xtext.qactor.QADocker.VarOrString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMoveFileAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMoveFile"


    // $ANTLR start "ruleWindowColor"
    // InternalQADocker.g:6831:1: ruleWindowColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'gray' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'cyan' ) ) ;
    public final Enumerator ruleWindowColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalQADocker.g:6837:2: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'gray' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'cyan' ) ) )
            // InternalQADocker.g:6838:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'gray' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'cyan' ) )
            {
            // InternalQADocker.g:6838:2: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'gray' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'yellow' ) | (enumLiteral_5= 'cyan' ) )
            int alt80=6;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt80=1;
                }
                break;
            case 122:
                {
                alt80=2;
                }
                break;
            case 123:
                {
                alt80=3;
                }
                break;
            case 124:
                {
                alt80=4;
                }
                break;
            case 125:
                {
                alt80=5;
                }
                break;
            case 126:
                {
                alt80=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalQADocker.g:6839:3: (enumLiteral_0= 'white' )
                    {
                    // InternalQADocker.g:6839:3: (enumLiteral_0= 'white' )
                    // InternalQADocker.g:6840:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getWindowColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWindowColorAccess().getWhiteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQADocker.g:6847:3: (enumLiteral_1= 'gray' )
                    {
                    // InternalQADocker.g:6847:3: (enumLiteral_1= 'gray' )
                    // InternalQADocker.g:6848:4: enumLiteral_1= 'gray'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getWindowColorAccess().getGrayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWindowColorAccess().getGrayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQADocker.g:6855:3: (enumLiteral_2= 'blue' )
                    {
                    // InternalQADocker.g:6855:3: (enumLiteral_2= 'blue' )
                    // InternalQADocker.g:6856:4: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getWindowColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWindowColorAccess().getBlueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQADocker.g:6863:3: (enumLiteral_3= 'green' )
                    {
                    // InternalQADocker.g:6863:3: (enumLiteral_3= 'green' )
                    // InternalQADocker.g:6864:4: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getWindowColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWindowColorAccess().getGreenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQADocker.g:6871:3: (enumLiteral_4= 'yellow' )
                    {
                    // InternalQADocker.g:6871:3: (enumLiteral_4= 'yellow' )
                    // InternalQADocker.g:6872:4: enumLiteral_4= 'yellow'
                    {
                    enumLiteral_4=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getWindowColorAccess().getYellowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWindowColorAccess().getYellowEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQADocker.g:6879:3: (enumLiteral_5= 'cyan' )
                    {
                    // InternalQADocker.g:6879:3: (enumLiteral_5= 'cyan' )
                    // InternalQADocker.g:6880:4: enumLiteral_5= 'cyan'
                    {
                    enumLiteral_5=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getWindowColorAccess().getCyanEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWindowColorAccess().getCyanEnumLiteralDeclaration_5());
                    			

                    }


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
    // $ANTLR end "ruleWindowColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000087EA012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000087E8012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008400012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x7E00000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00043400C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004340080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004200080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000220000000F0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000232000000F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x6858000000000000L,0x000003DEA6BFFEDFL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0680000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000200000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000010L,0x0000002000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0002000020000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0002000220000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x4000000000000000L,0x0000C00200000080L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});

}