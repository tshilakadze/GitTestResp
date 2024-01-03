import java.util.Arrays;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram{
	public void run(){
		String a = readLine("? ");
		String b = readLine("? ");
		char[] c = new char[a.length()];
		char[] d = new char[b.length()];
		for(int i = 0; i < a.length(); i++){
			c[i] = a.charAt(i);
		}
		for(int i = 0; i < b.length(); i++){
			d[i] = b.charAt(i);
		}
		Arrays.sort(c);
		Arrays.sort(d);
		println(Arrays.toString(c));
	}
}