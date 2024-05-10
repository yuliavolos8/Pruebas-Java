package miercoles1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumarCorecto() {
		Calculadora calcu = new Calculadora(20, 10);
		int result = calcu.sumar();
		assertEquals(30, result);
	}

	@Test
	void testSumarInCorecto() {
		Calculadora calcu = new Calculadora(20, 10);
		int result = calcu.sumar();
		assertEquals(0, result);
	}

	@Test
	void testRestarCorrecto() {
		Calculadora calcu = new Calculadora(50, 10);
		int result = calcu.restar();
		assertEquals(40, result);

	}

	@Test
	void testRestarInCorrecto() {
		Calculadora calcu = new Calculadora(50, 10);
		int result = calcu.restar();
		assertEquals(20, result);

	}

	@Test
	void testDivicionCorrecto() {
		Calculadora calcu = new Calculadora(100, 2);
		int result = calcu.dividir();
		assertEquals(50, result);

	}

	@Test
	void testDivicionInCorrecto() {
		Calculadora calcu = new Calculadora(100, 2);
		int result = calcu.dividir();
		assertEquals(5, result);

	}

	@Test
	void testMultiplicarCorrecto() {
		Calculadora calcu = new Calculadora(3, 4);
		int result = calcu.multiplicar();
		assertEquals(12, result);
	}
	@Test
	void testMultiplicarInCorrecto() {
		Calculadora calcu = new Calculadora(3, 4);
		int result = calcu.multiplicar();
		assertEquals(23, result);
	}


}
