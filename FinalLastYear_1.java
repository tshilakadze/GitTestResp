import acm.program.ConsoleProgram;

public class FinalLastYear_1 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter String: ");
		String result = compressedString(text);
	}

	private String compressedString(String text) {
		String line = "";
		if(text.length() == 0){
			return line;
		}
		int num = 0;
		for(int i = 1; i < text.length(); i++){
			if(text.charAt(i - 1) != text.charAt(i)){
				String part1 = text.substring(0,  i);
				text = text.substring(i);
			}
		}
		return line;
	}

}
