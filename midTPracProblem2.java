import acm.program.*;

public class midTPracProblem2 extends ConsoleProgram {
	
	private String result;

	public void run() {
		String text = readLine("enter text: ");
		onlyLowerCase(text);
		println(result);
		
		
		
	}

	private String onlyLowerCase(String text) {
		result = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(Character.isLowerCase(ch)){
				result = "" + ch;
			}
		}
		
		return result;
		
	}

	



	

}