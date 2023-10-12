package TP_6_tests;

import static org.junit.jupiter.api.Assertions.*;

import TP_6.SolicitudesDeCreditoHipotecario;
import TP_6.Cliente;

import org.junit.jupiter.api.Test;


class CreditoHipotecarioCuotaMensual {

	@Test
	void cuotaMensualTest() {
		Cliente cliente = new Cliente("lautaro", "martinez", "calle123", 27, 100.0, 60000.0);
		SolicitudesDeCreditoHipotecario solicitud1 = new SolicitudesDeCreditoHipotecario(cliente, 12, "auto", "4x4", 100.0);
		assertEquals(5000.0, solicitud1.getMontoCuotaMensual());
	}

}
