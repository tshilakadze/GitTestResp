import acm.program.ConsoleProgram;

public class FinalLastYear_1 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter String: ");
		String result = compressedString(text);
		println(result);
	}

	private String compressedString(String text) {
		String line = "";
		String part1 = "";
		if(text.length() == 0){
			return line;
		}
		int num = 0;
		for(int i = 1; i < text.length(); i++){
			if(text.charAt(i - 1) != text.charAt(i)){
				part1 = text.substring(0,  i);
				text = text.substring(i);
				num = part1.length();
			}
			String numStr = num + "";
			line = part1.charAt(0) + numStr;
		}
		return line;
	}
}
