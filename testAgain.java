import acm.program.*;
import acm.util.RandomGenerator;

public class testAgain extends ConsoleProgram{
	
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run() {
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++){
			int num = rgen.nextInt(1, 6);
			arr[i] = num;
		}
		println(arr);
	}
}