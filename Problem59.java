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
		int size = 0;
		int length = 0;
		int width = 0;
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				
			}
		}
		return size;
	}

}
