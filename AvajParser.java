// Generated from Avaj.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AvajParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, STRING=4, ATRIB=5, AP=6, FP=7, AC=8, FC=9, OP=10, 
		OPR=11, OPCON=12, IN=13, OUT=14, RET=15, COND=16, ELSE=17, WHILE=18, NUM=19, 
		ID=20, WS=21, ERROR=22;
	public static final int
		RULE_start = 0, RULE_decl = 1, RULE_varDecl = 2, RULE_funDecl = 3, RULE_params = 4, 
		RULE_param = 5, RULE_block = 6, RULE_stmt = 7, RULE_exprStmt = 8, RULE_expr = 9, 
		RULE_ifStmt = 10, RULE_elseStmt = 11, RULE_whileStmt = 12, RULE_returnStmt = 13, 
		RULE_inStmt = 14, RULE_outStmt = 15, RULE_value = 16, RULE_funCall = 17, 
		RULE_args = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "decl", "varDecl", "funDecl", "params", "param", "block", "stmt", 
			"exprStmt", "expr", "ifStmt", "elseStmt", "whileStmt", "returnStmt", 
			"inStmt", "outStmt", "value", "funCall", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", null, null, "'='", "'('", "')'", "'{'", "'}'", null, 
			null, "'<>'", "'tupni'", "'tnirp'", "'nruter'", "'fi'", "'esle'", "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "STRING", "ATRIB", "AP", "FP", "AC", "FC", 
			"OP", "OPR", "OPCON", "IN", "OUT", "RET", "COND", "ELSE", "WHILE", "NUM", 
			"ID", "WS", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Avaj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AvajParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AvajParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2092376L) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					decl();
					}
					break;
				case 2:
					{
					setState(39);
					stmt();
					}
					break;
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				funDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AvajParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(AvajParser.ATRIB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(TYPE);
			setState(52);
			match(ID);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIB) {
				{
				setState(53);
				match(ATRIB);
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					expr();
					}
					break;
				case 2:
					{
					setState(55);
					value();
					}
					break;
				}
				}
			}

			setState(60);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AvajParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterFunDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitFunDecl(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TYPE);
			setState(63);
			match(ID);
			setState(64);
			match(AP);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(65);
				params();
				}
			}

			setState(68);
			match(FP);
			setState(69);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			param();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(72);
				match(T__1);
				setState(73);
				param();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AvajParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(TYPE);
			setState(80);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(AvajParser.AC, 0); }
		public TerminalNode FC() { return getToken(AvajParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(AC);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2092376L) != 0)) {
				{
				{
				setState(83);
				stmt();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public InStmtContext inStmt() {
			return getRuleContext(InStmtContext.class,0);
		}
		public OutStmtContext outStmt() {
			return getRuleContext(OutStmtContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case AP:
			case OP:
			case OPR:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				exprStmt();
				}
				break;
			case COND:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				ifStmt();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				elseStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				whileStmt();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				returnStmt();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				inStmt();
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				outStmt();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				varDecl();
				}
				break;
			case AC:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitExprStmt(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			expr();
			setState(103);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OP() { return getToken(AvajParser.OP, 0); }
		public TerminalNode OPR() { return getToken(AvajParser.OPR, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AvajParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(AvajParser.STRING, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				value();
				setState(106);
				match(OP);
				setState(107);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				value();
				setState(110);
				match(OPR);
				setState(111);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				match(AP);
				setState(117);
				expr();
				setState(118);
				match(FP);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				funCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(AvajParser.COND, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public TerminalNode AC() { return getToken(AvajParser.AC, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode FC() { return getToken(AvajParser.FC, 0); }
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(COND);
			setState(124);
			match(AP);
			setState(125);
			expr();
			setState(126);
			match(FP);
			setState(127);
			match(AC);
			setState(128);
			stmt();
			setState(129);
			match(FC);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(130);
				elseStmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AvajParser.ELSE, 0); }
		public TerminalNode AC() { return getToken(AvajParser.AC, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode FC() { return getToken(AvajParser.FC, 0); }
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitElseStmt(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ELSE);
			setState(134);
			match(AC);
			setState(135);
			stmt();
			setState(136);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AvajParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WHILE);
			setState(139);
			match(AP);
			setState(140);
			expr();
			setState(141);
			match(FP);
			setState(142);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(AvajParser.RET, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AvajParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(AvajParser.STRING, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(RET);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(145);
				stmt();
				}
				break;
			case 2:
				{
				setState(146);
				expr();
				}
				break;
			case 3:
				{
				setState(147);
				match(ID);
				}
				break;
			case 4:
				{
				setState(148);
				match(NUM);
				}
				break;
			case 5:
				{
				setState(149);
				match(STRING);
				}
				break;
			}
			setState(152);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InStmtContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(AvajParser.IN, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public InStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterInStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitInStmt(this);
		}
	}

	public final InStmtContext inStmt() throws RecognitionException {
		InStmtContext _localctx = new InStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IN);
			setState(155);
			match(AP);
			setState(156);
			match(ID);
			setState(157);
			match(FP);
			setState(158);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutStmtContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(AvajParser.OUT, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public OutStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterOutStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitOutStmt(this);
		}
	}

	public final OutStmtContext outStmt() throws RecognitionException {
		OutStmtContext _localctx = new OutStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_outStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(OUT);
			setState(161);
			match(AP);
			setState(162);
			expr();
			setState(163);
			match(FP);
			setState(164);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode NUM() { return getToken(AvajParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(AvajParser.STRING, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(AP);
				setState(171);
				expr();
				setState(172);
				match(FP);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				funCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AvajParser.ID, 0); }
		public TerminalNode AP() { return getToken(AvajParser.AP, 0); }
		public TerminalNode FP() { return getToken(AvajParser.FP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitFunCall(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(AP);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1576016L) != 0)) {
				{
				setState(179);
				args();
				}
			}

			setState(182);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AvajListener ) ((AvajListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			expr();
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(185);
				match(T__1);
				setState(186);
				expr();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u00012\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00029\b\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0005\u0006U\b\u0006\n\u0006\f\u0006X\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"e\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tz\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0097"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b0"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b5\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00bc\b\u0012\n\u0012\f\u0012\u00bf\t\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$\u0000\u0000\u00d0\u0000*\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006>\u0001"+
		"\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000"+
		"\fR\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010f\u0001"+
		"\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000"+
		"\u0000\u0016\u0085\u0001\u0000\u0000\u0000\u0018\u008a\u0001\u0000\u0000"+
		"\u0000\u001a\u0090\u0001\u0000\u0000\u0000\u001c\u009a\u0001\u0000\u0000"+
		"\u0000\u001e\u00a0\u0001\u0000\u0000\u0000 \u00af\u0001\u0000\u0000\u0000"+
		"\"\u00b1\u0001\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000&)\u0003"+
		"\u0002\u0001\u0000\')\u0003\u000e\u0007\u0000(&\u0001\u0000\u0000\u0000"+
		"(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001\u0000\u0000\u0000"+
		"/2\u0003\u0004\u0002\u000002\u0003\u0006\u0003\u00001/\u0001\u0000\u0000"+
		"\u000010\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0005"+
		"\u0003\u0000\u00004:\u0005\u0014\u0000\u000058\u0005\u0005\u0000\u0000"+
		"69\u0003\u0012\t\u000079\u0003 \u0010\u000086\u0001\u0000\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005\u0001"+
		"\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005\u0003\u0000\u0000"+
		"?@\u0005\u0014\u0000\u0000@B\u0005\u0006\u0000\u0000AC\u0003\b\u0004\u0000"+
		"BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0007\u0000\u0000EF\u0003\f\u0006\u0000F\u0007\u0001\u0000"+
		"\u0000\u0000GL\u0003\n\u0005\u0000HI\u0005\u0002\u0000\u0000IK\u0003\n"+
		"\u0005\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0005\u0014\u0000"+
		"\u0000Q\u000b\u0001\u0000\u0000\u0000RV\u0005\b\u0000\u0000SU\u0003\u000e"+
		"\u0007\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YZ\u0005\t\u0000\u0000Z\r\u0001\u0000\u0000"+
		"\u0000[e\u0003\u0010\b\u0000\\e\u0003\u0014\n\u0000]e\u0003\u0016\u000b"+
		"\u0000^e\u0003\u0018\f\u0000_e\u0003\u001a\r\u0000`e\u0003\u001c\u000e"+
		"\u0000ae\u0003\u001e\u000f\u0000be\u0003\u0004\u0002\u0000ce\u0003\f\u0006"+
		"\u0000d[\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000d]\u0001\u0000"+
		"\u0000\u0000d^\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001"+
		"\u0000\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0003\u0012"+
		"\t\u0000gh\u0005\u0001\u0000\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0003"+
		" \u0010\u0000jk\u0005\n\u0000\u0000kl\u0003 \u0010\u0000lz\u0001\u0000"+
		"\u0000\u0000mn\u0003 \u0010\u0000no\u0005\u000b\u0000\u0000op\u0003 \u0010"+
		"\u0000pz\u0001\u0000\u0000\u0000qz\u0005\u0014\u0000\u0000rz\u0005\u0013"+
		"\u0000\u0000sz\u0005\u0004\u0000\u0000tu\u0005\u0006\u0000\u0000uv\u0003"+
		"\u0012\t\u0000vw\u0005\u0007\u0000\u0000wz\u0001\u0000\u0000\u0000xz\u0003"+
		"\"\u0011\u0000yi\u0001\u0000\u0000\u0000ym\u0001\u0000\u0000\u0000yq\u0001"+
		"\u0000\u0000\u0000yr\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000"+
		"yt\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0013\u0001\u0000"+
		"\u0000\u0000{|\u0005\u0010\u0000\u0000|}\u0005\u0006\u0000\u0000}~\u0003"+
		"\u0012\t\u0000~\u007f\u0005\u0007\u0000\u0000\u007f\u0080\u0005\b\u0000"+
		"\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081\u0083\u0005\t\u0000\u0000"+
		"\u0082\u0084\u0003\u0016\u000b\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0011\u0000\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087"+
		"\u0088\u0003\u000e\u0007\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u0017"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0012\u0000\u0000\u008b\u008c"+
		"\u0005\u0006\u0000\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u008e\u0005"+
		"\u0007\u0000\u0000\u008e\u008f\u0003\u000e\u0007\u0000\u008f\u0019\u0001"+
		"\u0000\u0000\u0000\u0090\u0096\u0005\u000f\u0000\u0000\u0091\u0097\u0003"+
		"\u000e\u0007\u0000\u0092\u0097\u0003\u0012\t\u0000\u0093\u0097\u0005\u0014"+
		"\u0000\u0000\u0094\u0097\u0005\u0013\u0000\u0000\u0095\u0097\u0005\u0004"+
		"\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000"+
		"\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0001"+
		"\u0000\u0000\u0099\u001b\u0001\u0000\u0000\u0000\u009a\u009b\u0005\r\u0000"+
		"\u0000\u009b\u009c\u0005\u0006\u0000\u0000\u009c\u009d\u0005\u0014\u0000"+
		"\u0000\u009d\u009e\u0005\u0007\u0000\u0000\u009e\u009f\u0005\u0001\u0000"+
		"\u0000\u009f\u001d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000e\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000\u00a2\u00a3\u0003\u0012\t\u0000"+
		"\u00a3\u00a4\u0005\u0007\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00b0\u0001\u0000\u0000\u0000"+
		"\u00a7\u00b0\u0005\u0014\u0000\u0000\u00a8\u00b0\u0005\u0013\u0000\u0000"+
		"\u00a9\u00b0\u0005\u0004\u0000\u0000\u00aa\u00ab\u0005\u0006\u0000\u0000"+
		"\u00ab\u00ac\u0003\u0012\t\u0000\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\"\u0011\u0000\u00af\u00a6"+
		"\u0001\u0000\u0000\u0000\u00af\u00a7\u0001\u0000\u0000\u0000\u00af\u00a8"+
		"\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00af\u00aa"+
		"\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0!\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00b4\u0005"+
		"\u0006\u0000\u0000\u00b3\u00b5\u0003$\u0012\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0007\u0000\u0000\u00b7#\u0001\u0000\u0000"+
		"\u0000\u00b8\u00bd\u0003\u0012\t\u0000\u00b9\u00ba\u0005\u0002\u0000\u0000"+
		"\u00ba\u00bc\u0003\u0012\t\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be%\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u000f(*18:BLVdy\u0083\u0096\u00af\u00b4\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}