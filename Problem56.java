import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {
	private int n;
	
	public void run() {
		n = readInt("? ");
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = readInt("Enter a number: ");
		}
		sortArray(arr);
		println(Arrays.toString(arr));
		
	}

	private void sortArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			int min = MinIndex(arr, i);
			swapIndex(arr, i, min);
		}
	}


	private int MinIndex(int[] arr, int i) {
		int currIndex = i;
		for(int l = i; l < arr.length; l++){
			if(arr[l] < arr[currIndex]){
				currIndex = l;
			}
		}
		return currIndex;
	}
	
	
	private void swapIndex(int[] arr, int i, int min2) {
		int curr = arr[i];
		arr[i] = arr[min2];
		arr[min2] = curr;
	}

}
