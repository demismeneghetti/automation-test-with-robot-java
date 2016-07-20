package br.com.gmail.comum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TecladoVirtual {

	public static void InserirCaracteres(String valoraDigitar) throws AWTException {
		Robot robot = new Robot();

		char[] chars = valoraDigitar.toCharArray();
		String converteChars = null;
		int numChars = chars.length;

		for (int i = 0; i < numChars; i++) {

			converteChars = String.valueOf(chars[i]);

			switch (converteChars) {

			case "q":
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
				robot.delay(100);
				break;

			case "Q":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_Q);
				robot.delay(100);
				break;

			case "w":
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				robot.delay(100);
				break;

			case "W":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_W);
				robot.delay(100);
				break;

			case "e":
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.delay(100);
				break;

			case "E":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_E);
				robot.delay(100);
				break;

			case "r":
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(100);
				break;

			case "R":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(100);
				break;

			case "t":
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.delay(100);
				break;

			case "T":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_T);
				robot.delay(100);
				break;

			case "y":
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
				robot.delay(100);
				break;

			case "Y":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_Y);
				robot.delay(100);
				break;

			case "u":
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
				robot.delay(100);
				break;

			case "U":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_U);
				robot.delay(100);
				break;

			case "i":
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
				robot.delay(100);
				break;

			case "I":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_I);
				robot.delay(100);
				break;

			case "o":
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(100);
				break;

			case "O":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(100);
				break;

			case "p":
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.delay(100);
				break;

			case "P":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_P);
				robot.delay(100);
				break;

			case "a":
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.delay(100);
				break;

			case "A":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_A);
				robot.delay(100);
				break;

			case "s":
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.delay(100);
				break;

			case "S":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_S);
				robot.delay(100);
				break;

			case "d":
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
				robot.delay(100);
				break;

			case "D":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_D);
				robot.delay(100);
				break;

			case "f":
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				robot.delay(100);
				break;

			case "F":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_F);
				robot.delay(100);
				break;

			case "g":
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_G);
				robot.delay(100);
				break;

			case "G":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_G);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_G);
				robot.delay(100);
				break;

			case "h":
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.delay(100);
				break;

			case "H":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_H);
				robot.delay(100);
				break;

			case "j":
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_J);
				robot.delay(100);
				break;

			case "J":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_J);
				robot.delay(100);
				break;

			case "k":
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_K);
				robot.delay(100);
				break;

			case "K":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_K);
				robot.delay(100);
				break;

			case "l":
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
				robot.delay(100);
				break;

			case "L":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_L);
				robot.delay(100);
				break;

			case "ç":
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
//				robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
//				robot.keyPress(KeyEvent.VK_C);
//				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
//				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(100);
				break;

			case "Ç":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_C);
//				robot.keyPress(KeyEvent.VK_DEAD_ACUTE);
//				robot.keyPress(KeyEvent.VK_SHIFT);
//				robot.keyPress(KeyEvent.VK_C);
//				robot.keyRelease(KeyEvent.VK_DEAD_ACUTE);
//				robot.keyRelease(KeyEvent.VK_SHIFT);
//				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(100);
				break;

			case "z":
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_Z);
				robot.delay(100);
				break;

			case "Z":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_Z);
				robot.delay(100);
				break;

			case "x":
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
				robot.delay(100);
				break;

			case "X":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_X);
				robot.delay(100);
				break;

			case "c":
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(100);
				break;

			case "C":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(100);
				break;

			case "v":
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.delay(100);
				break;

			case "V":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_V);
				robot.delay(100);
				break;

			case "b":
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_B);
				robot.delay(100);
				break;

			case "B":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_B);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_B);
				robot.delay(100);
				break;

			case "n":
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				robot.delay(100);
				break;

			case "N":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_N);
				robot.delay(100);
				break;

			case "m":
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(100);
				break;

			case "M":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(100);
				break;

			case "0":
				robot.keyPress(KeyEvent.VK_0);
				robot.keyRelease(KeyEvent.VK_0);
				robot.delay(100);
				break;

			case "1":
				robot.keyPress(KeyEvent.VK_1);
				robot.keyRelease(KeyEvent.VK_1);
				robot.delay(100);
				break;

			case "2":
				robot.keyPress(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_2);
				robot.delay(100);
				break;

			case "3":
				robot.keyPress(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_3);
				robot.delay(100);
				break;

			case "4":
				robot.keyPress(KeyEvent.VK_4);
				robot.keyRelease(KeyEvent.VK_4);
				robot.delay(100);
				break;

			case "5":
				robot.keyPress(KeyEvent.VK_5);
				robot.keyRelease(KeyEvent.VK_5);
				robot.delay(100);
				break;

			case "6":
				robot.keyPress(KeyEvent.VK_6);
				robot.keyRelease(KeyEvent.VK_6);
				robot.delay(100);
				break;

			case "7":
				robot.keyPress(KeyEvent.VK_7);
				robot.keyRelease(KeyEvent.VK_7);
				robot.delay(100);
				break;

			case "8":
				robot.keyPress(KeyEvent.VK_8);
				robot.keyRelease(KeyEvent.VK_8);
				robot.delay(100);
				break;

			case "9":
				robot.keyPress(KeyEvent.VK_9);
				robot.keyRelease(KeyEvent.VK_9);
				robot.delay(100);
				break;

			case " ":
				robot.keyPress(KeyEvent.VK_SPACE);
				robot.keyRelease(KeyEvent.VK_SPACE);
				robot.delay(100);
				break;

			case "_":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_MINUS);
				robot.delay(100);
				break;

			case "-":
				robot.keyPress(KeyEvent.VK_MINUS);
				break;

			case "=":
				robot.keyPress(KeyEvent.VK_EQUALS);
				break;

			case "~":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
				break;

			case "!":
				robot.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
				break;

			case "@":
				robot.keyPress(KeyEvent.VK_AT);
				break;

			case "#":
				robot.keyPress(KeyEvent.VK_NUMBER_SIGN);
				break;

			case "$":
				robot.keyPress(KeyEvent.VK_DOLLAR);
				break;

			case "%":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_5);
				break;

			case "^":
				robot.keyPress(KeyEvent.VK_CIRCUMFLEX);
				break;

			case "&":
				robot.keyPress(KeyEvent.VK_AMPERSAND);
				break;

			case "*":
				robot.keyPress(KeyEvent.VK_ASTERISK);
				break;

			case "(":
				robot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS);
				break;

			case ")":
				robot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS);
				break;

			// case "_":
			// robot.keyPress(KeyEvent.VK_UNDERSCORE);
			// robot.keyRelease(KeyEvent.VK_UNDERSCORE);
			// break;

			case "+":
				robot.keyPress(KeyEvent.VK_PLUS);
				break;

			case "\t":
				robot.keyPress(KeyEvent.VK_TAB);
				break;

			case "\n":
				robot.keyPress(KeyEvent.VK_ENTER);
				break;

			case "[":
				robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
				break;

			case "]":
				robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
				break;

			case "\\":
				robot.keyPress(KeyEvent.VK_BACK_SLASH);
				break;

			case "{":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
				break;

			case "}":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
				break;

			case "|":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_BACK_SLASH);
				break;

			case ";":
				robot.keyPress(KeyEvent.VK_SEMICOLON);
				break;

			case ":":
				robot.keyPress(KeyEvent.VK_COLON);
				break;

			case "\"":
				robot.keyPress(KeyEvent.VK_QUOTE);
				break;

			case "'":
				robot.keyPress(KeyEvent.VK_QUOTEDBL);
				break;

			case ",":
				robot.keyPress(KeyEvent.VK_COMMA);
				break;

			case "<":
				robot.keyPress(KeyEvent.VK_LESS);
				break;

			case ".":
				robot.keyPress(KeyEvent.VK_PERIOD);
				break;

			case ">":
				robot.keyPress(KeyEvent.VK_GREATER);
				break;

			case "/":
				robot.keyPress(KeyEvent.VK_SLASH);
				break;

			case "?":
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_SLASH);
				break;

			default:
				break;

			}
		}
	}

	public static void ESC() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.delay(500);

	}

	public static void F1() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F1);
		robot.keyRelease(KeyEvent.VK_F1);
		robot.delay(100);

	}

	public static void F2() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F2);
		robot.keyRelease(KeyEvent.VK_F2);
		robot.delay(100);

	}

	public static void F3() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F3);
		robot.keyRelease(KeyEvent.VK_F3);
		robot.delay(100);

	}

	public static void F4() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.delay(100);

	}

	public static void F5() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.delay(100);

	}

	public static void F6() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F6);
		robot.keyRelease(KeyEvent.VK_F6);
		robot.delay(100);

	}

	public static void F7() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F7);
		robot.keyRelease(KeyEvent.VK_F7);
		robot.delay(100);

	}

	public static void F8() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F8);
		robot.keyRelease(KeyEvent.VK_F8);
		robot.delay(100);

	}

	public static void F9() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F9);
		robot.keyRelease(KeyEvent.VK_F9);
		robot.delay(100);

	}

	public static void F10() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F10);
		robot.keyRelease(KeyEvent.VK_F10);
		robot.delay(100);

	}

	public static void F11() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F11);
		robot.keyRelease(KeyEvent.VK_F11);
		robot.delay(100);

	}

	public static void F12() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
		robot.delay(100);

	}

	public static void PrtSc() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_PRINTSCREEN);
		robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
		robot.delay(100);

	}

	public static void Insert() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_INSERT);
		robot.keyRelease(KeyEvent.VK_INSERT);
		robot.delay(100);

	}

	public static void DEL() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DELETE);
		robot.keyRelease(KeyEvent.VK_DELETE);
		robot.delay(500);

	}

	public static void UP() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.delay(100);

	}

	public static void DOWN() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(100);

	}

	public static void RIGTH() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyRelease(KeyEvent.VK_RIGHT);
		robot.delay(100);

	}

	public static void LEFT() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_LEFT);
		robot.keyRelease(KeyEvent.VK_LEFT);
		robot.delay(100);

	}

	public static void TAB() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(500);
	}

	public static void CAPSLOOK() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.delay(100);
	}

	public static void SHIFT() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(100);
	}

	public static void CTRL() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(100);
	}

	public static void ALT() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.delay(100);
	}

	public static void ESPACO() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.delay(100);
	}

	public static void ALTGR() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ALT_GRAPH);
		robot.keyRelease(KeyEvent.VK_ALT_GRAPH);
		robot.delay(100);
	}

	public static void Backspace() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		robot.delay(100);
	}

	public static void ENTER() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(500);
	}

	public static void HOME() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_HOME);
		robot.keyRelease(KeyEvent.VK_HOME);
		robot.delay(100);
	}

	public static void END() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_END);
		robot.keyRelease(KeyEvent.VK_END);
		robot.delay(100);
	}

	public static void PgUp() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.delay(100);
	}

	public static void PgDn() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.delay(100);
	}

	public static void SHIFT_TAB() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(500);
	}

	public static void ALT_F4() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.delay(500);
	}

	public static void CTRL_F4() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.delay(500);
	}

	public static void CTRL_C() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		robot.delay(500);
	}

	public static void CTRL_V() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(500);
	}
}