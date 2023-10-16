import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram{
	public void run() {
		double a = readDouble("Enter a: ");
		for(double b = 0; b < a; b++){
			println(b);
			double c = a -b;
			println(c);
		}
		
	}
}