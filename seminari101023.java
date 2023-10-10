import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class seminari101023 extends GraphicsProgram{
	public void run() {
		GOval myOval = new GOval(100, 200);
		add(myOval, 100, 100);
		myOval.setFilled(true);
		myOval.setColor(Color.RED);
		
		GOval secondOval = new GOval(100, 200);
		
		add(secondOval, 200, 200);
		secondOval.setFilled(true);
		secondOval.setColor(Color.RED);
		GOval rugbyBall = new GOval (200, 200);
		add(rugbyBall, 200, 200);
		rugbyBall.setFilled(true);
	}
}