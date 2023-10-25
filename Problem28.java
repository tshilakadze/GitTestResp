import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		
		int n = readPositiveInts("Enter a number ");
		
	}

	private int readPositiveInts(String string) {
		int n = readInt(string);
		if(n >= 0){
			while(n >= 0){
				int m = readInt(string);
				
				if(m < 0){
					if(m >= 0 && m % 2 == 0){
						println(m);
					}
					return 0;
				}
			}
			
			}
		return 0;
	}
	
	

}
