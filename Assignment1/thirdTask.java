package Assignment1;
import stanford.karel.SuperKarel;
public class thirdTask extends SuperKarel {
	public void run(){
		/*
		 * Karel creates a world that looks like a chess board
		 */
		if(frontIsClear()){
		fillHalfOfTheLine();
		fillTheRest();
		}
		else{
			turnLeft();
			fillHalfOfTheLine();
		}
	}

	/*
	 * Karel learns how to put one beeper on every two squares
	 */
	
	private void fillHalfOfTheLine() {
		while(frontIsClear()){
			putBeeper();
			move();
			if(frontIsClear()){
				move();
			}
		}
		checkBackForBeeper();
		goBack();
	}

	/*
	 * Karel learns how to check if it needs to put beeper at the end of the line
	 */
	
	private void checkBackForBeeper() {
		turnAround();
		move();
		turnAround();
		if(noBeepersPresent()){
			move();
			putBeeper();
		}
		else{
			move();
		}
	}

	/*
	 * Karel learns how to go back to the beginning of the line
	 */
	
	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}

	/*
	 * Karel learns how to repeat the first command(fillHalfOfTheLine()) until it meets the upper wall
	 */
	
	private void fillTheRest() {
		while(leftIsClear()){
			if(beepersPresent()){
				turnLeft();
				move();
				turnRight();
				move();
				fillHalfOfTheLine();
			}
			else{
				turnLeft();
				move();
				turnRight();
				fillHalfOfTheLine();
			}
		}
	}
}