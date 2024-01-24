import java.util.*;

public class FinalLastYear_5 implements Footballer{
	private Map<String, String> clubPlayer = new HashMap<String, String>();
	private Map<String, String> playerClub = new HashMap<String, String>();
	@Override
	public void addFootballPlayer(String club, String player) {
		clubPlayer.put(club, player);
		playerClub.put(player, club);
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
