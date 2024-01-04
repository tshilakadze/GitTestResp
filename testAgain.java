import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run() {
		version1();
	}
	
	private void version1() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		while(true) {
			int n = readInt("Enter num: ");
			if(n == SENTINEL) {
				break;
			}
			myList.add(n);
		}
		for(int i = myList.size() - 1; i >= 0; i--) {
			println(myList.get(i));
		}
	}
}