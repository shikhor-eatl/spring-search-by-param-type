//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.sipios.springsearch;

import java.util.List;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class QueryParser extends Parser {
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache;
    public static final int BOOL = 1;
    public static final int STRING = 2;
    public static final int AND = 3;
    public static final int OR = 4;
    public static final int NUMBER = 5;
    public static final int LPAREN = 6;
    public static final int RPAREN = 7;
    public static final int GT = 8;
    public static final int LT = 9;
    public static final int EQ = 10;
    public static final int NOT_EQ = 11;
    public static final int IDENTIFIER = 12;
    public static final int ENCODED_STRING = 13;
    public static final int LineTerminator = 14;
    public static final int WS = 15;
    public static final int RULE_input = 0;
    public static final int RULE_query = 1;
    public static final int RULE_criteria = 2;
    public static final int RULE_key = 3;
    public static final int RULE_value = 4;
    public static final int RULE_op = 5;
    public static final String[] ruleNames;
    private static final String[] _LITERAL_NAMES;
    private static final String[] _SYMBOLIC_NAMES;
    public static final Vocabulary VOCABULARY;
    /** @deprecated */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN = "\u0003悋Ꜫ脳맭䅼㯧瞆奤\u0003\u0011,\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0018\n\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u001d\n\u0003\f\u0003\u000e\u0003 \u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0002\u0003\u0004\b\u0002\u0004\u0006\b\n\f\u0002\u0005\u0003\u0002\u0005\u0006\u0005\u0002\u0003\u0004\u0007\u0007\u000e\u000f\u0003\u0002\n\r\u0002'\u0002\u000e\u0003\u0002\u0002\u0002\u0004\u0017\u0003\u0002\u0002\u0002\u0006!\u0003\u0002\u0002\u0002\b%\u0003\u0002\u0002\u0002\n'\u0003\u0002\u0002\u0002\f)\u0003\u0002\u0002\u0002\u000e\u000f\u0005\u0004\u0003\u0002\u000f\u0010\u0007\u0002\u0002\u0003\u0010\u0003\u0003\u0002\u0002\u0002\u0011\u0012\b\u0003\u0001\u0002\u0012\u0013\u0007\b\u0002\u0002\u0013\u0014\u0005\u0004\u0003\u0002\u0014\u0015\u0007\t\u0002\u0002\u0015\u0018\u0003\u0002\u0002\u0002\u0016\u0018\u0005\u0006\u0004\u0002\u0017\u0011\u0003\u0002\u0002\u0002\u0017\u0016\u0003\u0002\u0002\u0002\u0018\u001e\u0003\u0002\u0002\u0002\u0019\u001a\f\u0005\u0002\u0002\u001a\u001b\t\u0002\u0002\u0002\u001b\u001d\u0005\u0004\u0003\u0006\u001c\u0019\u0003\u0002\u0002\u0002\u001d \u0003\u0002\u0002\u0002\u001e\u001c\u0003\u0002\u0002\u0002\u001e\u001f\u0003\u0002\u0002\u0002\u001f\u0005\u0003\u0002\u0002\u0002 \u001e\u0003\u0002\u0002\u0002!\"\u0005\b\u0005\u0002\"#\u0005\f\u0007\u0002#$\u0005\n\u0006\u0002$\u0007\u0003\u0002\u0002\u0002%&\u0007\u000e\u0002\u0002&\t\u0003\u0002\u0002\u0002'(\t\u0003\u0002\u0002(\u000b\u0003\u0002\u0002\u0002)*\t\u0004\u0002\u0002*\r\u0003\u0002\u0002\u0002\u0004\u0017\u001e";
    public static final ATN _ATN;

    private static String[] makeRuleNames() {
        return new String[]{"input", "query", "criteria", "key", "value", "op"};
    }

    private static String[] makeLiteralNames() {
        return new String[]{null, null, null, "'AND'", "'OR'", null, "'('", "')'", "'>'", "'<'", "':'", "'!'"};
    }

    private static String[] makeSymbolicNames() {
        return new String[]{null, "BOOL", "STRING", "AND", "OR", "NUMBER", "LPAREN", "RPAREN", "GT", "LT", "EQ", "NOT_EQ", "IDENTIFIER", "ENCODED_STRING", "LineTerminator", "WS"};
    }

    /** @deprecated */
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    public String getGrammarFileName() {
        return "Query.g4";
    }

    public String[] getRuleNames() {
        return ruleNames;
    }

    public String getSerializedATN() {
        return "\u0003悋Ꜫ脳맭䅼㯧瞆奤\u0003\u0011,\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0018\n\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u001d\n\u0003\f\u0003\u000e\u0003 \u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0002\u0003\u0004\b\u0002\u0004\u0006\b\n\f\u0002\u0005\u0003\u0002\u0005\u0006\u0005\u0002\u0003\u0004\u0007\u0007\u000e\u000f\u0003\u0002\n\r\u0002'\u0002\u000e\u0003\u0002\u0002\u0002\u0004\u0017\u0003\u0002\u0002\u0002\u0006!\u0003\u0002\u0002\u0002\b%\u0003\u0002\u0002\u0002\n'\u0003\u0002\u0002\u0002\f)\u0003\u0002\u0002\u0002\u000e\u000f\u0005\u0004\u0003\u0002\u000f\u0010\u0007\u0002\u0002\u0003\u0010\u0003\u0003\u0002\u0002\u0002\u0011\u0012\b\u0003\u0001\u0002\u0012\u0013\u0007\b\u0002\u0002\u0013\u0014\u0005\u0004\u0003\u0002\u0014\u0015\u0007\t\u0002\u0002\u0015\u0018\u0003\u0002\u0002\u0002\u0016\u0018\u0005\u0006\u0004\u0002\u0017\u0011\u0003\u0002\u0002\u0002\u0017\u0016\u0003\u0002\u0002\u0002\u0018\u001e\u0003\u0002\u0002\u0002\u0019\u001a\f\u0005\u0002\u0002\u001a\u001b\t\u0002\u0002\u0002\u001b\u001d\u0005\u0004\u0003\u0006\u001c\u0019\u0003\u0002\u0002\u0002\u001d \u0003\u0002\u0002\u0002\u001e\u001c\u0003\u0002\u0002\u0002\u001e\u001f\u0003\u0002\u0002\u0002\u001f\u0005\u0003\u0002\u0002\u0002 \u001e\u0003\u0002\u0002\u0002!\"\u0005\b\u0005\u0002\"#\u0005\f\u0007\u0002#$\u0005\n\u0006\u0002$\u0007\u0003\u0002\u0002\u0002%&\u0007\u000e\u0002\u0002&\t\u0003\u0002\u0002\u0002'(\t\u0003\u0002\u0002(\u000b\u0003\u0002\u0002\u0002)*\t\u0004\u0002\u0002*\r\u0003\u0002\u0002\u0002\u0004\u0017\u001e";
    }

    public ATN getATN() {
        return _ATN;
    }

    public QueryParser(TokenStream input) {
        super(input);
        this._interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public final QueryParser.InputContext input() throws RecognitionException {
        QueryParser.InputContext _localctx = new QueryParser.InputContext(this._ctx, this.getState());
        this.enterRule(_localctx, 0, 0);

        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(12);
            this.query(0);
            this.setState(13);
            this.match(-1);
        } catch (RecognitionException var6) {
            _localctx.exception = var6;
            this._errHandler.reportError(this, var6);
            this._errHandler.recover(this, var6);
        } finally {
            this.exitRule();
        }

        return _localctx;
    }

    public final QueryParser.QueryContext query() throws RecognitionException {
        return this.query(0);
    }

    private QueryParser.QueryContext query(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = this._ctx;
        int _parentState = this.getState();
        QueryParser.QueryContext _localctx = new QueryParser.QueryContext(this._ctx, _parentState);
        int _startState = 2;
        this.enterRecursionRule((ParserRuleContext)_localctx, 2, 1, _p);

        try {
            this.enterOuterAlt((ParserRuleContext)_localctx, 1);
            this.setState(21);
            this._errHandler.sync(this);
            switch(this._input.LA(1)) {
                case 6:
                    _localctx = new QueryParser.PriorityQueryContext((QueryParser.QueryContext)_localctx);
                    this._ctx = (ParserRuleContext)_localctx;
                    this.setState(16);
                    this.match(6);
                    this.setState(17);
                    this.query(0);
                    this.setState(18);
                    this.match(7);
                    break;
                case 12:
                    _localctx = new QueryParser.AtomQueryContext((QueryParser.QueryContext)_localctx);
                    this._ctx = (ParserRuleContext)_localctx;
                    this.setState(20);
                    this.criteria();
                    break;
                default:
                    throw new NoViableAltException(this);
            }

            this._ctx.stop = this._input.LT(-1);
            this.setState(28);
            this._errHandler.sync(this);

            for(int _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 1, this._ctx); _alt != 2 && _alt != 0; _alt = ((ParserATNSimulator)this.getInterpreter()).adaptivePredict(this._input, 1, this._ctx)) {
                if (_alt == 1) {
                    if (this._parseListeners != null) {
                        this.triggerExitRuleEvent();
                    }

                    QueryParser.QueryContext _prevctx = _localctx;
                    _localctx = new QueryParser.OpQueryContext(new QueryParser.QueryContext(_parentctx, _parentState));
                    ((QueryParser.OpQueryContext)_localctx).left = (QueryParser.QueryContext)_prevctx;
                    this.pushNewRecursionContext((ParserRuleContext)_localctx, _startState, 1);
                    this.setState(23);
                    if (!this.precpred(this._ctx, 3)) {
                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    }

                    this.setState(24);
                    ((QueryParser.OpQueryContext)_localctx).logicalOp = this._input.LT(1);
                    int _la = this._input.LA(1);
                    if (_la != 3 && _la != 4) {
                        ((QueryParser.OpQueryContext)_localctx).logicalOp = this._errHandler.recoverInline(this);
                    } else {
                        if (this._input.LA(1) == -1) {
                            this.matchedEOF = true;
                        }

                        this._errHandler.reportMatch(this);
                        this.consume();
                    }

                    this.setState(25);
                    ((QueryParser.OpQueryContext)_localctx).right = this.query(4);
                }

                this.setState(30);
                this._errHandler.sync(this);
            }
        } catch (RecognitionException var12) {
            ((QueryParser.QueryContext)_localctx).exception = var12;
            this._errHandler.reportError(this, var12);
            this._errHandler.recover(this, var12);
        } finally {
            this.unrollRecursionContexts(_parentctx);
        }

        return (QueryParser.QueryContext)_localctx;
    }

    public final QueryParser.CriteriaContext criteria() throws RecognitionException {
        QueryParser.CriteriaContext _localctx = new QueryParser.CriteriaContext(this._ctx, this.getState());
        this.enterRule(_localctx, 4, 2);

        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(31);
            this.key();
            this.setState(32);
            this.op();
            this.setState(33);
            this.value();
        } catch (RecognitionException var6) {
            _localctx.exception = var6;
            this._errHandler.reportError(this, var6);
            this._errHandler.recover(this, var6);
        } finally {
            this.exitRule();
        }

        return _localctx;
    }

    public final QueryParser.KeyContext key() throws RecognitionException {
        QueryParser.KeyContext _localctx = new QueryParser.KeyContext(this._ctx, this.getState());
        this.enterRule(_localctx, 6, 3);

        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(35);
            this.match(12);
        } catch (RecognitionException var6) {
            _localctx.exception = var6;
            this._errHandler.reportError(this, var6);
            this._errHandler.recover(this, var6);
        } finally {
            this.exitRule();
        }

        return _localctx;
    }

    public final QueryParser.ValueContext value() throws RecognitionException {
        QueryParser.ValueContext _localctx = new QueryParser.ValueContext(this._ctx, this.getState());
        this.enterRule(_localctx, 8, 4);

        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(37);
            int _la = this._input.LA(1);
            if ((_la & -64) == 0 && (1L << _la & 12326L) != 0L) {
                if (this._input.LA(1) == -1) {
                    this.matchedEOF = true;
                }

                this._errHandler.reportMatch(this);
                this.consume();
            } else {
                this._errHandler.recoverInline(this);
            }
        } catch (RecognitionException var7) {
            _localctx.exception = var7;
            this._errHandler.reportError(this, var7);
            this._errHandler.recover(this, var7);
        } finally {
            this.exitRule();
        }

        return _localctx;
    }

    public final QueryParser.OpContext op() throws RecognitionException {
        QueryParser.OpContext _localctx = new QueryParser.OpContext(this._ctx, this.getState());
        this.enterRule(_localctx, 10, 5);

        try {
            this.enterOuterAlt(_localctx, 1);
            this.setState(39);
            int _la = this._input.LA(1);
            if ((_la & -64) == 0 && (1L << _la & 3840L) != 0L) {
                if (this._input.LA(1) == -1) {
                    this.matchedEOF = true;
                }

                this._errHandler.reportMatch(this);
                this.consume();
            } else {
                this._errHandler.recoverInline(this);
            }
        } catch (RecognitionException var7) {
            _localctx.exception = var7;
            this._errHandler.reportError(this, var7);
            this._errHandler.recover(this, var7);
        } finally {
            this.exitRule();
        }

        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch(ruleIndex) {
            case 1:
                return this.query_sempred((QueryParser.QueryContext)_localctx, predIndex);
            default:
                return true;
        }
    }

    private boolean query_sempred(QueryParser.QueryContext _localctx, int predIndex) {
        switch(predIndex) {
            case 0:
                return this.precpred(this._ctx, 3);
            default:
                return true;
        }
    }

    static {
        RuntimeMetaData.checkVersion("4.7.2", "4.7.2");
        _sharedContextCache = new PredictionContextCache();
        ruleNames = makeRuleNames();
        _LITERAL_NAMES = makeLiteralNames();
        _SYMBOLIC_NAMES = makeSymbolicNames();
        VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
        tokenNames = new String[_SYMBOLIC_NAMES.length];

        int i;
        for(i = 0; i < tokenNames.length; ++i) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }

        _ATN = (new ATNDeserializer()).deserialize("\u0003悋Ꜫ脳맭䅼㯧瞆奤\u0003\u0011,\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0018\n\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0007\u0003\u001d\n\u0003\f\u0003\u000e\u0003 \u000b\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0002\u0003\u0004\b\u0002\u0004\u0006\b\n\f\u0002\u0005\u0003\u0002\u0005\u0006\u0005\u0002\u0003\u0004\u0007\u0007\u000e\u000f\u0003\u0002\n\r\u0002'\u0002\u000e\u0003\u0002\u0002\u0002\u0004\u0017\u0003\u0002\u0002\u0002\u0006!\u0003\u0002\u0002\u0002\b%\u0003\u0002\u0002\u0002\n'\u0003\u0002\u0002\u0002\f)\u0003\u0002\u0002\u0002\u000e\u000f\u0005\u0004\u0003\u0002\u000f\u0010\u0007\u0002\u0002\u0003\u0010\u0003\u0003\u0002\u0002\u0002\u0011\u0012\b\u0003\u0001\u0002\u0012\u0013\u0007\b\u0002\u0002\u0013\u0014\u0005\u0004\u0003\u0002\u0014\u0015\u0007\t\u0002\u0002\u0015\u0018\u0003\u0002\u0002\u0002\u0016\u0018\u0005\u0006\u0004\u0002\u0017\u0011\u0003\u0002\u0002\u0002\u0017\u0016\u0003\u0002\u0002\u0002\u0018\u001e\u0003\u0002\u0002\u0002\u0019\u001a\f\u0005\u0002\u0002\u001a\u001b\t\u0002\u0002\u0002\u001b\u001d\u0005\u0004\u0003\u0006\u001c\u0019\u0003\u0002\u0002\u0002\u001d \u0003\u0002\u0002\u0002\u001e\u001c\u0003\u0002\u0002\u0002\u001e\u001f\u0003\u0002\u0002\u0002\u001f\u0005\u0003\u0002\u0002\u0002 \u001e\u0003\u0002\u0002\u0002!\"\u0005\b\u0005\u0002\"#\u0005\f\u0007\u0002#$\u0005\n\u0006\u0002$\u0007\u0003\u0002\u0002\u0002%&\u0007\u000e\u0002\u0002&\t\u0003\u0002\u0002\u0002'(\t\u0003\u0002\u0002(\u000b\u0003\u0002\u0002\u0002)*\t\u0004\u0002\u0002*\r\u0003\u0002\u0002\u0002\u0004\u0017\u001e".toCharArray());
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];

        for(i = 0; i < _ATN.getNumberOfDecisions(); ++i) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }

    }

    public static class OpContext extends ParserRuleContext {
        public TerminalNode EQ() {
            return this.getToken(10, 0);
        }

        public TerminalNode GT() {
            return this.getToken(8, 0);
        }

        public TerminalNode LT() {
            return this.getToken(9, 0);
        }

        public TerminalNode NOT_EQ() {
            return this.getToken(11, 0);
        }

        public OpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public int getRuleIndex() {
            return 5;
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterOp(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitOp(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitOp(this) : visitor.visitChildren(this);
        }
    }

    public static class ValueContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return this.getToken(12, 0);
        }

        public TerminalNode STRING() {
            return this.getToken(2, 0);
        }

        public TerminalNode ENCODED_STRING() {
            return this.getToken(13, 0);
        }

        public TerminalNode NUMBER() {
            return this.getToken(5, 0);
        }

        public TerminalNode BOOL() {
            return this.getToken(1, 0);
        }

        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public int getRuleIndex() {
            return 4;
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterValue(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitValue(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitValue(this) : visitor.visitChildren(this);
        }
    }

    public static class KeyContext extends ParserRuleContext {
        public TerminalNode IDENTIFIER() {
            return this.getToken(12, 0);
        }

        public KeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public int getRuleIndex() {
            return 3;
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterKey(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitKey(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitKey(this) : visitor.visitChildren(this);
        }
    }

    public static class CriteriaContext extends ParserRuleContext {
        public QueryParser.KeyContext key() {
            return (QueryParser.KeyContext)this.getRuleContext(QueryParser.KeyContext.class, 0);
        }

        public QueryParser.OpContext op() {
            return (QueryParser.OpContext)this.getRuleContext(QueryParser.OpContext.class, 0);
        }

        public QueryParser.ValueContext value() {
            return (QueryParser.ValueContext)this.getRuleContext(QueryParser.ValueContext.class, 0);
        }

        public CriteriaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public int getRuleIndex() {
            return 2;
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterCriteria(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitCriteria(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitCriteria(this) : visitor.visitChildren(this);
        }
    }

    public static class OpQueryContext extends QueryParser.QueryContext {
        public QueryParser.QueryContext left;
        public Token logicalOp;
        public QueryParser.QueryContext right;

        public List<QueryParser.QueryContext> query() {
            return this.getRuleContexts(QueryParser.QueryContext.class);
        }

        public QueryParser.QueryContext query(int i) {
            return (QueryParser.QueryContext)this.getRuleContext(QueryParser.QueryContext.class, i);
        }

        public TerminalNode AND() {
            return this.getToken(3, 0);
        }

        public TerminalNode OR() {
            return this.getToken(4, 0);
        }

        public OpQueryContext(QueryParser.QueryContext ctx) {
            this.copyFrom(ctx);
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterOpQuery(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitOpQuery(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitOpQuery(this) : visitor.visitChildren(this);
        }
    }

    public static class PriorityQueryContext extends QueryParser.QueryContext {
        public TerminalNode LPAREN() {
            return this.getToken(6, 0);
        }

        public QueryParser.QueryContext query() {
            return (QueryParser.QueryContext)this.getRuleContext(QueryParser.QueryContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return this.getToken(7, 0);
        }

        public PriorityQueryContext(QueryParser.QueryContext ctx) {
            this.copyFrom(ctx);
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterPriorityQuery(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitPriorityQuery(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitPriorityQuery(this) : visitor.visitChildren(this);
        }
    }

    public static class AtomQueryContext extends QueryParser.QueryContext {
        public QueryParser.CriteriaContext criteria() {
            return (QueryParser.CriteriaContext)this.getRuleContext(QueryParser.CriteriaContext.class, 0);
        }

        public AtomQueryContext(QueryParser.QueryContext ctx) {
            this.copyFrom(ctx);
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterAtomQuery(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitAtomQuery(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitAtomQuery(this) : visitor.visitChildren(this);
        }
    }

    public static class QueryContext extends ParserRuleContext {
        public QueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public int getRuleIndex() {
            return 1;
        }

        public QueryContext() {
        }

        public void copyFrom(QueryParser.QueryContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class InputContext extends ParserRuleContext {
        public QueryParser.QueryContext query() {
            return (QueryParser.QueryContext)this.getRuleContext(QueryParser.QueryContext.class, 0);
        }

        public TerminalNode EOF() {
            return this.getToken(-1, 0);
        }

        public InputContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public int getRuleIndex() {
            return 0;
        }

        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).enterInput(this);
            }

        }

        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof QueryListener) {
                ((QueryListener)listener).exitInput(this);
            }

        }

        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            return visitor instanceof QueryVisitor ? (T) ((QueryVisitor)visitor).visitInput(this) : visitor.visitChildren(this);
        }
    }
}
