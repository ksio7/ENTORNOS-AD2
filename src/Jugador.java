
public class Jugador {

	private int dorsal, numeroTarjetasAmarillas, numeroTarjetasRojas;

	public int getDorsal() {
		return dorsal;
	}

	public void ponerDorsal(int dorsal) {
		
		if(dorsal >=1 && dorsal <= 30) {
		this.dorsal = dorsal;
	}else {
		this.dorsal = -1; 
		}
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		
		if(numeroTarjetasAmarillas == 0 || numeroTarjetasAmarillas ==1 || numeroTarjetasAmarillas == 2)
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		else
			this.numeroTarjetasAmarillas = -1;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		
		if (numeroTarjetasRojas == 0 || numeroTarjetasRojas == 1)
		this.numeroTarjetasRojas = numeroTarjetasRojas;
		else
			this.numeroTarjetasRojas = -1;
	}
	
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if(numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		if (numeroTarjetasRojas == 1) {
			expulsado = true;
		}
		return expulsado;
	}
}
