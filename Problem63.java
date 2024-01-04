/* კონსოლიდან შეგვყავს წყვილ-წყვილად ადამიანის და მისი გამომწერის სახელები, მანამ სანამ არ შევიყვანთ
 * ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი, ვისაც ჰყავს ყველაზე მეტი გამომწერი.
 */

import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {
	public void run() {
		HashMap<String, String> followers = new HashMap<String, String>();
		String person;
		String follower;
		while(true){
			followers.put(person = readLine("key: "), follower = readLine("value: "));
			if(person.equals("") || follower.equals("")){
				break;
			}
		}
	}

}
