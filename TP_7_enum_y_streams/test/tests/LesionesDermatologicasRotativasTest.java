package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TP_7.LesionesDermatologicas;
import TP_7.LesionesDermatologicasRotativas;

class LesionesDermatologicasRotativasTest {

	@Test
	void test() {
		
		LesionesDermatologicasRotativas lesiones = new LesionesDermatologicasRotativas();
		
		LesionesDermatologicas siguienteDeMiel = lesiones.obtenerSiguiente(LesionesDermatologicas.MIEL);
		
		assertEquals(LesionesDermatologicas.ROJO, siguienteDeMiel);
	}

}
