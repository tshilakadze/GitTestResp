import acm.program.*;

public class midTPracProblem13 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a positive integer: ");
		while(n <= 0){
			n = readInt("Enter a positive integer PLEASE: ");
		}
		println(sumOfSquares(n));
	}
	
	private boolean sumOfSquares(int n){
		int root = (int)Math.sqrt(n);
		for(int i = 1; i < root + 1; i++){
			for(int l = 1; l < root + 1; l++){
				if(i*i + l*l == n){
					return true;
				}
			}
		}
		
		return false;
	}

}
