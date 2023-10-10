import acm.graphics.*;
import acm.program.GraphicsProgram;

public class seminari101023 extends GraphicsProgram{
	public void run() {
		GOval myOval = new GOval(100, 200);
		add(myOval, 100, 100);
		
		GOval secondOval = new GOval(100, 200);
		
		add(secondOval, 200, 200);
		GOval rugbyBall = new GOval (200, 200);
		add(rugbyBall, 200, 200);
		rugbyBall.setFilled(true);
	}
}