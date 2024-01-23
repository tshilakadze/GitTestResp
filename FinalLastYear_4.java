import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.*;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class FinalLastYear_4 extends GraphicsProgram{
	
	private static final int COLUMN_START_X = 10;
	private static final int COLUMN_START_Y = 20;
	private static final int ROW_STEP = 20;
	private static final int COLUMN_STEP = 100;
	
	private JTextField column;
	private JTextField row;
	private JTextField search;
	private JButton colButton;
	private JButton rowButton;
	private JButton filterButton;
	
	public void init() {
		column = new JTextField(10);
		row = new JTextField(10);
		search = new JTextField(10);
		colButton = new JButton("Add column");
		rowButton = new JButton("Add row");
		filterButton = new JButton("Filter");
		add(column, SOUTH);
		add(colButton, SOUTH);
		add(row, SOUTH);
		add(rowButton, SOUTH);
		add(search, SOUTH);
		add(filterButton, SOUTH);
		
		addActionListeners();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		int colCount = 0;
		int rowCount = 0;
		if(e.getActionCommand().equals("Add column")){
			colCount += 1;
			drawNewCol(colCount);
		}
	}


	private void drawNewCol(int colCount) {
		GLabel colName = new GLabel(column.getText());
		for(int i = 0; i < colCount; i++){
			int x = COLUMN_START_X * i;
			add(colName, x, COLUMN_START_Y);
		}
	}
	
}