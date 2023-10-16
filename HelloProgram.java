import acm.graphics.*;
import acm.program.*;
public class HelloProgram extends GraphicsProgram {
	public void run() {
		GLabel msg = new GLabel("Hello World", 100, 75);
		msg.setFont("Helvetica-24");
		add (msg);
	}

}
