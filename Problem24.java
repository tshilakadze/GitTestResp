import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a number: ");
		int a = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				a += 1;
			}
		}
		println("Number of divisors is " + a);
		
	}
}
