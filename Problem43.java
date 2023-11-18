import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;

public class Problem43 extends GraphicsProgram {
	private GOval circle;
	
	private int prevX;
	private int prevY;
	private GObject lastPressedObj;
	private static final int DIAMETER = 50;
	public void run() {
		circle = new GOval(DIAMETER, DIAMETER);
		circle.setFilled(true);
		add(circle, getWidth()/2 - DIAMETER/2, getHeight()/2 - DIAMETER/2);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		lastPressedObj = obj;
		if(obj != null){
			prevX = e.getX();
			prevY = e.getY();
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if(lastPressedObj != null){
			
			lastPressedObj.move(e.getX() - prevX, e.getY() - prevY);
			
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}
