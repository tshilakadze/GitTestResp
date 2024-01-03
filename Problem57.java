import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {
	public void run() {
		String text1 = readLine("First string: ");
		String text2 = readLine("Second string: ");
		println(anagramsOrNot(text1, text2));
	}
	
	private boolean anagramsOrNot(String text1, String text2){
		char[] first = new char[text1.length()];
		char[] second = new char[text2.length()];
		for(int i = 0; i < text1.length(); i++){
			first[i] = text1.charAt(i);
		}
		for(int i = 0; i < text2.length(); i++){
			second[i] = text2.charAt(i);
		}
		Arrays.sort(first);
		Arrays.sort(second);
		for(int i = 0; i < text1.length(); i++){
			if(first[i] != second[i]){
				return false;
			}
			else{
				return true;
			}
		}
		return false;
	}

}
