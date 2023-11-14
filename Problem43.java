import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;

public class Problem43 extends GraphicsProgram {
	private GOval circle;
	private static final int DIAMETER = 50;
	public void run() {
		circle = new GOval(DIAMETER, DIAMETER);
		circle.setFilled(true);
		add(circle, getWidth()/2 - DIAMETER/2, getHeight()/2 - DIAMETER/2);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}
}
