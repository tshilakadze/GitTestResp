import acm.program.*;

public class midTPracProblem2 extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			char nextCh = text.charAt(i + 1);
			if(Character.isUpperCase(ch)){
				String part1 = text.substring(0, i);
				String part2 = text.substring(i+1);
				text = part1 + part2;
			}
			if(Character.isUpperCase(ch) && Character.isUpperCase(nextCh)){
				String part1 = text.substring(0, i);
				String part2 = text.substring(i + 2);
			}
		}
		println(text);
	}

	



	

}