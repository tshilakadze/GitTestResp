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
	private ArrayList<String> columnNames;
	
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
		
		columnNames = new ArrayList<String>();
		addActionListeners();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Add column")){
			columnNames.add(column.getText());
			drawNewCol(columnNames);
			System.out.println(columnNames.size());
		}
	}


	private void drawNewCol(ArrayList<String> columnNames) {
		double x = COLUMN_START_X + ROW_STEP * (columnNames.size() - 1);
		System.out.println(x);
		GLabel colName = new GLabel(column.getText());
//		add(colName, x, COLUMN_START_Y);
		for(int i = 0; i < columnNames.size(); i++){
			add(colName, x, COLUMN_START_Y);
			x = x + ROW_STEP * (i + 1) + colName.getWidth();
		}
	}
	
}