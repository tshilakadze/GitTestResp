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
				for(int l = 0; l < secondPart.length(); l++){
					if(secondPart.charAt(l) == '.'){
						firstPart = secondPart.substring(0, l);
						secondPart = secondPart.substring(l + 1);
						result = firstPart + "[.]" + secondPart;
					}
				}
				
			}
		}
		println(result);
	}

	

}
