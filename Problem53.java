import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class Problem53 extends ConsoleProgram {
	
	private static final String FILENAME = "Statistics.txt";
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
			String text = "";
			while(true){
				String line = reader.readLine();
				if(line == null){
					break;
				}
				text += line + " ";
			}
			countStatistics(text);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void countStatistics(String text) {
		
	}
	
}
