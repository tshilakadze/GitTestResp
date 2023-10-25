import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the number ");
		primeOrNot(n);
		
		
		
		
		
		
		
		
	}

	private int primeOrNot(int n) {
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				println("This is not a prime number");
				
			}
			else{
				println("This is a prime number");
			}
		}
		return 0;		
	}
}
