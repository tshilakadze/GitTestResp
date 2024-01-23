import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
	private ArrayList<String> rowWords;
	private Map<String, ArrayList<String>> rows;
	
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
		rows = new HashMap<String, ArrayList<String>>();
		addActionListeners();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Add column")){
			if(!columnNames.contains(column.getText())){
				columnNames.add(column.getText());
				addNewColumn(columnNames);
			}
		}
		
		if(e.getActionCommand().equals("Add row")){
			
		}
		
		if(e.getActionCommand().equals("Filter")){
			
		}
	}





	private void displayRow(ArrayList<String> rowWords, int y) {
			for(int i = 0; i < rowWords.size(); i++){
				GLabel theWord = new GLabel(rowWords.get(i));
				int x = COLUMN_START_X + COLUMN_STEP*i;
				add(theWord, x, y);
			}
	}


	private void addNewColumn(ArrayList<String> columnNames2) {
		int x = COLUMN_START_X + COLUMN_STEP * columnNames2.indexOf(column.getText());
		GLabel colName = new GLabel(column.getText());
		GLine line = new GLine(x, COLUMN_START_Y, x + COLUMN_STEP, COLUMN_START_Y);
		add(colName, x, COLUMN_START_Y);
		add(line);
	}
}