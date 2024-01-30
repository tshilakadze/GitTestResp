import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.*;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem72 extends GraphicsProgram {
	
	private static final int RESULT_X = 20;
	private static final int LINE_H = 20;
	
	private JTextField teach;
	private JTextField subj;
	private JTextField pupil;
	
	
	private School school;
	
	public void init() {
		teach = new JTextField(5);
		subj = new JTextField(5);
		pupil = new JTextField(5);
		JLabel a = new JLabel("Name");
		add(a, SOUTH);
	}

}
