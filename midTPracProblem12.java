import acm.program.*;
public class midTPracProblem12 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the number n: ");
		int k = readInt("Enter the number between 2 and 9: ");
		while(k < 2 || k > 9){
			k = readInt("Can you read you fucking imbecile? Enter a proper number: ");
		}
		println("output: " + sumOfNumbers(n, k));
	}

	private int sumOfNumbers(int n, int k) {
		int divident = 1;
		int sum = 0;
		while(divident != 0){
			int remainder = n % k;
			divident = n / k;
			sum += remainder;
		}
		println(sum);
		return sum;
	}

}
