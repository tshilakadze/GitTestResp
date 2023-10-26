import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
	private static final int SENTINEL = 1;

	public void run() {
		int n = readInt("Enter a number: ");
		while(n != SENTINEL){
			if(n % 2 != 0){
				int b = 3*n + 1;
				println(n + " is odd, so I make 3n + 1: " + b);
			}
		}
	}
}