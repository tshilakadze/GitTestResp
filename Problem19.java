import acm.program.ConsoleProgram;

public class Problem19 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		for(int i = 1; i < n; i++){
			int b = i - 1;
			println("hello " + b);
		}
	}

}
