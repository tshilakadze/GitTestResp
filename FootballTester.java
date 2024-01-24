import java.util.Iterator;

import acm.program.ConsoleProgram;

public class FootballTester extends ConsoleProgram {
	public void run() {
		FinalLastYear_5 football = new FinalLastYear_5();
		football.addFootballPlayer("dinamo", "messi");
		football.addFootballPlayer("real", "messi");
		football.addFootballPlayer("olimpi", "messi");
		football.addFootballPlayer("barcellona", "messi");
		
		football.addFootballPlayer("real", "mari");
		football.addFootballPlayer("olimpi", "mari");
		football.addFootballPlayer("goodClub", "mari");
		football.addFootballPlayer("goodClub", "nino");
		football.addFootballPlayer("goodClub2", "goodPlayer");
		
		
		printIteratorElems(football.getClubs("messi"));
		printIteratorElems(football.getClubs("mari"));
		printIteratorElems(football.getClubs("nino"));

		printIteratorElems(football.getPlayers("dinamo", 3)); // arguments dont matter
		

	}

	private void printIteratorElems(Iterator<String> it) {
		if (it == null) {
			println("null");
		} else {
			if (!it.hasNext()) {
				println("empty");
			} else {
				while (it.hasNext()) {
					print(it.next() + ", ");
				}
				println();
			}
		}
	}
}