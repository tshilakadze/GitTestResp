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
		println(word);
		finalSentence();
		
	}
	
	private String seperateWords() {
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			word = tokenizer.nextToken();
			String firstLetter = word.substring(0, 1);
			String restOfWord = word.substring(1);
			firstLetter.toUpperCase();
			word = firstLetter + restOfWord;
		}
		
		return word;
	}
	
	private void finalSentence() {
		
	}

}
