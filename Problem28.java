import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int numEvens = 0;
		while(true){
			int n = readInt("Enter a number ");
			if(n == SENTINEL){
				break;
			}
			while(n < 0){
				println("enter a positive number ");
				n = readInt("Enter a number ");
			}
				numEvens = Math.max(n, n+1);
			
		}
		println(numEvens);
	}

}