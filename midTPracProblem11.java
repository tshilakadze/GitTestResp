import acm.program.*;
public class midTPracProblem11 extends ConsoleProgram {
	
	private static final String ZEROS = "00000000000000000000000000000000";
	
	public void run() {
		int num = readInt("Enter a number: ");
		println(binary(num));
		
	}
	
	private String binary(int num){
		String resultStr = "";
		String numInString = "";
		int stringToInt = 0;
		int dividend = num;
		while(dividend != 0){
			int remainder = dividend % 2;
			dividend = dividend / 2;
			numInString = remainder + "";
			resultStr += numInString;
			resultStr = reverseString(resultStr);
			
		}
		
		return resultStr;
	}

	private String reverseString(String resultStr) {
		String reversed = "";
		for(int i = 0; i < resultStr.length(); i++){
			char ch = resultStr.charAt(resultStr.length() - i - 1);
			reversed += ch;
		}
		return reversed;
	}

}
