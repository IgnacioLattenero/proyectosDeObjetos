package TP_6;

public class SolicitudesDeCreditoHipotecario extends SolicitudDeCredito {

	private String propiedadEnGarantia;
	private String descripcionPropiedad;
	private double valorFiscalPropiedad;
	
	public SolicitudesDeCreditoHipotecario(Cliente clienteSolicitante, int duracion,
										   String propiedadEnGarantia, 
										   String descripcionPropiedad, 
										   double valorFiscalPropiedad) {
		super(clienteSolicitante, duracion);
		this.propiedadEnGarantia = propiedadEnGarantia;
		this.descripcionPropiedad = descripcionPropiedad;
		this.valorFiscalPropiedad = valorFiscalPropiedad;
	}

	@Override
	public double otorgarCredito() {
		
		if (esAceptable()) {
			return this.getCliente().getMontoASolicitar();
		} else {
			return 0.0;
		}
	}

	@Override
	public boolean esAceptable() {
		/**
		 * El monto de la cuota mensual debe ser menor o igual al 50% de los ingresos 
		 * mensuales del cliente solicitante.
		 * El monto total solicitado debe ser menor o igual al 70% del valor fiscal 
		 * de la garantía.
		 * El cliente solicitante debe tener una edad menor o igual a 65 años antes de 
		 * terminar de pagar el crédito.
		 * */
		
		return ((this.getMontoCuotaMensual() <= (this.getCliente().getSueldoNetoMensual()) * 0.5) &
				(this.getCliente().getMontoASolicitar() <= this.valorFiscalPropiedad * 0.7) &
				(this.getCliente().getEdad() + this.getDuracion()) <= 65);
	}

}
