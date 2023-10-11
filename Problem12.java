import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
public class Problem12 extends GraphicsProgram{
	public void run(){
		drawAHouse();
		
	}

	private void drawAHouse() {
		GRect myHouse = new GRect(100, 200);
		add(myHouse, 200, 200);
	}
}