//ამოცანა 1. (15 ქულა) სტრინგების კომპრესირება
//დაწერეთ მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს ამ სტრინგის
//კომპრესირებულ ვერსიას შემდეგი წესით: ნაცვლად ერთმანეთის მიმდევრობით
//გამეორებული სიმბოლოებისა წერს სიმბოლოს და შემდეგ მის რაოდენობას.
//მაგალითად:
//“aabcccccaa” -> “a2b1c5a2”.
//“wwwaaaage” -> “w3a4g1e1”
//იმ შემთხვევაში თუ ამ წესით კომპრესირებული სტრინგი უფრო გრძელია ვიდრე
//საწყისი, მეთოდმა უნდა დააბრუნოს საწყისი სტრინგი უცვლელად. მაგალითად:
//“abc”-ს კომპრესირებული ვერსიაა “a1b1c1”, რომელიც თავდაპირველზე უფრო
//გრძელია, ამიტომ მეთოდი დააბრუნებს “abc”.

import acm.program.ConsoleProgram;

public class FinalLastYear_1 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter String: ");
		println(compressedString(text));
	}

	private String compressedString(String text) {
		String line = "";
		int symCount = 1;
		if(text.length() == 0){
			return line;
		}
		line += text.charAt(0);
		for(int i = 1; i < text.length(); i++){
			if(text.charAt(i - 1) != text.charAt(i)){
				String countStr = symCount + "";
				line = line + text.charAt(i) + countStr;
				symCount = 1;
			} else{
				symCount += 1;
			}
		}
		
		return line;
	}
}
