package TP_Template;

public class Planta extends Empleado {
	
	private double sueldoBasico;
	private double plusPorHijo;
	
	public Planta(double sueldoBasico, double plusPorHijo) {
		this.sueldoBasico = sueldoBasico;
		this.plusPorHijo = plusPorHijo;
	}
	/** no escribo getters y setters, pero los utilizo igual, está bien hacer esto en el parcial?
	 igual pienso hacer los getters y setters que necesite, pero no me logro dar cuenta bien 
	 cuales preciso y cuales no, entonces termino haciendo todos los getters y setters, pero 
	me llevarían mucho tiempo en el examen */

	@Override
	public double sueldo() {
		return (this.getSueldoBasico() + this.getPlusPorHijo - this.aportes());
	}

	@Override
	public double aportes() {
		
		return this.sueldo() * 0.13;
	}

}
