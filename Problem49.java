import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	
	public void run() {
		String numStr = readLine("Enter a number: ");
		int finalNum = stringToInteger(numStr);
	}

	private int stringToInteger(String numStr) {
		for(int i = 0; i < numStr.length(); i++){
			int currDigit = charToInteger(numStr.charAt(i));
		}
		return 0;
	}

	private int charToInteger(char charAt) {
		
		return charAt - '0';
	}
}
