import acm.program.ConsoleProgram;

public class Problem46 extends ConsoleProgram {
	private String text; 
	private char mostFrequent;
	public void run() {
		text = readLine("Text: ");
		frequentSymbol();
		
	}
	private void frequentSymbol() {
		int maxSymbolNum = 0;
		for(int i = 0; i < text.length(); i++){
			int currNum = countSymbols(text, text.charAt(i));
			if(currNum > maxSymbolNum){
				maxSymbolNum = currNum;
				mostFrequent = text.charAt(i);
			}
		}
	}
	private int countSymbols(String text2, char symbol) {
		int numSym = 0;
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == symbol){
				numSym = numSym + 1;
			}
		}
		return numSym;
	}

}
