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
		teach = new JTextField(8);
		subj = new JTextField(8);
		pupil = new JTextField(8);
		
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
		add(addSubj, SOUTH);
		add(addPupil, SOUTH);
		add(disPupil, NORTH);		// Because it took too much space
		add(disTeach, NORTH);
		
		
		addActionListeners();
	}
	
	
	public void actionListeners(ActionEvent e){
		if(e.getActionCommand().equals("Add Teach") && !teach.getText().equals("")){
			teach.setText("");
			school.addTeacher(teach.getText());
			pupil.setText("");
			subj.setText("");
			teach.setText("");
		}
		if(e.getActionCommand().equals("Add subject") && !subj.getText().equals("") && !teach.getText().equals("")){
			school.addSubject(teach.getText(), subj.getText());
			pupil.setText("");
			subj.setText("");
			teach.setText("");
		}
		if(e.getActionCommand().equals("Add Pupil") && !subj.getText().equals("") && !pupil.getText().equals("")){
			school.addPupil(pupil.getText(), subj.getText());
			pupil.setText("");
			subj.setText("");
			teach.setText("");
		}
		
		if(e.getActionCommand().equals("Display Pupil") && !teach.getText().equals("")){
			school.getPupils(teach.getText());
			displayIterator(school.getPupils(teach.getText()));
		}
	}


	private void displayIterator(Iterator<String> pupils) {
		removeAll();
		
	}

}
