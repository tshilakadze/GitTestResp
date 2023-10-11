import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;
public class Problem12 extends GraphicsProgram{
	public void run(){
		drawAHouse();
		drawWindow();
		drawDoor();
	}


	private void drawAHouse() {
		GRect myHouse = new GRect(600, 400);
		add(myHouse, 200, 300);
	}
	
	private void drawWindow() {
		GRect aWindow = new GRect(150, 150);
		add(aWindow, 600, 400);
	}
	
	private void drawDoor() {
		GRect aDoor = new GRect(200, 300);
		add(aDoor, 400, 400);
	}
}