/**
 * @author Ricardodr
 */
public class Jugador {
	private int dorsal, numeroTarjetasAmarillas, numeroTarjetasRojas;

	//Métodos getter por defecto
    public int getDorsal() {
		return dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	
	//Métodos setter por defecto
    /**Metodo setter que recibe un entero, de manera que si este entero está entre 1 y 30
     * se establece como el valor del atributo dorsal del jugador que llama a al metodo.
     * De otra manera establece NumeroTarjetasRojas en -1.
     * @param int numeroTarjetasAmarillas
     */
    public void ponerDorsal(int dorsal) {
    	if(dorsal >= 1 && dorsal <= 30) {
    		this.dorsal = dorsal;
        }else {
        this.dorsal = -1;
        }
    }
    
    //Métodos setter propios
    /**Metodo setter que recibe un entero, de manera que si este entero es 0, 1 o 2, ese entero
     * se establece como el valor del atributo NumeroTarjetasAmarillas del jugador que llama a
     * al metodo. De otra manera establece NumeroTarjetasRojas en -1.
     * @param int numeroTarjetasAmarillas
     */
	public void setNumeroTarjetasAmarillas (int numeroTarjetasAmarillas) {
		if (numeroTarjetasAmarillas==0 || numeroTarjetasAmarillas==1 || numeroTarjetasAmarillas==2)
			this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		else
			this.numeroTarjetasAmarillas=-1;
	}
	
    /**Metodo setter que recibe un entero, de manera que si este entero es 0 o 1, ese entero
     * se establece como el valor del atributo NumeroTarjetasRojas del jugador que llama a
     * al metodo. De otra manera establece NumeroTarjetasRojas en -1.
     * @param int numeroTarjetasRojas
     */
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		if (numeroTarjetasRojas==0 || numeroTarjetasRojas==1)
			this.numeroTarjetasRojas = numeroTarjetasRojas;
		else
			this.numeroTarjetasRojas=-1;
	}

	/**Metodo que devuelve si el jugador esta o no expulsado en base al numero de tarjetas amarillas o rojas
	 * que ha recibido durante el encuentro.
	 * @return true si el jugador que llama al metodo tiene por atributo numeroTarjetasAmarillas = 2 o si
	 * numeroTarjetasRojas = 1, false en cualquier otro caso.
	 */
	public boolean estaExpulsado() {
    	boolean expulsado = false;                                                  
    	if(numeroTarjetasAmarillas == 2) {
    		expulsado = true;
        }                          
    	if(numeroTarjetasRojas == 1) {
    		expulsado = true;
        }                          
        return expulsado;
    } 
}