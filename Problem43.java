import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;

public class Problem43 extends GraphicsProgram {
	private GOval circle;
	private static final int DIAMETER = 50;
	public void run() {
		add(circle, getWidth()/2, 0);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		circle = new GOval(DIAMETER, DIAMETER);
		circle.setFilled(true);
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}
}
