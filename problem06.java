import stanford.karel.Karel;
public class problem06 extends Karel{
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
	}
	private void run(){
		turnAround(){
			turnLeft();
			turnLeft();
			
		}
	}

}
