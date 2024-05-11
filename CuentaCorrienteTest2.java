package cuentaCorriente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaCorrienteTest2 {

	@Test
	void testCuentaCorriente() {

	}

	@Test
	void testCuentaCorrienteInt() {
		CuentaCorriente cuenta = new CuentaCorriente(1234);
		assertEquals(1234, cuenta.getNumero());
	}

	@Test
	void testCuentaCorrienteIntDouble() {
		CuentaCorriente cuenta = new CuentaCorriente(1234, 500);
		assertEquals(1234, cuenta.getNumero());
		assertEquals(500, cuenta.getSaldo());
	}

	@Test
	void testGetNumero() {
		CuentaCorriente cuenta = new CuentaCorriente(1234, 500);
		assertEquals(1234, cuenta.getNumero());
	}

	@Test
	void testGetSaldo() {
		CuentaCorriente cuenta = new CuentaCorriente(1234, 500);
		assertEquals(500, cuenta.getSaldo());

	}

	@Test
	void testAnadirDinero() {

		CuentaCorriente cuenta = new CuentaCorriente(1234, 500);
		CuentaCorriente.anadirDinero(cuenta, 500);
		assertEquals(1000, cuenta.getSaldo());
	}

	@Test
	void testRetirarDinero() throws Exception {
		CuentaCorriente cuenta = new CuentaCorriente(1234, 500);
		try {
			CuentaCorriente.retirarDinero(cuenta, 40);
			assertEquals(460, cuenta.getSaldo());
		} catch (Exception e) {
			fail("No debería haber lanzado una excepción");

		}
	}
}