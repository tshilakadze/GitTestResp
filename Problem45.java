import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {
	public void run() {
		String word = readLine("the word: ");
		String symbol = readLine("the symbol: ");
		
		char sym = symbol.charAt(0);
		int num = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == sym){
				num++;
			}
		}
		
		println(num);
	}
}
