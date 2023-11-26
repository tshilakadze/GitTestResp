import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	
	public void run() {
		String numStr = readLine("Enter a number: ");
		int finalNum = stringToInteger(numStr);
		println(finalNum);
		println(finalNum - 1);
	}

	private int stringToInteger(String numStr) {
		int num = 0;
		for(int i = 0; i < numStr.length(); i++){
			int currDigit = charToInteger(numStr.charAt(i));
			num = num * 10 + currDigit;
		}
		return num;
	}

	private int charToInteger(char charAt) {
		
		return charAt - '0';
	}
}
