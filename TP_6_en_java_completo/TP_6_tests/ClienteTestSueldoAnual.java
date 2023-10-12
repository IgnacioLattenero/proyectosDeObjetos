package TP_6_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TP_6.Cliente;

class ClienteTestSueldoAnual {

	@Test
	void sueldoAnualTest() {
		Cliente cliente = new Cliente("lio", "messi", "calle123", 24, 5000.0, 3000.0);
		
		assertEquals(60000.0, (cliente.getSueldoNetoAnual()));
	}

}
