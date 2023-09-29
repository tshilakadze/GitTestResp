import stanford.karel.SuperKarel;
public class problem07 extends SuperKarel {
	/* Karel places 1 beeper on every empty space
	 */
	public void run(){
		fillLine();}

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
}