package TP_6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double sueldoNetoAnual;
	private double montoASolicitar;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, 
			double sueldoNetoMensual, double montoASolicitar) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.sueldoNetoAnual = sueldoNetoMensual * 12;
		this.montoASolicitar = montoASolicitar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
	    this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public double getSueldoNetoAnual() {
		return this.sueldoNetoAnual;
	}
	
	public double getMontoASolicitar() {
		return this.montoASolicitar = montoASolicitar;
	}
	
	public void setMontoASolicitar(double monto) {
		this.montoASolicitar = monto;
	}
	
}
