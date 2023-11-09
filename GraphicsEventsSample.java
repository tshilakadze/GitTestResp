import acm.program.GraphicsProgram;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.*;

public class GraphicsEventsSample extends GraphicsProgram {
	
	private GRect rect1;
	private GRect rect2;
	
	public void run() {
		rect1 = new GRect(100, 100);
		rect1.setFilled(true);
		add(rect1);
		
		rect2 = new GRect(100, 100);
		rect2.setFilled(true);
		add(rect2, 200, 200);
		
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
	//	e.getX();
		
		GObject obj = getElementAt(e.getX(), e.getY());
		
		if(obj != null){
			obj.setColor(Color.RED);
		}
		
		if(obj == rect1){
			obj.setColor(Color.RED);
		}
		else if(obj == rect2) {
			obj.setColor(Color.BLUE);
		}
	}

}
