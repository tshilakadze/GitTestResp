import acm.graphics.*;

import acm.program.GraphicsProgram;
public class Problem12 extends GraphicsProgram{
	public void run(){
		drawHouse();
		drawWindow();
		drawDoor();
		drawRoof();
	}


	private void drawHouse() {
		GRect myHouse = new GRect(600, 400);
		add(myHouse, 200, 300);
	}
	
	private void drawWindow() {
		GRect aWindow = new GRect(150, 150);
		add(aWindow, 600, 400);
	}
	
	private void drawDoor() {
		GRect aDoor = new GRect(150, 300);
		add(aDoor, 300, 400);
		
		GRect aHandle = new GRect(35, 7);
		add(aHandle, 300, 550);
		GOval aLock = new GOval(10, 10);
		add(aLock, 305, 560);
	}
	
	private void drawRoof(){
		GLine firstLine = new GLine(200, 300, 500, 200);
		add(firstLine);
		GLine secondLine = new GLine(500, 200, 800, 300);
		add(secondLine);
	}
}