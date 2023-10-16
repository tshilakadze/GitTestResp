import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram{
	public void run() {
		double a = readDouble("Enter a: ");
		if(a < 1){
			println("Integer number is 0");
			println("Fraction of a is " + a + ".");
		}
	}
}