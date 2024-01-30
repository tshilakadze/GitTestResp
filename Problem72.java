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
		
		JButton addTeach = new JButton("Add Teach");
		JButton addSubj = new JButton("Add subject");
		JButton addPupil = new JButton("Add Pupil");
		JButton disPupil = new JButton("Display Pupil");
		JButton disTeach = new JButton("Display Teachers");
		
		JLabel a = new JLabel("Teach:");
		JLabel b = new JLabel("Subj:");
		JLabel c = new JLabel("Pupil:");
		
		add(a, SOUTH);
		add(teach, SOUTH);
		add(b, SOUTH);
		add(subj, SOUTH);
		add(c, SOUTH);
		add(pupil, SOUTH);
		add(addTeach, SOUTH);
	}

}
