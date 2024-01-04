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
				countNames(names);
				break;
			}
		}
	}

	private void countNames(ArrayList<String> names) {
		
	}

}
