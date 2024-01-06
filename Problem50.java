import acm.program.ConsoleProgram;

import java.util.*;

public class Problem50 extends ConsoleProgram {
	public void run() {
		int numOfWords = 0;
		String text = readLine("Enter the text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			String word = tokenizer.nextToken();
			println(word);
			numOfWords += 1;
		}
		println("There are " + numOfWords + " words in this string.");
	}
}
