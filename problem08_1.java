import stanford.karel.SuperKarel;
public class problem08_1 extends SuperKarel {
	public void run(){
		moveTwice();
		while(beepersPresent()){
			replaceBeeper();
			turnAround();
			moveTwice();
			pickBeeper();
			turnAround();
			moveTwice();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
		move();
		while(beepersPresent()){
			replaceBeeper();
			turnAround();
			move();
			turnAround();
		}
		turnAround();
		moveTwice();
		turnAround();
		while(beepersPresent()){
			pickBeeper();
			moveTwice();
			putBeeper();
			turnAround();
			moveTwice();
			turnAround();
		}
	}
	private void replaceBeeper(){
		pickBeeper();
		move();
		putBeeper();
	}
	private void moveTwice(){
		move();
		move();
	}
	}