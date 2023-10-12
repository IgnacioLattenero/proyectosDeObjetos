package TP_6_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TP_6.Cliente; // por qué la tuvo que importar????

class ClienteTest {

	@Test
	void sueldoMensualDelCliente() {
		
		Cliente cliente = new Cliente("nacho", "lattenero", "calle1", 24, 10000.0, 20000.0);
		
		assertEquals(10000.0, cliente.getSueldoNetoMensual());
	}

}
