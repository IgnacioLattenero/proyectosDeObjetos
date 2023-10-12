package TP_6_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TP_6.Cliente;
import TP_6.SolicitudesDeCreditoHipotecario;

class CreditoHipotecarioSeAceptaORechaza {

	@Test
	void test() {
		Cliente cliente = new Cliente("lautaro", "martinez", "calle123", 27, 50000.0, 100.0);
		SolicitudesDeCreditoHipotecario solicitud1 = new SolicitudesDeCreditoHipotecario(cliente, 12, "auto", "4x4", 200.0);
		assertEquals(100.0, solicitud1.otorgarCredito());
	}

}
