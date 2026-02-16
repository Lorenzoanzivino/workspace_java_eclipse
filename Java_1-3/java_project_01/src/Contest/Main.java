package Contest;

public class Main {
	public static void main(String[] args) {
		Contest contest = new Contest();

		Performer p1 = new Performer("Lorenzo");
		Performer p2 = new Performer("Mario");
		Performer p3 = new Performer("Anna");

		// Iscrizione artisti
		try {
			contest.signUp(p1);
			contest.signUp(p2);
			contest.signUp(p3);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		// Votazioni
		contest.registerVoteFor(p1);
		contest.registerVoteFor(p2);
		contest.registerVoteFor(p2);
		contest.registerVoteFor(p3);
		contest.registerVoteFor(p3);
		contest.registerVoteFor(p3);

		// Stampa vincitore
		Performer vincitore = contest.getWinner();
		if (vincitore != null) {
			System.out.println("Vincitore: " + vincitore);
		} else {
			System.out.println("Nessun vincitore");
		}
	}
}
