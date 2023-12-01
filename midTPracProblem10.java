import acm.program.*;
public class midTPracProblem10 extends ConsoleProgram {
	private String a;
	public void run() {
		int num = readInt("Enter a number: ");
		a = "" + num;
		println(equalsOrNot(num));
	}
	
	private boolean equalsOrNot(int num){
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < a.length(); i++){
			char ch = a.charAt(i);
			String c = ch + "";
			int b = Integer.parseInt(c);
			println(b);
		}
		return true;
	}

}
