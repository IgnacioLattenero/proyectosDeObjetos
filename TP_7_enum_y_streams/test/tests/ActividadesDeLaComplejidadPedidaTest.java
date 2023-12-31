package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TP_7.ActividadSemanal;
import TP_7.Deporte;
import TP_7.DiaDeLaSemana;	

class ActividadesDeLaComplejidadPedidaTest {

	LocalTime horaDeInicioActividad1 = LocalTime.of(16, 0);
	LocalTime horaDeInicioActividad2 = LocalTime.of(17, 0);
	LocalTime horaDeInicioActividad3 = LocalTime.of(18, 0);
	DiaDeLaSemana diaDeLaClase = DiaDeLaSemana.VIERNES; 
	
	ActividadSemanal unaActividadSemanal;
	ActividadSemanal otraActividadSemanal;
	ActividadSemanal unaTercerActividadSemanal;
	
	List<ActividadSemanal> actividades;
	List<ActividadSemanal> lasDeComplejidad2;
	Municipio municipio;
	
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		unaActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	horaDeInicioActividad1,
																	2,
																	Deporte.FUTBOL
																    );
		otraActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	 horaDeInicioActividad2,
																	 2,
																	 Deporte.FUTBOL
			    													 );
		unaTercerActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	      horaDeInicioActividad3,
																		  3,
																		  Deporte.TENNIS
			    														  );
		
		municipio = new Municipio();
		municipio.agregarActividad(unaActividadSemanal);
		municipio.agregarActividad(otraActividadSemanal);
		//municipio.agregarActividad(unaTercerActividadSemanal);
		
		/**
		 * aca se crea la lista a comparar con el resultado esperado*/
		
		lasDeComplejidad2 = new ArrayList<ActividadSemanal>();
		lasDeComplejidad2.add(unaActividadSemanal);
		lasDeComplejidad2.add(otraActividadSemanal); 
		
	}
	
	@Test
	void ActividadesComplejidadPedidaTest() {
		
		assertEquals(lasDeComplejidad2, municipio.todasLasActividadesDeLaComplejidadPedida(2));
	}
			/*
			 * esto compara una lista de 2 elementos con complejidad 2
			 * con un elemento solo, pero de complejidad 2, no?
			 * entonces el resultado es [FUTBOL,FUTBOL] == [FUTBOL] si te escucho
			 * dejame chekear mi internet jajaja
			 * 
			 * */
}






