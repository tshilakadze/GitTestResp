import stanford.karel.SuperKarel;
public class problem07new extends SuperKarel{
	public void run(){
		fillLine();
		
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