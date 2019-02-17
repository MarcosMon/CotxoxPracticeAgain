package org.lasencinas.cotxox.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.lasencinas.cotxox.carrera.Carrera;
import org.lasencinas.cotxox.tarifa.Tarifa;

public class CarreraTest {

	@Test
	public void comprobarOrigen() {
		Carrera carrera = new Carrera();
		String origen = "Aeroport Son Sant Joan";
		carrera.setOrigen(origen);
		assertEquals(origen, carrera.getOrigen());

	}

	@Test
	public void comprobarDestino() {
		Carrera carrera = new Carrera();
		String destino = "Magaluf";
		carrera.setDestino(destino);
		assertEquals(destino, carrera.getDestino());
	}

	@Test
	public void comprobarDistancia() {
		Carrera carrera = new Carrera();
		double distancia = 7.75;
		carrera.setDistancia(distancia);
		assertEquals(distancia, carrera.getDistancia(), 0);
	}

	@Test
	public void comprobarTiempoEsperado() {
		Carrera carrera = new Carrera();
		int tiempoEsperadoMinutos = 10;
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		assertEquals(tiempoEsperadoMinutos, carrera.getTiempoEsperado(), 0);

	}

	@Test
	public void comprobarCosteTotalEsperado() {
		Carrera carrera = new Carrera();
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		Tarifa.getCosteTotalEsperado(carrera);
		double costeTotalEsperado = 13.9625;
		assertEquals(costeTotalEsperado, carrera.getCosteEsperado(), 0);
	}

}
