import acm.program.ConsoleProgram;

public class Problem27 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the first number: ");
		int m = readInt("Enter the second number: ");
		int a = a(n, m);
		println("n^m = " + a);
		
	}

	private int a(int n, int m) {
		int b = 1;
		for(int i = 1; i <= m; i++){
		b *= n;	
		}
		return b;
	}
	
}
