import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		if(a > b){
			println("The biggest number is " + a + ".");
		}
		else{
			if(a == b){
				println("These numbers are equal");
			}
			else{
			println("The biggest number is " + b + ".");
		}}
		
	}

}