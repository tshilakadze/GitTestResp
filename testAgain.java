import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram {
	public void run() {
		HashMap<String, String> testMap = new HashMap<String, String>();
		testMap.put("dog", "woof");
		println(testMap.get("dog"));
	}
}