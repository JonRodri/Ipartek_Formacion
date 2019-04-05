package com.ipartek.formacion.proyecto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CadenaTextoStringTest {

	@Test
	public void testContarLetras() {
		/* assertTrue(0, CadenaTextoString.contarLetras(null, letra)); */
		assertTrue(2 == CadenaTextoString.contarLetras("asa", 'a'));
		assertEquals(2, CadenaTextoString.contarLetras("asa", 'a'));
	}

	@Test
	public void testDarVuelta() {
		/* assertTrue(0, CadenaTextoString.contarLetras(null, letra)); */
		assertEquals("aloh", CadenaTextoString.darVuelta("hola")); // Es lo mismo
		assertEquals("", CadenaTextoString.darVuelta(""));
		assertEquals(" aloh", CadenaTextoString.darVuelta(" hola "));
	}

}
