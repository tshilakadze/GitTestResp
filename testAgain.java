import java.util.Arrays;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram{
	public void run(){
		int[][] arr = new int[4][5];
		for(int i = 0; i < arr.length; i++){
			for(int l = 0; l < arr[0].length; l++){
				arr[i][l] = 1;
				print(arr[i][l]);
			}
			println();
		}
		int[] arr2 = new int[20];
		for(int i = 0; i < arr2.length; i++){
			for(int r = 0; r < arr.length; r++){
				for(int c = 0; c < arr[0].length; c++){
					arr2[i] = arr[r][c];
				}
			}
		}
		println(Arrays.toString(arr2));
	}
}