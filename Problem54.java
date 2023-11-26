import acm.program.*;
public class Problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("The number n = ");
		typeInNumbers(n);
	}

	private void typeInNumbers(int n) {
		int max = 0;
		int secMax = 0;
		for(int i = 0; i < n; i++){
			int a = readInt("? ");
			if(a > Integer.MIN_VALUE && a < Integer.MAX_VALUE){
				max = a;
				secMax = a;
				checkNext(a, max, secMax);
			}
		}
		println("The largest number is " + max);
		println("The second largest number is " + secMax);
	}

	private void checkNext(int a, int max, int secMax) {
		
	}

}
