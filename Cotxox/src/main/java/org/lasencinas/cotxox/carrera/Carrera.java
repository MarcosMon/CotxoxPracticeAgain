package org.lasencinas.cotxox.carrera;

import org.lasencinas.cotxox.conductores.Conductor;
import org.lasencinas.cotxox.conductores.PoolConductores;
import org.lasencinas.cotxox.tarifa.Tarifa;

/**
 * Hello world!
 *
 */
public class Carrera {
	private double tiempoEsperado;
	private String tarjetaCredito;
	private double tiempoCarrera;
	private double costeTotal;
	private double costeEsperado;
	private Conductor conductor;
	private String origen;
	private double distancia;
	private String destino;
	private int propina;

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

	public double getTiempoEsperado() {
		return tiempoEsperado;
	}

	public void setTiempoEsperado(double tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}

	public double getCosteEsperado() {

		return Tarifa.getCosteTotalEsperado(this);
	}

	public double getTiempoCarrera() {
		return tiempoCarrera;
	}

	public void setTiempoCarrera(int tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public Conductor getConductor() {
		return this.conductor;
	}

	public void asignarConductor(PoolConductores conductores) {
		setConductor(conductores.asignarConductor());
	}

	public void realizarPago(double pago) {
		this.costeTotal = pago;
	}

	public double getCosteTotal() {
		return this.costeTotal;
	}

	public void recibirPropina(int propina) {
		this.propina = propina;
	}

	public int getPropina() {
		return this.propina;
	}

	public void liberarConductor() {
		getConductor().setOcupado(false);
	}

}
