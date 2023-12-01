import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
	public void run() {
		while (true) {
			String s = readLine("Enter text: ");
			println(beautify(s));
		}
	}

	private String beautify(String s) {
		StringTokenizer tokenizer = new StringTokenizer(s, " ,.", true);
		String beautifulS = "";
		while (tokenizer.hasMoreTokens()) {
			String currentWord = tokenizer.nextToken();
			beautifulS += reversed(currentWord);
		}
		return beautifulS;
	}

	private String reversed(String word) {
		String reversed = "";
		for(int i = word.length() -1; i >= 0; i--){
			reversed += word.charAt(i);
		}
		return reversed;
	}
}