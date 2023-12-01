import acm.program.*;
public class midTpracProblem6 extends ConsoleProgram {
	public void run() {
		String text1 = readLine("Enter the first text: ");
		String text2 = readLine("Enter the second text: ");
		println(canBeEquals(text1, text2));
	}
	
	private boolean canBeEquals(String text1, String text2) {
		
		if(text1.length() != text2.length()){
			return false;
		}
		for(int i = 0; i < text1.length(); i++){
			
		}
		
		return true;
	}

}
