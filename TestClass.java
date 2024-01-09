import java.util.*;

public class TestClass {
	private Map<String, Double> studentScores;
	
	
	public TestClass(){
		studentScores = new HashMap<String, Double>();
		
	}

	public TestClass(ArrayList<String> students) {
		studentScores = new HashMap<String, Double>();
		for(String student: students){		// = for(int i = 0; i < students.size(); i++){String student = students.get(i);}
			studentScores.put(student,  null);
		}
//		studentScores.put(null, null);
	}
	
	public Double getScore(String student){
		if(!studentScores.containsKey(student)){
			System.out.println("No such student: " + student);
			return null;
			}
		return studentScores.get(student);
	}
	
	public void setScore(double score, String student){
		if(!studentScores.containsKey(student)){
			System.out.println("No such student: " + student);
			return;
			}
		studentScores.put(student,  score);
	}
	
	public void addStudent(String student){
		if(!studentScores.containsKey(student)){
			studentScores.put(student, null);
		}
	}
}
