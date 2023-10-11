import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
public class Problem12 extends GraphicsProgram{
	public void run(){
		drawAHouse();
		drawWindow();
	}

	

	private void drawAHouse() {
		GRect myHouse = new GRect(600, 400);
		add(myHouse, 200, 200);
	}
	
	private void drawWindow() {
		GRect aWindow = new GRect(150, 150);
		add(aWindow, 600, 300);
	}
}