package org.lasencinas.cotxox.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lasencinas.cotxox.conductores.Conductor;

public class ConductoresTest {

	@Test
	public void getNombreConductor() {
		String nombre = "Samantha";
		Conductor conductor = new Conductor(nombre);
		assertEquals(nombre, conductor.getNombre());

	}
	@Test
	public void ValoracionMediaTest() {
		String nombre = "Samantha";
		Conductor conductor = new Conductor(nombre);
		conductor.setValoracion((byte) 5);
		assertEquals(1, conductor.getNumeroValoraciones(), 0);
		assertEquals(5, conductor.getValoracion(), 0.1);

		int numeroValoraciones = 0;
		for (int valoracion = 0; valoracion <= 5; valoracion++) {
			conductor.setValoracion((byte) valoracion);
			numeroValoraciones++;
		}
		assertEquals(numeroValoraciones + 1, conductor.getNumeroValoraciones(), 0);
		assertEquals(2.875, conductor.getValoracion(), 0.1);
	}
	
	
}
