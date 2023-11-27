import acm.program.*;
public class Problem51 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter a text: ");
		printNewText(text);
	}

	private void printNewText(String text) {
		String used = "";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(!used.contains("" + ch)){
				used += ch;
			}
		}
		println(used);
		
	}

}
