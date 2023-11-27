import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class Bonus13_3 extends GraphicsProgram {
	
	private static final int DIAMETER = 50;
	private static final int DELAY = 20;
	private static final double VXMAX = 5;
	private static final double VYMAX = 5;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		GOval ball = new GOval(DIAMETER, DIAMETER);
		add(ball, getWidth()/2 - DIAMETER/2, getHeight()/2 - DIAMETER/2);
		ball.setFilled(true);
	}
}
