import acm.program.*;

public class stringForMidT4 extends ConsoleProgram {
	public void run() {
		String text = readLine("Input: ");
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == 'i'){
				reverseString(text, i);
			}
		}
	}

	private void reverseString(String text, int i) {
		
	}

}
