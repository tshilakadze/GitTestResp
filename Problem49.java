import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	
	public void run() {
		String numStr = readLine("Enter a number: ");
		double finalNum = stringToInteger(numStr);
	}

	private double stringToInteger(String numStr) {
		double num = 1;
		for(int i = 0; i < numStr.length(); i++){
			int currDigit = charToInteger(numStr.charAt(i));
			num = currDigit * Math.pow(10, numStr.length() - i);
		}
		return num;
	}

	private int charToInteger(char charAt) {
		
		return charAt - '0';
	}
}
