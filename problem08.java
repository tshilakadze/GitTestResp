import stanford.karel.SuperKarel;
public class problem08 extends SuperKarel {
	public void run(){
		move();
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			pickBeeper();
			turnAround();
			move();
			move();
			putBeeper();
		}
	}
}
