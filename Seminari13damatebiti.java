import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Seminari13damatebiti extends GraphicsProgram {
	public void run() {
		while(true){
			removeAll();
			GLine mLine = new GLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
			add(mLine);
			pause(20);
		}
		
	}
}
