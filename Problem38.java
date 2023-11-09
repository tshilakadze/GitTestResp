import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
public class Problem38 extends ConsoleProgram {
	private static final int MYMONEY = 1000;
	private RandomGenerator casino = RandomGenerator.getInstance();
	public void run(){
		
		int myBet = readBet("Choose your bet: ");
		int left = MYMONEY - myBet;
		
		while(myBet <= 0 || myBet > MYMONEY){
			println("no");
		}
		
		int myNum = readInt("Choose number: ");
		
		while(myNum < 0 || myNum > 36){
			println("This number is not allowed.");
			myNum = readInt("Choose number: ");
		}
		
		int num = casino.nextInt(0, 36);
		println("The number is " + num);
		if(num == myNum){
			println("You won " + 2*myBet);
		}
		else{
			println("You lose! Try again! You have " + left + " left.");
		}
	}
	private int readBet(String string) {
		
		return 0;
	}

}
