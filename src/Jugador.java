/**
 * Clase para poner un dorsal entre el 1 y el 99 a un jugador y comprobar si
 * esta expulsado o no
 * 
 * 
 * 
 * @author SergioParedes
 * @version 1.0
 */

public class Jugador {
	
	

	//ATRIBUTOS DE LA CLASE JUGADOR

	/**
	 * Esta propiedad indica el dorsal del jugador
	 */
	
	private int dorsal;
	
	/**
	 * Esta propiedad indica el numero de tarjetas amarillas del jugador
	 */
	
	private int numeroTarjetasAmarillas;
	
	/**
	 * Esta propiedad indica el numero de tarjetas rojas del jugador
	*/
	
	private int numeroTarjetasRojas;

	
	
	
	
	// METODOS GETTER AND SETTER.

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	
	/**
	 * Este metodo asigna un dorsal al jugador, el numero tiene que estar entre 1 y 30, si no se le asigna el -1
	 * @param dorsal, numero que se asigna al jugador
	 */
	
	
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	
	/**
	 * Metodo que indica si un jugador esta expulsado o no.
	 * @return devuelve true en caso de que tenga 2 tarjetas amarillas o una roja y false en caso contrario.
	 */
	
	
	
	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

}
