import acm.program.ConsoleProgram;

public class eval extends ConsoleProgram{
	public void run(){
		String str = readLine("? ");
		int answ = eval(str);
		println(answ);
	}

	private int eval(String str) {
		int result = 0;
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == '-'){
				String part = str.substring(0, i - 1);
				str = str.substring(i + 2);
				int num = stringToInt(part);
				result = result - num;
			}
			if(ch == '+'){
				String part1 = str.substring(0, i - 1);
				str = str.substring(i + 2);
				int num1 = stringToInt(part1);
				result = result + num1;
			}
		}
		return result;
	}
	
	private int stringToInt(String str){
		int x = Integer.parseInt(str);
		return x;
	}
}