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
		
		
		
		JTextField field = new JTextField(10);
		add(field, SOUTH);
		
		field.addActionListener(this);
		
		addActionListeners();
	//	println(field.getText());
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Red")){
			println("This happened.");
			
			
		}
	}
	
}