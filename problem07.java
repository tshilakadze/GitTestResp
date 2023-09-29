import stanford.karel.SuperKarel;
public class problem07 extends SuperKarel {
	/* Karel places 1 beeper on every empty space
	 */
	public void run(){
		while(frontIsClear()){
			if(noBeepersPresent()){putBeeper();
			move();
			}
			else{move();}
		}
		putBeeper();
		while(leftIsClear()){
			turnLeft();
			move();
			turnLeft();
			while(frontIsClear()){
				if(noBeepersPresent()){putBeeper();
				move();
				}
				else{move();}
			}
			putBeeper();
		}
		while(leftIsClear()){
			turnLeft();
			move();
			turnLeft();
			while(frontIsClear()){
				if(noBeepersPresent()){putBeeper();
				move();
				}
				else{move();}
			}
			putBeeper();
		}
	}
}
