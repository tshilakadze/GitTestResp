import java.util.ArrayList;

import acm.program.*;

public class Problem62 extends ConsoleProgram {
	public void run() {
		ArrayList<String> names = new ArrayList<String>();
		String name;
		while(true){
			names.add(name = readLine("? "));
			if(name == ""){
				break;
			}
		}
	}

}
