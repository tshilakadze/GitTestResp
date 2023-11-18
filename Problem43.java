import acm.program.GraphicsProgram;

import acm.graphics.*;

import java.awt.event.*;

public class Problem43 extends GraphicsProgram {
	private GOval ball;
	private static final int SIZE = 20;
	private static final int DELAY = 30;
	private int vy = 5;
	public void run(){
		ball = new GOval(SIZE, SIZE);
		ball.setFilled(true);
		add(ball);
		addMouseListeners();
		makeAnimation();
	}

	private void makeAnimation() {
		while(true){
			ball.move(0, vy);
			pause(DELAY);
		}
	}

	public void mouseClicked(MouseEvent e){
		ball.setLocation(e.getX(), e.getY());
	}
}
