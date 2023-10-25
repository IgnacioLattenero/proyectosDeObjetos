package tests;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;

import TP_7.ActividadSemanal;
import TP_7.Deporte;


public class Municipio {

	private List<ActividadSemanal> actividadesSemanales = new ArrayList<ActividadSemanal>();
	
	public void agregarActividad(ActividadSemanal actividad) {
		actividadesSemanales.add(actividad);
	}
	
	public List<ActividadSemanal> getActividadesSemanales() {
		return this.actividadesSemanales;
	}
	
	public List<ActividadSemanal> todasLasActividadesQueSonFutbol()	 {
		return actividadesSemanales.stream()
						  .filter(actividad -> Deporte.FUTBOL.equals(actividad.getDeportePracticado()))
						  .toList();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeLaComplejidadPedida(int complejidad) {
		return actividadesSemanales.stream()
						  .filter(actividad -> actividad.getDeportePracticado().getComplejidad()
						  == (actividad.getDeportePracticado().getComplejidad())).toList();
	}
	
	public double cantidadDeHorasTotalesQueOfreceElMunicipio() {
		return actividadesSemanales.stream()
						  .mapToDouble(actividad -> actividad.getDuracion())
						  .count();
	}
	
	
	public ActividadSemanal deporteDeMenorCostoSegunElDado(Deporte deporte) { 
		return actividadesSemanales.stream()
						  .filter(actividad -> actividad.getDeportePracticado() == deporte) 
						  .min(Comparator.comparing(ActividadSemanal::calcularPrecio))
						  .orElse(new ActividadSemanal());
		// la linea 117, el parentesis tambien se puede escribir como: CHEKEAR en test
		// actividad -> actividad.calcularPrecio()
	}
		
		public Map<Deporte, ActividadSemanal> actividadSemanalMasEconomica() {
			Map<Deporte, ActividadSemanal> actividadMasEconomicaPorDeporte = 
					actividadesSemanales.stream()
						   .collect(Collectors
						   .groupingBy(ActividadSemanal::getDeportePracticado, Collectors
						   .collectingAndThen(Collectors
						   .minBy(Comparator
						   .comparing(ActividadSemanal::calcularPrecio)),
							optional -> optional.orElse(null))));
							  
			return actividadMasEconomicaPorDeporte;
			
		}
		
		public void imprimirTodasLasActividadesDelMunicipio() {
			System.out.println(actividadesSemanales.toString());					 
		}
	

}
