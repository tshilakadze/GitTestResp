import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {
	public void run() {
		
	}
	
	private boolean isMagicalMatrix(int [][] matrix){
		if(matrix.length != matrix[0].length){
			return false;
		}
		int a = matrix.length;
		int[] allNums = new int[a*a];
		for(int i = 0; i < allNums.length; i++){
			allNums[i] = i + 1;
		}
		
		return false;
	}

}
