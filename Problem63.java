/* კონსოლიდან შეგვყავს წყვილ-წყვილად ადამიანის და მისი გამომწერის სახელები, მანამ სანამ არ შევიყვანთ
 * ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი, ვისაც ჰყავს ყველაზე მეტი გამომწერი.
 */

import java.util.*;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {
	public void run() {
		Map<String, ArrayList<String>> followers = new HashMap<String, ArrayList<String>>();	
		while(true){
			String follower = readLine("Enter follower's name: ");
			if(follower.isEmpty()){
				break;
			}
			String person = readLine("Enter person's name: ");
			if(!followers.containsKey(person)){
				followers.put(person, new ArrayList<String>());
			}
		}
	}
}
