import stanford.karel.SuperKarel;
public class problem08_1 extends SuperKarel {
	public void run(){
		move();
		move();
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