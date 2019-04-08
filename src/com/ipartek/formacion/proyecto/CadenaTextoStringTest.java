package com.ipartek.formacion.proyecto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
		assertEquals(false, CadenaTextoString.darVuelta(null)); // Es lo mismo
		assertEquals(false, CadenaTextoString.darVuelta(""));
		assertEquals(true, CadenaTextoString.darVuelta(" ana "));
		assertEquals(true, "ana");
		assertEquals(false, "anaa");
		assertEquals(true, "  ana ");
	}

	@Test
	public void testEsPalindroma() {
		assertFalse("caso null", CadenaTextoString.esPalindroma(null));
		assertFalse("cadena vacia", CadenaTextoString.esPalindroma(""));
		assertFalse(CadenaTextoString.esPalindroma("anaa"));

		assertTrue("caso mayus y minus", CadenaTextoString.esPalindroma("Ana"));
		assertTrue("caso simple", CadenaTextoString.esPalindroma("ana"));
		assertTrue("caso trimmer", CadenaTextoString.esPalindroma(" Ana "));

	}

}
