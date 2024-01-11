import acm.program.ConsoleProgram;

import java.util.*;

public class Problem50 extends ConsoleProgram {
	public void run() {
		int numOfWords = 0;
		int num = 0;
		int[] nums = new int[20];
		String text = readLine("Enter the text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		while(tokenizer.hasMoreTokens()){
			String word = tokenizer.nextToken();
			println(word);
			num = Integer.parseInt(word);
			numOfWords += 1;
		}
		for(int i = 0; i < numOfWords; i++){
			nums[i] = num;
		}
		println(Arrays.toString(nums));
		println("There are " + numOfWords + " words in this string.");
	}
}
