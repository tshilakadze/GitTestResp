import acm.program.*;

import java.util.*;

public class midTPracProblem4 extends ConsoleProgram {
	
	private String text;
	private String word;
	private String finalSentence;
	private String newWord;
	
	public void run() {
		text = readLine("enter the text: ");
		seperateSentence();
		println(finalSentence);
	}

	
	
	private String seperateSentence() {
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			word = tokenizer.nextToken();
			reverseWords();
			finalSentence += newWord;
			
		}
		return finalSentence;
	}
	
	
	private String reverseWords() {
		finalSentence = "";
		newWord = "";
		for(int i = 0; i < word.length(); i++){
			char ch = word.charAt(word.length() - i - 1);
			String letter = "" + ch;
			newWord += letter;
			newWord = newWord + " ";
		}
		return newWord;
	}
}
