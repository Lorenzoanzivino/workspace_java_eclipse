package SimulazioneDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class GestioneTabellaTodo {

	private File file;

	public GestioneTabellaTodo() {
		file = new File("tabella_studenti.txt");
	}

	/* ===================== FILE ===================== */

	private void aggiornaTabella(HashMap<String, Studente> tabella) {
		try {
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(tabella);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected HashMap<String, Studente> leggiTabella() throws TabellaInesistenteException {
		try {
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fin);
			HashMap<String, Studente> tabella = (HashMap<String, Studente>) ois.readObject();
			ois.close();
			return tabella;
		} catch (Exception e) {
			throw new TabellaInesistenteException(e);
		}
	}

	/* ===================== CRUD ===================== */

	public void inserisci(Studente studente) throws MatricolaException {
		HashMap<String, Studente> tabella;

		try {
			tabella = leggiTabella();
		} catch (TabellaInesistenteException e) {
			tabella = new HashMap<>();
		}

		String key = String.valueOf(studente.getMatricola());

		if (tabella.containsKey(key)) {
			throw new MatricolaException("Matricola già esistente");
		}

		tabella.put(key, studente);
		aggiornaTabella(tabella);
	}

	public ArrayList<Studente> visualizza() {
		try {
			HashMap<String, Studente> tabella = leggiTabella();
			return new ArrayList<>(tabella.values());
		} catch (TabellaInesistenteException e) {
			return new ArrayList<>();
		}
	}

	public Studente cerca(int matricola) throws MatricolaException, TabellaInesistenteException {

		HashMap<String, Studente> tabella = leggiTabella();
		String key = String.valueOf(matricola);

		if (!tabella.containsKey(key)) {
			throw new MatricolaException("Matricola non trovata");
		}

		return tabella.get(key);
	}

	public Studente rimuovi(int matricola) throws MatricolaException, TabellaInesistenteException {

		HashMap<String, Studente> tabella = leggiTabella();
		String key = String.valueOf(matricola);

		if (!tabella.containsKey(key)) {
			throw new MatricolaException("Matricola non trovata");
		}

		Studente rimosso = tabella.remove(key);
		aggiornaTabella(tabella);
		return rimosso;
	}

	public void modifica(Studente studente) {
		try {
			HashMap<String, Studente> tabella = leggiTabella();
			String key = String.valueOf(studente.getMatricola());

			if (!tabella.containsKey(key)) {
				throw new RuntimeException("Matricola inesistente");
			}

			tabella.put(key, studente);
			aggiornaTabella(tabella);

		} catch (TabellaInesistenteException e) {
			throw new RuntimeException("Tabella inesistente");
		}
	}

	/* ===================== ORDINAMENTI ===================== */

	public ArrayList<Studente> ordinaByNome() {
		ArrayList<Studente> lista = visualizza();
		lista.sort((a, b) -> a.getNome().compareToIgnoreCase(b.getNome()));
		return lista;
	}

	public ArrayList<Studente> ordinaByDate() {
		ArrayList<Studente> lista = visualizza();
		lista.sort((a, b) -> a.getDataImmatricolazione().compareTo(b.getDataImmatricolazione()));
		return lista;
	}

	/* ===================== SELEZIONI ===================== */

	public Studente getStudenteGiovane() {
		ArrayList<Studente> lista = visualizza();

		if (lista.isEmpty())
			return null;

		Studente giovane = lista.get(0);

		for (Studente s : lista) {
			if (s.getDataImmatricolazione().after(giovane.getDataImmatricolazione())) {
				giovane = s;
			}
		}
		return giovane;
	}

	public ArrayList<Studente> visualizzaByCorso(String corso) {
		ArrayList<Studente> risultato = new ArrayList<>();

		for (Studente s : visualizza()) {
			if (s.getCorsoLaurea().equalsIgnoreCase(corso)) {
				risultato.add(s);
			}
		}
		return risultato;
	}
}
