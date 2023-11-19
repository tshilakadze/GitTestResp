/* if(ball.getY() + BALL_RADIUS*2 >= getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT &&
				ball.getX() <= paddle.getX() + PADDLE_WIDTH && ball.getX() >= paddle.getX()){
				vy = -vy;
			}
			
			if(ball.getX() == paddle.getX() + PADDLE_WIDTH && ball.getY() <= getHeight() - PADDLE_Y_OFFSET){
				vx = -vx;
			}
*/



/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class testAgain extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
	
	private RandomGenerator rgen1 = RandomGenerator.getInstance();
	private RandomGenerator rgen2 = RandomGenerator.getInstance();
	
	private GObject obj;
	private GObject firstPoint;
	private GObject secondPoint;
	private GObject thirdPoint;
	private GObject fourthPoint;
	private GObject paddleLeftPoint1;
	private GObject paddleRightPoint1;
	private GObject paddleLeftPoint2;
	private GObject paddleRightPoint2;
	private GOval ball;
	private GRect brick;
	private GRect paddle;
	
	private int prevx;
	private int lostLives;
	private int brickNum;
	
/* Method: run() */
/** Runs the Breakout program. */
	public void run() {
		/* You fill this in, along with any subsidiary methods */
		
		drawBricks();
		drawPaddle();
		drawBall();
		lostLives = 0;
		brickNum = 100;
		
		
		double vx = rgen1.nextDouble(1, 2);
		if(rgen1.nextBoolean(0.5))vx = -vx;
		double vy = rgen2.nextDouble(1, 2);
		if(rgen2.nextBoolean(0.5))vy = -vy;
		addMouseListeners();
		while(true){
			
			if(ball.getX() + BALL_RADIUS*2 >= WIDTH || ball.getX() <= 0){
				vx = -vx;
			}
			if(ball.getY() <= 0){
				vy = -vy;
			}
			
			firstPoint = getElementAt(ball.getX(), ball.getY());
			secondPoint = getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY());
			thirdPoint = getElementAt(ball.getX(), ball.getY() + BALL_RADIUS*2);
			fourthPoint = getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY() + BALL_RADIUS*2);
			paddleLeftPoint1 = getElementAt(paddle.getX(), paddle.getY() + PADDLE_HEIGHT/2);
			paddleRightPoint1 = getElementAt(paddle.getX() + PADDLE_WIDTH, paddle.getY() + PADDLE_HEIGHT/2);
			paddleLeftPoint2 = getElementAt(paddle.getX(), paddle.getY() + PADDLE_HEIGHT);
			paddleRightPoint2 = getElementAt(paddle.getX() + PADDLE_WIDTH, paddle.getY() + PADDLE_HEIGHT);
			
			if(thirdPoint == paddle || fourthPoint == paddle){
				vy = -vy;
			}
			
			if(paddleLeftPoint1 == ball || paddleRightPoint1 == ball ||
					paddleLeftPoint2 == ball || paddleRightPoint2 == ball){
				vx = -vx;
			}
			
			if(ball.getY() + BALL_RADIUS*2 >= getHeight()){
				remove(ball);
				lostLives = lostLives + 1;
				drawBall();
				if(lostLives == 3){
					removeAll();
				}
			}
			
			
			if(firstPoint != null && firstPoint != paddle){
				remove(firstPoint);
				vy = -vy;
				brickNum = brickNum - 1;
				if(brickNum == 0){
					removeAll();
				}
			}
			
			else if(secondPoint != null && secondPoint != paddle){
				remove(secondPoint);
				vy = -vy;
				brickNum = brickNum - 1;
				if(brickNum == 0){
					removeAll();
				}
			}
			
			else if(thirdPoint != null && thirdPoint != paddle){
				remove(thirdPoint);
				vy = -vy;
				brickNum = brickNum - 1;
				if(brickNum == 0){
					removeAll();
				}
			}
			
			else if(fourthPoint != null && fourthPoint != paddle){
				remove(fourthPoint);
				vy = -vy;
				brickNum = brickNum - 1;
				if(brickNum == 0){
					removeAll();
				}
			}
			
			ball.move(vx, vy);
			pause(10);
		}
		
	}

	
	

	public void mousePressed(MouseEvent e) {
		obj = getElementAt(e.getX(), e.getY());
		if(obj == paddle){
			prevx = e.getX();
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if(obj == paddle && e.getX() <= WIDTH && e.getX() >= 0){      // !!!!!!!!!!!!!!!!!!!!!!
			obj.move(e.getX() - prevx, 0);
			prevx = e.getX();
		}
	}
	
	
private void drawBricks() {
	for(int i = 0; i < NBRICK_ROWS; i++){
		for(int l = 0; l < NBRICKS_PER_ROW; l++){
			int x = BRICK_SEP/2 + BRICK_WIDTH*i + BRICK_SEP*i;
			int y = BRICK_Y_OFFSET + BRICK_HEIGHT*l + BRICK_SEP*l;
			brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
			add(brick, x, y);
			brick.setFilled(true);
			if(y < BRICK_Y_OFFSET + BRICK_HEIGHT*2 + BRICK_SEP*2){
				brick.setColor(Color.RED); 
			}
			if(y < BRICK_Y_OFFSET + BRICK_HEIGHT*4 + BRICK_SEP*4 &&
					y >= BRICK_Y_OFFSET + BRICK_HEIGHT*2 + BRICK_SEP*2){
				brick.setColor(Color.ORANGE);
			}
			if(y < BRICK_Y_OFFSET + BRICK_HEIGHT*6 + BRICK_SEP*6 &&
					y >= BRICK_Y_OFFSET + BRICK_HEIGHT*4 + BRICK_SEP*4){
				brick.setColor(Color.YELLOW);
			}
			if(y < BRICK_Y_OFFSET + BRICK_HEIGHT*8 + BRICK_SEP*8 &&
					y >= BRICK_Y_OFFSET + BRICK_HEIGHT*6 + BRICK_SEP*6){
				brick.setColor(Color.GREEN);
			}
			if(y < BRICK_Y_OFFSET + BRICK_HEIGHT*10 + BRICK_SEP*10 &&
					y >= BRICK_Y_OFFSET + BRICK_HEIGHT*8 + BRICK_SEP*8){
				brick.setColor(Color.CYAN);
			}
		}
	}
}


private void drawPaddle() {
	paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
	add(paddle, WIDTH/2 - PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
	paddle.setFilled(true);
}


private void drawBall() {
	ball = new GOval(BALL_RADIUS*2, BALL_RADIUS*2);
	if(lostLives < 3){
	add(ball, WIDTH/2 - BALL_RADIUS, HEIGHT - BALL_RADIUS);
	ball.setFilled(true);
	}
}
}