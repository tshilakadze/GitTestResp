import stanford.karel.Karel;
public class Problem04 extends Karel {
	public void run(){
		while(frontIsClear()){
			putBeeper();
			move();
		}
		putBeeper();
	}

}
