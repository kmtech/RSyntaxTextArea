/* The following code was generated by JFlex 1.4.1 on 10/10/10 10:56 PM */

/*
 * 10/03/2007
 *
 * TclTokenMaker.java - Scanner for the Tcl programming language.
 * 
 * This library is distributed under a modified BSD license.  See the included
 * RSyntaxTextArea.License.txt file for details.
 */
package org.fife.ui.rsyntaxtextarea.modes;

import java.io.*;
import javax.swing.text.Segment;

import org.fife.ui.rsyntaxtextarea.*;


/**
 * Scanner for the Tcl programming language.<p>
 *
 * This implementation was created using
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1; however, the generated file
 * was modified for performance.  Memory allocation needs to be almost
 * completely removed to be competitive with the handwritten lexers (subclasses
 * of <code>AbstractTokenMaker</code>, so this class has been modified so that
 * Strings are never allocated (via yytext()), and the scanner never has to
 * worry about refilling its buffer (needlessly copying chars around).
 * We can achieve this because RText always scans exactly 1 line of tokens at a
 * time, and hands the scanner this line as an array of characters (a Segment
 * really).  Since tokens contain pointers to char arrays instead of Strings
 * holding their contents, there is no need for allocating new memory for
 * Strings.<p>
 *
 * The actual algorithm generated for scanning has, of course, not been
 * modified.<p>
 *
 * If you wish to regenerate this file yourself, keep in mind the following:
 * <ul>
 *   <li>The generated TclTokenMaker.java</code> file will contain two
 *       definitions of both <code>zzRefill</code> and <code>yyreset</code>.
 *       You should hand-delete the second of each definition (the ones
 *       generated by the lexer), as these generated methods modify the input
 *       buffer, which we'll never have to do.</li>
 *   <li>You should also change the declaration/definition of zzBuffer to NOT
 *       be initialized.  This is a needless memory allocation for us since we
 *       will be pointing the array somewhere else anyway.</li>
 *   <li>You should NOT call <code>yylex()</code> on the generated scanner
 *       directly; rather, you should use <code>getTokenList</code> as you would
 *       with any other <code>TokenMaker</code> instance.</li>
 * </ul>
 *
 * @author Robert Futrell
 * @version 0.5
 *
 */

public class TclTokenMaker extends AbstractJFlexCTokenMaker {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\14\1\13\1\0\1\14\1\7\22\0\1\14\1\27\1\15"+
    "\1\10\1\1\1\27\1\27\1\7\2\24\1\27\1\22\1\25\1\22"+
    "\1\23\1\27\1\3\1\61\1\60\5\5\2\2\1\7\1\25\1\30"+
    "\1\26\1\30\1\7\1\0\3\4\1\20\1\21\1\20\5\1\1\17"+
    "\13\1\1\16\2\1\1\24\1\11\1\24\1\27\1\12\1\0\1\31"+
    "\1\54\1\46\1\35\1\33\1\52\1\53\1\56\1\44\1\55\1\43"+
    "\1\50\1\42\1\34\1\41\1\32\1\62\1\36\1\47\1\40\1\6"+
    "\1\51\1\57\1\45\1\37\1\1\1\24\1\27\1\24\1\27\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\2\1\1\1\4\1\5"+
    "\1\6\1\7\1\10\1\2\1\11\1\2\1\10\22\2"+
    "\1\1\1\12\1\3\1\13\1\12\1\13\1\12\1\14"+
    "\1\12\2\2\1\7\1\15\35\2\1\16\5\2\1\16"+
    "\40\2\1\1\1\13\1\0\2\14\5\2\1\15\25\2"+
    "\1\16\30\2\1\16\4\2\1\16\11\2\1\1\5\2"+
    "\2\16\6\2\1\16\15\2\1\16\3\2\1\16\1\2"+
    "\1\1\14\2\1\1\6\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[241];
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
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0132\0\u0198\0\u01cb\0\u0132\0\u01fe\0\u0132\0\u0132\0\u0231"+
    "\0\u0264\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9"+
    "\0\u03fc\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561"+
    "\0\u0594\0\u05c7\0\u05fa\0\u062d\0\u062d\0\u062d\0\u0660\0\u0693"+
    "\0\u06c6\0\u06f9\0\u072c\0\u075f\0\u0792\0\u07c5\0\u0132\0\u07f8"+
    "\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u095d\0\u0990"+
    "\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28"+
    "\0\u0b5b\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0"+
    "\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2\0\u0e25\0\u0e58"+
    "\0\u0e8b\0\u0ebe\0\146\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd"+
    "\0\u0ff0\0\u1023\0\u1056\0\u1089\0\u10bc\0\u10ef\0\u1122\0\u1155"+
    "\0\u1188\0\u11bb\0\u11ee\0\u1221\0\u1254\0\u1287\0\u12ba\0\u12ed"+
    "\0\u1320\0\u1353\0\u1386\0\u13b9\0\u13ec\0\u141f\0\u1452\0\u1485"+
    "\0\u14b8\0\u14eb\0\u151e\0\u1551\0\u1584\0\u15b7\0\u062d\0\u15ea"+
    "\0\u161d\0\u1650\0\u1683\0\u16b6\0\u16e9\0\u01cb\0\u171c\0\u174f"+
    "\0\u1782\0\u17b5\0\u17e8\0\u181b\0\u184e\0\u1881\0\u18b4\0\u18e7"+
    "\0\u191a\0\u194d\0\u1980\0\u19b3\0\u19e6\0\u1a19\0\u1a4c\0\u1a7f"+
    "\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b\0\u1b7e\0\u1bb1\0\u1be4\0\u1c17"+
    "\0\u1c4a\0\u1c7d\0\u1cb0\0\u1ce3\0\u1d16\0\u1d49\0\u1d7c\0\u1daf"+
    "\0\u1de2\0\u1e15\0\u1e48\0\u1e7b\0\u1eae\0\u1ee1\0\u1f14\0\u1f47"+
    "\0\u1f7a\0\u1fad\0\u1fe0\0\u2013\0\u2046\0\u2079\0\u20ac\0\u20df"+
    "\0\u2112\0\u2145\0\u2178\0\u21ab\0\u21de\0\u2211\0\u2244\0\u2277"+
    "\0\u22aa\0\u22dd\0\u2310\0\u2343\0\u2376\0\u23a9\0\u23dc\0\u240f"+
    "\0\u2442\0\u2475\0\u24a8\0\u24db\0\u250e\0\u2541\0\u2574\0\u25a7"+
    "\0\u25da\0\u260d\0\u2640\0\u1b4b\0\u2673\0\u26a6\0\u26d9\0\u270c"+
    "\0\u273f\0\u2772\0\u27a5\0\u27d8\0\u280b\0\u283e\0\u2871\0\u28a4"+
    "\0\u28d7\0\u290a\0\u293d\0\u0bc1\0\u2970\0\u29a3\0\u29d6\0\u2a09"+
    "\0\u260d\0\u2a3c\0\u2a6f\0\u2aa2\0\u2ad5\0\u2b08\0\u2b3b\0\u2b6e"+
    "\0\u2ba1\0\u2bd4\0\u2c07\0\u2c3a\0\u2c6d\0\u2ca0\0\u2cd3\0\u2d06"+
    "\0\u2d39";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[241];
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
    "\1\2\1\3\1\4\1\5\1\3\1\4\1\6\1\7"+
    "\1\10\1\2\1\3\1\11\1\12\1\13\4\3\1\14"+
    "\1\15\1\16\1\17\2\14\1\20\1\21\1\22\1\23"+
    "\1\3\1\24\1\25\1\3\1\26\1\27\1\30\1\3"+
    "\1\31\1\3\1\32\1\33\1\34\1\3\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\2\4\1\3\7\2\1\0"+
    "\3\2\3\0\4\2\7\0\33\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\32\3\2\44\2\4"+
    "\1\44\1\4\1\44\1\0\3\44\3\0\1\44\1\45"+
    "\1\46\1\47\1\0\1\50\5\0\2\44\1\47\1\44"+
    "\1\46\12\44\1\45\1\44\1\46\5\44\2\4\3\44"+
    "\1\51\1\52\1\44\1\52\1\44\1\0\3\44\3\0"+
    "\1\53\1\45\1\46\1\47\1\0\1\50\5\0\2\44"+
    "\1\47\1\44\1\46\7\44\1\53\2\44\1\45\1\44"+
    "\1\46\5\44\2\52\1\44\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\1\3\1\54\1\3"+
    "\1\55\26\3\63\0\13\10\1\0\47\10\14\0\1\12"+
    "\46\0\11\13\1\56\3\13\1\57\45\13\2\0\2\50"+
    "\1\0\1\50\52\0\2\50\27\0\1\14\34\0\1\2"+
    "\5\3\1\60\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\1\3\1\61\3\3\1\62\1\3\1\63\5\3"+
    "\1\64\1\65\2\3\1\66\1\3\1\67\6\3\1\2"+
    "\5\3\1\70\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\1\71\4\3\1\72\2\3\1\73\2\3\1\74"+
    "\3\3\1\75\6\3\1\74\3\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\3\3\1\76"+
    "\1\3\1\77\2\3\1\100\3\3\1\101\2\3\1\102"+
    "\1\103\11\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\2\3\1\104\5\3\1\105\21\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\1\106\1\3\1\107\5\3\1\110\21\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\1\111\1\3\1\112\2\3\1\113\2\3\1\114\1\3"+
    "\1\115\1\116\16\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\1\3\1\117\30\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\2\3\1\120\27\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\3\3\1\121\5\3\1\122"+
    "\7\3\1\123\10\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\1\124\1\3\1\125\1\3"+
    "\1\123\3\3\1\126\6\3\1\127\5\3\1\130\4\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\1\3\1\131\1\132\4\3\1\133\1\134\2\3"+
    "\1\111\1\3\1\135\10\3\1\136\2\3\1\137\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\1\140\4\3\1\141\2\3\1\142\2\3\1\143\2\3"+
    "\1\144\1\145\12\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\5\3\1\146\2\3\1\147"+
    "\1\150\1\3\1\151\3\3\1\152\12\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\2\3"+
    "\1\70\2\3\1\153\11\3\1\154\12\3\1\2\5\3"+
    "\1\155\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\5\3\1\156\5\3\1\157\16\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\10\3\1\65"+
    "\21\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\6\3\1\160\4\3\1\161\16\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\11\3\1\123\1\3\1\162\11\3\1\163\4\3\6\2"+
    "\1\164\1\0\3\2\3\0\4\2\7\0\32\2\7\44"+
    "\1\0\3\44\3\0\4\44\7\0\34\44\2\165\1\44"+
    "\1\165\1\44\1\0\3\44\3\0\4\44\1\166\6\0"+
    "\27\44\2\165\3\44\2\50\1\44\1\50\1\44\1\0"+
    "\3\44\3\0\2\44\1\46\1\47\7\0\2\44\1\47"+
    "\1\44\1\46\14\44\1\46\5\44\2\50\3\44\2\51"+
    "\1\44\1\51\1\44\1\0\3\44\3\0\2\44\1\46"+
    "\1\47\1\0\1\50\5\0\2\44\1\47\1\44\1\46"+
    "\14\44\1\46\5\44\2\51\3\44\1\51\1\52\1\44"+
    "\1\52\1\44\1\0\3\44\3\0\1\44\1\167\1\46"+
    "\1\47\1\0\1\50\5\0\2\44\1\47\1\44\1\46"+
    "\12\44\1\167\1\44\1\46\5\44\2\52\3\44\4\170"+
    "\1\44\1\0\3\44\3\0\2\44\2\170\7\0\1\170"+
    "\1\44\1\170\1\44\1\170\10\44\1\170\3\44\1\170"+
    "\1\44\1\170\3\44\2\170\1\44\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\4\3\1\171"+
    "\12\3\1\172\1\173\11\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\12\3\1\174\3\3"+
    "\1\175\13\3\13\13\1\0\1\13\1\176\45\13\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\7\3\1\177\22\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\1\3\1\200\30\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\5\3\1\201\24\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\1\202\31\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\10\3"+
    "\1\67\21\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\13\3\1\203\16\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\7\3"+
    "\1\204\22\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\16\3\1\123\13\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\7\3"+
    "\1\67\22\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\15\3\1\205\14\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\10\3"+
    "\1\206\21\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\26\3\1\123\3\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\4\3"+
    "\1\123\25\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\1\207\31\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\7\3\1\210"+
    "\22\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\5\3\1\211\24\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\21\3\1\123"+
    "\10\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\1\3\1\212\1\206\10\3\1\213\16\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\16\3\1\214\13\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\1\215\31\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\16\3\1\216\13\3\1\2\5\3\1\217\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\32\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\4\3"+
    "\1\220\6\3\1\221\16\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\1\74\2\3\1\146"+
    "\3\3\1\222\12\3\1\223\7\3\1\2\5\3\1\157"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\32\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\3\3\1\224\26\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\14\3\1\213\2\3"+
    "\1\215\12\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\1\225\31\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\1\3\1\226"+
    "\30\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\2\3\1\227\23\3\1\230\3\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\11\3\1\231\20\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\2\3\1\203\4\3\1\232"+
    "\22\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\3\3\1\233\12\3\1\234\13\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\7\3\1\123\5\3\1\212\3\3\1\235\10\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\1\236\31\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\3\3\1\237\3\3\1\240\22\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\13\3\1\215\16\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\3\3\1\241\12\3"+
    "\1\224\13\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\10\3\1\221\21\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\2\3"+
    "\1\242\27\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\17\3\1\243\12\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\2\3"+
    "\1\205\1\74\3\3\1\123\7\3\1\244\12\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\5\3\1\245\24\3\1\2\5\3\1\246\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\32\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\1\247"+
    "\4\3\1\250\24\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\13\3\1\251\16\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\5\3\1\213\24\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\1\3\1\61\21\3\1\252"+
    "\6\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\1\253\1\3\1\254\27\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\22\3"+
    "\1\255\3\3\1\204\3\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\3\3\1\256\12\3"+
    "\1\257\13\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\2\3\1\260\5\3\1\137\21\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\2\3\1\261\27\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\1\116\31\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\5\3\1\262\7\3\1\263\14\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\10\3\1\74"+
    "\21\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\17\3\1\231\12\3\1\2\5\3\1\264"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\10\3"+
    "\1\211\21\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\1\265\31\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\10\3\1\266"+
    "\21\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\7\3\1\267\22\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\2\3\1\270"+
    "\27\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\3\3\1\74\26\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\1\3\1\271"+
    "\30\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\16\3\1\272\13\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\3\3\1\273"+
    "\26\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\13\3\1\151\16\3\2\2\4\274\1\2"+
    "\1\0\3\2\3\0\2\2\2\274\7\0\1\274\1\2"+
    "\1\274\1\2\1\274\10\2\1\274\3\2\1\274\1\2"+
    "\1\274\3\2\2\274\1\2\2\44\2\165\1\44\1\165"+
    "\1\44\1\0\3\44\3\0\2\44\1\46\1\44\7\0"+
    "\4\44\1\46\14\44\1\46\5\44\2\165\1\44\2\0"+
    "\2\165\1\0\1\165\52\0\2\165\1\0\2\44\4\170"+
    "\1\44\1\0\3\44\3\0\1\44\1\167\2\170\7\0"+
    "\1\170\1\44\1\170\1\44\1\170\10\44\1\170\1\44"+
    "\1\167\1\44\1\170\1\44\1\170\3\44\2\170\1\44"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\1\275\31\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\2\3\1\276\27\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\1\212\31\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\10\3\1\277\21\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\2\3"+
    "\1\213\27\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\10\3\1\300\21\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\2\3"+
    "\1\157\27\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\1\301\31\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\3\3\1\302"+
    "\26\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\3\3\1\123\26\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\2\3\1\212"+
    "\27\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\12\3\1\123\17\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\15\3\1\123"+
    "\14\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\15\3\1\204\14\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\5\3\1\301"+
    "\24\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\10\3\1\212\21\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\5\3\1\123"+
    "\24\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\7\3\1\123\22\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\2\3\1\303"+
    "\27\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\17\3\1\123\12\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\7\3\1\304"+
    "\22\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\23\3\1\151\6\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\13\3\1\305"+
    "\16\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\16\3\1\231\13\3\1\2\5\3\1\306"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\32\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\2\3\1\307\13\3\1\310\13\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\25\3"+
    "\1\123\4\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\15\3\1\231\14\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\17\3"+
    "\1\172\12\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\5\3\1\77\24\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\1\243"+
    "\31\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\2\3\1\123\27\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\13\3\1\311"+
    "\16\3\1\2\5\3\1\312\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\32\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\16\3\1\122\13\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\10\3\1\123\21\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\22\3\1\231\7\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\20\3\1\313\11\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\15\3\1\314\14\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\7\3\1\315\5\3\1\316\1\317\13\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\15\3\1\320\14\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\13\3\1\213\16\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\2\3\1\321\27\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\13\3\1\322\16\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\5\3\1\225\24\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\3\3\1\123\13\3\1\231"+
    "\12\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\10\3\1\323\21\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\7\3\1\240"+
    "\22\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\2\3\1\215\27\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\3\3\1\236"+
    "\26\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\1\3\1\324\30\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\30\3\1\325"+
    "\1\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\4\3\1\326\11\3\1\327\13\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\7\3\1\330\22\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\1\331\31\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\3\3"+
    "\1\332\26\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\2\3\1\333\6\3\1\316\20\3"+
    "\1\2\5\3\1\67\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\32\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\16\3\1\314\13\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\23\3\1\123\6\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\23\3\1\334\6\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\7\3\1\311\22\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\1\205\31\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\10\3"+
    "\1\213\21\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\7\3\1\335\22\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\21\3"+
    "\1\235\10\3\2\2\4\336\1\2\1\0\3\2\3\0"+
    "\2\2\2\336\7\0\1\336\1\2\1\336\1\2\1\336"+
    "\10\2\1\336\3\2\1\336\1\2\1\336\3\2\2\336"+
    "\2\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\7\3\1\231\22\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\20\3\1\252\11\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\26\3\1\203\3\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\337\3\0\4\3\7\0\32\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\6\3"+
    "\1\123\23\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\27\3\1\123\2\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\13\3"+
    "\1\100\16\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\5\3\1\340\24\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\10\3"+
    "\1\341\21\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\5\3\1\203\24\3\1\2\6\3"+
    "\1\0\1\2\1\43\1\3\3\0\4\3\7\0\14\3"+
    "\1\342\15\3\1\2\5\3\1\265\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\32\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\10\3\1\203"+
    "\21\3\1\2\6\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\23\3\1\343\6\3\1\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\1\67\31\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\13\3\1\344\16\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\1\213\31\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\10\3\1\151\21\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\12\3\1\341\17\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\15\3\1\345\14\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\3\3\1\346\26\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\17\3\1\347\12\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\17\3\1\113\12\3\1\2"+
    "\2\3\1\123\3\3\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\32\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\2\3\1\350\27\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\2\3\1\137\27\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\23\3\1\351\6\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\5\3\1\240\24\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\22\3\1\352\7\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\1\240\31\3\1\2\6\3\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\10\3\1\210\21\3\2\2\4\353"+
    "\1\2\1\0\3\2\3\0\2\2\2\353\7\0\1\353"+
    "\1\2\1\353\1\2\1\353\10\2\1\353\3\2\1\353"+
    "\1\2\1\353\3\2\2\353\2\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\11\3\1\354\20\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\10\3\1\301\21\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\1\3\1\123\30\3"+
    "\1\2\5\3\1\155\1\0\1\2\1\43\1\3\3\0"+
    "\4\3\7\0\32\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\3\3\1\355\26\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\7\3\1\232\22\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\22\3\1\123\7\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\17\3\1\356\12\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\14\3\1\123\15\3\1\2"+
    "\6\3\1\0\1\2\1\43\1\3\3\0\4\3\7\0"+
    "\10\3\1\350\21\3\1\2\6\3\1\0\1\2\1\43"+
    "\1\3\3\0\4\3\7\0\7\3\1\314\22\3\2\2"+
    "\4\3\1\2\1\0\3\2\3\0\2\2\2\3\7\0"+
    "\1\3\1\2\1\3\1\2\1\3\10\2\1\3\3\2"+
    "\1\3\1\2\1\3\3\2\2\3\2\2\6\3\1\0"+
    "\1\2\1\43\1\3\3\0\4\3\7\0\12\3\1\357"+
    "\17\3\1\2\5\3\1\231\1\0\1\2\1\43\1\3"+
    "\3\0\4\3\7\0\32\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\23\3\1\173\6\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\13\3\1\360\16\3\1\2\6\3\1\0\1\2"+
    "\1\43\1\3\3\0\4\3\7\0\3\3\1\361\26\3"+
    "\1\2\6\3\1\0\1\2\1\43\1\3\3\0\4\3"+
    "\7\0\4\3\1\326\25\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11628];
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
    "\1\0\5\1\1\11\1\1\1\11\2\1\1\11\1\1"+
    "\2\11\37\1\1\11\106\1\1\0\173\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[241];
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
  private char zzBuffer[];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */


	/**
	 * Constructor.  This must be here because JFlex does not generate a
	 * no-parameter constructor.
	 */
	public TclTokenMaker() {
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 */
	private void addToken(int tokenType) {
		addToken(zzStartRead, zzMarkedPos-1, tokenType);
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param tokenType The token's type.
	 */
	private void addToken(int start, int end, int tokenType) {
		int so = start + offsetShift;
		addToken(zzBuffer, start,end, tokenType, so);
	}


	/**
	 * Adds the token specified to the current linked list of tokens.
	 *
	 * @param array The character array.
	 * @param start The starting offset in the array.
	 * @param end The ending offset in the array.
	 * @param tokenType The token's type.
	 * @param startOffset The offset in the document at which this token
	 *                    occurs.
	 */
	public void addToken(char[] array, int start, int end, int tokenType, int startOffset) {
		super.addToken(array, start,end, tokenType, startOffset);
		zzStartRead = zzMarkedPos;
	}


	/**
	 * Returns the text to place at the beginning and end of a
	 * line to "comment" it in a this programming language.
	 *
	 * @return The start and end strings to add to a line to "comment"
	 *         it out.
	 */
	public String[] getLineCommentStartAndEnd() {
		return new String[] { "//", null };
	}


	/**
	 * Returns the first token in the linked list of tokens generated
	 * from <code>text</code>.  This method must be implemented by
	 * subclasses so they can correctly implement syntax highlighting.
	 *
	 * @param text The text from which to get tokens.
	 * @param initialTokenType The token type we should start with.
	 * @param startOffset The offset into the document at which
	 *        <code>text</code> starts.
	 * @return The first <code>Token</code> in a linked list representing
	 *         the syntax highlighted text.
	 */
	public Token getTokenList(Segment text, int initialTokenType, int startOffset) {

		resetTokenList();
		this.offsetShift = -text.offset + startOffset;

		// Start off in the proper state.
		int state = Token.NULL;

		s = text;
		try {
			yyreset(zzReader);
			yybegin(state);
			return yylex();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return new TokenImpl();
		}

	}


	/**
	 * Refills the input buffer.
	 *
	 * @return      <code>true</code> if EOF was reached, otherwise
	 *              <code>false</code>.
	 * @exception   IOException  if any I/O-Error occurs.
	 */
	private boolean zzRefill() throws java.io.IOException {
		return zzCurrentPos>=s.offset+s.count;
	}


	/**
	 * Resets the scanner to read from a new input stream.
	 * Does not close the old reader.
	 *
	 * All internal variables are reset, the old input stream 
	 * <b>cannot</b> be reused (internal buffer is discarded and lost).
	 * Lexical state is set to <tt>YY_INITIAL</tt>.
	 *
	 * @param reader   the new input stream 
	 */
	public final void yyreset(java.io.Reader reader) throws java.io.IOException {
		// 's' has been updated.
		zzBuffer = s.array;
		/*
		 * We replaced the line below with the two below it because zzRefill
		 * no longer "refills" the buffer (since the way we do it, it's always
		 * "full" the first time through, since it points to the segment's
		 * array).  So, we assign zzEndRead here.
		 */
		//zzStartRead = zzEndRead = s.offset;
		zzStartRead = s.offset;
		zzEndRead = zzStartRead + s.count - 1;
		zzCurrentPos = zzMarkedPos = s.offset;
		zzLexicalState = YYINITIAL;
		zzReader = reader;
		zzAtEOF  = false;
	}




  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public TclTokenMaker(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public TclTokenMaker(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 160) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public org.fife.ui.rsyntaxtextarea.Token yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


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
        case 14: 
          { addToken(Token.RESERVED_WORD);
          }
        case 15: break;
        case 2: 
          { addToken(Token.IDENTIFIER);
          }
        case 16: break;
        case 13: 
          { addToken(Token.LITERAL_STRING_DOUBLE_QUOTE);
          }
        case 17: break;
        case 11: 
          { addToken(Token.LITERAL_NUMBER_FLOAT);
          }
        case 18: break;
        case 4: 
          { addToken(Token.COMMENT_EOL); addNullToken(); return firstToken;
          }
        case 19: break;
        case 6: 
          { addToken(Token.WHITESPACE);
          }
        case 20: break;
        case 10: 
          { addToken(Token.ERROR_NUMBER_FORMAT);
          }
        case 21: break;
        case 1: 
          { addToken(Token.ERROR_IDENTIFIER);
          }
        case 22: break;
        case 12: 
          { addToken(Token.LITERAL_NUMBER_HEXADECIMAL);
          }
        case 23: break;
        case 8: 
          { addToken(Token.OPERATOR);
          }
        case 24: break;
        case 3: 
          { addToken(Token.LITERAL_NUMBER_DECIMAL_INT);
          }
        case 25: break;
        case 7: 
          { addToken(Token.ERROR_STRING_DOUBLE); addNullToken(); return firstToken;
          }
        case 26: break;
        case 5: 
          { addNullToken(); return firstToken;
          }
        case 27: break;
        case 9: 
          { addToken(Token.SEPARATOR);
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case YYINITIAL: {
              addNullToken(); return firstToken;
            }
            case 242: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
