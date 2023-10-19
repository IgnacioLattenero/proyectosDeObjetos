package TP_7;

import java.time.*;
import java.util.List;

public class ActividadSemanal {

	private DiaDeLaSemana dia;
	private LocalTime horaDeInicio;
	private LocalTime duracion;
	private Deportes deportePracticado;
	/*
	 * para hacer una lista de ActividadSemanal, instancio varias de estas y la meto 
	 * en una lista en el junit test, pero utilizando Streams, algunas son recorridos, 
	 * ver ejemplo de cuadernillo y apuntes, 
	 * 
	 * */
	
	
	public ActividadSemanal(DiaDeLaSemana dia,
						    LocalTime horaDeInicio,
						    LocalTime duracion,
						    Deportes deportePracticado) {
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deportePracticado = deportePracticado;
		
	}
	
	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	public LocalTime getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(LocalTime horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}

	public Deportes getDeportePracticado() {
		return deportePracticado;
	}

	public void setDeportePracticado(Deportes deportePracticado) {
		this.deportePracticado = deportePracticado;
	}

	public List<ActividadSemanal> todasLasActividadesQueSonFutbol(List<ActividadSemanal> actividades)	 {
		return actividades.stream()
						  .filter(actividad -> Deportes.FUTBOL.equals(actividad.getDeportePracticado()))
						  .toList();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeLaComplejidadPedida(int complejidad, List<ActividadSemanal> actividades) {
		return actividades.stream()
						  .filter(actividad -> deportePracticado.getComplejidad()
						  == (actividad.getDeportePracticado().getComplejidad())).toList();
	}
	
	public int cantidadDeHorasTotalesQueOfreceElMunicipio(List<ActividadSemanal> actividades) {
		return (int) actividades.stream()
						  .mapToInt(actividad -> actividad.getDuracion().getHour())
						  .count();
	}
	
	public ActividadSemanal deporteDeMenorCostoEnLaSemana(Deportes deporte, List<ActividadSemanal> actividades) {
		return actividades.stream()
						  .filter(actividad -> deporte.)
	}

}






























