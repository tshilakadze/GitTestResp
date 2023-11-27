import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
	public void run() {
		String text1 = readLine("text 1: ");
		String text2 = readLine("Text 2: ");
		if(text1.equalsIgnoreCase(text2)){
			println(true);
		}
	}
}