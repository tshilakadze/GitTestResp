import stanford.karel.SuperKarel;
public class problem10 extends SuperKarel {
	public void run(){
		/*
		 * Karel divides two numbers
		 */
		move();
		divideBeepers();
	}

	private void divideBeepers() {
		while(beepersPresent()){
		minusAndBackUpBeepers();
		
		}
	}

	private void minusAndBackUpBeepers() {
		move();
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnRight();
			turnRight();
			move();
			turnRight();
			move();
			turnAround();
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnRight();
			turnRight();
			move();
			turnLeft();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
	}
}