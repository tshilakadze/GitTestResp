import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.*;

import acm.graphics.*;
import acm.program.GraphicsProgram;


public class testAgain extends GraphicsProgram {
	private static final int COLUMN_START_X = 10;
	private static final int COLUMN_START_Y = 20;
	private static final int ROW_STEP = 20;
	private static final int COLUMN_STEP = 100;

	private JTextField colField;
	private JTextField rowField;
	private JTextField filterField;
	private JButton colButton;
	private JButton rowButton;
	private JButton filterButton;

	private ArrayList<String> columnNames;
	private ArrayList<ArrayList<String>> rows;

	public void init() {
		colField = new JTextField(10);
		rowField = new JTextField(10);
		filterField = new JTextField(10);
		colButton = new JButton("add column");
		rowButton = new JButton("add row");
		filterButton = new JButton("filter");

		add(colField, SOUTH);
		add(colButton, SOUTH);
		add(rowField, SOUTH);
		add(rowButton, SOUTH);
		add(filterField, SOUTH);
		add(filterButton, SOUTH);

		addActionListeners();

		columnNames = new ArrayList<>();
		rows = new ArrayList<>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == colButton) {
			addColumn(colField.getText());
		} else if (e.getSource() == rowButton) {
			addRow(rowField.getText());
		} else if (e.getSource() == filterButton) {
			filterRows(filterField.getText());
		}
	}

	private void filterRows(String text) {
		showGrid(text);
	}

	private void addRow(String text) {
		StringTokenizer tokenizer = new StringTokenizer(text, ";");
		ArrayList<String> newRow = new ArrayList<>();
		while (tokenizer.hasMoreTokens()) {
			newRow.add(tokenizer.nextToken());
		}
		rows.add(newRow);

		showGrid(null);
	}

	private void showGrid(String filterWrd) {
		displayColumnNames();
		int y = COLUMN_START_Y;
		for (ArrayList<String> row : rows) {
			if (filterWrd == null || row.contains(filterWrd)) {
				y += ROW_STEP;
				displayRow(row, y);
			}
		}
	}

	private void addColumn(String text) {
		columnNames.add(text);
		displayColumnNames();
	}

	private void displayColumnNames() {
		removeAll();
		displayRow(columnNames, COLUMN_START_Y);
		GLine line = new GLine(COLUMN_START_X, COLUMN_START_Y, COLUMN_START_X + COLUMN_STEP * columnNames.size(),
				COLUMN_START_Y);
		add(line);
	}

	private void displayRow(ArrayList<String> row, int y) {
		int x = COLUMN_START_X;
		for (int i = 0; i < row.size(); i++) {
			GLabel label = new GLabel(row.get(i));
			add(label, x, y);
			x += COLUMN_STEP;
		}
	}

}


//		555 244 676


/*
 * 244
 * 121
 * 74
 * 148
 */




