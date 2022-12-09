// Generated from /home/cgeorge/cpl/tema-cpl-1/cool/parser/CoolParser.g4 by ANTLR 4.9.2

    package cool.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, CL_CLASS=2, INHERITS=3, NEW=4, IF=5, THEN=6, ELSE=7, FI=8, CASE=9, 
		ESAC=10, OF=11, LET=12, IN=13, WHILE=14, LOOP=15, POOL=16, TRUE=17, FALSE=18, 
		NOT=19, ISVOID=20, TYPE_ID=21, OBJ_ID=22, SELF=23, SELF_TYPE=24, INTEGER=25, 
		STRING=26, BAD_COMMENT=27, LINE_COMMENT=28, BLOCK_COMMENT=29, SEMI=30, 
		DOT=31, COLON=32, COMMA=33, COMPL=34, ASSIGN=35, LPAREN=36, RPAREN=37, 
		LBRACE=38, RBRACE=39, PLUS=40, MINUS=41, MULT=42, DIV=43, EQUAL=44, LT=45, 
		LE=46, CASE_EXPR=47, PARENT_CLASS=48, END_FILE=49, WS=50, INVALID=51;
	public static final int
		RULE_program = 0, RULE_cl_class = 1, RULE_formal = 2, RULE_feature = 3, 
		RULE_localVar = 4, RULE_caseBranch = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "cl_class", "formal", "feature", "localVar", "caseBranch", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'inherits'", "'new'", "'if'", "'then'", "'else'", 
			"'fi'", "'case'", "'esac'", "'of'", "'let'", "'in'", "'while'", "'loop'", 
			"'pool'", "'true'", "'false'", "'not'", "'isvoid'", null, null, "'self'", 
			"'SELF_TYPE'", null, null, "'*)'", null, null, "';'", "'.'", "':'", "','", 
			"'~'", "'<-'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'<'", "'<='", "'=>'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "CL_CLASS", "INHERITS", "NEW", "IF", "THEN", "ELSE", "FI", 
			"CASE", "ESAC", "OF", "LET", "IN", "WHILE", "LOOP", "POOL", "TRUE", "FALSE", 
			"NOT", "ISVOID", "TYPE_ID", "OBJ_ID", "SELF", "SELF_TYPE", "INTEGER", 
			"STRING", "BAD_COMMENT", "LINE_COMMENT", "BLOCK_COMMENT", "SEMI", "DOT", 
			"COLON", "COMMA", "COMPL", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"PLUS", "MINUS", "MULT", "DIV", "EQUAL", "LT", "LE", "CASE_EXPR", "PARENT_CLASS", 
			"END_FILE", "WS", "INVALID"
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
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Cl_classContext cl_class;
		public List<Cl_classContext> class_list = new ArrayList<Cl_classContext>();
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<Cl_classContext> cl_class() {
			return getRuleContexts(Cl_classContext.class);
		}
		public Cl_classContext cl_class(int i) {
			return getRuleContext(Cl_classContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				((ProgramContext)_localctx).cl_class = cl_class();
				((ProgramContext)_localctx).class_list.add(((ProgramContext)_localctx).cl_class);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CL_CLASS );
			setState(19);
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

	public static class Cl_classContext extends ParserRuleContext {
		public Cl_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl_class; }
	 
		public Cl_classContext() { }
		public void copyFrom(Cl_classContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDefContext extends Cl_classContext {
		public Token type;
		public Token inherit;
		public FeatureContext feature;
		public List<FeatureContext> feat_list = new ArrayList<FeatureContext>();
		public TerminalNode CL_CLASS() { return getToken(CoolParser.CL_CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(CoolParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(CoolParser.TYPE_ID, i);
		}
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassDefContext(Cl_classContext ctx) { copyFrom(ctx); }
	}

	public final Cl_classContext cl_class() throws RecognitionException {
		Cl_classContext _localctx = new Cl_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cl_class);
		int _la;
		try {
			_localctx = new ClassDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CL_CLASS);
			setState(22);
			((ClassDefContext)_localctx).type = match(TYPE_ID);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(23);
				match(INHERITS);
				setState(24);
				((ClassDefContext)_localctx).inherit = match(TYPE_ID);
				}
			}

			setState(27);
			match(LBRACE);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJ_ID) {
				{
				{
				setState(28);
				((ClassDefContext)_localctx).feature = feature();
				((ClassDefContext)_localctx).feat_list.add(((ClassDefContext)_localctx).feature);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(RBRACE);
			setState(35);
			match(SEMI);
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

	public static class FormalContext extends ParserRuleContext {
		public Token id;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((FormalContext)_localctx).id = match(OBJ_ID);
			setState(38);
			match(COLON);
			setState(39);
			((FormalContext)_localctx).type = match(TYPE_ID);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDefContext extends FeatureContext {
		public Token id;
		public Token type;
		public ExprContext init;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(FeatureContext ctx) { copyFrom(ctx); }
	}
	public static class FuncDefContext extends FeatureContext {
		public Token id;
		public FormalContext formal;
		public List<FormalContext> formal_list = new ArrayList<FormalContext>();
		public Token type;
		public ExprContext f_body;
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public FuncDefContext(FeatureContext ctx) { copyFrom(ctx); }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((FuncDefContext)_localctx).id = match(OBJ_ID);
				setState(42);
				match(LPAREN);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJ_ID) {
					{
					setState(43);
					((FuncDefContext)_localctx).formal = formal();
					((FuncDefContext)_localctx).formal_list.add(((FuncDefContext)_localctx).formal);
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(44);
						match(COMMA);
						setState(45);
						((FuncDefContext)_localctx).formal = formal();
						((FuncDefContext)_localctx).formal_list.add(((FuncDefContext)_localctx).formal);
						}
						}
						setState(50);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(53);
				match(RPAREN);
				setState(54);
				match(COLON);
				setState(55);
				((FuncDefContext)_localctx).type = match(TYPE_ID);
				setState(56);
				match(LBRACE);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IF) | (1L << CASE) | (1L << LET) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << COMPL) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					setState(57);
					((FuncDefContext)_localctx).f_body = expr(0);
					}
				}

				setState(60);
				match(RBRACE);
				setState(61);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				((VarDefContext)_localctx).id = match(OBJ_ID);
				setState(63);
				match(COLON);
				setState(64);
				((VarDefContext)_localctx).type = match(TYPE_ID);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(65);
					match(ASSIGN);
					setState(66);
					((VarDefContext)_localctx).init = expr(0);
					}
				}

				setState(69);
				match(SEMI);
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

	public static class LocalVarContext extends ParserRuleContext {
		public Token id;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVar; }
	}

	public final LocalVarContext localVar() throws RecognitionException {
		LocalVarContext _localctx = new LocalVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((LocalVarContext)_localctx).id = match(OBJ_ID);
			setState(73);
			match(COLON);
			setState(74);
			((LocalVarContext)_localctx).type = match(TYPE_ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(75);
				match(ASSIGN);
				setState(76);
				expr(0);
				}
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

	public static class CaseBranchContext extends ParserRuleContext {
		public Token id;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode CASE_EXPR() { return getToken(CoolParser.CASE_EXPR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((CaseBranchContext)_localctx).id = match(OBJ_ID);
			setState(80);
			match(COLON);
			setState(81);
			((CaseBranchContext)_localctx).type = match(TYPE_ID);
			setState(82);
			match(CASE_EXPR);
			setState(83);
			expr(0);
			setState(84);
			match(SEMI);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplExprContext extends ExprContext {
		public TerminalNode COMPL() { return getToken(CoolParser.COMPL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComplExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class WhileLoopContext extends ExprContext {
		public ExprContext cond_expr;
		public ExprContext instr_expr;
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public WhileLoopContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanEqualContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode LE() { return getToken(CoolParser.LE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanEqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ClIfContext extends ExprContext {
		public ExprContext cond;
		public ExprContext then_expr;
		public ExprContext else_expr;
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ClIfContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode DIV() { return getToken(CoolParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(CoolParser.TRUE, 0); }
		public BoolTrueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode LT() { return getToken(CoolParser.LT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BlockContext extends ExprContext {
		public ExprContext expr;
		public List<ExprContext> expr_list = new ArrayList<ExprContext>();
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LetContext extends ExprContext {
		public LocalVarContext localVar;
		public List<LocalVarContext> other_vars = new ArrayList<LocalVarContext>();
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<LocalVarContext> localVar() {
			return getRuleContexts(LocalVarContext.class);
		}
		public LocalVarContext localVar(int i) {
			return getRuleContext(LocalVarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleAssignContext extends ExprContext {
		public Token id;
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public SimpleAssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode MULT() { return getToken(CoolParser.MULT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode EQUAL() { return getToken(CoolParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CaseContext extends ExprContext {
		public ExprContext init;
		public CaseBranchContext caseBranch;
		public List<CaseBranchContext> cases = new ArrayList<CaseBranchContext>();
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Obj_idContext extends ExprContext {
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public Obj_idContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(CoolParser.FALSE, 0); }
		public BoolFalseContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NewInstanceContext extends ExprContext {
		public Token type;
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public NewInstanceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OopDispatchContext extends ExprContext {
		public ExprContext left;
		public Token p_type;
		public Token method_id;
		public ExprContext expr;
		public List<ExprContext> params = new ArrayList<ExprContext>();
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public TerminalNode PARENT_CLASS() { return getToken(CoolParser.PARENT_CLASS, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public OopDispatchContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VoidCheckContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VoidCheckContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ClStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public ClStringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ClIntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(CoolParser.INTEGER, 0); }
		public ClIntegerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallContext extends ExprContext {
		public Token id;
		public ExprContext expr;
		public List<ExprContext> params = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				((FuncCallContext)_localctx).id = match(OBJ_ID);
				setState(88);
				match(LPAREN);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IF) | (1L << CASE) | (1L << LET) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << COMPL) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					setState(89);
					((FuncCallContext)_localctx).expr = expr(0);
					((FuncCallContext)_localctx).params.add(((FuncCallContext)_localctx).expr);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(90);
						match(COMMA);
						setState(91);
						((FuncCallContext)_localctx).expr = expr(0);
						((FuncCallContext)_localctx).params.add(((FuncCallContext)_localctx).expr);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(99);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ClIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(IF);
				setState(101);
				((ClIfContext)_localctx).cond = expr(0);
				setState(102);
				match(THEN);
				setState(103);
				((ClIfContext)_localctx).then_expr = expr(0);
				setState(104);
				match(ELSE);
				setState(105);
				((ClIfContext)_localctx).else_expr = expr(0);
				setState(106);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileLoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(WHILE);
				setState(109);
				((WhileLoopContext)_localctx).cond_expr = expr(0);
				setState(110);
				match(LOOP);
				setState(111);
				((WhileLoopContext)_localctx).instr_expr = expr(0);
				setState(112);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(LBRACE);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					((BlockContext)_localctx).expr = expr(0);
					((BlockContext)_localctx).expr_list.add(((BlockContext)_localctx).expr);
					setState(116);
					match(SEMI);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IF) | (1L << CASE) | (1L << LET) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << COMPL) | (1L << LPAREN) | (1L << LBRACE))) != 0) );
				setState(122);
				match(RBRACE);
				}
				break;
			case 5:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(LET);
				setState(125);
				((LetContext)_localctx).localVar = localVar();
				((LetContext)_localctx).other_vars.add(((LetContext)_localctx).localVar);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126);
					match(COMMA);
					setState(127);
					((LetContext)_localctx).localVar = localVar();
					((LetContext)_localctx).other_vars.add(((LetContext)_localctx).localVar);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(IN);
				setState(134);
				expr(20);
				}
				break;
			case 6:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(CASE);
				setState(137);
				((CaseContext)_localctx).init = expr(0);
				setState(138);
				match(OF);
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					((CaseContext)_localctx).caseBranch = caseBranch();
					((CaseContext)_localctx).cases.add(((CaseContext)_localctx).caseBranch);
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJ_ID );
				setState(144);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewInstanceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(NEW);
				setState(147);
				((NewInstanceContext)_localctx).type = match(TYPE_ID);
				}
				break;
			case 8:
				{
				_localctx = new VoidCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(ISVOID);
				setState(149);
				expr(17);
				}
				break;
			case 9:
				{
				_localctx = new ComplExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(COMPL);
				setState(151);
				expr(12);
				}
				break;
			case 10:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(NOT);
				setState(153);
				expr(8);
				}
				break;
			case 11:
				{
				_localctx = new SimpleAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				((SimpleAssignContext)_localctx).id = match(OBJ_ID);
				setState(155);
				match(ASSIGN);
				setState(156);
				expr(7);
				}
				break;
			case 12:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(LPAREN);
				setState(158);
				expr(0);
				setState(159);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new Obj_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(OBJ_ID);
				}
				break;
			case 14:
				{
				_localctx = new ClIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(INTEGER);
				}
				break;
			case 15:
				{
				_localctx = new ClStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(TRUE);
				}
				break;
			case 17:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(169);
						match(MULT);
						setState(170);
						((MultiplicationContext)_localctx).right = expr(17);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(172);
						match(DIV);
						setState(173);
						((DivisionContext)_localctx).right = expr(16);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(175);
						match(PLUS);
						setState(176);
						((AdditionContext)_localctx).right = expr(15);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(178);
						match(MINUS);
						setState(179);
						((SubtractionContext)_localctx).right = expr(14);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						((LessThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(181);
						match(LT);
						setState(182);
						((LessThanContext)_localctx).right = expr(12);
						}
						break;
					case 6:
						{
						_localctx = new LessThanEqualContext(new ExprContext(_parentctx, _parentState));
						((LessThanEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(184);
						match(LE);
						setState(185);
						((LessThanEqualContext)_localctx).right = expr(11);
						}
						break;
					case 7:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						((EqualityContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(187);
						match(EQUAL);
						setState(188);
						((EqualityContext)_localctx).right = expr(10);
						}
						break;
					case 8:
						{
						_localctx = new OopDispatchContext(new ExprContext(_parentctx, _parentState));
						((OopDispatchContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==PARENT_CLASS) {
							{
							setState(190);
							match(PARENT_CLASS);
							setState(191);
							((OopDispatchContext)_localctx).p_type = match(TYPE_ID);
							}
						}

						setState(194);
						match(DOT);
						setState(195);
						((OopDispatchContext)_localctx).method_id = match(OBJ_ID);
						setState(196);
						match(LPAREN);
						setState(205);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << IF) | (1L << CASE) | (1L << LET) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << COMPL) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
							{
							setState(197);
							((OopDispatchContext)_localctx).expr = expr(0);
							((OopDispatchContext)_localctx).params.add(((OopDispatchContext)_localctx).expr);
							setState(202);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(198);
								match(COMMA);
								setState(199);
								((OopDispatchContext)_localctx).expr = expr(0);
								((OopDispatchContext)_localctx).params.add(((OopDispatchContext)_localctx).expr);
								}
								}
								setState(204);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(207);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 25);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\2\3\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5"+
		"\64\13\5\5\5\66\n\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5F\n\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\5\bd"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\6\by\n\b\r\b\16\bz\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0083\n\b\f"+
		"\b\16\b\u0086\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u008f\n\b\r\b\16\b"+
		"\u0090\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c3"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cb\n\b\f\b\16\b\u00ce\13\b\5\b\u00d0"+
		"\n\b\3\b\7\b\u00d3\n\b\f\b\16\b\u00d6\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16"+
		"\2\2\2\u00f9\2\21\3\2\2\2\4\27\3\2\2\2\6\'\3\2\2\2\bH\3\2\2\2\nJ\3\2\2"+
		"\2\fQ\3\2\2\2\16\u00a8\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2"+
		"\2\23\21\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2"+
		"\2\27\30\7\4\2\2\30\33\7\27\2\2\31\32\7\5\2\2\32\34\7\27\2\2\33\31\3\2"+
		"\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35!\7(\2\2\36 \5\b\5\2\37\36\3\2\2\2"+
		" #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7)\2\2%&\7 \2"+
		"\2&\5\3\2\2\2\'(\7\30\2\2()\7\"\2\2)*\7\27\2\2*\7\3\2\2\2+,\7\30\2\2,"+
		"\65\7&\2\2-\62\5\6\4\2./\7#\2\2/\61\5\6\4\2\60.\3\2\2\2\61\64\3\2\2\2"+
		"\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\65-\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\3\2\2\2\678\7\'\2\289\7\"\2\29:\7\27\2\2:<\7(\2\2;="+
		"\5\16\b\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7)\2\2?I\7 \2\2@A\7\30\2\2A"+
		"B\7\"\2\2BE\7\27\2\2CD\7%\2\2DF\5\16\b\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2"+
		"GI\7 \2\2H+\3\2\2\2H@\3\2\2\2I\t\3\2\2\2JK\7\30\2\2KL\7\"\2\2LO\7\27\2"+
		"\2MN\7%\2\2NP\5\16\b\2OM\3\2\2\2OP\3\2\2\2P\13\3\2\2\2QR\7\30\2\2RS\7"+
		"\"\2\2ST\7\27\2\2TU\7\61\2\2UV\5\16\b\2VW\7 \2\2W\r\3\2\2\2XY\b\b\1\2"+
		"YZ\7\30\2\2Zc\7&\2\2[`\5\16\b\2\\]\7#\2\2]_\5\16\b\2^\\\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2c[\3\2\2\2cd\3\2\2\2de\3\2"+
		"\2\2e\u00a9\7\'\2\2fg\7\7\2\2gh\5\16\b\2hi\7\b\2\2ij\5\16\b\2jk\7\t\2"+
		"\2kl\5\16\b\2lm\7\n\2\2m\u00a9\3\2\2\2no\7\20\2\2op\5\16\b\2pq\7\21\2"+
		"\2qr\5\16\b\2rs\7\22\2\2s\u00a9\3\2\2\2tx\7(\2\2uv\5\16\b\2vw\7 \2\2w"+
		"y\3\2\2\2xu\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7)\2\2}"+
		"\u00a9\3\2\2\2~\177\7\16\2\2\177\u0084\5\n\6\2\u0080\u0081\7#\2\2\u0081"+
		"\u0083\5\n\6\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u0088\7\17\2\2\u0088\u0089\5\16\b\26\u0089\u00a9\3\2\2\2\u008a\u008b"+
		"\7\13\2\2\u008b\u008c\5\16\b\2\u008c\u008e\7\r\2\2\u008d\u008f\5\f\7\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\f\2\2\u0093\u00a9\3\2\2\2\u0094"+
		"\u0095\7\6\2\2\u0095\u00a9\7\27\2\2\u0096\u0097\7\26\2\2\u0097\u00a9\5"+
		"\16\b\23\u0098\u0099\7$\2\2\u0099\u00a9\5\16\b\16\u009a\u009b\7\25\2\2"+
		"\u009b\u00a9\5\16\b\n\u009c\u009d\7\30\2\2\u009d\u009e\7%\2\2\u009e\u00a9"+
		"\5\16\b\t\u009f\u00a0\7&\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00a2\7\'\2\2"+
		"\u00a2\u00a9\3\2\2\2\u00a3\u00a9\7\30\2\2\u00a4\u00a9\7\33\2\2\u00a5\u00a9"+
		"\7\34\2\2\u00a6\u00a9\7\23\2\2\u00a7\u00a9\7\24\2\2\u00a8X\3\2\2\2\u00a8"+
		"f\3\2\2\2\u00a8n\3\2\2\2\u00a8t\3\2\2\2\u00a8~\3\2\2\2\u00a8\u008a\3\2"+
		"\2\2\u00a8\u0094\3\2\2\2\u00a8\u0096\3\2\2\2\u00a8\u0098\3\2\2\2\u00a8"+
		"\u009a\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a3\3\2"+
		"\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00d4\3\2\2\2\u00aa\u00ab\f\22\2\2\u00ab\u00ac\7"+
		",\2\2\u00ac\u00d3\5\16\b\23\u00ad\u00ae\f\21\2\2\u00ae\u00af\7-\2\2\u00af"+
		"\u00d3\5\16\b\22\u00b0\u00b1\f\20\2\2\u00b1\u00b2\7*\2\2\u00b2\u00d3\5"+
		"\16\b\21\u00b3\u00b4\f\17\2\2\u00b4\u00b5\7+\2\2\u00b5\u00d3\5\16\b\20"+
		"\u00b6\u00b7\f\r\2\2\u00b7\u00b8\7/\2\2\u00b8\u00d3\5\16\b\16\u00b9\u00ba"+
		"\f\f\2\2\u00ba\u00bb\7\60\2\2\u00bb\u00d3\5\16\b\r\u00bc\u00bd\f\13\2"+
		"\2\u00bd\u00be\7.\2\2\u00be\u00d3\5\16\b\f\u00bf\u00c2\f\33\2\2\u00c0"+
		"\u00c1\7\62\2\2\u00c1\u00c3\7\27\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7!\2\2\u00c5\u00c6\7\30\2\2\u00c6"+
		"\u00cf\7&\2\2\u00c7\u00cc\5\16\b\2\u00c8\u00c9\7#\2\2\u00c9\u00cb\5\16"+
		"\b\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00c7\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\7\'\2\2\u00d2"+
		"\u00aa\3\2\2\2\u00d2\u00ad\3\2\2\2\u00d2\u00b0\3\2\2\2\u00d2\u00b3\3\2"+
		"\2\2\u00d2\u00b6\3\2\2\2\u00d2\u00b9\3\2\2\2\u00d2\u00bc\3\2\2\2\u00d2"+
		"\u00bf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\17\3\2\2\2\u00d6\u00d4\3\2\2\2\26\23\33!\62\65<EHO`cz\u0084"+
		"\u0090\u00a8\u00c2\u00cc\u00cf\u00d2\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}