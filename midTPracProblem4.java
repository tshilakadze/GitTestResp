import acm.program.*;

import java.util.*;

public class midTPracProblem4 extends ConsoleProgram {
	
	private String text;
	private String word;
	private String finalSentence;
	
	public void run() {
		text = readLine("enter the text: ");
		seperateSentence();
		reverseWords();
		println(finalSentence);
	}

	
	
	private String seperateSentence() {
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			word = tokenizer.nextToken();
		}
		return word;
	}
	
	
	private String reverseWords() {
		finalSentence = "";
		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(word.length() - i - 1);
			String letter = "" + ch;
			word += letter;
			finalSentence = word + " ";
		}
		return finalSentence;
	}
}
