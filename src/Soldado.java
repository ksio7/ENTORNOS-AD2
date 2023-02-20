/**
 * @author Ricardodr
 */
public class Soldado {
	//Atributos
	/**Indica si un soldado está o no muerto*/
	private boolean estaMuerto;
	/**Indica el número de balas con las que cuenta un soldado*/
	private int numeroBalas;

    //Métodos getter
    public boolean isEstaMuerto() {
		return estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	
	//Método setter por defecto
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	//Método setter propio
	public void setNumeroBalas(int numeroBalas) {
		if (numeroBalas>=0)
			this.numeroBalas = numeroBalas;
		else
			this.numeroBalas=-1;
	}
	
	/** Metodo que no recibe ningun parametro y que devuelve si el soldado que llama al metodo esta o no
	 * en condiciones de disparar en base a su atributo numeroBalas, independientemente de que este muerto
	 * @return true si el soldado que llama al metodo si puede disparar, lo cual pasa porque tenga balas, 
	 * false en cualquier otro caso.
	 */
    public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}                          
        return false;
    }
    
    /** Metodo que recibe como parametro un objeto de clase Soldado y que hace al soldado que llama al metodo (
     * independientemente de que este vivo y de las balas que tenga) disminuir su atributo numeroBalas en una unidad
     * y al soldado introducido como parametro fijar su atributo estaMuerto en el estado de true.
     * @param Soldado sol
     */
	public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;
    } 
}