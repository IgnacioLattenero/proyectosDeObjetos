package TP_7;

import java.util.Arrays;
import java.util.List;

public class LesionesDermatologicasRotativas {
	public LesionesDermatologicas obtenerSiguiente(LesionesDermatologicas lesionActual)  {
		
		List<LesionesDermatologicas> lesiones = Arrays.asList(LesionesDermatologicas.values()); 

			int indice = lesiones.indexOf(lesionActual);
			int siguienteIndice = (indice + 1) % lesiones.size();
			return lesiones.get(siguienteIndice);
	}
	
}
