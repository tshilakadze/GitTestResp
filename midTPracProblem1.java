import acm.program.*;

public class midTPracProblem1 extends ConsoleProgram {
	private String text;
	private String result;
	
	public void run() {
		text = readLine("enter the text = ");
		text = text.toLowerCase();
		leaveOnlyLetters();
		println(result);
	}
	
	
	private String leaveOnlyLetters(){
		result = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(Character.isLetter(ch)){
				result += ch;
			}
		}
		return result;
	}
}
