import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem61 extends ConsoleProgram {
	public void run() {
		int m = readInt("Enter m: ");
		int n = readInt("Enter n: ");
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			myList.add(readInt("? "));
		}
		for(int i = 0; i < myList.size(); i++){
			for(int l = i + 1; l < myList.size(); l++){
				if(myList.get(i) + myList.get(l) == m){
					println(myList.get(i) + " and " + myList.get(l));
				}
			}
		}
	}

}
