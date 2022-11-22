// Generated from cool/parser/CoolParser.g4 by ANTLR 4.10.1

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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, CL_CLASS=2, INHERITS=3, NEW=4, IF=5, THEN=6, ELSE=7, FI=8, CASE=9, 
		ESAC=10, OF=11, LET=12, IN=13, WHILE=14, LOOP=15, POOL=16, TRUE=17, FALSE=18, 
		NOT=19, ISVOID=20, TYPE_ID=21, OBJ_ID=22, SELF=23, SELF_TYPE=24, INTEGER=25, 
		STRING=26, LINE_COMMENT=27, BLOCK_COMMENT=28, SEMI=29, DOT=30, COLON=31, 
		COMMA=32, NEGATE=33, ASSIGN=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, 
		PLUS=39, MINUS=40, MULT=41, DIV=42, EQUAL=43, LT=44, LE=45, CASE_EXPR=46, 
		PARENT_CLASS=47, END_FILE=48, WS=49;
	public static final int
		RULE_program = 0, RULE_cl_class = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "cl_class", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'inherits'", "'new'", "'if'", "'then'", "'else'", 
			"'fi'", "'case'", "'esac'", "'of'", "'let'", "'in'", "'while'", "'loop'", 
			"'pool'", "'true'", "'false'", "'not'", "'isvoid'", null, null, "'self'", 
			"'SELF_TYPE'", null, null, null, null, "';'", "'.'", "':'", "','", "'~'", 
			"'<-'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"'<'", "'<='", "'=>'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "CL_CLASS", "INHERITS", "NEW", "IF", "THEN", "ELSE", "FI", 
			"CASE", "ESAC", "OF", "LET", "IN", "WHILE", "LOOP", "POOL", "TRUE", "FALSE", 
			"NOT", "ISVOID", "TYPE_ID", "OBJ_ID", "SELF", "SELF_TYPE", "INTEGER", 
			"STRING", "LINE_COMMENT", "BLOCK_COMMENT", "SEMI", "DOT", "COLON", "COMMA", 
			"NEGATE", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "PLUS", "MINUS", 
			"MULT", "DIV", "EQUAL", "LT", "LE", "CASE_EXPR", "PARENT_CLASS", "END_FILE", 
			"WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				((ProgramContext)_localctx).cl_class = cl_class();
				((ProgramContext)_localctx).class_list.add(((ProgramContext)_localctx).cl_class);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CL_CLASS );
			setState(15);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cl_classContext cl_class() throws RecognitionException {
		Cl_classContext _localctx = new Cl_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cl_class);
		int _la;
		try {
			_localctx = new ClassDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(CL_CLASS);
			setState(18);
			((ClassDefContext)_localctx).type = match(TYPE_ID);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(19);
				match(INHERITS);
				setState(20);
				((ClassDefContext)_localctx).inherit = match(TYPE_ID);
				}
			}

			setState(23);
			match(LBRACE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJ_ID) {
				{
				{
				setState(24);
				((ClassDefContext)_localctx).feature = feature();
				((ClassDefContext)_localctx).feat_list.add(((ClassDefContext)_localctx).feature);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(RBRACE);
			setState(31);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((FuncDefContext)_localctx).id = match(OBJ_ID);
				setState(34);
				match(LPAREN);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJ_ID) {
					{
					setState(35);
					((FuncDefContext)_localctx).formal = formal();
					((FuncDefContext)_localctx).formal_list.add(((FuncDefContext)_localctx).formal);
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(36);
						match(COMMA);
						setState(37);
						((FuncDefContext)_localctx).formal = formal();
						((FuncDefContext)_localctx).formal_list.add(((FuncDefContext)_localctx).formal);
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				match(RPAREN);
				setState(46);
				match(COLON);
				setState(47);
				((FuncDefContext)_localctx).type = match(TYPE_ID);
				setState(48);
				match(LBRACE);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << CASE) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << NEGATE) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					setState(49);
					((FuncDefContext)_localctx).f_body = expr(0);
					}
				}

				setState(52);
				match(RBRACE);
				setState(53);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((VarDefContext)_localctx).id = match(OBJ_ID);
				setState(55);
				match(COLON);
				setState(56);
				((VarDefContext)_localctx).type = match(TYPE_ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(57);
					match(ASSIGN);
					setState(58);
					((VarDefContext)_localctx).init = expr(0);
					}
				}

				setState(61);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((FormalContext)_localctx).id = match(OBJ_ID);
			setState(65);
			match(COLON);
			setState(66);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLessThanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLessThanEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLessThanEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Obj_idContext extends ExprContext {
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public Obj_idContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterObj_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitObj_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitObj_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(CoolParser.FALSE, 0); }
		public BoolFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewInstanceContext extends ExprContext {
		public Token type;
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public NewInstanceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNewInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNewInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNewInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OopDispatchContext extends ExprContext {
		public ExprContext left;
		public Token type;
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
		public TerminalNode PARENT_CLASS() { return getToken(CoolParser.PARENT_CLASS, 0); }
		public TerminalNode TYPE_ID() { return getToken(CoolParser.TYPE_ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public OopDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterOopDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitOopDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitOopDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExprContext extends ExprContext {
		public TerminalNode NEGATE() { return getToken(CoolParser.NEGATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNegateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNegateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNegateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(CoolParser.TRUE, 0); }
		public BoolTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidCheckContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VoidCheckContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterVoidCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitVoidCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitVoidCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public ClStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClIntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(CoolParser.INTEGER, 0); }
		public ClIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisonContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode DIV() { return getToken(CoolParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterDivison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitDivison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitDivison(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleAssignContext extends ExprContext {
		public Token id;
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OBJ_ID() { return getToken(CoolParser.OBJ_ID, 0); }
		public SimpleAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterSimpleAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitSimpleAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitSimpleAssign(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExprContext {
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> CASE_EXPR() { return getTokens(CoolParser.CASE_EXPR); }
		public TerminalNode CASE_EXPR(int i) {
			return getToken(CoolParser.CASE_EXPR, i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				((SimpleAssignContext)_localctx).id = match(OBJ_ID);
				setState(70);
				match(ASSIGN);
				setState(71);
				expr(23);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				((FuncCallContext)_localctx).id = match(OBJ_ID);
				setState(73);
				match(LPAREN);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << CASE) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << NEGATE) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					setState(74);
					((FuncCallContext)_localctx).expr = expr(0);
					((FuncCallContext)_localctx).params.add(((FuncCallContext)_localctx).expr);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(75);
						match(COMMA);
						setState(76);
						((FuncCallContext)_localctx).expr = expr(0);
						((FuncCallContext)_localctx).params.add(((FuncCallContext)_localctx).expr);
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new WhileLoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(WHILE);
				setState(86);
				((WhileLoopContext)_localctx).cond_expr = expr(0);
				setState(87);
				match(LOOP);
				setState(88);
				((WhileLoopContext)_localctx).instr_expr = expr(0);
				setState(89);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(LBRACE);
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					expr(0);
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << CASE) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << NEGATE) | (1L << LPAREN) | (1L << LBRACE))) != 0) );
				setState(97);
				match(RBRACE);
				}
				break;
			case 5:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(CASE);
				setState(100);
				expr(0);
				setState(101);
				match(OF);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					formal();
					setState(103);
					match(CASE_EXPR);
					setState(104);
					expr(0);
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJ_ID );
				setState(110);
				match(ESAC);
				}
				break;
			case 6:
				{
				_localctx = new NewInstanceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(NEW);
				setState(113);
				((NewInstanceContext)_localctx).type = match(TYPE_ID);
				}
				break;
			case 7:
				{
				_localctx = new VoidCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(ISVOID);
				setState(115);
				expr(16);
				}
				break;
			case 8:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(NEGATE);
				setState(117);
				expr(11);
				}
				break;
			case 9:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(NOT);
				setState(119);
				expr(7);
				}
				break;
			case 10:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(LPAREN);
				setState(121);
				expr(0);
				setState(122);
				match(RPAREN);
				}
				break;
			case 11:
				{
				_localctx = new Obj_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(OBJ_ID);
				}
				break;
			case 12:
				{
				_localctx = new ClIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(INTEGER);
				}
				break;
			case 13:
				{
				_localctx = new ClStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(TRUE);
				}
				break;
			case 15:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(132);
						match(PLUS);
						setState(133);
						((AdditionContext)_localctx).right = expr(16);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(135);
						match(MINUS);
						setState(136);
						((SubtractionContext)_localctx).right = expr(15);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(138);
						match(MULT);
						setState(139);
						((MultiplicationContext)_localctx).right = expr(14);
						}
						break;
					case 4:
						{
						_localctx = new DivisonContext(new ExprContext(_parentctx, _parentState));
						((DivisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(141);
						match(DIV);
						setState(142);
						((DivisonContext)_localctx).right = expr(13);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						((LessThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(144);
						match(LT);
						setState(145);
						((LessThanContext)_localctx).right = expr(11);
						}
						break;
					case 6:
						{
						_localctx = new LessThanEqualContext(new ExprContext(_parentctx, _parentState));
						((LessThanEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(147);
						match(LE);
						setState(148);
						((LessThanEqualContext)_localctx).right = expr(10);
						}
						break;
					case 7:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						((EqualityContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(150);
						match(EQUAL);
						setState(151);
						((EqualityContext)_localctx).right = expr(9);
						}
						break;
					case 8:
						{
						_localctx = new OopDispatchContext(new ExprContext(_parentctx, _parentState));
						((OopDispatchContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==PARENT_CLASS) {
							{
							setState(153);
							match(PARENT_CLASS);
							setState(154);
							((OopDispatchContext)_localctx).type = match(TYPE_ID);
							}
						}

						setState(157);
						match(DOT);
						setState(158);
						match(LPAREN);
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << CASE) | (1L << WHILE) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ISVOID) | (1L << OBJ_ID) | (1L << INTEGER) | (1L << STRING) | (1L << NEGATE) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
							{
							setState(159);
							((OopDispatchContext)_localctx).expr = expr(0);
							((OopDispatchContext)_localctx).params.add(((OopDispatchContext)_localctx).expr);
							setState(164);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(160);
								match(COMMA);
								setState(161);
								((OopDispatchContext)_localctx).expr = expr(0);
								((OopDispatchContext)_localctx).params.add(((OopDispatchContext)_localctx).expr);
								}
								}
								setState(166);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(169);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u00b0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*"+
		"\t\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b"+
		"\u0002\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004N\b"+
		"\u0004\n\u0004\f\u0004Q\t\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004^\b\u0004\u000b\u0004\f\u0004_\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004k\b\u0004\u000b\u0004\f\u0004l\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0082\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009c\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a3\b\u0004\n"+
		"\u0004\f\u0004\u00a6\t\u0004\u0003\u0004\u00a8\b\u0004\u0001\u0004\u0005"+
		"\u0004\u00ab\b\u0004\n\u0004\f\u0004\u00ae\t\u0004\u0001\u0004\u0000\u0001"+
		"\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000\u00cf\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004>\u0001\u0000"+
		"\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\b\u0081\u0001\u0000\u0000"+
		"\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0005"+
		"\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0005"+
		"\u0002\u0000\u0000\u0012\u0015\u0005\u0015\u0000\u0000\u0013\u0014\u0005"+
		"\u0003\u0000\u0000\u0014\u0016\u0005\u0015\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u001b\u0005%\u0000\u0000\u0018\u001a\u0003\u0004"+
		"\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005&\u0000\u0000\u001f \u0005\u001d\u0000\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!\"\u0005\u0016\u0000\u0000\"+\u0005#\u0000"+
		"\u0000#(\u0003\u0006\u0003\u0000$%\u0005 \u0000\u0000%\'\u0003\u0006\u0003"+
		"\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000+#\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-.\u0005$\u0000\u0000./\u0005\u001f\u0000\u0000"+
		"/0\u0005\u0015\u0000\u000002\u0005%\u0000\u000013\u0003\b\u0004\u0000"+
		"21\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0005&\u0000\u00005?\u0005\u001d\u0000\u000067\u0005\u0016\u0000"+
		"\u000078\u0005\u001f\u0000\u00008;\u0005\u0015\u0000\u00009:\u0005\"\u0000"+
		"\u0000:<\u0003\b\u0004\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0005\u001d\u0000\u0000>!\u0001\u0000"+
		"\u0000\u0000>6\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0016\u0000\u0000AB\u0005\u001f\u0000\u0000BC\u0005\u0015\u0000"+
		"\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0006\u0004\uffff\uffff\u0000"+
		"EF\u0005\u0016\u0000\u0000FG\u0005\"\u0000\u0000G\u0082\u0003\b\u0004"+
		"\u0017HI\u0005\u0016\u0000\u0000IR\u0005#\u0000\u0000JO\u0003\b\u0004"+
		"\u0000KL\u0005 \u0000\u0000LN\u0003\b\u0004\u0000MK\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RJ\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T\u0082\u0005$\u0000\u0000UV\u0005\u000e\u0000\u0000VW\u0003\b\u0004\u0000"+
		"WX\u0005\u000f\u0000\u0000XY\u0003\b\u0004\u0000YZ\u0005\u0010\u0000\u0000"+
		"Z\u0082\u0001\u0000\u0000\u0000[]\u0005%\u0000\u0000\\^\u0003\b\u0004"+
		"\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005"+
		"&\u0000\u0000b\u0082\u0001\u0000\u0000\u0000cd\u0005\t\u0000\u0000de\u0003"+
		"\b\u0004\u0000ej\u0005\u000b\u0000\u0000fg\u0003\u0006\u0003\u0000gh\u0005"+
		".\u0000\u0000hi\u0003\b\u0004\u0000ik\u0001\u0000\u0000\u0000jf\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000"+
		"o\u0082\u0001\u0000\u0000\u0000pq\u0005\u0004\u0000\u0000q\u0082\u0005"+
		"\u0015\u0000\u0000rs\u0005\u0014\u0000\u0000s\u0082\u0003\b\u0004\u0010"+
		"tu\u0005!\u0000\u0000u\u0082\u0003\b\u0004\u000bvw\u0005\u0013\u0000\u0000"+
		"w\u0082\u0003\b\u0004\u0007xy\u0005#\u0000\u0000yz\u0003\b\u0004\u0000"+
		"z{\u0005$\u0000\u0000{\u0082\u0001\u0000\u0000\u0000|\u0082\u0005\u0016"+
		"\u0000\u0000}\u0082\u0005\u0019\u0000\u0000~\u0082\u0005\u001a\u0000\u0000"+
		"\u007f\u0082\u0005\u0011\u0000\u0000\u0080\u0082\u0005\u0012\u0000\u0000"+
		"\u0081D\u0001\u0000\u0000\u0000\u0081H\u0001\u0000\u0000\u0000\u0081U"+
		"\u0001\u0000\u0000\u0000\u0081[\u0001\u0000\u0000\u0000\u0081c\u0001\u0000"+
		"\u0000\u0000\u0081p\u0001\u0000\u0000\u0000\u0081r\u0001\u0000\u0000\u0000"+
		"\u0081t\u0001\u0000\u0000\u0000\u0081v\u0001\u0000\u0000\u0000\u0081x"+
		"\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000"+
		"\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u00ac\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\n\u000f\u0000\u0000\u0084\u0085\u0005\'\u0000\u0000"+
		"\u0085\u00ab\u0003\b\u0004\u0010\u0086\u0087\n\u000e\u0000\u0000\u0087"+
		"\u0088\u0005(\u0000\u0000\u0088\u00ab\u0003\b\u0004\u000f\u0089\u008a"+
		"\n\r\u0000\u0000\u008a\u008b\u0005)\u0000\u0000\u008b\u00ab\u0003\b\u0004"+
		"\u000e\u008c\u008d\n\f\u0000\u0000\u008d\u008e\u0005*\u0000\u0000\u008e"+
		"\u00ab\u0003\b\u0004\r\u008f\u0090\n\n\u0000\u0000\u0090\u0091\u0005,"+
		"\u0000\u0000\u0091\u00ab\u0003\b\u0004\u000b\u0092\u0093\n\t\u0000\u0000"+
		"\u0093\u0094\u0005-\u0000\u0000\u0094\u00ab\u0003\b\u0004\n\u0095\u0096"+
		"\n\b\u0000\u0000\u0096\u0097\u0005+\u0000\u0000\u0097\u00ab\u0003\b\u0004"+
		"\t\u0098\u009b\n\u0016\u0000\u0000\u0099\u009a\u0005/\u0000\u0000\u009a"+
		"\u009c\u0005\u0015\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\u001e\u0000\u0000\u009e\u00a7\u0005#\u0000\u0000\u009f\u00a4"+
		"\u0003\b\u0004\u0000\u00a0\u00a1\u0005 \u0000\u0000\u00a1\u00a3\u0003"+
		"\b\u0004\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u009f\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005$\u0000"+
		"\u0000\u00aa\u0083\u0001\u0000\u0000\u0000\u00aa\u0086\u0001\u0000\u0000"+
		"\u0000\u00aa\u0089\u0001\u0000\u0000\u0000\u00aa\u008c\u0001\u0000\u0000"+
		"\u0000\u00aa\u008f\u0001\u0000\u0000\u0000\u00aa\u0092\u0001\u0000\u0000"+
		"\u0000\u00aa\u0095\u0001\u0000\u0000\u0000\u00aa\u0098\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\t\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u0012\r\u0015\u001b(+2;>OR_l\u0081"+
		"\u009b\u00a4\u00a7\u00aa\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}