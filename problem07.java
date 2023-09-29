import stanford.karel.SuperKarel;
public class problem07 extends SuperKarel {
	/* Karel places 1 beeper on every empty space
	 */
	public void run(){
		fillLine();
		returnHome();
		while(leftIsClear()){
			turnLeft();
			move();
			turnRight();
			fillLine();
			returnHome();
		}
		}
/* Karel learns how to fill a line with Beepers
 */
	private void fillLine(){
		while(frontIsClear()){
			if(noBeepersPresent()){putBeeper();
			move();
			}
			else{move();}
		}
		if(noBeepersPresent()){
		putBeeper();}
	}
	/* Karel learns how to return to the 1st avenue after filling a line with beepers
	 */
	private void returnHome(){
		turnAround();
		while(frontIsClear()){move();}
		turnAround();
	}
}