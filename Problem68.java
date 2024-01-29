import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class Problem68 extends GraphicsProgram {
	private JTextField message;
	private double y = 20;
	
	public void init() {
		message = new JTextField(20);
		add(message, SOUTH);
		message.addActionListener(this);
		JButton ent = new JButton("Enter");
		add(ent, SOUTH);
		
		addActionListeners();
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Enter") || e.getSource() == message){
			GLabel mas = new GLabel(message.getText());
			mas.setFont("Dialog-16-bold");
			add(mas, 2, y);
			y += 20;
			message.setText("");
		}
	}
}