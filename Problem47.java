import acm.program.ConsoleProgram;
public class Problem47 extends ConsoleProgram {
	public void run() {
		while(true){
		String text = readLine("The text: ");
		if(palindrome(text)){
			println("This text is a palindrome.");
		}
		else{
			println("This text is not a palindrome.");
		}
		}
	}

	private boolean palindrome(String text) {
		for(int i = 0; i < text.length()/2; i++){
			if(text.charAt(i) != text.charAt(text.length() - i)){
				return false;
			}
		}
		return true;
	}

	
}