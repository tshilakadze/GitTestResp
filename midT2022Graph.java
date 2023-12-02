import java.awt.Color;

import acm.graphics.*;

import acm.program.GraphicsProgram;

public class midT2022Graph extends GraphicsProgram {
	private static final double ROWS = 8;
	private static final double COLUMNS = 8;
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
				GRect rect = new GRect(size, size);
				add(rect, x, y);
				rect.setFilled(true);
				rect.setFillColor(Color.WHITE);
				
			}
		}
	}

}
