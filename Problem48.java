import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("The text: ");
		printStatistics(text);	
	}

	private void printStatistics(String text) {
		String used = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(!used.contains("" + ch)){
				int num = countSymbols(text, ch);
				String a = num + "";
				print(ch + a);
				used += ch;
				
			}
		}
	}

	private int countSymbols(String text, char ch) {
		int numOfSymbol = 0;
		for(int i = 0; i < text.length(); i++){
			if(ch == text.charAt(i)){
				numOfSymbol += 1;
			}
		}
		return numOfSymbol;
	}

	

	
	
}