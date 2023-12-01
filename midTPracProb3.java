import acm.program.ConsoleProgram;

import java.util.*;

public class midTPracProb3 extends ConsoleProgram {
	
	private String text;
	
	public void run() {
		text = readLine("Enter text: ");
		text = text.toLowerCase();
		StringTokenizer tokenizer = new StringTokenizer(text);
		println(tokenizer.nextToken());
	}

}
