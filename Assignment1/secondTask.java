package Assignment1;
import stanford.karel.SuperKarel;
public class secondTask extends SuperKarel {
	public void run(){
	while(frontIsClear()){
		fillColumn();
		goBack();
		moveToNextColumn();
		}
	fillColumn();
	goBack();
	}

	private void fillColumn() {
		turnLeft();
		if(noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				putBeeper();
			}
		}
	}
	private void goBack(){
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}
	private void moveToNextColumn(){
		for(int i=0; i<4; i++){
			move();
		}
	}
}