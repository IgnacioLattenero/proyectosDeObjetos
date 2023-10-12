package TP_6;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	
	private String nombre;
	private String direccion;
	private List<Cliente> clientes;
	private List<Solicitable> solicitables;
	private double montoTotalADesembolsar;
	
	public Banco(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.clientes = new ArrayList<Cliente>();
		this.solicitables = new ArrayList<Solicitable>();
		this.montoTotalADesembolsar = 0.0;
		
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void setClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public List<Solicitable> getSolicitables() {
		return this.solicitables;
	}
	
	public void setSolicitables(Solicitable solicitable) {
		this.solicitables.add(solicitable);
	}
	
	public double montoTotalADesembolsar() {
		
		List<Solicitable> solicitablesASumar = this.getSolicitables();
		double montoTotalActual = 0.0;
		for (Solicitable i: solicitablesASumar) {
			montoTotalActual += i.otorgarCredito();
		}
		return montoTotalActual;
			
	}
	
	public double getMontoTotalADesembolsar() {
		return this.montoTotalADesembolsar;
	}
	
	

}
