import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
public class Problem38 extends ConsoleProgram {
	private static final int MYMONEY = 1000;
	private RandomGenerator casino = RandomGenerator.getInstance();
	public void run(){
		
		int myBet = readInt("Choose your bet: ");
		int left = MYMONEY - myBet;
		
		int myNum = readInt("Choose number: ");
		
		while(myNum < 0 || myNum > 36){
			println("This number is not allowed.");
			myNum = readInt("Choose number: ");
		}
		
		spinRoulette(myNum, myBet, left);
		
	}
	private void spinRoulette(int myNum, int myBet, int left) {
		int num = casino.nextInt(0, 36);
		println("The number is " + num);
		if(num == myNum){
			println("You won " + 2*myBet);
		}
		else{
			println("You lose! Try again! You have " + left + " left.");
		}
	}
}