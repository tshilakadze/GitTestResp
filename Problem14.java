import acm.program.*;
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
	}

	private void drawNose() {
		double a = getWidth();
		double b = getHeight();
		double x = 40;
		double y = 50;
		GRect Nose = new GRect(x, y);
		add(Nose, a/2 - x/2, b/2 - y/16);
	}

	private void drawMouth() {
		// TODO Auto-generated method stub
		
	}

	private void drawEyes() {
		// TODO Auto-generated method stub
		
	}

}
