package Contest;

import java.util.ArrayList;

public class Contest {
	private ArrayList<Performer> artisti = new ArrayList<>();

	public void signUp(Performer p) throws RuntimeException {
		if (artisti.contains(p)) {
			throw new RuntimeException("Artista già iscritto");
		}
		artisti.add(p);
	}

	public void registerVoteFor(Performer p) throws RuntimeException {
		if (artisti.isEmpty()) {
			throw new RuntimeException("artista non iscritto");
		}
		p.incrementaVoti();

	}

	public Performer getWinner() {
		if (artisti.isEmpty()) {
			return null;
		}
		Performer vincitore = artisti.get(0);
		for (Performer p : artisti) {
			if (p.getVoti() > vincitore.getVoti()) {
				vincitore = p;
			}
		}
		return vincitore;
	}
}
