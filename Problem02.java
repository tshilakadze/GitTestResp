import stanford.karel.Karel;
public class Problem02 extends Karel {
	public void run(){
		while(noBeepersPresent()){move();}
		while(beepersPresent()){pickBeeper();}
		move();
		while(beepersInBag()){putBeeper();}
	}

}
