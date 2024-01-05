import java.util.*;

import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
//	private static final String SENTINEL = "";
	public void run() {
		JTextField field = new JTextField(5);
		add(field, SOUTH);
		field.setText("rugby");
		println(field.getText());
	}
}