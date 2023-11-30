import acm.program.*;

public class midTPracProblem2 extends ConsoleProgram {

	public void run() {
		String text = readLine("enter text: ");
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			String a = "" + ch;
	//		char nextCh = text.charAt(i + 1);
			if(Character.isUpperCase(ch)){
				text.replaceFirst(a, "");
			}
		}
	}

	



	

}