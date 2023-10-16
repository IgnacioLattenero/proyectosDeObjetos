package TP_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class LesionesDermatologicasRotativas {
	public static void main (String[] args) {
		List<LesionesDermatologicas> lesiones = Arrays.asList(LesionesDermatologicas.values()); 

		LesionesDermatologicas lesionInicial = LesionesDermatologicas.ROJO;

		Stream<LesionesDermatologicas> streamRotativo = Stream.iterate(lesionInicial, lesion -> {
			int indice = lesiones.indexOf(lesion);
			int siguienteIndice = (indice + 1) % lesiones.size();
			return lesiones.get(siguienteIndice);
			
		});
	}
	
}
