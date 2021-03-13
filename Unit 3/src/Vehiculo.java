
public class Vehiculo {
	private int color;
	private int numeroSerie;
	
	public Vehiculo() {
	}
	
	public Vehiculo(int color, int numeroSerie) {
		this.setColor(color);
		this.setNumeroSerie(numeroSerie);
	}
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	public void cambiaNumeroSerie(int serie) {
		this.setNumeroSerie(serie);
	}
	
	public void pinta(int color) {
		this.setColor(color);
	}
}
