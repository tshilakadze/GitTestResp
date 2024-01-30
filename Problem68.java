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
	private GCompound compMess;
	
	public void init() {
		message = new JTextField(20);
		add(message, SOUTH);
		message.addActionListener(this);
		JButton ent = new JButton("Enter");
		add(ent, SOUTH);
		
		compMess = new GCompound();
		add(compMess);
		
		addActionListeners();
		addMouseListeners();
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Enter") || e.getSource() == message){
			GLabel mes = new GLabel(message.getText());
			mes.setFont("Dialog-16-bold");
			compMess.add(mes, 2, y);
			y += 20;
			GLabel bla = new GLabel(compMess.getHeight() + "");
			add(bla, 2, y);
			message.setText("");
		}
	}
	
	
	public void mousePressed(MouseEvent e){
		prevY = e.getY();
	}
	
	public void mouseDragged(MouseEvent e){
		
	}
}