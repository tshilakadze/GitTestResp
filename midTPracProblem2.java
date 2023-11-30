import acm.program.*;

public class midTPracProblem2 extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			char nextCh = text.charAt(i + 1);
			if(Character.isLowerCase(ch) && Character.isLowerCase(nextCh)){
				checkNextChar(text, ch, nextCh);
			}
		}	
	}

	private void checkNextChar(String text, char ch, char nextCh) {
		if(ch > nextCh){
			println("false");
		}
		else{
			println("true");
		}
	}

	

}