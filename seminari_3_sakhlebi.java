import stanford.karel.SuperKarel;
public class seminari_3_sakhlebi extends SuperKarel{
	public void run(){
		move();
		move();
		for(int i=0; i<5; i++){
		drawHouse();
		}
		returnHome();
		for(int i=0; i<4; i++){
		move();}
		turnLeft();
		for(int i=0; i<5; i++){
		drawDoor();}
	}
	private void drawHouse(){
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
		turnLeft();
		move();
		move();
		move();
	}
	private void returnHome(){
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnAround();
	}
	private void drawDoor(){
		for(int i=0; i<4; i++){
			move();
		}
		turnLeft();
		putBeeper();
		for(int i=0; i<3; i++){
			move();
			putBeeper();
		}
		turnRight();
		move();
		putBeeper();
		move();
		putBeeper();
		turnRight();
		for(int i=0; i<3; i++){
			move();
			putBeeper();
		}
	}

	
}