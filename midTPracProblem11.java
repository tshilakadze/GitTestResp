import acm.program.*;
public class midTPracProblem11 extends ConsoleProgram {
	
	private static final String ZERO = "00000000000000000000000000000000";
	String reversed;
	
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
			println(resultStr);
			println(reversedResultStr(resultStr));
		}
		
		return resultStr;
	}

	private String reversedResultStr(String resultStr) {
		for(int i = 0; i < reversed.length(); i++){
			char ch = reversed.charAt(i);
			if(ch == '1'){
				resultStr = resultStr.replace(ch, '0');
			}
			else{
				resultStr = resultStr.replace(ch, '1');
			}
		}
		return resultStr;
	}

	private String reverseString(String resultStr) {
		reversed = "";
		for(int i = 0; i < resultStr.length(); i++){
			char ch = resultStr.charAt(resultStr.length() - i - 1);
			reversed += ch;
		}
		int size = reversed.length();
		int zeroSize = ZERO.length();
		String part1 = ZERO.substring(0, zeroSize - size);
		reversed = part1 + reversed;
		return reversed;
	}

}
