/*
 * Program "Problem15" calculates arithmetic average of two integers
 */

import acm.program.ConsoleProgram;
public class Problem15 extends ConsoleProgram{
	public void run() {
		double a = readInt("Enter a: ");
		double b = readInt("Enter b: ");
		double average = (a + b) / 2;
		println("The arithmetic average is " + average + ".");
	}
}
