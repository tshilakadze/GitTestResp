import stanford.karel.Karel;
public class problem02 extends Karel {
	public void run(){
		while(noBeepersPresent()){move();}
		while(beepersPresent()){pickBeeper();}
		move();
		while(beepersInBag()){putBeeper();}
		move();
	}

}
