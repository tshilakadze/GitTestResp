import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the number ");
		primeOrNot(n);
		
		
		
		
		
		
		
		
	}

	private int primeOrNot(int n) {
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				println("This is not a prime number");
				break;	
			}
			
			}
			
		return 0;		
	}
}
