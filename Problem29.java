import acm.program.ConsoleProgram;

public class Problem29 extends ConsoleProgram{
	
	public void run(){
		int n = readInt("Enter the number n ");
		while(n < 0){
				println("enter a positive number ");
				n = readInt("Enter a number ");
			}
		
		int fibN = fib(n);
		println(fibN);
	}

	// 0 1 2 3 4 5 6 
	// 0 1 1 2 3 5 8
	
	private int fib(int n) {
		if(n == 0 || n ==1){
			return n;
		}
		
		int prev2 = 0;			// older
		int prev1 = 1;			// newer
		for(int i = 2; i <= n; i++){
			int curr = prev2 + prev1;
			prev2 = prev1;
			prev1 = curr;
		}
		return prev1;
	}
}