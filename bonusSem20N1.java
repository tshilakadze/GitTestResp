import acm.program.*;

import acm.util.RandomGenerator;

import java.awt.event.MouseEvent;

import acm.graphics.*;

public class bonusSem20N1 extends GraphicsProgram {
	
	private RandomGenerator rgen1 = RandomGenerator.getInstance();
	private static final double MINRADIUS = 10;
	private static final double MAXRADIUS = 50;
	private static final double MINSPEED = 1;
	private static final double MAXSPEED = 5;
	private static final int DELAY = 50;
	private GOval circle = null;
	private double vx = 0;
	private double vy = 0;
	public void run() {
		addMouseListeners();
		addRandomCircle();
		while(true){
			circle.move(vx, vy);
			pause(50);
		}
	}

	
	private void addRandomCircle(){
		double radius = rgen1.nextDouble(MINRADIUS, MAXRADIUS);
		double x = rgen1.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen1.nextDouble(0, getHeight() - 2 * radius);
		circle = new GOval(2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(rgen1.nextColor());
		add(circle, x, y);
	}
	
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == circle){
			vx = rgen1.nextDouble(MINSPEED, MAXSPEED);
			if (rgen1.nextBoolean(0.5))
				vx = -vx;
			vy = rgen1.nextDouble(MINSPEED, MAXSPEED);
		}
		
	}
}
