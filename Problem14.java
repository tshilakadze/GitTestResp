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
		GRect Head = new GRect(a/2, b/2, a/4, b/4);
		add(Head);
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
