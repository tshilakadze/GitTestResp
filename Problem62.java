import java.util.ArrayList;

import acm.program.*;

public class Problem62 extends ConsoleProgram {
	public void run() {
		ArrayList<String> names = new ArrayList<String>();
		String name;
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
		ArrayList<String> myList = new ArrayList<String>();
		for(int i = 0; i < names.size(); i++){
			String currName = names.get(i);
			if(!myList.contains(currName)){
				int num = countNames(names, currName);
				println(currName + ": " + num);
				myList.add(currName);
			}
		}
	}

	private int countNames(ArrayList<String> names, String currName) {
		int numOfNames = 0;
		for(int i = 0; i < names.size(); i++){
			if(names.get(i).equals(currName)){
				numOfNames += 1;
			}
		}
		return numOfNames;
	}

}
