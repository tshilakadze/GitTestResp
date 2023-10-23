import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter the first number: ");
		int n = readInt("Enter the second number: ");
		int a  = Math.min(m, n);
		println(a);
	}
}