import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
	private static final int ZERO = 0;

	public void run(){
		int n = readInt("? ");
		printNewNumbers(n);
	}

	private int printNewNumbers(int n) {
		if(n != ZERO){
			while(true){
				int m = readInt("? ");
				if(m == ZERO){
				int max = (Math.max(m, m));
					return max;
				}
				
			}
		}
		return 0;
	}
}