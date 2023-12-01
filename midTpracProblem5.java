import acm.program.*;

public class midTpracProblem5 extends ConsoleProgram {
		
	public void run() {
		
		String text1 = readLine("enter first text: ");
		String text2 = readLine("enter second text: ");
		if(canBeManipulated(text1, text2)){
			println("true");
		}
		else{
			println("false");
		}
	}
	
	
	private boolean canBeManipulated(String text1, String text2) {
		if(text1.length() != text2.length()){
			return false;
		}
		
		for(int i = 0; i < text1.length(); i++){
			char ch = text1.charAt(i);
			int numOfSym1 = countSymbols(text1, ch);
			int numOfSym2 = countSymbols(text2, ch);
			if(numOfSym1 != numOfSym2){
				return false;
			}
		}
		return true;
	}
	
	
	private int countSymbols(String text, char ch){
		int num = 0;
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == ch){
				num = num + 1;
			}
		}
		return num;
	}
}
