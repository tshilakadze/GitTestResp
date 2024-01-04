import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem60 extends ConsoleProgram{
	
	private static final int SENTINEL = -1;
	
	public void run() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(true){
			int n;
			numbers.add(n = readInt("? "));
			if(n == SENTINEL){
				for(int i = 0; i < numbers.size(); i++){
					println(numbers.get(numbers.size() - i - 1));
				}
				break;
			}
		}
	}

}