import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Seminari13damatebiti extends GraphicsProgram {
	public void run() {
		double x1 = 0;
		double y1 = getHeight() / 2;
		double x2 = getWidth();
		double y2 = getHeight() / 2;
		while(true){
			removeAll();
			GLine mLine = new GLine(x1, y1, x2, y2);
			add(mLine);
		}
		
	}
}
