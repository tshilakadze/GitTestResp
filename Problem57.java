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
		
		return true;
	}

}
