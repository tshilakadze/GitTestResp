import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram{
	public void run() {
		double a = readDouble("Enter a: ");
		if(a < 1){
			println("Integer part of the number is 0");
			println("Fraction of the number is " + a + ".");}
			else{
				double b = a - 1;
				while(b < 1){
					println("Fraction of the number is " + b - 1 + ".");
					
				}
			}
		
	}
}