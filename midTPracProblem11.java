import acm.program.*;
public class midTPracProblem11 extends ConsoleProgram {
	
	private static final String ZEROS = "00000000000000000000000000000000";
	
	public void run() {
		int num = readInt("Enter a number: ");
		println(binary(num));
		
	}
	
	private String binary(int num){
		String result = "";
		String numInString = "";
		int dividend = num;
		while(dividend != 0){
			int remainder = dividend % 2;
			dividend = dividend / 2;
			numInString = remainder + "";
			result += numInString;
		}
		
		return result;
	}

}
