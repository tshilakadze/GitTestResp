import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {
	public void run() {
		int[][] matrix1 = {
				{1, 2, 3},
				{9, 7, 8},
				{4, 6, 6}};
		println(isMagicalMatrix(matrix1));
	}
	
	private boolean isMagicalMatrix(int [][] matrix){
		if(matrix.length != matrix[0].length){
			return false;
		}
		
		int matSize = matrix.length;
		int[] allNums = new int[matSize*matSize];
		for(int i = 0; i < allNums.length; i++){
			allNums[i] = i + 1;
		}
		println(Arrays.toString(allNums));
		
		int count = 0;
		int[] matrixToArray = new int[matSize*matSize];
		for(int r = 0; r < matSize; r++){
			for(int c = 0; c < matSize; c++){
				matrixToArray[count] = matrix[r][c];
				count++;
			}
		}
		Arrays.sort(matrixToArray);
		println(Arrays.toString(matrixToArray));
		for(int i = 0; i < matrixToArray.length; i++){
			if(matrixToArray[i] == allNums[i]){
				continue;
			}
			else{
				return false;
				
			}
		}
		return true;
	}

}
