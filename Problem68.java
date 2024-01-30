import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class Problem68 extends GraphicsProgram {
	
	private JTextField message;
	private double y = 20;
	private int prevY;
	
	public void init() {
		message = new JTextField(20);
		add(message, SOUTH);
		message.addActionListener(this);
		JButton ent = new JButton("Enter");
		add(ent, SOUTH);
		
		addActionListeners();
		addMouseListeners();
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
	
	
	public void mousePressed(MouseEvent e){
		prevY = e.getY();
	}
}