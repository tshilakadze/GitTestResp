import acm.program.ConsoleProgram;

public class Problem46 extends ConsoleProgram {
	private String text; 
	public void run() {
		text = readLine("Text: ");
		countSymbols();
		
	}
	private void countSymbols() {
		int numOfSym = 0;
		for(int i = 0; i < text.length(); i++){
			for(int l = 0; l < text.length(); l++){
				if(text.charAt(l) == text.charAt(l)){
					
				}
			}
		}
	}

}
