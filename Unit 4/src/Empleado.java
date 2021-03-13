
abstract class Empleado {
	private String nombre;
	private String apellidos;
	private int edad;
	private int sueldo;
	
	public Empleado() {	
	}
	
	public Empleado(String nombre, String apellidos, int edad, int sueldo) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setEdad(edad);
		this.setSueldo(sueldo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sueldo=" + sueldo
				+ "]";
	}
	
	public abstract void ExtrasSueldo(int sueldoExtra);
	
	
}
