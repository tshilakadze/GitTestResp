import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter the first number: ");
		int n = readInt("Enter the second number: ");
		int LCM = 1;
		for(int i = 1; i <= m || i <= n; i++){
			if(m % i == 0 || n % i == 0){
				LCM *= i;
			}
	}
		println("Lowest common multiple is "+ LCM);
	}
}