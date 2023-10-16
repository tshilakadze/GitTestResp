import stanford.karel.SuperKarel;
public class problem06 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
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
