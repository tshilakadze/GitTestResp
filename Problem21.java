import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Problem21 extends GraphicsProgram{
	public void run(){
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		double a = getWidth()/10;
		GLine line = new GLine(a, 0, a, getHeight());
		add(line);
		
		for(int i = 0; i < 9; i++){
		double b = a + getWidth()/10;
		GLine OtherLines = new GLine(b, 0, b, getHeight());
		add(OtherLines);
		
		}
	}

}
