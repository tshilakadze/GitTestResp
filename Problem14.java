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
		GRect Head = new GRect(100, 100);
		add(Head, a/2 - 50, b - 50);
	}

	private void drawNose() {
		// TODO Auto-generated method stub
		
	}

	private void drawMouth() {
		// TODO Auto-generated method stub
		
	}

	private void drawEyes() {
		// TODO Auto-generated method stub
		
	}

}
