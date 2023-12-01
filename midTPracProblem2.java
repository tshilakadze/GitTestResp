import acm.program.*;

public class midTPracProblem2 extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		onlyLowerCase(text);
		
		
		
		
	}

	private String onlyLowerCase(String text) {
		String result = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(Character.isLowerCase(ch)){
				result = "" + ch;
			}
		}
		
		return result;
		
	}

	



	

}