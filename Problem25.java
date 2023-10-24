import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter the first number: ");
		int n = readInt("Enter the second number: ");
		int a = 0;
		for(int i = 1; i <= m || i <= n; i++){
			if(m % i == 0 && n % i == 0){
				a = (m * n) / i;
			}
		}
		println(a);
	}
}