package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

import org.junit.jupiter.api.Test;

import TP_7.ActividadSemanal;
import TP_7.Deporte;
import TP_7.DiaDeLaSemana;

class ActividadCalcularPrecioTest {

	@Test
	void Actividadtest() {
		
		LocalTime horaDeInicio = LocalTime.of(16, 0);
		DiaDeLaSemana diaDeLaClase = DiaDeLaSemana.VIERNES; 
		
		ActividadSemanal unaActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	horaDeInicio,
																	2,
																	Deporte.TENNIS
																    );
		
		assertEquals(3200, unaActividadSemanal.calcularPrecio());
	}

}
