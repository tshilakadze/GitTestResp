import stanford.karel.SuperKarel;
public class problem08_1 extends SuperKarel {
	public void run(){
		move();
		move();
		minusBeepers();
		turnAround();
		move();
		putBeepersOnDestination();
		
	}

	private void putBeepersOnDestination() {
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
		}
	}

	private void minusBeepers() {
		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			pickBeeper();
			turnAround();
			move();
		}
	}
}