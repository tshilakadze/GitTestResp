import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;

public class Problem41 extends GraphicsProgram {
	
	private static final int SIZE = 10;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e){
		GOval ball = new GOval(SIZE, SIZE);
		ball.setFilled(true);
		add(ball, e.getX() - SIZE/2, e.getY() - SIZE/2);
	}
	
	public void mousePressed(MouseEvent e) {
		GOval circle = new GOval(SIZE, SIZE);
		circle.setFilled(true);
		add(circle, e.getX() - SIZE/2, e.getY() - SIZE/2);
	}
	
}
