package TP_Template;

public class Pasante extends Empleado {
	
	private int horasTrabajadas;
	
	public Pasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double sueldo() {
		return ((this.getHorasTrabajadas() * 40.0) - this.aportes());
	}

	@Override
	public double aportes() {
		return this.sueldo() * 0.13;
	}

}
