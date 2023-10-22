package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class ActividadesDeLaComplejidadPedidaTest {

	LocalTime horaDeInicioActividad1 = LocalTime.of(16, 0);
	LocalTime horaDeInicioActividad2 = LocalTime.of(17, 0);
	LocalTime horaDeInicioActividad3 = LocalTime.of(18, 0);
	
	
	@Test
	void ActividadesComplejidadPedidaTest() {
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
		List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
		actividades.add(unaActividadSemanal);
		actividades.add(otraActividadSemanal);
		actividades.add(unaTercerActividadSemanal);
		
		List<ActividadSemanal> lasDeComplejidad2 = new ArrayList<ActividadSemanal>();
		lasDeComplejidad2.add(unaActividadSemanal);
		lasDeComplejidad2.add(otraActividadSemanal);
		
		ActividadSemanal actividadSemanal = new ActividadSemanal();
		
		assertEquals(lasDeComplejidad2, actividadSemanal.todasLasActividadesDeLaComplejidadPedida(2, actividades));
	}

}
