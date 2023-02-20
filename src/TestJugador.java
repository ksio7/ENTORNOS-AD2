import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugador {
	Jugador j1;

	/** Creo un nuevo jugador antes de hacer el test de cada metodo.
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		j1 = new Jugador();
	}

	/** Imposibilito trabajar con el jugador previamente credo
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		j1 = null;
	}
	
	//Test para probar los métodos setter propios -------------------------------------------
	
	/**Test para probar el método setter propio void ponerDorsal(int n)
	 * Primero genero un entero aleatorio entre 0 y 1 y vemos si asigna ese entero.
	 * Segundo genero un entero aleatorio entre 2 y 99 y vemos si efectivamente asigna -1.
	 * Tercero genero un entero aleatorio entre -1 y -99 y vemos si efectivamente asigna -1.
	 * */
	@Test
	void testPonerDorsal() {
		int n;
		n = (int)(1+Math.random()*30);
		j1.ponerDorsal(n);
		assertTrue(j1.getDorsal()==n);
		
		n = (int)(31+Math.random()*69);
		j1.ponerDorsal(n);
		assertTrue(j1.getDorsal()==-1);
		
		n = (int)(-Math.random()*100);
		j1.ponerDorsal(n);
		assertTrue(j1.getDorsal()==-1);
	}

	/**Test para probar el método setter propio void setNumeroTarjetasRojas(int n)
	 * Primero genero un entero aleatorio entre 0 y 2 y vemos si asigna ese entero.
	 * Segundo genero un entero aleatorio entre 3 y 99 y vemos si efectivamente asigna -1.
	 * Tercero genero un entero aleatorio entre -1 y -99 y vemos si efectivamente asigna -1.
	 * */
	@Test
	void testSetNumeroTarjetasAmarillas() {
		int n;
		n = (int)(Math.random()*3);
		j1.setNumeroTarjetasAmarillas(n);
		assertTrue(j1.getNumeroTarjetasAmarillas()==n);
		n = (int)(3+Math.random()*97);
		j1.setNumeroTarjetasAmarillas(n);
		assertTrue(j1.getNumeroTarjetasAmarillas()==-1);
		n = (int)(-1-Math.random()*99);
		j1.setNumeroTarjetasAmarillas(n);
		assertTrue(j1.getNumeroTarjetasAmarillas()==-1);
	}
	
	/**Test para probar el método setter propio void setNumeroTarjetasRojas(int n);
	 * Primero genero un entero aleatorio entre 0 y 1 y vemos si asigna ese entero.
	 * Segundo genero un entero aleatorio entre 2 y 99 y vemos si efectivamente asigna -1.
	 * Tercero genero un entero aleatorio entre -1 y -99 y vemos si efectivamente asigna -1.
	 * */
	@Test
	void testSetNumeroTarjetasRojas() {
		int n;
		n = (int)(Math.random()*2);
		j1.setNumeroTarjetasAmarillas(n);
		assertTrue(j1.getNumeroTarjetasAmarillas()==n);
		n = (int)(2+Math.random()*98);
		j1.setNumeroTarjetasAmarillas(n);
		assertTrue(j1.getNumeroTarjetasAmarillas()==-1);
		n = (int)(-1-Math.random()*99);
		j1.setNumeroTarjetasAmarillas(n);
		assertTrue(j1.getNumeroTarjetasAmarillas()==-1);
	}
	
	//Tests para probar el método boolean estaExpulsado() --------------------------------------
	/**
	 * Test para comprobar que un jugador esta expulsado si tiene 2 amarillas, independientemente
	 * del número de rojas que tenga.
	 */
	@Test
	void testEstaExpulsado2Amarillas() {
		j1.setNumeroTarjetasAmarillas(2);
		assertTrue(j1.estaExpulsado()==true);
	}
	/**
	 * Test para comprobar que un jugador esta expulsado si tiene 1 roja, independientemente
	 * del número de amarillas que tenga.
	 */
	@Test
	void testEstaExpulsado1Roja() {
		j1.setNumeroTarjetasRojas(1);
		assertTrue(j1.estaExpulsado()==true);
	}
	/**
	 * Test para comprobar que un jugador no esta expulsado si no tiene ni 2 amarillas ni 1 roja.
	 * Dado que los métodos setter propios solo asignan entre -1 y 2 amarillas y entre -1 y 1 rojas,
	 * basta con asignar entre -1 y 1 amarillas y entre -1 y 0 rojas y comprobar que no está
	 * expulsado.
	 */
	@Test
	void testEstaExpulsado() {
		j1.setNumeroTarjetasAmarillas((int)(-1+Math.random()*3));
		j1.setNumeroTarjetasRojas((int)(-1+Math.random()*2));
		assertTrue(j1.estaExpulsado()==false);
	}
}