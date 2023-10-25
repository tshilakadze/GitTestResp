import acm.program.ConsoleProgram;

public class testAgain extends ConsoleProgram{
	public void run() {
		int n = readPositiveInt("Enter n: ");
		int m = readPositiveInt("Enter m: ");
	
		int gcd = gcd(n, m);
		println("GCD is: " + gcd);
		int lcm = lcm(n, m);
		println("LCM is: " + lcm);
	}

	private int readPositiveInt(String text) {
		int n = readInt(text);
		while( n <= 0) {
			println("Number should positive");
			n = readInt(text);
		}
		return n;
	}
	
	private int lcm(int n, int m) {
		return n * m / gcd(n, m);
	}

	private int gcd(int n, int m) {
		for (int i = Math.min(n, m); i >= 1; i--) {
			if(n % i == 0 && m % i == 0) { // && logical and
				return i;
			}
		}
		return -1;
	}
}