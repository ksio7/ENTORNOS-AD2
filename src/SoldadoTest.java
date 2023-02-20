import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SoldadoTest {

	Soldado s1;

	/**
	 * Creamos un soldado nuevo cada vez que testeamos un metodo
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		s1 = new Soldado();
	}

	/**
	 * Este test es para probar que puede disparar teniendo balas.
	 */
	@Test
	void testPuedeDispararConBalas() {
		s1.setNumeroBalas(2);
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = s1.puedeDisparar();

		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	/**
	 * Este test es para probar que no puede disparar, si no tiene balas
	 */
	@Test
	void testPuedeDispararSinBalas() {
		s1.setNumeroBalas(0);
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = s1.puedeDisparar();

		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}

	/**
	 * Este test es para ver si funciona el metodo disparar
	 */
	@Test
	void testDisparar() {
		s1.disparar(s1);
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = s1.isEstaMuerto();
		assertEquals(ResultadoEsperado, ResultadoObtenido);

	}

}
