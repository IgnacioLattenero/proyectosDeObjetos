package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import TP_7.ActividadSemanal;
import TP_7.Deporte;
import TP_7.DiaDeLaSemana;

class ActividadesQueSonFutbolTest {

	
	LocalTime horaDeInicioActividad1 = LocalTime.of(16, 0);
	LocalTime horaDeInicioActividad2 = LocalTime.of(17, 0);
	LocalTime horaDeInicioActividad3 = LocalTime.of(18, 0);
	DiaDeLaSemana diaDeLaClase = DiaDeLaSemana.VIERNES; 
	
	ActividadSemanal unaActividadSemanal;
	ActividadSemanal otraActividadSemanal;
	ActividadSemanal unaTercerActividadSemanal;
	
	List<ActividadSemanal> actividades;
	List<ActividadSemanal> lasQueSonFutbol;
	Municipio municipio;

	@Test
	void test() {
		DiaDeLaSemana diaDeLaClase = DiaDeLaSemana.VIERNES; 
		
		ActividadSemanal unaActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	horaDeInicioActividad1,
																	2,
																	Deporte.FUTBOL
																    );
		ActividadSemanal otraActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	 horaDeInicioActividad2,
																	 2,
																	 Deporte.FUTBOL
			    													 );
		ActividadSemanal unaTercerActividadSemanal = new ActividadSemanal(diaDeLaClase,
																	      horaDeInicioActividad3,
																		  2,
																		  Deporte.TENNIS
			    														  );
		
		municipio = new Municipio();
		municipio.agregarActividad(unaActividadSemanal);
		municipio.agregarActividad(otraActividadSemanal);
		municipio.agregarActividad(unaTercerActividadSemanal);
		
		lasQueSonFutbol = new ArrayList<ActividadSemanal>();
		lasQueSonFutbol.add(unaActividadSemanal);
		lasQueSonFutbol.add(otraActividadSemanal);
		
		assertEquals(lasQueSonFutbol, municipio.todasLasActividadesQueSonFutbol());
		
	}

}
