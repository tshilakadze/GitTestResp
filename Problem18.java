import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		int c = a - b;
		if(c > 0){
			println("The biggest number is " + a + ".");
		}
		else{
			println("The biggest number is " + b + ".");
		}
		if(c == 0){
			println("These numbers are equal");
		}
	}

}