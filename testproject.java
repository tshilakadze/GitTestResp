

turnLeft();
		move();
		move();
		move();
		
		drawDoor();
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
