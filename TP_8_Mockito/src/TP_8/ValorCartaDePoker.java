package TP_8;

import java.lang.constant.Constable;

public enum ValorCartaDePoker implements Constable, Comparable <ValorCartaDePoker>{
	A       (1),
	DOS     (2),
	TRES    (3),
	CUATRO  (4),
	CINCO   (5),
	SEIS    (6),
	SIETE   (7),
	OCHO    (8),
	NUEVE   (9),
	DIEZ    (10),
	J       (11),
	Q       (12),
	K       (13);
	
	private final int valorReal;
	
	private ValorCartaDePoker (int valorReal) {
		this.valorReal = valorReal;
	}
	
	public int getValorReal() {
		return this.valorReal;
	}
}
