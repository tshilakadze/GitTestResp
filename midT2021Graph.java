import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

import acm.graphics.*;

public class midT2021Graph extends GraphicsProgram {
	 private int x;
	 private int y;
	 private GLine line;
	 
	public void run() {
		 x = 0;
		 y = 0;
		 addMouseListeners();
	 }
	
	public void mousePressed(MouseEvent e){
		line = new GLine(x, y, e.getX(), e.getY());
		add(line);
	}
	
	
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(e.getX(), e.getY());
	}
	
	public void mouseReleased(MouseEvent e){
		x = e.getX();
		y = e.getY();
	}

}
