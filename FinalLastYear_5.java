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
		
		return null;
	}

	@Override
	public Iterator<String> getPlayers(String club, int n) {
		
		return null;
	}

}
