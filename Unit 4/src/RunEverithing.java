
public class RunEverithing {

	public static void main(String[] args) {
		Vendedor empleado1 = new Vendedor("Manuel", "Fernandez", 39, 18000, 500);
		System.out.println(empleado1.toString());
		empleado1.ExtrasSueldo(300);
		System.out.println(empleado1.toString());
	}

}
