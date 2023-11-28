import acm.program.*;

public class stringForMidT4 extends ConsoleProgram {
	public void run() {
		String text = readLine("Input: ");
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == 'i'){
				String part1 = text.substring(0, i);
				String part2 = text.substring(i + 1);
				for(int l = 0; l < part1.length(); l++){
					part1 = part1.replace(part1.charAt(l), part1.charAt(part1.length() - l - 1));
					result = part1 + 
				}
			}
		}
		println(result);
		
	}
}
