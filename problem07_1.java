import stanford.karel.SuperKarel;
public class problem07_1 extends SuperKarel{
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
