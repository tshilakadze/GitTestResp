import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram {
	private String text;
	private char symbol;
	public void run() {
		text = readLine("The text: ");
		symbol = readLine("The symbol: ").charAt(0);
		countSymbol();
	}

	private void countSymbol() {
		int numOfSym = 0;
		for(int i = 0; i < text.length(); i++){
			
		}
	}
}
