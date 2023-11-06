package TP_8_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import TP_8.PokerStatus;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import TP_8.Carta;
import TP_8.ValorCartaDePoker;
import TP_8.PaloCartaDePoker;

class VerificarPokerStatusTest {
	/**
	 * Se asume que la codificación recibida de una carta es correcta, 
	 * y que una carta siempre va a tener un texto que represente a una de un mazo.
	 * */
	
	private Carta primeraCarta;
	private Carta segundaCarta;
	private Carta terceraCarta;
	private Carta cuartaCarta;
	private Carta quintaCarta;
	private PokerStatus unaMano;
	private PokerStatus otraMano;
	
	@BeforeEach
	
	public void setUp() {
		// acá van mis variables en donde inicializo mis objetos mock.
		this.primeraCarta = mock(Carta.class);
		this.segundaCarta = mock(Carta.class);
		this.terceraCarta = mock(Carta.class);
		this.cuartaCarta  = mock(Carta.class);
		this.quintaCarta  = mock(Carta.class);
		
		// este es el SUT: unaMano de poker.
		
			this.unaMano = new PokerStatus(primeraCarta, segundaCarta, terceraCarta,
											   cuartaCarta, quintaCarta); 
				// este es el DOC: otraMano de poker.
				
			this.otraMano = new PokerStatus(primeraCarta, segundaCarta, terceraCarta,
											   cuartaCarta, quintaCarta);
		
			
	}
	
	@Test
	void testVerificarQueUnaManoDePokerTengaUnJuegoDePoker() {
		// primero asigno valores a las variables:
		
		this.primeraCarta = new Carta(ValorCartaDePoker.A, PaloCartaDePoker.DIAMANTES);
		this.segundaCarta = new Carta(ValorCartaDePoker.A, PaloCartaDePoker.TRÉBOLES);
		this.terceraCarta = new Carta(ValorCartaDePoker.A, PaloCartaDePoker.PICAS);
		this.cuartaCarta  = new Carta(ValorCartaDePoker.A, PaloCartaDePoker.CORAZONES);
		this.quintaCarta  = new Carta(ValorCartaDePoker.OCHO, PaloCartaDePoker.DIAMANTES);
		
		// VERIFY:
		
		assertTrue(this.unaMano.verificar(primeraCarta, segundaCarta, terceraCarta,
							   cuartaCarta, quintaCarta));
	}
	
	@Test
	void testVerificarQueHayaColorEnLaManoDePoker() {
		// primero asigno valores a las variables:
		
			this.primeraCarta = new Carta(ValorCartaDePoker.A, PaloCartaDePoker.DIAMANTES);
			this.segundaCarta = new Carta(ValorCartaDePoker.TRES, PaloCartaDePoker.DIAMANTES);
			this.terceraCarta = new Carta(ValorCartaDePoker.CINCO, PaloCartaDePoker.DIAMANTES);
			this.cuartaCarta  = new Carta(ValorCartaDePoker.SIETE, PaloCartaDePoker.DIAMANTES);
			this.quintaCarta  = new Carta(ValorCartaDePoker.NUEVE, PaloCartaDePoker.DIAMANTES);
			
		/**
		 * verify: verificar que las 5 cartas sean del mismo color y palo, pero que no esten en escalera
		 * */ 
				
			assertTrue(this.unaMano.verificar(primeraCarta, segundaCarta, terceraCarta,
									   cuartaCarta, quintaCarta));
	}
	
	@Test
	void testVerificarQueHayaTrioEnLaManoDePoker() {
		// primero asigno valores a las variables:
		
			this.primeraCarta = new Carta(ValorCartaDePoker.K, PaloCartaDePoker.DIAMANTES);
			this.segundaCarta = new Carta(ValorCartaDePoker.K, PaloCartaDePoker.TRÉBOLES);
			this.terceraCarta = new Carta(ValorCartaDePoker.K, PaloCartaDePoker.CORAZONES);
			this.cuartaCarta  = new Carta(ValorCartaDePoker.SIETE, PaloCartaDePoker.DIAMANTES);
			this.quintaCarta  = new Carta(ValorCartaDePoker.NUEVE, PaloCartaDePoker.PICAS);
			
		/**
		 *  verify: verificar que 3 cartas de la mano sean del mismo valor pero de distinto palo, 
		 *  las otras 2 restantes no se tienen en cuenta
		 */
				
			assertTrue(this.unaMano.verificar(primeraCarta, segundaCarta, terceraCarta,
									   cuartaCarta, quintaCarta));
	}
	
	@Test
	void test() {
		
		// Exercise: 
		
		PokerStatus jugadaGanadora = this.unaMano.verificarManoGanadora(unaMano, otraMano);
		
		// Verify:
		
		verify(jugadaGanadora == unaMano);
	}
}
