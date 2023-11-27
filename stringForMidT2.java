import acm.program.*;
public class stringForMidT2 extends ConsoleProgram {
	public void run() {
		String IP = readLine("adress = ");
		findPoints(IP);
	}

	private void findPoints(String IP) {
		for(int i = 0; i < IP.length(); i++){
			if(IP.charAt(i) == '.'){
				replaceIt(IP, i);
			}
		}
	}

	private void replaceIt(String IP, int i) {
		String part = IP.substring(0, i);
		
	}

	

}
