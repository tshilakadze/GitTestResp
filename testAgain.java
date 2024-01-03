import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram{
	public void run(){
		int[][] arr = new int[4][4];
		for(int i = 0; i < arr.length; i++){
			for(int l = 0; l < arr[0].length; l++){
				print(arr[i][l] + "");
			}
			println();
		}
	}
}