
public class Vendedor extends Empleado {
	private int comision;
	
	public Vendedor() {
	}
	
	public Vendedor(String nombre, String apellidos, int edad, int sueldo, int comision) {
		super(nombre,apellidos,edad,sueldo);
		this.setComision(comision);
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Vendedor [comision=" + comision + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos()
				+ ", getEdad()=" + getEdad() + ", getSueldo()=" + getSueldo() + "]";
	}

	public void ExtrasSueldo(int sueldoExtra) {
		if(this.comision < 45) {
			this.setSueldo(sueldoExtra + this.getSueldo());;			
		}
	}
	
}
