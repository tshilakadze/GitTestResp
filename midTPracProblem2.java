import acm.program.*;

public class midTPracProblem2 extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(Character.isLowerCase(ch)){
				checkNextChar(text, ch, i);
			}
		}	
	}

	private void checkNextChar(String text, char ch, int i) {
		if(ch > text.charAt(i + 1)){
			println("false");
		}
		else{
			println("true");
		}
	}

	

}