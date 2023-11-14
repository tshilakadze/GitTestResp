import acm.program.GraphicsProgram;

import acm.graphics.*;

public class Problem39 extends GraphicsProgram {
	private static final int SIZE = 100;

	public void run() {		
		GOval ball = new GOval(SIZE, SIZE);
		add(ball, 0, getHeight()/2 - SIZE/2);
		int x = 5;
		int y = 0;
		while(true){
			if(ball.getX() + SIZE >= getWidth() || ball.getX() < 0){
				x = -x;
			}
			ball.move(x, y);
			pause(20);
		}
	}

	
}
