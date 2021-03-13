
public class CineMiramar {

	public static void main(String[] args) {
		ColaCine colacine = new ColaCine();
		
		colacine.push(1);
		colacine.push(2);
		colacine.push(3);
		colacine.push(4);
		colacine.push(5);
		colacine.push(6);
		System.out.println(colacine);
		
		colacine.pop();
		
		System.out.println(colacine);
	}

}
