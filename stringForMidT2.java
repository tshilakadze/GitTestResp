import acm.program.*;
public class stringForMidT2 extends ConsoleProgram {
	public void run() {
		String IP = readLine("adress = ");
		findPoints(IP);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	IP = IP.replaceAll(".", "[.]");
		
	//	println(IP);
	}

	private void findPoints(String IP) {
		for(int i = 0; i < IP.length(); i++){
			if(IP.charAt(i) == '.'){
				String firstPart = IP.substring(0, i);
				String secondPart = IP.substring(i + 1);
				IP = firstPart + "[.]" + secondPart;
				println(IP);
				
			}
		}
	}

	

	

}