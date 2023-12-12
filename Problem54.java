import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("n = ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = readInt("? ");
		}
	}

}
