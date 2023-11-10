package TP_Template;

public class Temporario extends Empleado {
	private double sueldoBasico;
	private double plusPorFamilia;
	private int horasTrabajadas;
	
	public Temporario (double sueldoBasico, double plusPorFamilia, int horasTrabajadas) {
		this.sueldoBasico = sueldoBasico;
		this.plusPorFamilia = plusPorFamilia;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public double getPlusPorFamilia() {
		return plusPorFamilia;
	}

	public void setPlusPorFamilia(double plusPorFamilia) {
		this.plusPorFamilia = plusPorFamilia;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double pagoPorHora() {
		return this.getHorasTrabajadas() * 5.0;
	}

	@Override
	public double sueldo() {
		return (this.getSueldoBasico() + this.pagoPorHora() + this.getPlusPorFamilia() - this.aportes());
	}

	@Override
	public double aportes() {
		
		return (this.sueldo() * 0.13);
	}

}
