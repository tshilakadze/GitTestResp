import acm.program.*;
public class midTPracProblem11 extends ConsoleProgram {
	
	private static final String ZEROS = "00000000000000000000000000000000";
	
	public void run() {
		int num = readInt("Enter a number: ");
		println(binary(num));
		
	}
	
	private int binary(int num){
		String finalNum = "";
		while(true){
			int remainder = num % 2;
			num = num / 2;
			if(num / 2 == 0){
				break;
			}
			String number = remainder + "";
			finalNum += number;
		}
		int realNumber = Integer.parseInt(finalNum);
		return realNumber;
	}

}
