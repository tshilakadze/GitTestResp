import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run() {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		while(true){
			int n = readInt("? ");
			if(n == SENTINEL){
				break;
			}
		}
		println(myList);
	}

}
