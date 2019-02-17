package org.lasencinas.cotxox.tarifa;

import org.lasencinas.cotxox.carrera.Carrera;

public class Tarifa {
	private static double costeMilla = 1.35;
	private static double costeMinuto = 0.35;
	private static int costeMinimo = 5;
	private int porcentajeComision = 20;
	private static double costeTotal;

	public Tarifa() {

	}

	public static double getCosteMilla(double distancia) {
		return costeMilla * distancia;
	}

	public static double getCosteTiempo(double tiempo) {
		return costeMinuto * tiempo;
	}

	public static double getCosteTotalEsperado(Carrera carrera) {
		costeTotal = getCosteMilla(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
		if (costeTotal >= 5) {
			return costeTotal;
		}
		return costeMinimo;
	}
}
