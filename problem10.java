import stanford.karel.SuperKarel;
public class problem10 extends SuperKarel {
	public void run(){
		/*
		 * Karel divides two numbers
		 */
		move();
		move();
		divideBeepers();
	}

	private void divideBeepers() {
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnRight();
			move();
			while(beepersPresent()){
				pickBeeper();
				
			}
		}
	}
}