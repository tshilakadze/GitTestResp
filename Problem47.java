import acm.program.ConsoleProgram;
public class Problem47 extends ConsoleProgram {
	public void run() {
		String text = "hagg";
		boolean isPalindrom = isPalindrom(text);
		println(text + " is palindrome: " + isPalindrom);
	}

	private boolean isPalindrom(String text) {
		for(int i = 0; i < text.length()/2; i++){
			if(text.charAt(i) != text.charAt(text.length() - i - 1)){
				return false;
			}
		}
		return true;
	}

}
