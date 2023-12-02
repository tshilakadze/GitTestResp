import java.awt.Color;

import java.awt.event.MouseEvent;

import acm.graphics.*;

import acm.program.GraphicsProgram;

public class midT2022Graph extends GraphicsProgram {
	private static final double ROWS = 8;
	private static final double COLUMNS = 8;
	private GRect rect;
	public void run(){
		drawRects();
		addMouseListeners();
		
	}
	private void drawRects() {
		double size = Math.min(getHeight(), getWidth())/COLUMNS;
		for(int i = 0; i < ROWS; i++){
			for(int l = 0; l < COLUMNS; l++){
				double x = i*size;
				double y = l*size;
				rect = new GRect(size, size);
				add(rect, x, y);
				rect.setFilled(true);
				rect.setFillColor(Color.WHITE);
				
			}
		}
	}
	
	public void mouseClicked(MouseEvent e){
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == rect){
			rect.setFillColor(Color.BLACK);
		}
	}

}
