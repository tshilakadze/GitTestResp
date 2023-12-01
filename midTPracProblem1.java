import acm.program.*;

public class midTPracProblem1 extends ConsoleProgram {
	
	private String text;
	private String result;
	
	public void run() {
		text = readLine("enter the text = ");
		text = text.toLowerCase();
		leaveOnlyLetters();
		findMostFrequent();
	}
	
	
	private String leaveOnlyLetters(){
		result = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(Character.isLetter(ch)){
				result += ch;
			}
		}
		return result;
	}
	
	
	private char findMostFrequent() {
		char mostFrequent = 'a';
		int maxNum = 0;
		int currNum = 0;
		for(int i = 0; i < result.length(); i++){
			char ch = result.charAt(i);
			currNum = countSymbols(ch);
			maxNum = currNum;
			mostFrequent = ch;
		}
		
		return mostFrequent;
	}


	private int countSymbols(char ch) {
		int num = 0;
		for(int i = 0; i < result.length(); i++){
			if(result.charAt(i) == ch){
				num += 1;
			}
		}
		return num;
	}
}
