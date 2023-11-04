import acm.program.ConsoleProgram;

public class Problem33 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter a number: ");
		if( n != 1){
			makeItOne(n);
			
			}
		else{
			println("The number is already 1");
		}
		
		
	}

	private void makeItOne(int n) {
		for(int i = n; i == 1; i++){
			if(i % 2 == 0){
				println(i/2);
			}
			else{
				println(3*n + 1);
			}
		}
		
	}

}
