
public class Soldado {

	 private boolean estaMuerto;
	 private int numeroBalas;
	 
	 
	 
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
		if (numeroBalas >= 0)
		this.numeroBalas = numeroBalas;
		else
			this.numeroBalas=-1;
	}

	//Este método no recibe ningún parámetro y devuelve si el soldado puede disparar o no según el numeroBalas
	
	public boolean puedeDisparar() {
		if(this.numeroBalas >0) {
			return true;
			
		}
		return false;
	}

	//Método que recibe un bojeto soldado y que hace disminuir su atributo numeroBalas en 1
	public void disparar (Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}
}
