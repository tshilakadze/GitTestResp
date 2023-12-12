import stanford.karel.Karel;
public class Problem05 extends Karel {
	public void run(){
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