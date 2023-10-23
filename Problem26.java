import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter the first number: ");
		int n = readInt("Enter the second number: ");
		int a = Math.min(m, n);
		int b = Math.max(m, n);
		for(int i = a + 1; i <= b; i++){
			if(b % i == 0 && i % a != 0){
				a *= i;
				println(a);
			}
		}
		
	}
}