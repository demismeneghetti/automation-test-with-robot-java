package br.com.gmail.comum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Mouse {

	public static void clicaAreaDaTela(int x, int y) throws AWTException {

		Robot robot = new Robot();

		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

	}

}
