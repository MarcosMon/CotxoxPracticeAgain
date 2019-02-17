package org.lasencinas.cotxox.carrera;

/**
 * Hello world!
 *
 */
public class Carrera {
	private double tiempoEsperado;
	private String tarjetaCredito;
	private double tiempoCarrera;
	private double costeTotal;
	private String conductor;
	private String origen;

	public Carrera() {

	}

	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}

	public String getOrigen() {

		return this.origen;
	}

	public void setOrigen(String origen) {

		this.origen = origen;

	}
}
