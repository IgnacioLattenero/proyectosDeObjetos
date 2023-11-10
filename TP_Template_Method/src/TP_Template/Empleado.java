package TP_Template;

public abstract class Empleado {

	public Empleado() {}
	
	public abstract double sueldo() ;
	public abstract double aportes() ;
	
	// El método Template es: sueldo() = 
	
 public final void sueldo() {
		 		return (this.sueldoBasico() + this.plusPorHijo() + this.pagoPorHora() - (this.sueldo() - this.sueldo() * 0.13));
		 }
		  
		 /**
		  * El Template se describe de esta manera en el codigo? 
		  * lo hice como entendí según en el ejemplo de la clase teorica del método extraer
		  * 
		  * 
		  * */ 
}






