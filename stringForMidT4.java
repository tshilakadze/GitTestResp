import acm.program.*;

public class stringForMidT4 extends ConsoleProgram {
	public void run() {
		String text = readLine("Input: ");
		text = text.replace('i', ' ');
		println(text);
	}

}
