import acm.program.ConsoleProgram;

public class Problem59 extends ConsoleProgram {
	public void run() {
		int[][] matrix1 = new int[][] {
			{0,1,1,0,0,1,0,0}, 
			{0,1,1,1,1,1,0,0},
			{0,0,1,1,1,1,0,0}, 
			{0,0,1,1,1,1,0,0},
		};
		
		int answ1 = largestRect(matrix1);
		println("First largest: " + answ1);
	}

	private int largestRect(int[][] matrix) {
		int maxSize = 0;
		for(int r1 = 0; r1 < matrix.length; r1++){
			for(int c1 = 0; c1 < matrix[0].length; c1++){
				for(int r2 = 0; r2 < matrix.length; r2++){
					for(int c2 = 0; c2 < matrix[0].length; c2++){
						if(justOnes(matrix, r1, c1, r2, c2)){
							int size = (r2 - r1 + 1)*(c2 - c1 + 1);
							maxSize = Math.max(maxSize, size);
						}
					}
				}
			}
		}
		return maxSize;
	}

	private boolean justOnes(int[][] matrix, int r1, int c1, int r2, int c2) {
		int count = 0;
		for(int i = r1; i < r2; i++){
			for(j = c1; j < c2; j++){
				
			}
		}
		return false;
	}

}
