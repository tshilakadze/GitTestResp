import acm.program.ConsoleProgram;
public class Problem47 extends ConsoleProgram {
	public void run() {
		String text = readLine("The text: ");
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) == text.charAt(text.length() - i)){
				println("it is a palindrome");
			}
			else{
				println("not a palindrome");
			}
		}
		
	}
}