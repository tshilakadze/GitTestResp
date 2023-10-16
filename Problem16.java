/*
 * This program calculates average harmonic of three integers
 */

import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram {
	public void run() {
		double a = readInt("Enter a: ");
		double b = readInt("Enter b: ");
		double c = readInt("Enter c: ");
		double d = 1 / (1/a + 1/b + 1/c);
		println("Average harmonic is " + d + ".");
	}
}
