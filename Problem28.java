import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		int n = readPositiveInt("Enter the number ");
		
	}

	private int readPositiveInt(String string) {
		int n = readInt(string);
		while(n >= 0){
			readInt();
		}
		return 0;
	}

}
