import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem36 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 1000000;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		double sumFlips = 0;
		for(int i = 0; i < NUM_EXPERIMENTS; i++){
			int currFlips = holdExperiment();
			sumFlips += currFlips;
		}
		double avgFlips = sumFlips / NUM_EXPERIMENTS;
		println(avgFlips);
	}
	private int holdExperiment() {
		int numFlips = 0;
		int numConsecutiveHeads = 0;
		while(true){
			numFlips++;
			boolean isHeads = rgen.nextBoolean();
			if(isHeads){
				numConsecutiveHeads += 1;
				if(numConsecutiveHeads == 3){
					break;
				}
				else{
					numConsecutiveHeads = 0;
				}
			}
		}
		
		return numFlips;
	}
	
}
