import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter a number: ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = readInt("? ");
		}
	}

}
