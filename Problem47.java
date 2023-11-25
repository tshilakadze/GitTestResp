import acm.program.ConsoleProgram;
public class Problem47 extends ConsoleProgram {
	public void run() {
		String text = readLine("The text: ");
		palindromeOrNot(text);
		
	}

	private boolean palindromeOrNot(String text) {
		for(int i = 0; i < text.length()/2; i++){
			if(text.charAt(i) == text.charAt(text.length() - i)){
				
			}
			return true;
		}
		return false;
	}
}