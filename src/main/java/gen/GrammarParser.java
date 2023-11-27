// Generated from C:/Users/danie/Documents/A3_Computacao_Grafica/CompiladorA3/src/main/antlr4/Grammar.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TYPE=5, ID=6, INT=7, FLOAT=8, STRING=9, 
		PLUS=10, ASSING=11, EQUALS=12, IF=13, ELSE=14, SEMICOLON=15, NOTEQUAL=16, 
		LT=17, LTEQUAL=18, GT=19, GTEQUAL=20, PRINT=21, NEWLINE=22, WS=23, COMMENT=24;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_var = 2, RULE_compare = 3, 
		RULE_statementEnd = 4, RULE_assignment = 5, RULE_expression = 6, RULE_condition = 7, 
		RULE_printStatement = 8, RULE_ifStatement = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "var", "compare", "statementEnd", "assignment", 
			"expression", "condition", "printStatement", "ifStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", null, null, null, null, null, "'+'", 
			"'='", "'=='", "'if'", "'else'", "';'", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TYPE", "ID", "INT", "FLOAT", "STRING", 
			"PLUS", "ASSING", "EQUALS", "IF", "ELSE", "SEMICOLON", "NOTEQUAL", "LT", 
			"LTEQUAL", "GT", "GTEQUAL", "PRINT", "NEWLINE", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2106336L) != 0)) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				ifStatement();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				printStatement();
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				expression();
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CompareContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(GrammarParser.EQUALS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(GrammarParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode LTEQUAL() { return getToken(GrammarParser.LTEQUAL, 0); }
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode GTEQUAL() { return getToken(GrammarParser.GTEQUAL, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2035712L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class StatementEndContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public StatementEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatementEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatementEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatementEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementEndContext statementEnd() throws RecognitionException {
		StatementEndContext _localctx = new StatementEndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(SEMICOLON);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammarParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSING() { return getToken(GrammarParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(TYPE);
			setState(41);
			match(ID);
			setState(42);
			match(ASSING);
			setState(43);
			expression();
			setState(44);
			statementEnd();
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(GrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GrammarParser.PLUS, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(47);
					match(PLUS);
					setState(48);
					match(ID);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				var();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(55);
					match(PLUS);
					setState(56);
					var();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(ID);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(63);
					match(PLUS);
					setState(64);
					var();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				var();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(71);
					match(PLUS);
					setState(72);
					match(ID);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				var();
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
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(ID);
				{
				setState(82);
				compare();
				}
				setState(83);
				match(ID);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				var();
				{
				setState(86);
				compare();
				}
				setState(87);
				var();
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementEndContext statementEnd() {
			return getRuleContext(StatementEndContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(PRINT);
			setState(92);
			match(T__0);
			setState(93);
			expression();
			setState(94);
			match(T__1);
			setState(95);
			statementEnd();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IF);
			setState(98);
			match(T__0);
			setState(99);
			condition();
			setState(100);
			match(T__1);
			setState(101);
			match(T__2);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				statement();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2106336L) != 0) );
			setState(107);
			match(T__3);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(108);
				match(ELSE);
				setState(109);
				match(T__2);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					statement();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2106336L) != 0) );
				setState(115);
				match(T__3);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u00062\b\u0006\n\u0006\f\u00065\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006:\b\u0006\n\u0006\f\u0006=\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006B\b\u0006\n\u0006\f\u0006"+
		"E\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006J\b\u0006\n\u0006"+
		"\f\u0006M\t\u0006\u0001\u0006\u0003\u0006P\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007Z\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\th\b\t\u000b\t"+
		"\f\ti\u0001\t\u0001\t\u0001\t\u0001\t\u0004\tp\b\t\u000b\t\f\tq\u0001"+
		"\t\u0001\t\u0003\tv\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000\u0007\t\u0002\u0000\f"+
		"\f\u0010\u0014}\u0000\u0017\u0001\u0000\u0000\u0000\u0002 \u0001\u0000"+
		"\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000"+
		"\u0000\b&\u0001\u0000\u0000\u0000\n(\u0001\u0000\u0000\u0000\fO\u0001"+
		"\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000"+
		"\u0000\u0012a\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000"+
		"\u001c!\u0003\n\u0005\u0000\u001d!\u0003\u0012\t\u0000\u001e!\u0003\u0010"+
		"\b\u0000\u001f!\u0003\f\u0006\u0000 \u001c\u0001\u0000\u0000\u0000 \u001d"+
		"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000"+
		"\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0007\u0000\u0000\u0000"+
		"#\u0005\u0001\u0000\u0000\u0000$%\u0007\u0001\u0000\u0000%\u0007\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u000f\u0000\u0000\'\t\u0001\u0000\u0000\u0000"+
		"()\u0005\u0005\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005\u000b\u0000"+
		"\u0000+,\u0003\f\u0006\u0000,-\u0003\b\u0004\u0000-\u000b\u0001\u0000"+
		"\u0000\u0000.3\u0005\u0006\u0000\u0000/0\u0005\n\u0000\u000002\u0005\u0006"+
		"\u0000\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u00004P\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u00006;\u0003\u0004\u0002\u000078\u0005\n\u0000\u0000"+
		"8:\u0003\u0004\u0002\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<P\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>C\u0005\u0006\u0000\u0000?@\u0005"+
		"\n\u0000\u0000@B\u0003\u0004\u0002\u0000A?\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DP\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FK\u0003\u0004\u0002"+
		"\u0000GH\u0005\n\u0000\u0000HJ\u0005\u0006\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LP\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NP\u0003"+
		"\u0004\u0002\u0000O.\u0001\u0000\u0000\u0000O6\u0001\u0000\u0000\u0000"+
		"O>\u0001\u0000\u0000\u0000OF\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000P\r\u0001\u0000\u0000\u0000QR\u0005\u0006\u0000\u0000RS\u0003\u0006"+
		"\u0003\u0000ST\u0005\u0006\u0000\u0000TZ\u0001\u0000\u0000\u0000UV\u0003"+
		"\u0004\u0002\u0000VW\u0003\u0006\u0003\u0000WX\u0003\u0004\u0002\u0000"+
		"XZ\u0001\u0000\u0000\u0000YQ\u0001\u0000\u0000\u0000YU\u0001\u0000\u0000"+
		"\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0005\u0015\u0000\u0000\\]\u0005"+
		"\u0001\u0000\u0000]^\u0003\f\u0006\u0000^_\u0005\u0002\u0000\u0000_`\u0003"+
		"\b\u0004\u0000`\u0011\u0001\u0000\u0000\u0000ab\u0005\r\u0000\u0000bc"+
		"\u0005\u0001\u0000\u0000cd\u0003\u000e\u0007\u0000de\u0005\u0002\u0000"+
		"\u0000eg\u0005\u0003\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ku\u0005\u0004\u0000\u0000"+
		"lm\u0005\u000e\u0000\u0000mo\u0005\u0003\u0000\u0000np\u0003\u0002\u0001"+
		"\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005"+
		"\u0004\u0000\u0000tv\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u0013\u0001\u0000\u0000\u0000\u000b\u0017"+
		" 3;CKOYiqu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}