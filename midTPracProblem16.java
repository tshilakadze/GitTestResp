import acm.program.*;
public class midTPracProblem16 extends ConsoleProgram{
	public void run() {
		double n = readInt("n = ");
		double a = readInt("a ");
		double q = readInt("q = ");
		println(findNthMember(n, a, q));
	}

	
	
	private double findNthMember(double n, double a, double q){
		n = n - 1;
		double b = Math.pow(q, n);
		double nthMember = a * b;
		return nthMember;
	}
}
