package TP_6;

public class SolicitudesDeCreditoPersonal extends SolicitudDeCredito {
	
	public SolicitudesDeCreditoPersonal(Cliente clienteSolicitante, int duracion) {
		super(clienteSolicitante, duracion);
	}

	@Override
	public double otorgarCredito() {
		/**
		 * Los ingresos anuales del cliente solicitante deben ser mayores o iguales a 
		 * 15000 pesos.
		 * El monto de la cuota debe ser menor al 70% de los ingresos mensuales del 
		 * cliente solicitante.
		 * */
		if (esAceptable()) {
			return this.getCliente().getMontoASolicitar();
		} else {
			return 0.0;
		}
	}

	@Override
	public boolean esAceptable() {
		/**
		 * Los ingresos anuales del cliente solicitante deben ser mayores o iguales a 
		 * 15000 pesos.
		 * El monto de la cuota debe ser menor al 70% de los ingresos mensuales del 
		 * cliente solicitante.
		 * */
		
		return ((this.getCliente().getSueldoNetoAnual() >= 15000.0) & 
				(this.getMontoCuotaMensual() <= this.getCliente().getSueldoNetoMensual() * 0.7));
	}

}
