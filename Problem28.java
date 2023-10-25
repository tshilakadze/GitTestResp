import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		int n = readPositiveInt("Enter the number ");
		
	}

	private int readPositiveInt(String string) {
		int n = readInt(string);
		if(n >= 0){
			readInt();
		}
		else{
			println("stop");
		}
		return 0;
	}

}
