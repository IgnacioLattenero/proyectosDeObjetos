package TP_8;

public class Carta {
	
	private ValorCartaDePoker valor;
	private PaloCartaDePoker palo;
	
	public Carta(ValorCartaDePoker valor, PaloCartaDePoker palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public ValorCartaDePoker getValor() {
		return this.valor;
	}
	
	public void setValor(ValorCartaDePoker valor) {
		this.valor = valor;
	}
	
	public PaloCartaDePoker getPalo() {
		return this.palo;
	}
	
	public void setPalo(PaloCartaDePoker palo) {
		this.palo = palo;
	}
 
}
