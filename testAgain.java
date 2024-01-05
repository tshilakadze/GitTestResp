import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
	private JButton redButton;
//	private static final String SENTINEL = "";
	public void run() {
		
		redButton = new JButton("Red");
		add(redButton, SOUTH);
		addActionListeners();
		
		
		JTextField field = new JTextField(10);
		add(field, SOUTH);
		field.setText("rugby");
		field.addActionListener(this);
	//	println(field.getText());
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Red")){
			println("This happened.");
			
			
		}
	}
	
}