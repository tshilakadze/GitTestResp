import java.util.*;

public class FinalLastYear_5 implements Footballer{
	private Map<String, ArrayList<String>> clubPlayer = new HashMap<String, ArrayList<String>>();
	private Map<String, ArrayList<String>> playerClub = new HashMap<String, ArrayList<String>>();
	@Override
	public void addFootballPlayer(String club, String player) {
		clubPlayer.putIfAbsent(club, new ArrayList<String>());
		clubPlayer.get(club).add(player);
		
		playerClub.putIfAbsent(player, new ArrayList<String>());
		playerClub.get(player).add(club);
		
	}

	@Override
	public Iterator<String> getClubs(String player) {
		if(!playerClub.containsKey(player)){
			return null;
		}
		return playerClub.get(player).iterator();
	}

	@Override
	public Iterator<String> getPlayers(String club, int n) {
		ArrayList<String> goodPlayers = new ArrayList<String>();
		ArrayList<String> badClubs = getBadClubs();
		for(String player: playerClub.keySet()){
			boolean add = true;
			for(String theClub: playerClub.get(player)){
				if(badClubs.contains(theClub)){
					add = false;
					break;
				}
			}
			if(add){
				goodPlayers.add(player);
			}
		}
		return goodPlayers.iterator();
	}

	private ArrayList<String> getBadClubs() {
		ArrayList<String> badClubs = new ArrayList<String>();
		for(String club: clubPlayer.keySet()){
			for(String player: clubPlayer.get(club)){
				if(playerClub.get(player).size() > 3){
					badClubs.add(club);
					break;
				}
			}
		}
		return badClubs;
	}

}
