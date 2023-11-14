import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;

public class Problem41 extends GraphicsProgram {
	
	private static final int SIZE = 10;
	
	public void run() {
		addMouseListeners();
	}
	
	public void MouseDragged(MouseEvent e){
		GOval ball = new GOval(SIZE, SIZE);
		ball.setFilled(true);
		add(ball);
	}
	
}
