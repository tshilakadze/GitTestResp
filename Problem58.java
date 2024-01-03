import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {
	public void run() {
		int m = readInt("? ");
		int n = readInt("? ");
		int[][] myMatrix = new int[m][n];
		println(Arrays.toString(myMatrix));
		println(isMagicalMatrix(myMatrix));
	}
	
	private boolean isMagicalMatrix(int [][] matrix){
		
		return false;
	}

}
