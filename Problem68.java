import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class Problem68 extends GraphicsProgram {
	
	private JTextField message;
	private static final int SPACE = 20;
	private double y = SPACE;
	private int prevY;
	private GCompound compMess;
	private GRect scroll;
	private GObject obj;
	
	public void init() {
		message = new JTextField(20);
		add(message, SOUTH);
		message.addActionListener(this);
		JButton ent = new JButton("Enter");
		add(ent, SOUTH);
		
		compMess = new GCompound();
		add(compMess);
		scroll = new GRect(20, 60);
		scroll.setFilled(true);
		add(scroll, getWidth() - 20, 0);
		
		addActionListeners();
		addMouseListeners();
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Enter") || e.getSource() == message){
			if(!message.getText().equals("")){
				GLabel mes = new GLabel(message.getText());
				mes.setFont("Dialog-16-bold");
				compMess.add(mes, 2, y);
				y += SPACE;
				/*GLabel bla = new GLabel(compMess.getY() + "");
				add(bla, 2, y);*/
				message.setText("");
			}
		}
	}
	
	
	public void mousePressed(MouseEvent e){
		obj = getElementAt(e.getX(), e.getY());
		if(obj == scroll){
			prevY = e.getY();
		}
	}
	
	public void mouseDragged(MouseEvent e){
		if(compMess.getHeight() <= getHeight()){
			return;
		}
		compMess.move(0, e.getY() - prevY);
		prevY = e.getY();
		
		if(compMess.getY() < startingY()){
			compMess.setLocation(2, startingY());
		}
		if(compMess.getY() > 0){
			compMess.setLocation(2, 0);
		}
	}
	
	
	private double startingY() {
		double result = getHeight() - compMess.getHeight() - SPACE;
		return result;
	}
}