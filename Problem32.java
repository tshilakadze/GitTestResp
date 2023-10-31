import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {
	private static final int MAX_NUM = 10000;
	public void run() {
		for(int i = 1; i < MAX_NUM; i++){
			if(isPrime(i)){
				println(i);
				
			}
		}
		
	}
	private boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}
