import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		int n = readPositiveInts("Enter a number ");
		
		
	}

	private int readPositiveInts(String string) {
		int NOE = 0;		// Number Of Even numbers
		int n = readInt(string);
		if(n >= 0){
			while(n >= 0){
				int m = readInt(string);
				
				if(m < 0){
					
					return 0;
				}
			}
			}
		return 0;
	}

	

}
