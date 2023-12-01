import acm.program.ConsoleProgram;

import java.util.*;

public class midTPracProb3 extends ConsoleProgram {
	
	private String text;
	private String word;
	private String result;
	
	public void run() {
		text = readLine("Enter text: ");
		text = text.toLowerCase();
		seperateWords();
		println(result);
		finalSentence();
		
	}
	
	private String seperateWords() {
		result = "";
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			word = tokenizer.nextToken();
			String firstLetter = word.substring(0, 1);
			String restOfWord = word.substring(1);
			firstLetter = firstLetter.toUpperCase();
			word = firstLetter + restOfWord + " ";
			result += word;
			
		}
		
		return result;
	}
	
	private void finalSentence() {
		
	}

}
