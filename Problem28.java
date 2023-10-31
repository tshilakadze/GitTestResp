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
			int c = 0;
			b = readInt(string);
			if(b % 2 == 0){
				
				c += 1;
				
			}
			println(c);	
		}
		return 0;
	}

}