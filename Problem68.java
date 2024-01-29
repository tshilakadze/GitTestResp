import java.awt.event.ActionEvent;
import java.util.*;

import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class Problem68 extends GraphicsProgram {
	private JTextField message;
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
			double y = 20;
			ArrayList<String> list = new ArrayList<String>();
			list.add(message.getText());
			GLabel mas = new GLabel(message.getText());
			mas.setFont("Dialog-16-bold");
			for(int i = 0; i < list.size(); i++){
				y = y + mas.getHeight() * (i + 1);
			}
			add(mas, 0, 20);
			message.setText("");
		}
	}
}