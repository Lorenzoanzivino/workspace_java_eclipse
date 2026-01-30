package OperazioniProdotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Catalogo {
	public static void main(String... args) {
		// 0. Lista dei prodotti
		ArrayList<Prodotto> catalogo = new ArrayList<>();
		catalogo.add(new Prodotto(133, "latte", "alimentare", 100, true, 2.5, 0));
		catalogo.add(new Prodotto(134, "latte UHT", "alimentare", 0, false, 2.5, 0));
		catalogo.add(new Prodotto(113, "pomodori", "alimentare", 50, true, 1.5, 5));
		catalogo.add(new Prodotto(123, "libro", "media", 10, true, 10, 5));
		catalogo.add(new Prodotto(155, "maglietta", "abbigliamento", 20, true, 25, 10));
		catalogo.add(new Prodotto(184, "cd musicale", "media", 0, false, 12.5, 0));
		catalogo.add(new Prodotto(143, "smartphone", "elettronica", 80, true, 250, 10));
		catalogo.add(new Prodotto(144, "cuffie", "elettronica", 0, false, 250, 10));

		// 1 Numero categorie
		long numeroCategorie = catalogo.stream().map(p -> p.getCategoria()).distinct().count();
		System.out.println("Numero di categorie: " + numeroCategorie);

		// 2 Categorie ordinate per nome
		List<String> categorieOrdinateNomi = catalogo.stream().map(p -> p.getCategoria()).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println("Categorie ordinate per nome: " + categorieOrdinateNomi);

		// 3 Prodotti ordinati per prezzo crescente
		List<String> prodottoOrdinatoPrezzo = catalogo.stream().sorted(Comparator.comparing(p -> p.getPrezzo()))
				.map(p -> p.getDescrizione()).collect(Collectors.toList());
		System.out.println("Prodotti ordinati per prezzo: " + prodottoOrdinatoPrezzo);

		// 4 Prodotti ordinati per sconto crescente
		List<String> prodottoOrdinatoSconto = catalogo.stream().sorted(Comparator.comparing(p -> p.getSconto()))
				.map(p -> p.getDescrizione()).collect(Collectors.toList());
		System.out.println("Prodotti ordinati per sconto: " + prodottoOrdinatoSconto);

		// 5 Prodotto con lo sconto maggiore
		Optional<Prodotto> maxSconto = catalogo.stream().max(Comparator.comparing(p -> p.getSconto()));
		maxSconto.ifPresent(p -> System.out.println("Prodotto con sconto maggiore: " + p.getDescrizione()));

		// 6 Somma dei prezzi dei prodotti alimentari
		double sommaPrezziAlimentari = catalogo.stream().filter(p -> p.getCategoria().equalsIgnoreCase("alimentare"))
				.mapToDouble(p -> p.getPrezzo()).sum();
		System.out.println("Somma prezzi prodotti alimentari: " + sommaPrezziAlimentari);

		// 7 Optional vuoto per categoria inesistente ("giocattoli")
		Optional<Prodotto> ricercaGiocattoli = catalogo.stream()
				.filter(p -> p.getCategoria().equalsIgnoreCase("giocattoli")).findFirst();
		System.out.println("Prodotto categoria giocattoli: " + ricercaGiocattoli);

		// 8 Prodotto con prezzo più alto nella categoria media
		Optional<Prodotto> maxMedia = catalogo.stream().filter(p -> p.getCategoria().equalsIgnoreCase("media"))
				.max(Comparator.comparing(p -> p.getPrezzo()));
		maxMedia.ifPresent(
				p -> System.out.println("Prodotto con prezzo più alto categoria media: " + p.getDescrizione()));

		// 9 Nomi dei prodotti non disponibili
		List<String> prodottiNonDisponibili = catalogo.stream().filter(p -> !p.isDisponibile())
				.map(p -> p.getDescrizione()).collect(Collectors.toList());
		System.out.println("Prodotti non disponibili: " + prodottiNonDisponibili);
	}
}
