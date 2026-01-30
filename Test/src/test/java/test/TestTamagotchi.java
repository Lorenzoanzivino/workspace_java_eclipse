package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import tamagotchi.Tamagotchi;

public class TestTamagotchi {
	private Tamagotchi tama = new Tamagotchi("tama01", "GATTO");

	@Test
	public void verificaTipi() {
		assertEquals("tama01", tama.getNome());
		assertEquals("GATTO", tama.getSpecie().name());
		assertEquals(10, tama.getAltezza());
		assertEquals(100, tama.getPeso());
		assertEquals(3, tama.getEnergia());
	}

	@Test
	public void verificaMangia() {
		assertTrue(tama.mangia());
		assertEquals(11, tama.getAltezza());
		assertEquals(250, tama.getPeso());
		assertEquals(4, tama.getEnergia());
	}

	@Test
	public void testGiocaEnergiaZero() {
		tama.mangia();
		tama.mangia();
		tama.mangia();
		tama.gioca();
		tama.gioca();
		tama.gioca();
		tama.gioca();
		tama.gioca();
		assertEquals(1, tama.getEnergia());
		assertFalse(tama.gioca());
		assertEquals(1, tama.getEnergia());
	}

	@Test
	public void testGiocaPesoMinimo() {
		tama.mangia();
		tama.mangia();
		tama.mangia();
		tama.gioca();
		tama.gioca();
		tama.gioca();
		tama.gioca();
		tama.gioca();
		assertFalse(tama.gioca());
		assertTrue(tama.getPeso() > 0);
	}

	@Test
	public void sequesnzaOperazioni() {
		tama.mangia();
		tama.gioca();
		tama.dorme();
		assertEquals(4, tama.getEnergia());
		assertEquals(150, tama.getPeso());
	}
}