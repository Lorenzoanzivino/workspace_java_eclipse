package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import calcolo.Calcolatrice;

public class TestCalcolatrice {
	// creo l'oggetto della classe da testare
	private Calcolatrice calcolatrice = new Calcolatrice();

	// aggiungo i vari metodi di test su calcolatrice

	@Test
	public void sum_ok() {
		assertEquals(2, calcolatrice.somma(1, 1));
	}

	@Test
	public void sum_faZero() {
		assertEquals(0, calcolatrice.somma(1, -1));
	}

	@Test
	public void divisione_ok() throws Exception {
		assertEquals(2.5, calcolatrice.dividi(10, 4));
	}

	@Test
	public void disisione_eccezione() {
		assertThrows(Exception.class, () -> calcolatrice.dividi(10, 0));
	}
}
