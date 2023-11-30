import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;

public class bonusSem20N1 extends GraphicsProgram {
	
	private RandomGenerator rgen1 = RandomGenerator.getInstance();
	private static final double MINRADIUS = 10;
	private static final double MAXRADIUS = 50;
	private static final double MINSPEED = 1;
	private static final double MAXSPEED = 5;
	
	public void run() {
		addMouseListeners();
		addRandomCircle();
	}

	
	private void addRandomCircle(){
		double radius = rgen1.nextDouble(MINRADIUS, MAXRADIUS);
		double x = rgen1.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen1.nextDouble(0, getHeight() - 2 * radius);
		GOval circle = new GOval(2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(rgen1.nextColor());
		add(circle, x, y);
	}
}
