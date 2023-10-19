package TP_7;

import java.time.*;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.*;

public class ActividadSemanal {

	private DiaDeLaSemana dia;
	private LocalTime horaDeInicio;
	private double duracion; // tipo int, o double, mas facil para trabajarlo
	private Deporte deportePracticado; // nombres de enums en sigular
	/*
	 * para hacer una lista de ActividadSemanal, instancio varias de estas y la meto 
	 * en una lista en el junit test, pero utilizando Streams, algunas son recorridos, 
	 * ver ejemplo de cuadernillo y apuntes, 
	 * 
	 * */
	
	
	public ActividadSemanal(DiaDeLaSemana dia,
						    LocalTime horaDeInicio,
						    double duracion,
						    Deporte deportePracticado) {
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deportePracticado = deportePracticado;
		
	}
	
	public ActividadSemanal() {
		// TODO Auto-generated constructor stub
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

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeportePracticado() {
		return deportePracticado;
	}

	public void setDeportePracticado(Deporte deportePracticado) {
		this.deportePracticado = deportePracticado;
	}

	public List<ActividadSemanal> todasLasActividadesQueSonFutbol(List<ActividadSemanal> actividades)	 {
		return actividades.stream()
						  .filter(actividad -> Deporte.FUTBOL.equals(actividad.getDeportePracticado()))
						  .toList();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeLaComplejidadPedida(int complejidad, List<ActividadSemanal> actividades) {
		return actividades.stream()
						  .filter(actividad -> deportePracticado.getComplejidad()
						  == (actividad.getDeportePracticado().getComplejidad())).toList();
	}
	
	public double cantidadDeHorasTotalesQueOfreceElMunicipio(List<ActividadSemanal> actividades) {
		return actividades.stream()
						  .mapToDouble(actividad -> actividad.getDuracion())
						  .count();
	}
	
	public double calcularPrecio() {
		// hash table, map  usar map acá, hashMap buscar hago un diccionario, entro con el
		// dia de la semana y salgo con el valor de horas, hash set y es lo mismo
		// dictionary:	key -> value
		
		Map<DiaDeLaSemana, Integer> rutinaSemanal = new HashMap<>();
		
		rutinaSemanal.put(DiaDeLaSemana.LUNES, 500);
		rutinaSemanal.put(DiaDeLaSemana.MARTES, 500);
		rutinaSemanal.put(DiaDeLaSemana.MIERCOLES, 500);
		rutinaSemanal.put(DiaDeLaSemana.JUEVES, 1000);
		rutinaSemanal.put(DiaDeLaSemana.VIERNES, 1000);
		rutinaSemanal.put(DiaDeLaSemana.SABADO, 1000);
		rutinaSemanal.put(DiaDeLaSemana.DOMINGO, 1000);
		
		int costoDelDia = rutinaSemanal.get(getDia());
		
		int costoPorComplejidad = getDeportePracticado().getComplejidad() * 200;
		
		double costoTotal = (getDuracion() * (costoDelDia + costoPorComplejidad));
		
		return costoTotal;
									   
	}
	
	public ActividadSemanal deporteDeMenorCostoSegunElDado(Deporte deporte, List<ActividadSemanal> actividades) { 
	return actividades.stream()
					  .filter(actividad -> actividad.getDeportePracticado() == deporte)
					  .min(Comparator.comparing(ActividadSemanal::calcularPrecio))
					  .orElse(new ActividadSemanal());
					  //.min(Comparator.comparing(actividad:: deporte.calcularPrecio())));
}
	
	
	
	
	
	
	
	
	/*List <DiaDeLaSemana> primeraMitadDeSemana = dias.stream()
	   .dropWhile(dia -> dias.indexOf(dia) > 2)
	   .toList();
List <DiaDeLaSemana> segundaMitadDeSemana = dias.stream()
						 .dropWhile(dia -> dias.indexOf(dia) < 2)
						 .toList();
precioPrimeraMitad = */

}






























