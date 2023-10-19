package TP_7;

import java.util.List;

public enum Deportes {
	RUNNING(1),
	FUTBOL(2),
	BASKET(2),
	TENNIS(3),
	JABALINA(4);
	
	private final int complejidad;
	
	private Deportes(int complejidad) {
		this.complejidad = complejidad;
	}
	
	public int getComplejidad() {
		return this.complejidad;
	}
	
	public double calcularPrecio(List<DiaDeLaSemana> dias, List<Deportes> deportes) {
		 List <DiaDeLaSemana> primeraMitadDeSemana = dias.stream()
									   .dropWhile(dia -> dias.indexOf(dia) > 2)
									   .toList();
		 List <DiaDeLaSemana> segundaMitadDeSemana = dias.stream()
				 										 .dropWhile(dia -> dias.indexOf(dia) < 2)
				 										 .toList();
		 precioPrimeraMitad = 
									   
	}
	
}
