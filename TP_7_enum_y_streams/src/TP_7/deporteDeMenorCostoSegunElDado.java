package TP_7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TP_7.ActividadSemanal;
import TP_7.Deporte;
import TP_7.DiaDeLaSemana;
import tests.Municipio;	

class deporteDeMenorCostoSegunElDado {
	
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
																	1,
																	Deporte.FUTBOL
																    );
		otraActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	 horaDeInicioActividad2,
																	 30,
																	 Deporte.BASKET
			    													 );
		unaTercerActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	      horaDeInicioActividad3,
																		  40,
																		  Deporte.TENNIS
			    														  );
		municipio = new Municipio();
		municipio.agregarActividad(unaActividadSemanal);
		municipio.agregarActividad(otraActividadSemanal);
		municipio.agregarActividad(unaTercerActividadSemanal);
		
	}

	@Test
	void DeporteMenorCostoTest() {
		
		assertEquals(unaActividadSemanal, municipio.deporteDeMenorCostoSegunElDado(Deporte.FUTBOL));
	}
			/*
			 * unaActividadSemanal es lo esperado
			 * claro eso es lo que me confunde, pero bueno, lo hice de esa manera, 
			 *lo que pasa es que como la clase ActividadSemanal no tiene una lista de deportes 
			 *como atributo, como que tengo que entrar a una instancia de ActividadSemanal,
			 *no, no la defini al municipio, claro entiendo. 
			 *El municipio, me falta esa clase que este por ensima de todo, jajaj, si, es 
			 *insconsistencia, bueno, el municipio tiene la lista de ActividadesSemanales, 
			 *y es el que va  a ejecutar estos mensajes, de alguna manera tengo que lograr
			 *que los ejecute, okay, entonces municipio es una clase relacionada, entiendo.
			 *bueno, el profe me lo isinuó que lo haga el jueves, pero como no lo entendí, 
			 *dijo que siga y haga todo junto ahi jajja. claro nunca me cayo la ficha jajaja.
			 *ya esta solucionado
			 * 
			 * 
			 * */
}
