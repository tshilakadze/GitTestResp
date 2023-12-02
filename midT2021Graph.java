import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

import acm.graphics.*;

public class midT2021Graph extends GraphicsProgram {
	 private int x;
	 private int y;
	public void run() {
		 x = 0;
		 y = 0;
		 addMouseListeners();
	 }
	
	public void mousePressed(MouseEvent e){
		int x1 = e.getX();
		int y1 = e.getY();
		GLine line = new GLine(x, y, x1, y1);
		add(line);
	}

}
