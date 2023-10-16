import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram{
	public void run() {
		double a = readDouble("Enter a: ");
		if(a >= 0){
		for(double b = 0; b < a || b==a; b++){
			if(b+1>a){
				println("Integer number is " + b +".");	
				double c = a - b;
				println("Fraction is " + c + ".");
				}
			}
		}
		else{
			for(double b = 0; b > a || b==a; b--){
				if(b-1<a){
					println("Integer number is " + b +".");	
					double c = a - b;
					println("Fraction is " + c + ".");
					}
				}
			}
		}
	}