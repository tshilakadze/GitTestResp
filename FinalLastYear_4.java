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
	private ArrayList<ArrayList<String>> rows;
	
	public void init() {
		column = new JTextField(10);
		row = new JTextField(10);
		search = new JTextField(10);
		colButton = new JButton("Add column");
		rowButton = new JButton("Add row");
		filterButton = new JButton("Search");
		add(column, SOUTH);
		add(colButton, SOUTH);
		add(row, SOUTH);
		add(rowButton, SOUTH);
		add(search, SOUTH);
		add(filterButton, SOUTH);
		
		columnNames = new ArrayList<String>();
		rows = new ArrayList<ArrayList<String>>();
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
			addRow(row.getText());
		}
		
		if(e.getActionCommand().equals("Search")){
			findSearchedWord(search.getText());
		}
	}





	private void addRow(String text) {
		ArrayList<String> rowWords = new ArrayList<String>();
		StringTokenizer tokenizer = new StringTokenizer(text, ";");
		while(tokenizer.hasMoreTokens()){
			rowWords.add(tokenizer.nextToken());
		}
		rows.add(rowWords);
		displayNewRows();
	}




	private void displayNewRows() {
		removeAll();
		addNewColumn(columnNames);
		int y = COLUMN_START_Y + ROW_STEP;
		for(ArrayList<String> row: rows){
			displayRow(row, y);
			y += ROW_STEP;
		}
	}


	private void addNewColumn(ArrayList<String> columnNames2) {
		int x = COLUMN_START_X + COLUMN_STEP * columnNames2.indexOf(column.getText());
		int y = COLUMN_START_Y;
		displayRow(columnNames, y);
		GLine line = new GLine(COLUMN_START_X, COLUMN_START_Y, COLUMN_START_X + COLUMN_STEP * columnNames.size(), COLUMN_START_Y);
		add(line);
	}


	private void displayRow(ArrayList<String> row, int y) {
		int x = COLUMN_START_X;
		for(int i  = 0; i < row.size(); i++){
			GLabel label = new GLabel(row.get(i));
			add(label, x, y);
			x += COLUMN_STEP;
		}
	}
}