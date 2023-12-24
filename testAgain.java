import java.util.Arrays;

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
	/*	arr[0] = 1;
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = 2;		*/
		println(Arrays.toString(arr));
		Arrays.sort(arr);
		println(Arrays.toString(arr));
	}
}