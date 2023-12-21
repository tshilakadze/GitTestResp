import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.*;

public class Problem53 extends ConsoleProgram {
	
	private static final String FILENAME = "Statistics.txt";
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Untitled 1"));
			String text = "";
			while(true){
				String line = reader.readLine();
				if(line == null){
					break;
				}
				text += line + " ";
			}
			println(text);
			println("");
			countStatistics(text);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void countStatistics(String text) {
		int words = 0;
		int sentences = 0;
		int sym1 = 0;		// !
		int sym2 = 0;		// ?
		int sym3 = 0;		// .
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(ch == ' '){
				words += 1;
			}
			if(ch == '.' || ch == '?' || ch == '!'){
				sentences += 1;
			}
			if(ch == '!'){
				sym1 += 1;
			}
			if(ch == '?'){
				sym2 += 1;
			}
			if(ch == '.'){
				sym2 += 1;
			}
			
		}
		println("There are " + words + " words");
		println("There are " + sentences + " sentences");
	}
	
}
