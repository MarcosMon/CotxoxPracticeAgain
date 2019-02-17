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
	private double distancia;
	private String destino;

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

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	
}
