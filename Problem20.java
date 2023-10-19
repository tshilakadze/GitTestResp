import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram {
	public void run() {
		
	int n = readInt("Enter n: ");
	int total = 0;
	for(int i = 0; i < n; i++){
		int value = readInt("Enter an integer ");
		total += value;
		}
	println(total);
	
	}
}
