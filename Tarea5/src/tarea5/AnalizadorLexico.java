/* The following code was generated by JFlex 1.4.3 on 13/08/21 03:48 PM */

package tarea5;
import java_cup.runtime.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 13/08/21 03:48 PM from the specification file
 * <tt>Lexico.jflex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  3,  3,  3,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3,  0,  0,  0,  0,  0,  0,  0,  4,  5,  0,  0, 23,  0,  0,  0, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 21, 19,  0, 22,  0,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0, 
     0, 10, 20, 12, 14, 13,  1,  9,  1, 15,  1,  1,  1, 11, 16,  8, 
     6,  1,  7, 18, 17,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\1\1\3\1\4\1\5\1\6\3\1"+
    "\1\7\1\1\1\10\1\11\5\1\1\12\2\1\1\13"+
    "\11\1\1\14\1\1\1\15\2\1\1\14\3\1\1\16"+
    "\1\17\5\1\1\20";

  private static int [] zzUnpackAction() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\30\0\60\0\110\0\140\0\30\0\30\0\170"+
    "\0\220\0\250\0\30\0\300\0\330\0\30\0\360\0\u0108"+
    "\0\u0120\0\u0138\0\u0150\0\30\0\u0168\0\u0180\0\60\0\u0198"+
    "\0\u01b0\0\u01c8\0\u01e0\0\u01f8\0\u0210\0\u0228\0\u0240\0\u0258"+
    "\0\u0270\0\u0288\0\60\0\u02a0\0\u02b8\0\60\0\u02d0\0\u02e8"+
    "\0\u0300\0\60\0\60\0\u0318\0\u0330\0\u0348\0\u0360\0\u0378"+
    "\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\3"+
    "\1\11\1\3\1\12\3\3\1\13\1\14\1\15\1\2"+
    "\1\16\31\0\2\3\3\0\15\3\1\0\1\3\5\0"+
    "\1\4\30\0\1\5\25\0\2\3\3\0\1\3\1\17"+
    "\2\3\1\20\10\3\1\0\1\3\4\0\2\3\3\0"+
    "\12\3\1\21\2\3\1\0\1\3\4\0\2\3\3\0"+
    "\12\3\1\22\2\3\1\0\1\3\4\0\2\3\3\0"+
    "\7\3\1\23\5\3\1\0\1\3\31\0\1\24\2\0"+
    "\2\3\3\0\2\3\1\25\12\3\1\0\1\3\4\0"+
    "\2\3\3\0\1\3\1\26\13\3\1\0\1\3\4\0"+
    "\2\3\3\0\10\3\1\27\4\3\1\0\1\3\4\0"+
    "\2\3\3\0\13\3\1\30\1\3\1\0\1\3\4\0"+
    "\2\3\3\0\3\3\1\31\11\3\1\0\1\3\4\0"+
    "\2\3\3\0\3\3\1\32\2\3\1\33\6\3\1\0"+
    "\1\3\4\0\2\3\3\0\4\3\1\34\10\3\1\0"+
    "\1\3\4\0\2\3\3\0\7\3\1\35\5\3\1\0"+
    "\1\3\4\0\2\3\3\0\11\3\1\36\3\3\1\0"+
    "\1\3\4\0\2\3\3\0\1\3\1\37\13\3\1\0"+
    "\1\3\4\0\2\3\3\0\7\3\1\40\5\3\1\0"+
    "\1\3\4\0\2\3\3\0\5\3\1\41\7\3\1\0"+
    "\1\3\4\0\2\3\3\0\3\3\1\42\11\3\1\0"+
    "\1\3\4\0\2\3\3\0\12\3\1\43\2\3\1\0"+
    "\1\3\4\0\2\3\3\0\4\3\1\44\10\3\1\0"+
    "\1\3\4\0\2\3\3\0\10\3\1\45\4\3\1\0"+
    "\1\3\4\0\2\3\3\0\14\3\1\46\1\0\1\3"+
    "\4\0\2\3\3\0\7\3\1\47\5\3\1\0\1\3"+
    "\4\0\2\3\3\0\5\3\1\50\7\3\1\0\1\3"+
    "\4\0\2\3\3\0\11\3\1\51\3\3\1\0\1\3"+
    "\4\0\2\3\3\0\1\3\1\52\13\3\1\0\1\3"+
    "\4\0\2\3\3\0\4\3\1\53\10\3\1\0\1\3"+
    "\4\0\2\3\3\0\5\3\1\54\7\3\1\0\1\3"+
    "\4\0\2\3\3\0\11\3\1\55\3\3\1\0\1\3"+
    "\4\0\2\3\3\0\7\3\1\56\5\3\1\0\1\3"+
    "\4\0\2\3\3\0\12\3\1\57\2\3\1\0\1\3"+
    "\4\0\2\3\3\0\13\3\1\60\1\3\1\0\1\3"+
    "\4\0\2\3\3\0\2\3\1\61\12\3\1\0\1\3"+
    "\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[912];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\3\1\2\11\3\1\1\11\2\1\1\11"+
    "\5\1\1\11\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[49];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    //coidgo de usuario en sintaxis java
    



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 16: 
          { System.out.print(yytext()); return new Symbol(Simbolos.PROCEDIMIENTO , yycolumn, yyline, yytext());
          }
        case 17: break;
        case 10: 
          { System.out.print(yytext()); return new Symbol(Simbolos.IGUAL , yycolumn, yyline, yytext());
          }
        case 18: break;
        case 9: 
          { System.out.print(yytext()); return new Symbol(Simbolos.COMA , yycolumn, yyline, yytext());
          }
        case 19: break;
        case 14: 
          { System.out.print(yytext()); return new Symbol(Simbolos.INTEGER , yycolumn, yyline, yytext());
          }
        case 20: break;
        case 3: 
          { System.out.println(yytext()); return new Symbol(Simbolos.NUMERO , yycolumn, yyline, yytext());
          }
        case 21: break;
        case 1: 
          { System.out.println(yytext()); return new Symbol(Simbolos.ID , yycolumn, yyline, yytext());
          }
        case 22: break;
        case 5: 
          { System.out.print("("); return new Symbol(Simbolos.P_A , yycolumn, yyline, yytext());
          }
        case 23: break;
        case 15: 
          { System.out.print(yytext()); return new Symbol(Simbolos.PROGRAMA , yycolumn, yyline, yytext());
          }
        case 24: break;
        case 12: 
          { System.out.print(yytext()); return new Symbol(Simbolos.PARAMETRO , yycolumn, yyline, yytext());
          }
        case 25: break;
        case 8: 
          { System.out.print(yytext()); return new Symbol(Simbolos.DOS_PUNTOS , yycolumn, yyline, yytext());
          }
        case 26: break;
        case 6: 
          { System.out.print(")"); return new Symbol(Simbolos.P_C , yycolumn, yyline, yytext());
          }
        case 27: break;
        case 11: 
          { System.out.print(yytext()); return new Symbol(Simbolos.END , yycolumn, yyline, yytext());
          }
        case 28: break;
        case 7: 
          { System.out.print(yytext()); return new Symbol(Simbolos.PUNTO_COMA , yycolumn, yyline, yytext());
          }
        case 29: break;
        case 2: 
          { System.out.println("CUALQUIER_SIM: "+yytext()); 
                                    //ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    //listaErrores.add(e);
                                    //return new Symbol(Simbolos.CUALQUIER_SIM , yycolumn, yyline, yytext());
          }
        case 30: break;
        case 4: 
          { /*Ignore*/
          }
        case 31: break;
        case 13: 
          { System.out.print(yytext()); return new Symbol(Simbolos.BEGIN , yycolumn, yyline, yytext());
          }
        case 32: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(Simbolos.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
