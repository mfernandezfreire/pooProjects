
public class Coche extends Vehiculo {
	private int cilindrada;
	
	public Coche(){
	}
	
	public Coche(int color, int numeroSerie, int cilindrada) {
		super(color, numeroSerie);
		this.setCilindrada(cilindrada);
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
