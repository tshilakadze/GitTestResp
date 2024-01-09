/* 63. კონსოლიდან შეგვყავს წყვილ-წყვილად ადამიანის და მისი გამომწერის სახელები, მანამ სანამ არ შევიყვანთ
 * ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი, ვისაც ჰყავს ყველაზე მეტი გამომწერი.
 * 64. 63-ე ამოცანის გაგრძელება, დაბეჭდეთ თითოეული შეყვანილი სახელი და მის გასწვრივ
 * მძიმით გამოყოფილი გამომწერების სია.
 */

import java.util.*;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {
	private String person;
	private ArrayList<String> myFollowers;
	public void run() {
		Map<String, ArrayList<String>> followersMap = new HashMap<String, ArrayList<String>>();	
		while(true){
			String follower = readLine("Enter follower's name: ");
			if(follower.isEmpty()){
				break;
			}
			person = readLine("Enter person's name: ");
			if(!followersMap.containsKey(person)){
				followersMap.put(person, new ArrayList<String>());
			}
			myFollowers = followersMap.get(person);
			myFollowers.add(follower);
		}
		println(followersMap);		//Problem64
		/*if((notMutuals(person, followersMap))){
			println(person);
		}*/
		
		
		int maxFollowers = 0;
		String mostPopular = null;
		for(String person: followersMap.keySet()){
			int followerCount = followersMap.get(person).size();
			if(followerCount > maxFollowers){
				maxFollowers = followerCount;
				mostPopular = person;
			}
		}
		println("Person with most followers is " + mostPopular);
		
	}
	/*private boolean notMutuals(String person2, Map<String, ArrayList<String>> followersMap) {
		for(int i = 0; i < followersMap.size(); i++){
			for(int j = 0; j < myFollowers.size(); j++){
				
			}
		}
		return true;
	}*/
}
