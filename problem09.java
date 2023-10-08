import stanford.karel.SuperKarel;
public class problem09 extends SuperKarel {
	/*
	 * Karel multiplies the number of beepers on 2x1 and on 3x1 and puts the product on 4x1
	 */
	public void run(){
		move();
		multiplyBeepers();
	}

	private void multiplyBeepers() {
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnRight();
			move();
			turnRight();
			move();
			turnLeft();
			backUpBeepersAndTakeThemToDestination();
			returnBeepers();
		}
	}

	private void returnBeepers() {
		turnLeft();
		move();
		while(beepersPresent()){
		pickBeeper();
		turnAround();
		move();
		putBeeper();
		
		}
	}

	private void backUpBeepersAndTakeThemToDestination() {
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
	}
}