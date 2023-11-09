import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

import acm.graphics.*;

public class GraphicsEventsSample extends GraphicsProgram {
	public void run() {
		GRect rect1 = new GRect(100, 100);
		rect1.setFilled(true);
		add(rect1);
		
		GRect rect2 = new GRect(100, 100);
		rect2.setFilled(true);
		add(rect2, 200, 200);
		
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e){
	//	e.getX();
		
		GObject obj = getElementAt(e.getX(), e.getY());
		
		if(obj != null){
			pbj.setColor(Color.RED);
		}
	}

}
