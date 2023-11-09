import acm.program.GraphicsProgram;

import acm.graphics.*;

public class Bonus13_3 extends GraphicsProgram {
	
	private static final int DIAMETER = 50;
	
	public void run() {
		GOval ball = new GOval(DIAMETER, DIAMETER);
		add(ball, getWidth()/2 - DIAMETER/2, getHeight()/2 - DIAMETER/2);
		ball.setFilled(true);
	}
}
