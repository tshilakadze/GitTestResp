import acm.program.ConsoleProgram;

public class Problem23 extends ConsoleProgram {
	public void run() {
	int n = readInt("Enter a number: ");
	int sum = 0;
	for(int i = 0; i <= n; i++){
	sum += i;
	}
	println("The sum is " + sum);
	}
}