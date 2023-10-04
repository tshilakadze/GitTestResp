import stanford.karel.SuperKarel;
public class problem09 extends SuperKarel {
	public void run(){
		move();
		multiplyBeepers();
	}
	
	
	private void multiplyBeepers(){
	while(beepersPresent()){
		pickBeeper();
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
	}
	}
}