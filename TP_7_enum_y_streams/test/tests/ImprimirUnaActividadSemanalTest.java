package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import TP_7.ActividadSemanal;
import TP_7.Deporte;
import TP_7.DiaDeLaSemana;

class ImprimirUnaActividadSemanalTest {

	LocalTime horaDeInicioActividad1 = LocalTime.of(16, 0);
	
	DiaDeLaSemana diaDeLaClase = DiaDeLaSemana.VIERNES; 
	
	ActividadSemanal actividadFutbol;
	
	@BeforeEach
	public void setUp() throws Exception {
		actividadFutbol = new ActividadSemanal(diaDeLaClase,
								horaDeInicioActividad1,
								1,
								Deporte.FUTBOL
			    			);
	}
	
	@Test
	void testToString() {
		
		assertEquals("Deporte: FUTBOL. Dia: VIERNES. A Las: 16:00.  this.getHoraDeInicio()  Duración: 1. hora(s)",
					 actividadFutbol.toString());
	}

}
