import acm.program.GraphicsProgram;
import acm.graphics.*;

public class Seminari8Damatebii02 extends GraphicsProgram {
	
	private static final int LENGTH = 100;
	
	public void run() {
		drawSquare();
		
	}

	private void drawSquare() {
		double a = getWidth();
		double b = getHeight();
		GRect square = new GRect(LENGTH, LENGTH);
		add(square, a/2 - LENGTH/2, b/2 - LENGTH/2);
	}
}
