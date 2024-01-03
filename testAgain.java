import java.util.Arrays;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram{
	public void run(){
		String a = readLine("? ");
		String b = readLine("? ");
		char[] c = new char[a.length()];
		for(int i = 0; i < a.length(); i++){
			c[i] = a.charAt(i);
		}
		println(Arrays.toString(c));
	}
}