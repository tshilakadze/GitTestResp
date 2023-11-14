import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;

public class Problem42 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		GOval circle = new GOval(SIZE, SIZE);
		circle.setFilled(true);
	}
	
}
