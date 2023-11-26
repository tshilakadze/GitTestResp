import acm.program.*;
public class Problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("The number n = ");
		typeInNumbers(n);
	}

	private void typeInNumbers(int n) {
		for(int i = 0; i < n; i++){
			int a = readInt("? ");
		}
	}

}
