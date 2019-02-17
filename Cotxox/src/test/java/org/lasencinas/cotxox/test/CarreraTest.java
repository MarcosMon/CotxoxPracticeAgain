package org.lasencinas.cotxox.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.lasencinas.cotxox.carrera.Carrera;

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

}
