package org.lasencinas.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {

	private String nombre;
	private String modelo;
	private String matricula;
	private Double valoracionMedia;
	List<Byte> valoraciones = new ArrayList<Byte>();
	private boolean ocupado = false;

	public Conductor() {

	}

	public Conductor(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValoracion() {
		return this.valoracionMedia;
	}

	public int getNumeroValoraciones() {
		return this.valoraciones.size();
	}

	public void setValoracion(byte valoracion) {
		this.valoraciones.add(valoracion);
		this.calcularValoracionMedia();
	}

	private double calcularValoracionMedia() {
		int sumaValoraciones = 0;
		for (byte valoracion : this.valoraciones) {
			sumaValoraciones += valoracion;
		}
		this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
		return this.valoracionMedia;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public boolean isOcupado() {
		return this.ocupado;
	}

}
