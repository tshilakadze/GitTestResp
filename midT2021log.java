import acm.program.*;
public class midT2021log extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter the first number: ");
		int m = readInt("Enter the second number: ");
		println(findLog(n, m,));
		
}


	private int findLog(int n, int m){
		int result = 0;
		while(n != 0){
			n = n / m;
			result += 1;
		}
		return result;
}
}