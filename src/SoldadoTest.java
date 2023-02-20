import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SoldadoTest {

	private Soldado soldado1;
	//Creamos un soldado nuevo para probar el método
	
	@BeforeEach
	void setUp() throws Exception {
		soldado1 = new Soldado();
	}
	
	//Ahora imposibilito el soldado creado anteriormente
	
	@AfterEach
	
	void tearDown() throws Exception {
		soldado1 = null;
	}
	
	//Test para probar el método setnumeroBalas
	
	@Test
	void setNumeroBalas() {
		int Balas = 10;
		soldado1.setNumeroBalas(Balas);
		assertTrue(soldado1.getNumeroBalas() == Balas);
	}
		
		//Test para el método puedeDisparar
		

	@Test
	void testpuedeDisparar() {
		int d = 5;
		soldado1.setNumeroBalas(d);
		assertTrue(soldado1.puedeDisparar() == true);
		
		d = -2;
		soldado1.setNumeroBalas(d);
		assertTrue(soldado1.puedeDisparar() == false);
	}

	//Prueba para el método Disparar
	
	@Test
	
	void testDisparar() {
		int d=5;
		soldado1.setNumeroBalas(d);
		Soldado soldado2 = new Soldado();
		soldado1.disparar(soldado2);
		assertTrue(soldado2.isEstaMuerto() == true);
		assertTrue(soldado1.getNumeroBalas() == d-1);
		
	}
}
