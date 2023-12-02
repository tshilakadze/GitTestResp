import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

import acm.graphics.*;

public class midT2021Graph extends GraphicsProgram {
	 private int x;
	 private int y;
	 private int x1;
	 private int y1;
	 private GLine line;
	 
	public void run() {
		 x = 0;
		 y = 0;
		 addMouseListeners();
	 }
	
	public void mousePressed(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY();
		line = new GLine(x, y, x1, y1);
		add(line);
	}
	
	
	public void mouseDragged(MouseEvent e){
		line.setEndPoint(x1, y1);
	}
	
	public void mouseReleased(MouseEvent e){
		x = x1;
		y = y1;
	}

}
