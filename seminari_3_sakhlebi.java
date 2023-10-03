import stanford.karel.SuperKarel;
public class seminari_3_sakhlebi extends SuperKarel{
	public void run(){
		move();
		move();
		for(int i=0; i<5; i++){
		paintHouse();
		turnLeft();
		move();
		move();
		move();}
		returnHome();
		for(int i=0; i<4; i++){
			move();
		}
		turnLeft();
		for(int i=0; i<4; i++){
			putBeeper();
			move();
		}
	}
	private void paintHouse(){
		turnLeft();
		putBeeper();
		for(int i=0; i<8; i++){
			move();
			putBeeper();
		}
		turnRight();
		for(int i=0; i<6; i++){
			move();
			putBeeper();
		}
		turnRight();
		for(int i=0; i<8; i++){
			move();
			putBeeper();	
		}
	}
	private void returnHome(){
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
}