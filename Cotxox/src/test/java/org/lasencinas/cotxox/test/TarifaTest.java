package org.lasencinas.cotxox.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lasencinas.cotxox.tarifa.Tarifa;

public class TarifaTest {

	@Test
	public void comprobarCosteDistancia() {
		double distancia = 7.75;
		double total = 10.4625;
		assertEquals(10.4625, Tarifa.getCosteMilla(distancia), 0);
		
	}

	

}
