import acm.program.*;
public class midTPracProblem12 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the number n: ");
		int k = readInt("Enter the number between 2 and 9: ");
		println("output: " + mOfNumbers(n, k));
		
	}

	private int sumOfNumbers(int n, int k) {
		int sum = 0;
		while(n != 0){
			int remainder = n % k;
			n = n / k;
			sum += remainder;
		}
		return sum;
	}

}
