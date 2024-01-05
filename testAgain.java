import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
//	private static final String SENTINEL = "";
	public void run() {
		
		JButton redButton = new JButton("Touch me daddy");
		add(redButton, SOUTH);
		addActionListeners();
		
		
		
/*		JTextField field = new JTextField(5);
		add(field, SOUTH);
		field.setText("rugby");
		field.addActionListener(this);*/
	//	println(field.getText());
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Red")){
			println("Oh yes baby...");
		}
	}
	
}