package TP_8;

public class PokerStatus {
	private Carta primeraCarta;
	private Carta segundaCarta;
	private Carta terceraCarta;
	private Carta cuartaCarta;
	private Carta quintaCarta;

	public PokerStatus(Carta primeraCarta, Carta segundaCarta, 
					   Carta terceraCarta, Carta cuartaCarta, Carta quintaCarta) {
		this.primeraCarta = primeraCarta;
		this.segundaCarta = segundaCarta;
		this.terceraCarta = terceraCarta;
		this.cuartaCarta  = cuartaCarta;
		this.quintaCarta  = quintaCarta;
	}
	
	public Carta getPrimeraCarta() {
		return this.primeraCarta;
	}
	
	public void setPrimeraCarta(Carta primeraCarta) {
		this.primeraCarta = primeraCarta;
	}
	
	public Carta getSegundaCarta() {
		return this.segundaCarta;
	}
	
	public void setSegundaCarta(Carta segundaCarta) {
		this.segundaCarta = segundaCarta;
	}
	
	public Carta getTerceraCarta() {
		return this.terceraCarta;
	}
	
	public void setTerceraCarta(Carta terceraCarta) {
		this.terceraCarta = terceraCarta;
	}
	
	public Carta getCuartaCarta() {
		return this.cuartaCarta;
	}
	
	public void setCuartaCarta(Carta cuartaCarta) {
		this.cuartaCarta = cuartaCarta;
	}
	
	public Carta getQuintaCarta() {
		return this.quintaCarta;
	}
	
	public void setQuintaCarta(Carta quintaCarta) {
		this.quintaCarta = quintaCarta;
	}

	public PokerStatus verificarManoGanadora(PokerStatus unaMano, PokerStatus otraMano) {
		
		if(todasLasCartasDeUnaManoSonSuperioresALaOtraMano(unaMano, otraMano)) {
			return unaMano;
		} else {
			return otraMano;
		}
	}
	
	
	
	public boolean verificar(Carta primeraCarta, Carta segundaCarta, Carta terceraCarta, 
						     Carta cuartaCarta, Carta quintaCarta) {
		
		if(hayColorDePoker(primeraCarta, segundaCarta, terceraCarta, 
						   cuartaCarta, quintaCarta)) {
			
			return (true);
			
		} else if (hayTrioDePoker(primeraCarta, segundaCarta, terceraCarta, 
				   cuartaCarta, quintaCarta)) {
			
			return (true);
			
		} else if (hayJuegoDePoker(primeraCarta, segundaCarta, terceraCarta, 
						   cuartaCarta, quintaCarta)) {
			
			return (true);
		} 
			return (false);
		
		
		}
	// este booleano lo resolvio chat gpt LPM, pero lo expandi yo con sus subtareas -.-
		
		public boolean hayJuegoDePoker(Carta primeraCarta, Carta segundaCarta, Carta terceraCarta, 
				   	   Carta cuartaCarta, Carta quintaCarta) {
			return ((primeraCarta == segundaCarta    && 
		    		segundaCarta == terceraCarta     && 
		    		terceraCarta == cuartaCarta      && 
		    		cuartaCarta == quintaCarta)      ||
		           (primeraCarta == cuartaCarta)     && 
		            cuartaCarta == quintaCarta);
		}
		
		public boolean hayColorDePoker(Carta primeraCarta, Carta segundaCarta, Carta terceraCarta, 
			   	   					   Carta cuartaCarta, Carta quintaCarta) {
			
			return (primeraCarta.getPalo() == segundaCarta.getPalo() && 
					terceraCarta.getPalo() == cuartaCarta.getPalo()  &&
					quintaCarta.getPalo() == primeraCarta.getPalo());
			
		}
		
		public boolean hayTrioDePoker(Carta primeraCarta, Carta segundaCarta, Carta terceraCarta, 
					   				  Carta cuartaCarta, Carta quintaCarta) {
			return (primeraCarta.getValor() == 
					 segundaCarta.getValor() &&
					 (terceraCarta.getValor() ==
					 primeraCarta.getValor()));
		}
		
		public boolean valorDeUnaCartaEsSuperiorAOtra(Carta unaCarta, Carta otraCarta) {
			 
			return unaCarta.getValor().getValorReal() > otraCarta.getValor().getValorReal();	
	}
	
	public boolean todasLasCartasDeUnaManoSonSuperioresALaOtraMano(PokerStatus unaMano, PokerStatus otraMano) {
		return (valorDeUnaCartaEsSuperiorAOtra(unaMano.getPrimeraCarta(), otraMano.getPrimeraCarta()) &&
				valorDeUnaCartaEsSuperiorAOtra(unaMano.getSegundaCarta(), otraMano.getSegundaCarta()) &&   
				valorDeUnaCartaEsSuperiorAOtra(unaMano.getTerceraCarta(), otraMano.getTerceraCarta()) &&
				valorDeUnaCartaEsSuperiorAOtra(unaMano.getCuartaCarta(), otraMano.getCuartaCarta())   &&
				valorDeUnaCartaEsSuperiorAOtra(unaMano.getQuintaCarta(), otraMano.getQuintaCarta()));
	}
}
	
	













