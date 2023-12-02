import acm.program.ConsoleProgram;

public class eval extends ConsoleProgram{
	public void run(){
		String s = "2 + 5 + 5 - 3";
		System.out.println(eval(s));
	}
	private int eval(String s){
		s.replaceAll(" ", "");
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			if(i == 0){
				result = s.charAt(0) - '0';
			}
			if(s.charAt(i) == '+'){
				result = result + (s.charAt(i) - '0');
			}
			if(s.charAt(i) == '-'){
				result = result - (s.charAt(i) - '0');
			}
			if(s.length() == 1){
				return s.charAt(0) - '0';
			}
		}
		return result;
	}
}