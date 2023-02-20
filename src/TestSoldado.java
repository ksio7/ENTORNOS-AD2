import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSoldado {
	private Soldado s1;

	/** Creamos un soldado nuevo cada vez que testeamos un metodo
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		s1 = new Soldado();
	}

	/** Imposibilito trabajar con el soldado anteriormente creado
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		s1 = null;
	}
	
	/**Test para probar el método setter propio void setNumeroBalas(int n)
	 * Primero genero un entero aleatorio entre 0 y 99 y vemos si asigna ese entero.
	 * Segundo genero un entero aleatorio entre -99 y -1 y vemos si efectivamente asigna -1.
	 */
	@Test
	void testSetNumeroBalas() {
		int n;
		n = (int)(Math.random()*100);
		s1.setNumeroBalas(n);
		assertTrue(s1.getNumeroBalas()==n);
		
		n = (int)(-1-Math.random()*99);
		s1.setNumeroBalas(n);
		assertTrue(s1.getNumeroBalas()==-1);
	}
	
	/**
	 * Test para el metodo boolean puedeDisparar().
	 * La respuesta dependera de su numeroBalas, independientemente de si el soldado esta vivo o muerto.
	 * Primero genero un entero aleatorio entre 1 y 99 y lo asigno como numeroBalas y compruebo
	 * si efectivamente puede disparar.
	 * Segundo genero un entero aleatorio entre -99 y 0 y compruebo si efectivamente no puedo disparar.
	 */
	@Test
	void testPuedeDisparar() {
		int n;
		n = (int)(1+Math.random()*99);
		s1.setNumeroBalas(n);
		assertTrue(s1.puedeDisparar()==true);
		
		n = (int)(-Math.random()*100);
		s1.setNumeroBalas(n);
		assertTrue(s1.puedeDisparar()==false);
	}
    //Método equivalente al anterior pero necesita de más líneas de código
	@Test
	void testPuedeDisparar2() {
		int n;
		n = (int)(1+Math.random()*99);
		s1.setNumeroBalas(n);
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s1.puedeDisparar();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		n = (int)(-Math.random()*100);
		s1.setNumeroBalas(n);
		boolean resultadoEsperado2 = false;
		boolean resultadoObtenido2 = s1.puedeDisparar();
		assertEquals(resultadoEsperado2, resultadoObtenido2);
	}
	
	/**
	 * Test para el metodo void void Disparar(Soldado sol). La respuesta dependera del numeroBalas
	 * que tenga el soldado que llama al metodo independientemente de que este este vivo o muerto,
	 * y tambien es independiente de los atributos del soldado introducido como parametro.
	 */
	@Test
	void testDisparar() {
		int n=5;
		s1.setNumeroBalas(n);
		Soldado s2 = new Soldado();
		s1.disparar(s2);
		assertTrue(s2.isEstaMuerto()==true);
		assertTrue(s1.getNumeroBalas()==n-1);
	
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = s2.isEstaMuerto();
		assertEquals(resultadoEsperado, resultadoObtenido);
		assertTrue(s1.getNumeroBalas()==n-1);
	}
	
	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
}

