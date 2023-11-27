import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
	private RandomGenerator casino = RandomGenerator.getInstance();
	public void run(){
		int myNum = readInt("Choose number: ");
		while(myNum < 0 || myNum > 36){
			println("This number is not allowed.");
			myNum = readInt("Choose number: ");
		}
		int num = casino.nextInt(0, 36);
		println("The number is " + num);
		if(num == myNum){
			println("You win!");
		}
		else{
			println("You lose! Try again!");
		}
	}

}
