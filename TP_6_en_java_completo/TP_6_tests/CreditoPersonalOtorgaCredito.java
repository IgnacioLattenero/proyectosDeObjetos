package TP_6_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TP_6.Cliente;
import TP_6.SolicitudesDeCreditoPersonal;

class CreditoPersonalOtorgaCredito {

	@Test
	void test() {
		Cliente cliente = new Cliente("lautaro", "martinez", "calle123", 27, 5000.0, 1000.0);
		SolicitudesDeCreditoPersonal credito2 = new SolicitudesDeCreditoPersonal(cliente, 2);
		assertEquals(true, credito2.esAceptable()); // YA INTENTE SOLUCIONARLO PERO NO PUDE HACERLO PASAR EN TRUE
	}

}
