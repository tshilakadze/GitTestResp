import java.awt.event.ActionEvent;

import javax.swing.*;

import acm.program.*;

public class Problem68 extends GraphicsProgram {
	public void init() {
		JTextField message = new JTextField(20);
		add(message, SOUTH);
		message.addActionListener(this);
		JButton ent = new JButton("Enter");
		add(ent, SOUTH);
		
		addActionListeners();
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		
	}
}