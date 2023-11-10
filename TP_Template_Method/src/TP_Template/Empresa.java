package TP_Template;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private double pagoDeSueldos;
	private List<Empleado> empleados;

	public Empresa(Empleado empleados) {
		this.empleados = new ArrayList<Empleado>();
	}
	
	// hago solamente los getters y setters necesarios

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public double pagoDeSueldos() {
		return this.getEmpleados().stream()
								  .forEach(Empleado::sueldo)
								  .sum();
				
	}
	
	
	

}
