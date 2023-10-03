import stanford.karel.SuperKarel;
public class seminari_3_sakhlebi extends SuperKarel{
	public void run(){
		move();
		move();
		paintHouse();
	}
	private void paintHouse(){
		turnLeft();
		for(int i=0; i<9; i++){
			putBeeper();
		}
	}
}