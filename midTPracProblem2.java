import acm.program.*;

public class midTPracProblem2 extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(Character.isLowerCase(ch)){
				if(ascendingOrder(text, ch)){
					
				}
			}
		}	
	}

	private boolean ascendingOrder(String text, char ch) {
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) < text.charAt(i + 1)){
				return false;
			}
		}
		return true;
	}

}
