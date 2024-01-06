import acm.program.ConsoleProgram;

import java.util.*;

public class Problem50 extends ConsoleProgram {
	public void run() {
		int numOfWords = 0;
		String text = readLine("Enter the text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			tokenizer.nextToken();
			numOfWords += 1;
		}
		while(tokenizer.hasMoreElements()){
			println(tokenizer.nextToken());
		}
		println("There are " + numOfWords + " words in this string.");
	}
}
