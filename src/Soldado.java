
/**
 * Clase que indica si un soldado puede disparar y si tiene balas, puede disparar y por lo tanto matar a su adversario, si dispara, resta una bala.
 *  
 * 
 * 
 * @author Sergio Paredes
 * @version 1.0
 */



public class Soldado {

	
// ATRIBUTOS DE LA CLASE SOLDADO	

	
/**
 * Esta propiedad indica si consigue matar o no 
 */
private boolean estaMuerto;

/**
 * Esta propiedad indica el numero de balas que tiene y por lo tanto si puede disparar o no 
 */
 private int numeroBalas;
 
 
 
 //GETTER AND SETTER.
 
public boolean isEstaMuerto() {
	return estaMuerto;
}

public void setEstaMuerto(boolean estaMuerto) {
	this.estaMuerto = estaMuerto;
}

public int getNumeroBalas() {
	return numeroBalas;
}

public void setNumeroBalas(int numeroBalas) {
	this.numeroBalas = numeroBalas;
}


 
@Override
public String toString() {
	return "Soldado [estaMuerto=" + estaMuerto + ", numeroBalas=" + numeroBalas + ", isEstaMuerto()=" + isEstaMuerto()
			+ ", getNumeroBalas()=" + getNumeroBalas() + ", puedeDisparar()=" + puedeDisparar() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

/**
 * Este metodo indica si el soldado tiene mas de 0 balas y por lo tanto si puede disparar.
 * 
 * @return si puede disparar true, si no, false.
 */


public boolean puedeDisparar() {

    if(this.numeroBalas > 0) {

                  return true;

    }                          

    return false;

}


/**
 * Este metodo dispara a un soldado, 
 * 
 * @param sol representa al soldado al que se le dispara
 */

public void disparar(Soldado sol) {

    this.numeroBalas--;

    sol.estaMuerto = true;

}







 
              
}