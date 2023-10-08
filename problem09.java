import stanford.karel.SuperKarel;
public class problem09 extends SuperKarel {
	/*
	 * Karel multiplies the number of beepers on 2x1 and on 3x1 and puts the product on 4x1
	 */
	public void run(){
		move();
		multiplyBeepers();
		returnBeepersOn2x1();
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
			returnBeepersOn3x1();
		}
	}

	private void returnBeepersOn2x1() {
		turnLeft();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
		}
	}

	private void returnBeepersOn3x1() {
		turnLeft();
		move();
		while(beepersPresent()){
		pickBeeper();
		turnAround();
		move();
		putBeeper();
		turnAround();
		move();
		}
		turnAround();
		move();
		turnRight();
		move();
		turnAround();
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