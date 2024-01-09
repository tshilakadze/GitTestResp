import java.util.*;

import acm.program.ConsoleProgram;

public class TestingClass extends ConsoleProgram {
	
	public void run() {
		ArrayList<String> students = new ArrayList<>();
		students.add("mberi15");
		students.add("aberi20");
//		TestClass obj = new TestClass();
		TestClass obj = new TestClass(students);
		println(obj.getScore("mberi15"));
		
		obj.setScore(15.5, "mberi15");
		obj.setScore(15.5, "mberi1");
		
		println(obj.getScore("mberi15"));
		println(obj.getScore("mberi1"));
		
		obj.addStudent("mberi1");
		obj.setScore(15, "mberi1");
		println(obj.getScore("mberi1"));

	}

}
