import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorTest {
	Jugador jugador1;
	//Primero, creamos un jugador

	@BeforeEach
	void setUp() throws Exception {
		jugador1 = new Jugador();
	}
	
	//Imposibilito el jugador recien creado
	
	@AfterEach
	void tearDown() throws Exception {
		jugador1 = null;
	}
	
	/*Test para probar el método ponerDorsal
	 *
	 * Como no se me ocurre otra forma, utilizaré el .random para asignar los dorsales
	 */
	@Test
	void testponerDorsal() {
		int n;
		n = (int)(1+Math.random()*30);
		jugador1.ponerDorsal(n);
		assertTrue(jugador1.getDorsal() == n);
		
		n = (int) (31+Math.random()*69);
		jugador1.ponerDorsal(n);
		assertTrue(jugador1.getDorsal() == -1);
		
		n = (int)(-Math.random()*100);
		jugador1.ponerDorsal(n);
		assertTrue(jugador1.getDorsal() == -1);
		
	}
	
	/*
	 * Prueba del método setNumeroTarjetasRojas
	 * Lo hago de la misma forma, creando un .random
	 */

	@Test
	void testSetNumeroTarjetasAmarillas() {
		int t;
		t = (int)(Math.random()*3);
		jugador1.setNumeroTarjetasAmarillas(t);
		assertTrue(jugador1.getNumeroTarjetasAmarillas() == t);
		
		t = (int)(3+Math.random()*97);
		jugador1.setNumeroTarjetasAmarillas(t);
		assertTrue(jugador1.getNumeroTarjetasAmarillas() == -1);
		
		t= (int)(-1-Math.random() *99);
		jugador1.setNumeroTarjetasAmarillas(t);
		assertTrue(jugador1.getNumeroTarjetasAmarillas() == -1);
	}
	
	/*
	 * Test para probar el método estaExpulsado
	 * Si tiene 2 amarillas o 1 roja estará expulsado
	 */

	@Test
	void testEstaExpulsado2Amarillas() {
		jugador1.setNumeroTarjetasAmarillas(2);;
		assertTrue(jugador1.estaExpulsado() == true);
	}
	@Test
	void testEstaexpulsadoRoja() {
		jugador1.setNumeroTarjetasRojas(1);
		assertTrue(jugador1.estaExpulsado() == true);
	}
}
