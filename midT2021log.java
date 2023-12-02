import acm.program.*;
public class midT2021log extends ConsoleProgram {
	public void run(){
		int n = readInt("n = ");
		int m = readInt("m = ");
		println(findLog(n, m));
		
}


	private int findLog(int n, int m){
		int result = 0;
		while(m != 0){
			m = m / n;
			result += 1;
		}
		return result - 1;
}
}