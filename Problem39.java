import acm.program.GraphicsProgram;

import acm.graphics.*;

public class Problem39 extends GraphicsProgram {
	private static final int SIZE = 100;

	public void run() {		
		GOval ball = new GOval(SIZE, SIZE);
		add(ball, 0, getHeight()/2 - SIZE/2);
		while(ball.getX() <= getWidth() - SIZE - 10){
			ball.move(10, 0);
			pause(15);
			if(ball.getX() >= 0){
				ball.move(-10, 0);
				pause(15);
			}
		}
	}

	
}
