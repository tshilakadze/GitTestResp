import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram{
	public void run(){
		for(int m = 0; m < getWidth(); m = m + getWidth()/11){
			GLine line = new GLine(m, 0, m, getHeight());
			add(line);
		}
		for(int n = 0; n < getHeight(); n = n + getHeight()/11){
			GLine HorLine = new GLine(0, n, getWidth(), n);
			add(HorLine);
		}
	}

}
