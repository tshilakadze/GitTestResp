import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int a = readInt("Enter a number ");
		if(a == SENTINEL){
			println("0");
		}
		else{
			int b = readPositiveInts("Enter a number ");
		}
	}
	private int readPositiveInts(String string) {
		int b = readInt(string);
		while(b != SENTINEL){
			b = readInt(string);
		}
		while(b < 0){
			println("No negative numbers please");
			b = readInt(string);
		}
		return 0;
	}

}