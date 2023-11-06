package TP_8_test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import TP_8.GuerreroDelAzar;
import TP_8.IGuerrero;
import TP_8.IMoneda;


public class GuerreroDelAzarTestCase {
	
	private GuerreroDelAzar guerreroAzar;
	private IGuerrero otroGuerrero ;
	private IMoneda unaMoneda;
	
	@BeforeEach
	public void setUp(){
		// setUp
		otroGuerrero = mock(IGuerrero.class);
		unaMoneda = mock(IMoneda.class);
		
		//Test Double Instalation
		guerreroAzar = new GuerreroDelAzar(1000, 500, unaMoneda);
		
	}

	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCaraDescuentanPuntosDeVidaDelAdversario() {
		
		//Test Double Configuration
		when(unaMoneda.esCara()).thenReturn(true);
		
		//Exercise
		guerreroAzar.atacar(otroGuerrero);
		
		//Verify
		verify(otroGuerrero, times(1)).descontarVida(500);
	}	
	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCruzDescuentanPuntosDeVidaDeSiMismo(){
		
		//Test Double Configuration
		when(unaMoneda.esCara()).thenReturn(false);
		
		//Exercise
		guerreroAzar.atacar(otroGuerrero);
		
		//Verify
		// verifyZeroInteractions(mock) no me lo toma, tira error y dice que no existe en mockito
		verifyNoMoreInteractions(otroGuerrero);
		verify(otroGuerrero, times(0)).descontarVida(500);
		verify(otroGuerrero, never()).descontarVida(500);
	}
		
}
