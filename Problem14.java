import acm.program.*;
import java.awt.Color;
import acm.graphics.*;
public class Problem14 extends GraphicsProgram {
	public void run() {
		drawRobot();
	}

	private void drawRobot() {
		drawHead();
		drawNose();
		drawMouth();
		drawEyes();
	}

	private void drawHead() {
		double a = getWidth();
		double b = getHeight();
		double c = 250;		// Face width
		double d = 300;		// Face height
		GRect Head = new GRect(c, d);
		add(Head, a/2 - c/2, b/2 - d/2);
		Head.setFilled(true);
		Head.setColor(Color.GRAY);
	}

	private void drawNose() {
		double a = getWidth();
		double b = getHeight();
		double m = 20;
		double n = 50;
		GRect Nose = new GRect(m, n);
		add(Nose, a/2 - m/2, b/2 + 20);
		Nose.setFilled(true);
		Nose.setColor(Color.BLACK);
	}

	private void drawMouth() {
		double a = getWidth();
		double b = getHeight();
		double k = 100;
		double l = 25;
		GRect Mouth = new GRect(k, l);
		add(Mouth, a/2 - k/2, b/2 + l*4);
		Mouth.setFilled(true);
		Mouth.setColor(Color.WHITE);
		
	}

	private void drawEyes() {
		double a = getWidth();
		double b = getHeight();
		double x = 30;
		double y = 50;
		GRect Eye1 = new GRect(x, y);
		add(Eye1, a/2 - x*3, b/2 - y*2);
		Eye1.setFilled(true);
		Eye1.setColor(Color.YELLOW);
		GRect Eye2 = new GRect(x, y);
		add(Eye2, a/2 + x*2, b/2 - y*2);
		Eye2.setFilled(true);
		Eye2.setColor(Color.YELLOW);
	}

}
