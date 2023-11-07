import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a number ");
		int reversedN = reverse(n);
	}

	private int reverse(int n) {
		while(n != 0){
			int lastDigit = n % 10;
			n /= 10;
			print(lastDigit);
		}
		return 0;
	}
}
