import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		int n = readPositiveInts("Enter a number ");
		
		
	}

	private int readPositiveInts(String string) {
		int NOE = 0;		// Number Of Even numbers
		int a = 0;
		int n = readInt(string);
		if(n >= 0){
			while(n >= 0){
				int m = readInt(string);
				a = a+1;
				println(a);
				if(m < 0){
					for(int i = 0; i <= a; i++){
						if(m % 2 == 0){
							NOE +=1;
						}
						println(NOE);
					}
					return 0;
				}
			}
			}
		return 0;
	}

	

}
