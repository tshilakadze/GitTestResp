import stanford.karel.SuperKarel;
public class problem07again extends SuperKarel{
	public void run(){
		fillLine();
		while(facingEast()){
			turnLeft();
			if(frontIsClear()){
			move();}
			turnLeft();
			fillLine();
		while(facingWest()){
			turnRight();
			if(frontIsClear()){
			move();}
			turnRight();
			fillLine();
		}
		}
}
	private void fillLine(){
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			else{move();}
	}
		if(noBeepersPresent()){
			putBeeper();
		}
	}
}