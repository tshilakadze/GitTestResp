import acm.program.ConsoleProgram;

public class Problem17sem extends ConsoleProgram{
	public void run() {
		double a = readDouble();
		int intA = (int)a;
		double b = a - intA;
		println(intA);
		println(b);
	}
}
