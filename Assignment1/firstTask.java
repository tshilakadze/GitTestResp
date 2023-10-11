package Assignment1;

import stanford.karel.SuperKarel;

public class firstTask extends SuperKarel {
	public void run(){
		/*
		 * Karel goes outside its house, picks up a newspaper and returns to its location
		 */
		goOutside();
		pickNewspaper();
		returnHome();
	}

	/*
	 * Karel learns how to go outside the house
	 */
	
	private void goOutside() {
		while(frontIsClear()){
		move();
		}
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	/*
	 * Karel learns how to pick up a newspaper
	 */
	
	private void pickNewspaper(){
		if(beepersPresent())
			pickBeeper();
	}
	
	
/*
 * Karel learns how to return home
 */
	private void returnHome() {
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		while(frontIsClear()){
		move();
		}
		turnAround();
	}
}
