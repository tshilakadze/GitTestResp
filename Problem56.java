import acm.program.ConsoleProgram;

public class Problem56 extends ConsoleProgram {
	private int n;
	private int min;
	
	public void run() {
		n = readInt("? ");
		int[] arr = new int[n];
		min = 0;
		for(int i = 0; i < n; i++){
			arr[i] = readInt("Enter a number: ");
		}
		sortArray(arr);
		
	}

	private void sortArray(int[] arr) {
		for(int l = 0; l < n; l++){
			min = arr[l];
			if(arr[l + 1] < min){
				min = arr[l + 1];
			}
		}
		println(min);
		
	}

}
