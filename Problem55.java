import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter a number: ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = readInt("? ");
		}
		if(isSorted(arr)){
			println("sorted");
		}
		else{
			println("not sorted");
		}
	}

	private boolean isSorted(int[] arr) {
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < arr[i - 1]){
				return false;
			}
		}
		return true;
	}

}
