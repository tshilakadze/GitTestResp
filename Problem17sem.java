import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class Problem17sem extends ConsoleProgram{
	public void run() {
		double a = readDouble();
		calculateInBouble(a);
		calculateInBigDecimal(a);
		
	
	
	}
	
	private void calculateInBigDecimal(double a) {
		BigDecimal decimal = new BigDecimal(a);
		
		int intA = decimal.intValue();
		
		println(intA);
	}

	private void calculateInBouble (double a) {
		int intA = (int)a;
		double b = a - intA;
		println(intA);
		println(b);
	}
}