import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a number: ");
		int div = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				div += 1;
			}
		}
		println("Number of divisors is " + div);
		
	}
}
