/**
 * @author Ricardodr
 */
public class Soldado {
	//Atributos
	private boolean estaMuerto; private int numeroBalas;

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
	
	/** Método que no recibe ningún parámetro y que devuelve si el soldado que llama al método está o no
	 * en condiciones de disparar en base a su atributo numeroBalas, independientemente de que esté muerto
	 * @return true si el soldado que llama al método sí puede disparar, lo cual pasa porque tenga balas, 
	 * false en cualquier otro caso.
	 */
    public boolean puedeDisparar() {
    	if(this.numeroBalas > 0) {
    		return true;
    	}                          
        return false;
    }
    
    /** Método que recibe como parámetro un objeto de clase Soldado y que hace al soldado que llama al método (
     * independientemente de que esté vivo y de las balas que tenga) disminuir su atributo numeroBalas en una unidad
     * y al soldado introducido como parámetro fijar su atributo estaMuerto en el estado de true.
     * @param Soldado sol
     */
	public void disparar(Soldado sol) {
    	this.numeroBalas--;
    	sol.estaMuerto = true;
    } 
}