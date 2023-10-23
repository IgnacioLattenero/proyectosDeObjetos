package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import TP_7.ActividadSemanal;
import TP_7.Deporte;
import TP_7.DiaDeLaSemana;

class actividadSemanalMasEconomicaTest {
	
	LocalTime horaDeInicioActividad1 = LocalTime.of(16, 0);
	LocalTime horaDeInicioActividad2 = LocalTime.of(17, 0);
	LocalTime horaDeInicioActividad3 = LocalTime.of(18, 0);
	DiaDeLaSemana diaDeLaClase = DiaDeLaSemana.VIERNES; 
	
	ActividadSemanal futbolBarato;
	ActividadSemanal futbolCaro;
	ActividadSemanal basketBarato;
	ActividadSemanal basketCaro;
	ActividadSemanal tennisBarato;
	ActividadSemanal tennisCaro;
	
	List<ActividadSemanal> actividades;
	List<ActividadSemanal> lasDeComplejidad2;
	Municipio municipio;
	
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		futbolBarato = new ActividadSemanal(diaDeLaClase,
																	horaDeInicioActividad1,
																	1,
																	Deporte.FUTBOL
																    );
		futbolCaro = new ActividadSemanal(diaDeLaClase,
											horaDeInicioActividad1,
											1000,
											Deporte.FUTBOL
			    							);
		
		basketBarato = new ActividadSemanal(diaDeLaClase,
																	 horaDeInicioActividad2,
																	 2,
																	 Deporte.BASKET
			    													 );
		basketCaro = new ActividadSemanal(diaDeLaClase,
				 							horaDeInicioActividad2,
				 							200,
				 							Deporte.BASKET
				 							);
		
		tennisBarato = new ActividadSemanal(diaDeLaClase,
																	      horaDeInicioActividad3,
																		  3,
																		  Deporte.TENNIS
			    														  );
		tennisCaro = new ActividadSemanal(diaDeLaClase,
			      							horaDeInicioActividad3,
			      							100,
			      							Deporte.TENNIS
				  							);
		municipio = new Municipio();
		municipio.agregarActividad(futbolBarato);
		municipio.agregarActividad(futbolCaro);
		municipio.agregarActividad(basketBarato);
		municipio.agregarActividad(basketCaro);
		municipio.agregarActividad(tennisBarato);
		municipio.agregarActividad(tennisCaro);
	}
	

	@Test
	void ActividadMasEconomicaTest() {
		
		Map<Deporte, ActividadSemanal> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(Deporte.FUTBOL, futbolBarato);
		resultadoEsperado.put(Deporte.BASKET, basketBarato);
		resultadoEsperado.put(Deporte.TENNIS, tennisBarato);
		
		assertEquals(resultadoEsperado, municipio.actividadSemanalMasEconomica());
	}

}
