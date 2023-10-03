import stanford.karel.SuperKarel;
public class seminari_3_sakhlebi extends SuperKarel{
	public void run(){
		move();
		move();
		paintHouse();
	}
	private void paintHouse(){
		turnLeft();
		putBeeper();
		for(int i=0; i<9; i++){
			move();
			putBeeper();
		}
	}
}