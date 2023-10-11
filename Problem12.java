import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
public class Problem12 extends GraphicsProgram{
	public void run(){
		drawAHouse();
		drawWindow();
	}

	

	private void drawAHouse() {
		GRect myHouse = new GRect(400, 400);
		add(myHouse, 200, 200);
	}
	
	private void drawWindow() {
		GRect aWindow = new GRect(80, 80);
		add(aWindow, 300, 250);
	}
}