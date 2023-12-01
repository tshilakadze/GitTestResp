import acm.program.*;
public class midTPracProblem12 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the number n: ");
		int k = readInt("Enter the number between 2 and 9: ");
		while(k < 2 || k > 9){
			k = readInt("Can you read you fucking imbecile? Enter a proper number you asshole: ");
		}
		println(sumOfNumbers(n, k));
		
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
