import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("n = ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = readInt("? ");
		}
		int max1 = Integer.MIN_VALUE;
		int currMaxIndex1 = 0;
		for(int i = 0; i < arr.length; i++){
			int next = arr[i];
			if(next > max1){
				max1 = next;
				currMaxIndex1 = i;
			}
		}
		
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			int next = arr[i];
			if(next > max2 && i != currMaxIndex1){
				max2 = next;
			}
		}
		println(max1);
		println(max2);
	}

}
