import java.util.ArrayList;

import acm.program.*;

public class Problem62 extends ConsoleProgram {
	public void run() {
		ArrayList<String> names = new ArrayList<String>();
		String name;
		int count = 0;
		while(true){
			names.add(name = readLine("? "));
			if(name.equals("")){
				names.remove(names.size() - 1);
				printStatistics(names);
				break;
			}
		}
	}

	private void printStatistics(ArrayList<String> names) {
		
	}

}
