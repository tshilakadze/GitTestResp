import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine("The text: ");
		for(int i = 0; i < text.length(); i++){
			countSymbols(text, text.charAt(i));
		}
		
	}

	private void countSymbols(String text, char charAt) {
		int symNum = 0;
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == charAt){
				symNum = symNum + 1;
			}
		}
		println(symNum);
	}

	
	
}
