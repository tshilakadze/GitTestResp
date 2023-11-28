import acm.program.*;

public class stringForMidT4 extends ConsoleProgram {
	public void run() {
		String text = readLine("Input: ");
		String result = "";
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == 'i'){
				String part1 = text.substring(0, i);
				String part2 = text.substring(i);
				for(int l = part1.length() - 1; l <= 0 ; l = l - 1){
					result = result + part1.charAt(l);
				}
			}
		}
		println(result);
		
	}
}
