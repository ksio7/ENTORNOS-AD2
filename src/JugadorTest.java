import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorTest {

	Jugador j1;

	
	/**
	 * Se crea un nuevo jugador antes de hacer el test de cada metodo.
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		j1 = new Jugador();
	}
/**
 * Test para poner el dorsal correcto, un numero entre 0 y 30.
 */
	@Test
	void testPonerDorsalCorrecto() {
		j1.ponerDorsal(7);
		int ResultadoEsperado = 7;
		int ResultadoObtenido = j1.getDorsal();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}
	
	/**
	 * Test para poner el dorsal erroneo, un numero que no esta entre 0 y 30.
	 */
	
	@Test
	void testPonerDorsalErroneo() {
		j1.ponerDorsal(31);
		int ResultadoEsperado = -1;
		int ResultadoObtenido = j1.getDorsal();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}
	
	/**
	 * Test para comprobar que un jugador esta expulsado si tiene 2 amarillas.
	 */
	@Test
	void testEstaExpulsado2Amarillas() {
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(0);
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = j1.estaExpulsado();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}
	/**
	 * Test para comprobar que un jugador esta expulsado si tiene 1 roja.
	 */
	@Test
	void testEstaExpulsado1Roja() {
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
		boolean ResultadoEsperado = true;
		boolean ResultadoObtenido = j1.estaExpulsado();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}
	
	/**
	 * Test para comprobar que un jugador no esta expulsado si no tiene tarjetas.
	 */
	
	@Test
	void testEstaExpulsado0Tarjetas() {
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(0);
		boolean ResultadoEsperado = false;
		boolean ResultadoObtenido = j1.estaExpulsado();
		assertEquals(ResultadoEsperado, ResultadoObtenido);
	}
	
	
	
	
	
	
}
