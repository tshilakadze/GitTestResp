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
		for(String player: playerClub.keySet()){
			
		}
		return null;
	}

}
