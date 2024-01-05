import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;
import java.awt.*;
import acm.graphics.*;
import acm.util.*;

public class Random extends GraphicsProgram {
	private static final int BALL_COUNT = 20;
	private static final int MIN_RADIUS = 2;
	private static final int MAX_RADIUS = 10;
	private static final int V_Y = 3;
	private int radius;
	private int diameter;
	private int x;
	private int y;
	private GOval ball;
	private GObject a = null;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
	
	}
}