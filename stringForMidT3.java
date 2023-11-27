import acm.program.*;
public class stringForMidT3 extends ConsoleProgram {
	public void run() {
		String jewels = readLine("jewels: ");
		String myStones = readLine("my stones: ");
		int jewelNum = 0;
		for(int i = 0; i < myStones.length(); i++){
			for(int l = 0; l < jewels.length(); l++){
				if(myStones.charAt(i) == jewels.charAt(l)){
					jewelNum += 1;
				}
			}
		}
	}

}
