import stanford.karel.SuperKarel;
public class problem09 extends SuperKarel {
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			while(frontIsClear()){
				move();
			while(beepersPresent()){
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				turnAround();
			}}
			turnAround();
			move();
			turnAround();
		}
	}
}