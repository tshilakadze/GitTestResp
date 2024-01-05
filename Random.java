import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;
import java.awt.*;
import acm.graphics.*;
import acm.util.*;

public class Random extends GraphicsProgram {
	private static final int BALL_COUNT = 20;
	private static final int MIN_RADIUS = 2;
	private static final int MAX_RADIUS = 10;
	private static final int V_Y = 3;
	private int radius;
	private int diameter;
	private int x;
	private int y;
	private GOval ball;
	private GObject a = null;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		drawBalls();
		radius = rgen.nextInt(MIN_RADIUS, MAX_RADIUS);
		diameter = radius * 2;
		x = rgen.nextInt(0, getWidth());
		y = rgen.nextInt(0, getHeight());
		addMouseListeners();
		
	}
	
	
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if((GOval)obj == ball){
		//	a(GOval) = obj;
		//	ball.setColor(Color.rgen.nextColor());
		}
		if(obj == null && a != null){
			while(true){
				a.move(0, V_Y);
				pause(20);
			}
			
		}
	}
	
	
	private void drawBalls() {
		for(int i = 0; i < BALL_COUNT; i++){
			ball = new GOval(diameter, diameter);
			add(ball, x, y);
			ball.setFilled(true);
			if(x + diameter > getWidth()){
				ball.setLocation(getWidth() - diameter, y);
			}
			if(x < 0){
				ball.setLocation(0, y);
			}
			if(y + diameter > getHeight()){
				ball.setLocation(x, getHeight() - diameter);
			}
			if(y < 0){
				ball.setLocation(0, x);
			}
		}
		
	}
}