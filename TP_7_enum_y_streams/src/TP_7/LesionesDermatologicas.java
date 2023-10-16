package TP_7;


public enum LesionesDermatologicas {
	ROJO("grave", 4),
	GRIS("medio", 3),
	AMARILLO("leve", 2),
	MIEL("curado", 1);
	
	private final String descripcion;
	private final int nivelDeRiesgo;
	
	private LesionesDermatologicas(String descripcion, int nivelDeRiesgo) {
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiesgo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}
 	
	
			
	
}

