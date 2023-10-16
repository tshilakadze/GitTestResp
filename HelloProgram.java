import acm.graphics.*;
import acm.program.*;
public class HelloProgram extends GraphicsProgram {
	public void run() {
		GLabel msg = new GLabel("Hello World", 100, 75);
		msg.setFont("Lucida Blackletter-24");
		add (msg);
	}

}
