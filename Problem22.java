import acm.program.GraphicsProgram;
import acm.graphics.*;
public class Problem22 extends GraphicsProgram {
	public void run() {
		double sqWidth = getWidth()/8;
		double sqHeight = getHeight()/8;
		GRect sq = new GRect(sqWidth, sqHeight);
		for(int i = 0; i < getWidth() - getWidth()/8; i = i + getWidth()/8){
			add(sq, i, 0);
		}
	}
}
