import acm.program.*;
public class stringForMidT2 extends ConsoleProgram {
	public void run() {
		String IP = readLine("adress = ");
		replaceSymbol(IP);
	}

	public String replaceSymbol(String IP){
		return IP.replace('.', '[');
		
		
	}

	

}
