/* SQFParser.java */
/* Generated By:JavaCC: Do not edit this line. SQFParser.java */
package cz.zipek.sqflint.parser;

public class SQFParser implements SQFParserConstants {
        public void setTabSize(int size) {
                jj_input_stream.setTabSize(size);
        }

        protected void handleName() throws ParseException {
        }

        protected void recover(ParseException ex, int target) throws ParseException {

        }

  final public void CompilationUnit() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BANG:
      case BANG2:
      case FOR:
      case IF:
      case NULL:
      case SWITCH:
      case WHILE:
      case TRUE:
      case FALSE:
      case INTEGER_LITERAL:
      case FLOATING_POINT_LITERAL:
      case STRING_LITERAL:
      case STRING_LITERAL_OTHER:
      case IDENTIFIER:
      case LPAREN:
      case LBRACE:
      case LBRACKET:
      case SEMICOLON:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      BlockStatement();
    }
    jj_consume_token(0);
  }

/*

============ END OF TOKENS =============
============ START OF LANG =============

*/
  final public 


void Literal() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INTEGER_LITERAL:{
      jj_consume_token(INTEGER_LITERAL);
      break;
      }
    case FLOATING_POINT_LITERAL:{
      jj_consume_token(FLOATING_POINT_LITERAL);
      break;
      }
    case STRING_LITERAL:{
      jj_consume_token(STRING_LITERAL);
      break;
      }
    case STRING_LITERAL_OTHER:{
      jj_consume_token(STRING_LITERAL_OTHER);
      break;
      }
    case TRUE:
    case FALSE:{
      BooleanLiteral();
      break;
      }
    case NULL:{
      NullLiteral();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void BooleanLiteral() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case TRUE:{
      jj_consume_token(TRUE);
      break;
      }
    case FALSE:{
      jj_consume_token(FALSE);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void NullLiteral() throws ParseException {
    jj_consume_token(NULL);
  }

  final public void Operator() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CSEL:{
      jj_consume_token(CSEL);
      break;
      }
    case ASSIGN:{
      jj_consume_token(ASSIGN);
      break;
      }
    case EQ:{
      jj_consume_token(EQ);
      break;
      }
    case 70:{
      jj_consume_token(70);
      break;
      }
    case GT:{
      jj_consume_token(GT);
      break;
      }
    case LT:{
      jj_consume_token(LT);
      break;
      }
    case PLUS:{
      jj_consume_token(PLUS);
      break;
      }
    case MINUS:{
      jj_consume_token(MINUS);
      break;
      }
    case STAR:{
      jj_consume_token(STAR);
      break;
      }
    case REM:{
      jj_consume_token(REM);
      break;
      }
    case SC_AND:{
      jj_consume_token(SC_AND);
      break;
      }
    case SC_OR:{
      jj_consume_token(SC_OR);
      break;
      }
    case REM2:{
      jj_consume_token(REM2);
      break;
      }
    case POWER:{
      jj_consume_token(POWER);
      break;
      }
    case GTEQ:{
      jj_consume_token(GTEQ);
      break;
      }
    case LTEQ:{
      jj_consume_token(LTEQ);
      break;
      }
    case SLASH:{
      jj_consume_token(SLASH);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Name() throws ParseException {handleName();
    jj_consume_token(IDENTIFIER);
  }

  final public void Expression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case BANG:
    case BANG2:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BANG:{
        jj_consume_token(BANG);
        break;
        }
      case BANG2:{
        jj_consume_token(BANG2);
        break;
        }
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Expression();
      break;
      }
    case NULL:
    case TRUE:
    case FALSE:
    case INTEGER_LITERAL:
    case FLOATING_POINT_LITERAL:
    case STRING_LITERAL:
    case STRING_LITERAL_OTHER:
    case IDENTIFIER:
    case LPAREN:
    case LBRACE:
    case LBRACKET:{
      PrimaryExpression();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ASSIGN:
      case GT:
      case LT:
      case GTEQ:
      case LTEQ:
      case EQ:
      case SC_OR:
      case SC_AND:
      case PLUS:
      case MINUS:
      case STAR:
      case SLASH:
      case POWER:
      case REM:
      case REM2:
      case CSEL:
      case 70:{
        Operator();
        break;
        }
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BANG:
      case BANG2:
      case NULL:
      case TRUE:
      case FALSE:
      case INTEGER_LITERAL:
      case FLOATING_POINT_LITERAL:
      case STRING_LITERAL:
      case STRING_LITERAL_OTHER:
      case IDENTIFIER:
      case LPAREN:
      case LBRACE:
      case LBRACKET:{
        Expression();
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        ;
      }
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Array() throws ParseException {
    if (jj_2_1(2)) {
      jj_consume_token(LBRACKET);
      Expression();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          break label_2;
        }
        jj_consume_token(COMMA);
        Expression();
      }
      jj_consume_token(RBRACKET);
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LBRACKET:{
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

/*
void BinaryExpression() :
{}
{
	UnaryExpression() [ Operator() Expression() ]
}

void UnaryExpression() :
{}
{
	PrimaryExpression() [ Expression() ] |
	("!" | "not ") PrimaryExpression()
}
*/
  final public 
void PrimaryExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case NULL:
    case TRUE:
    case FALSE:
    case INTEGER_LITERAL:
    case FLOATING_POINT_LITERAL:
    case STRING_LITERAL:
    case STRING_LITERAL_OTHER:{
      Literal();
      break;
      }
    case LPAREN:{
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      break;
      }
    case IDENTIFIER:{
      Name();
      break;
      }
    case LBRACE:{
      Block();
      break;
      }
    case LBRACKET:{
      Array();
      break;
      }
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Block() throws ParseException {
    if (jj_2_2(2)) {
      jj_consume_token(LBRACE);
      jj_consume_token(RBRACE);
    } else {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LBRACE:{
        jj_consume_token(LBRACE);
        Statement();
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case SEMICOLON:{
          jj_consume_token(SEMICOLON);
          label_3:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case BANG:
            case BANG2:
            case FOR:
            case IF:
            case NULL:
            case SWITCH:
            case WHILE:
            case TRUE:
            case FALSE:
            case INTEGER_LITERAL:
            case FLOATING_POINT_LITERAL:
            case STRING_LITERAL:
            case STRING_LITERAL_OTHER:
            case IDENTIFIER:
            case LPAREN:
            case LBRACE:
            case LBRACKET:
            case SEMICOLON:{
              ;
              break;
              }
            default:
              jj_la1[11] = jj_gen;
              break label_3;
            }
            BlockStatement();
          }
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          ;
        }
        jj_consume_token(RBRACE);
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void BlockStatement() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case SEMICOLON:{
        EmptyStatement();
        break;
        }
      case BANG:
      case BANG2:
      case FOR:
      case IF:
      case NULL:
      case SWITCH:
      case WHILE:
      case TRUE:
      case FALSE:
      case INTEGER_LITERAL:
      case FLOATING_POINT_LITERAL:
      case STRING_LITERAL:
      case STRING_LITERAL_OTHER:
      case IDENTIFIER:
      case LPAREN:
      case LBRACE:
      case LBRACKET:{
        Statement();
        jj_consume_token(SEMICOLON);
        break;
        }
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException ex) {
recover(ex, SEMICOLON);
    }
  }

  final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case SWITCH:{
      SwitchStatement();
      break;
      }
    case IF:{
      IfStatement();
      break;
      }
    case WHILE:{
      WhileStatement();
      break;
      }
    case FOR:{
      ForStatement();
      break;
      }
    case BANG:
    case BANG2:
    case NULL:
    case TRUE:
    case FALSE:
    case INTEGER_LITERAL:
    case FLOATING_POINT_LITERAL:
    case STRING_LITERAL:
    case STRING_LITERAL_OTHER:
    case IDENTIFIER:
    case LPAREN:
    case LBRACE:
    case LBRACKET:{
      StatementExpression();
      break;
      }
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void EmptyStatement() throws ParseException {
    jj_consume_token(SEMICOLON);
  }

  final public void StatementExpression() throws ParseException {
    Expression();
  }

  final public void SwitchStatement() throws ParseException {
    jj_consume_token(SWITCH);
    Expression();
    jj_consume_token(DO);
    jj_consume_token(LBRACE);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CASE:{
        ;
        break;
        }
      default:
        jj_la1[16] = jj_gen;
        break label_4;
      }
      SwitchCase();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case _DEFAULT:{
      SwitchDefault();
      break;
      }
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    jj_consume_token(RBRACE);
  }

  final public void SwitchCase() throws ParseException {
    SwitchLabel();
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 71:{
      jj_consume_token(71);
      Block();
      jj_consume_token(SEMICOLON);
      break;
      }
    case SEMICOLON:{
      jj_consume_token(SEMICOLON);
      break;
      }
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void SwitchDefault() throws ParseException {
    jj_consume_token(_DEFAULT);
    Block();
    jj_consume_token(SEMICOLON);
  }

  final public void SwitchLabel() throws ParseException {
    jj_consume_token(CASE);
    Expression();
  }

// @TODO: exitWith can't have else :(
  final public void IfStatement() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(LPAREN);
    Expression();
    jj_consume_token(RPAREN);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case THEN:{
      jj_consume_token(THEN);
      Block();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ELSE:{
        jj_consume_token(ELSE);
        Block();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        ;
      }
      break;
      }
    case EXIT_WITH:{
      jj_consume_token(EXIT_WITH);
      Block();
      break;
      }
    default:
      jj_la1[20] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void WhileStatement() throws ParseException {
    jj_consume_token(WHILE);
    Block();
    jj_consume_token(DO);
    Block();
  }

  final public void ForStatement() throws ParseException {
    if (jj_2_3(2)) {
      jj_consume_token(FOR);
      jj_consume_token(LBRACKET);
      Block();
      jj_consume_token(COMMA);
      Block();
      jj_consume_token(COMMA);
      Block();
      jj_consume_token(RBRACKET);
      jj_consume_token(DO);
      Block();
    } else if (jj_2_4(2)) {
      jj_consume_token(FOR);
      StatementExpression();
      jj_consume_token(FROM);
      jj_consume_token(INTEGER_LITERAL);
      jj_consume_token(TO);
      jj_consume_token(INTEGER_LITERAL);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case STEP:{
        jj_consume_token(STEP);
        jj_consume_token(INTEGER_LITERAL);
        break;
        }
      default:
        jj_la1[21] = jj_gen;
        ;
      }
      jj_consume_token(DO);
      Block();
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_3R_12()
 {
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3_4()
 {
    if (jj_scan_token(FOR)) return true;
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3R_11()
 {
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  private boolean jj_3_3()
 {
    if (jj_scan_token(FOR)) return true;
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  private boolean jj_3R_9()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_10()) {
    jj_scanpos = xsp;
    if (jj_3R_11()) {
    jj_scanpos = xsp;
    if (jj_scan_token(58)) {
    jj_scanpos = xsp;
    if (jj_3R_12()) {
    jj_scanpos = xsp;
    if (jj_3R_13()) return true;
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3R_10()
 {
    if (jj_3R_14()) return true;
    return false;
  }

  private boolean jj_3R_6()
 {
    if (jj_3R_5()) return true;
    return false;
  }

  private boolean jj_3R_19()
 {
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  private boolean jj_3_1()
 {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_3R_5()) return true;
    return false;
  }

  private boolean jj_3R_16()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_1()) {
    jj_scanpos = xsp;
    if (jj_3R_19()) return true;
    }
    return false;
  }

  private boolean jj_3R_20()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(48)) {
    jj_scanpos = xsp;
    if (jj_scan_token(49)) return true;
    }
    return false;
  }

  private boolean jj_3R_8()
 {
    if (jj_3R_9()) return true;
    return false;
  }

  private boolean jj_3R_7()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(19)) {
    jj_scanpos = xsp;
    if (jj_scan_token(20)) return true;
    }
    return false;
  }

  private boolean jj_3R_5()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_7()) {
    jj_scanpos = xsp;
    if (jj_3R_8()) return true;
    }
    return false;
  }

  private boolean jj_3R_17()
 {
    if (jj_3R_20()) return true;
    return false;
  }

  private boolean jj_3R_18()
 {
    if (jj_scan_token(LBRACE)) return true;
    return false;
  }

  private boolean jj_3R_14()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(50)) {
    jj_scanpos = xsp;
    if (jj_scan_token(54)) {
    jj_scanpos = xsp;
    if (jj_scan_token(56)) {
    jj_scanpos = xsp;
    if (jj_scan_token(57)) {
    jj_scanpos = xsp;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_scan_token(45)) return true;
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_scan_token(LBRACE)) return true;
    if (jj_scan_token(RBRACE)) return true;
    return false;
  }

  private boolean jj_3R_15()
 {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) return true;
    }
    return false;
  }

  private boolean jj_3R_13()
 {
    if (jj_3R_16()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public SQFParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[22];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x180000,0x0,0x0,0xffe7c000,0x180000,0xffe7c000,0x180000,0x180000,0x0,0x0,0x0,0x180000,0x0,0x0,0x180000,0x180000,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0xa747e420,0x3472000,0x30000,0x0,0x0,0x0,0xa7472000,0xa7472000,0x0,0x0,0xa7472000,0xa747e420,0x0,0x80000000,0xa747e420,0xa747e420,0x1,0x4,0x0,0x10,0x1800,0x100,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x22,0x0,0x0,0x40,0x0,0x40,0x2,0x2,0x8,0x2,0x2,0x22,0x20,0x0,0x22,0x2,0x0,0x0,0xa0,0x0,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[4];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public SQFParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SQFParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SQFParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public SQFParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SQFParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public SQFParser(SQFParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(SQFParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 22; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[72];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 22; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 72; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 4; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}