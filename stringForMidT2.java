import acm.program.*;
public class stringForMidT2 extends ConsoleProgram {
	public void run() {
		String IP = readLine("adress = ");
		findPoints(IP);
	}

	private void findPoints(String IP) {
		for(int i = 0; i < IP.length(); i++){
			if(IP.charAt(i) == '.'){
				IP.replace('.', '[');
			}
		}
		println(IP);
	}

}
