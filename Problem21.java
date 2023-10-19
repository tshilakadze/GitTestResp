import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram{
	public void run(){
		GLine line = new GLine(getWidth()/10, 0, getWidth()/10, getHeight());
		add(line);
		for(int i = 0; i < 9; i++){
			add(line);
		}
	}

}
