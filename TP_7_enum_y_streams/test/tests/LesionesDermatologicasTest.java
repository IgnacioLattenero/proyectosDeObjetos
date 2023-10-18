package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TP_7.LesionesDermatologicas;

class LesionesDermatologicasTest {

	@Test
	void lesionesTest() {
		LesionesDermatologicas unaLesion = LesionesDermatologicas.ROJO;
		assertEquals(4, unaLesion.getNivelDeRiesgo());
		assertEquals("grave", unaLesion.getDescripcion());
	}

}
