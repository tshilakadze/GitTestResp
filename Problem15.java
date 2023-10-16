/*
 * Program "Problem15" calculates arithmetic average of two integers
 */

import acm.program.ConsoleProgram;
import acm.program.*;
public class Problem15 extends ConsoleProgram{
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		int average = (a + b) / 2;
		println("The arithmetic average is "+ average + ".");
	}
}
