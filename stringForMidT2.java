import acm.program.*;
public class stringForMidT2 extends ConsoleProgram {
	public void run() {
		String IP = readLine("adress = ");
		findPoints(IP);
	}

	private void findPoints(String IP) {
		String result = "";
		for(int i = 0; i < IP.length(); i++){
			if(IP.charAt(i) == '.'){
				String firstPart = IP.substring(0, i);
				String secondPart = IP.substring(i + 1);
				result = firstPart + "[.]" + secondPart;
				IP = result;
			}
		}
		println(IP);
		
	}

	

}
