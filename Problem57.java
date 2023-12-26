import java.util.Arrays;

import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {
	public void run() {
		String text1 = readLine("First string: ");
		String text2 = readLine("Second string: ");
		println(anagramsOrNot(text1, text2));
	}
	
	private boolean anagramsOrNot(String text1, String text2){
		if(text1.length() != text2.length()){
			return false;
		}
		String chToString1 = "";
		String chToString2 = "";
		String[] arr1 = new String[text1.length()];
		String[] arr2 = new String[text2.length()];
		for(int i = 0; i < text1.length(); i++){
			char ch = text1.charAt(i);
			chToString1 = ch + "";
			arr1[i] = chToString1;
		}
		for(int i = 0; i < text2.length(); i++){
			char ch = text1.charAt(i);
			chToString2 = ch + "";
			arr2[i] = chToString2;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(!arr1.equals(arr2)){
			return false;
		}
		
		return true;
	}

}
