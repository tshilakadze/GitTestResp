import acm.program.*;
public class stringForMidT2 extends ConsoleProgram {
	public void run() {
		String IP = readLine("adress = ");
		replacePoints(IP);
		println(IP);
	}

	private String replacePoints(String IP) {
		
		return IP.replace('.', '[');
	}

	

}
