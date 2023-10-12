import acm.graphics.*;
import acm.program.GraphicsProgram;
public class Problem13 extends GraphicsProgram {
//	private static final double PI = 3.14;
	private static final double HOUSE_WIDTH = 300;
	private static final double HOUSE_HEIGT = 200;
	private static final double DOOR_WIDTH = 40;
	private static final double DOOR_HEIGT = 60;
	
	public void run(){
		drawLineInTheMiddle();
		drawHouse();
	}
	
	private void drawHouse() {
	drawWall();
	drawRoof();
	drawDoor();
	drawWindows();
	}
	
	private void drawWindows() {
		// TODO Auto-generated method stub
		
	}

	private void drawDoor() {
		// TODO Auto-generated method stub
		
	}

	private void drawRoof() {
		// TODO Auto-generated method stub
		
	}

	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGT);
		// int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		double x = getWidth() / 2 - HOUSE_WIDTH / 2;
		double y = getHeight() - HOUSE_HEIGT;
		add(wall, x, y);
	}

	private void drawLineInTheMiddle(){
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = y1;
		GLine Line = new GLine(x1, y1, x2, y2);
		add(Line);
	}
}