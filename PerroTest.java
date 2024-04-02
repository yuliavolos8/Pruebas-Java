package TestJunitPerro;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import perro.Perro;

class PerroTest {
	Perro perro = new Perro("tedi", 2, " dog");

	@Test
	void testComerCuandoHambriento() throws Exception {
		perro.setHambriento(true);
		assertDoesNotThrow(() -> perro.comer());
	}

	@Test
	void testComerCuandoNOHambriento() throws Exception {
		perro.setHambriento(false);
		Exception e = assertThrows(Exception.class, () -> perro.comer());
		assertEquals("el perro no debe comer", e.getMessage());
	}

	@Test
	void setEdadCorrecto() throws Exception {
		perro.setEdad(2);
		assertDoesNotThrow(() -> perro.setEdad(2));
	}

	@Test
	void setEdadinCorrecto() {
		Exception e = assertThrows(Exception.class, () -> perro.setEdad(-4));
		assertEquals("La edad no puede ser negativa", e.getMessage());
	}

}
