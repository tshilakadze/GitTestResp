import stanford.karel.SuperKarel;
public class problem06seminarze extends SuperKarel{
	public void run(){
		move();
		moveFirstPileToDestinationAndBackup();
		move();
		moveSecondPileToDestinationAndBackup();
		restoreFromBackup();
		restoreFromBackup();
	}

	private void moveFirstPileToDestinationAndBackup() {
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromFirstPileToDestination();
			backUpBeeper()
		}
	}

	private void moveBeeperFromFirstPileToDestination() {
		move();
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround()
	}
	
}
