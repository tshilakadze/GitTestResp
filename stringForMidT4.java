import acm.program.*;

public class stringForMidT4 extends ConsoleProgram {
	public void run() {
		String text = readLine("Input: ");
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == 'i'){
				String part1 = text.substring(0, i);
				reverseString(part1, text);
			}
		}
	}

	private void reverseString(String part1, String text) {
		String result = "";
		for(int i = 0; i < part1.length(); i++){
			result = part1.replace(part1.charAt(i), part1.charAt(part1.length() - i));
		}
		println(result);
	}

}
