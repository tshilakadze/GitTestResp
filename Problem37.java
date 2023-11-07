import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
	private RandomGenerator casino = RandomGenerator.getInstance();
	public void run(){
		int myNum = readInt("I choose number ");
		while(myNum < 0 || myNum > 36){
			println("This number is not allowed.");
			myNum = readInt("I choose number ");
		}
	}

}
