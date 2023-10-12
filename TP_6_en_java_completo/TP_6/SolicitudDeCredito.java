package TP_6;

public abstract class SolicitudDeCredito implements Solicitable {
	
	private Cliente clienteSolicitante;
	private int duracion;
	private double montoCuotaMensual;
	private boolean esAceptable;
	private Solicitable otorgarCredito;
	

	public SolicitudDeCredito(Cliente clienteSolicitante, int duracion) {
		this.clienteSolicitante = clienteSolicitante;
		this.duracion = duracion;
	}
	
	/*public enum Mes {
		ENERO,
		FEBRERO,
		MARZO,
		ABRIL,
		MAYO,
		JUNIO,
		JULIO,
		AGOSTO,
		SEPTIEMBRE,
		OCTUBRE,
		NOVIEMBRE,
		DICIEMBRE	buscar como hacer que el enum me de el numero de mes que le pido
	}*/
	
	public Cliente getCliente() {
		return this.clienteSolicitante;
	}
	
	public void setCliente(Cliente cliente) {
		this.clienteSolicitante = cliente;
	}
	
	public int getDuracion() {
		return this.duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public double montoCuotaMensual() {
			/**
			 * El clienteSolicitante paga al menos una cuota por mes del credito personal
			 * solicitado.
			 */
			double montoDeLaCuotaMensual = ((this.getCliente().getMontoASolicitar()) / this.getDuracion());
			return montoDeLaCuotaMensual;
		}
	
	public double getMontoCuotaMensual() {
		return this.montoCuotaMensual();
	}
	
	public abstract boolean esAceptable();

}
