/* კონსოლიდან შეგვყავს წყვილ-წყვილად ადამიანის და მისი გამომწერის სახელები, მანამ სანამ არ შევიყვანთ
 * ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი, ვისაც ჰყავს ყველაზე მეტი გამომწერი.
 */

import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {
	private String mostFollowed;
	public void run() {
		HashMap<String, String> followers = new HashMap<String, String>();
		String person;
		String follower;
		while(true){
			followers.put(person = readLine("key: "), follower = readLine("value: "));
			if(person.equals("") || follower.equals("")){
				personWithMostFollowers(followers);
				break;
			}
		}
	}

	private String personWithMostFollowers(HashMap<String, String> followers) {
		int mostFollowers = 0;
		for(int i = 0; i < followers.size(); i++){
			int currNum = countFollowers(followers, followers.get(i));
			if(currNum > mostFollowers){
				mostFollowers = currNum;
				mostFollowed = followers.get(i);
			}
		}
		return mostFollowed;
	}

	private int countFollowers(HashMap<String, String> followers, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
