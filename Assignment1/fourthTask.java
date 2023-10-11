package Assignment1;
import stanford.karel.SuperKarel;
public class fourthTask extends SuperKarel {
	public void run(){
		fillLine();
		goBack();
		leaveOneBeeper();
	}

	private void leaveOneBeeper() {
		while(beepersPresent()){
			checkTheNext();
			while(frontIsClear()){
				move();
			}
			turnAround();
			if(beepersPresent()){
				checkTheNext();
				turnAround();
				goBack();
			}
			else{
				while(noBeepersPresent()){
				move();}
				checkTheNext();
				turnAround();
				goBack();
			}
			while(noBeepersPresent()){
			move();
			}
		}
	}

	private void checkTheNext() {
		move();
		if(beepersPresent()){
			turnAround();
			move();
			turnAround();
			pickBeeper();
		}
		else{
			turnAround();
			move();
		}
	}

	private void fillLine() {
		while(frontIsClear()){
			putBeeper();
			move();
		}
		putBeeper();
		
	}

	private void goBack() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
}