import acm.graphics.*;
import acm.program.GraphicsProgram;
public class Problem13 extends GraphicsProgram{
	public void run(){
		drawLineInTheMiddle();
	}
	private void drawLineInTheMiddle(){
		GLine middleLine = new GLine(0, 600, 3000, 800);
		add(middleLine);
	}
}