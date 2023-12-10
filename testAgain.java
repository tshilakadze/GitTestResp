import acm.graphics.GLabel;
import acm.program.ConsoleProgram;

import java.util.*;

public class testAgain extends ConsoleProgram {
	remove(wordLabel);
	remove(incorrect);
	GLabel lost = new GLabel("YOU LOST");
	lost.setFont("Helvetic-26");
	add(lost, getWidth()/2 - lost.getWidth()/2, 80 + SCAFFOLD_HEIGHT);
}