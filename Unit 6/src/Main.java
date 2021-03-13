
public class Main {
	public static void main(String[] args) {
		int[] n = new int[1];
		n[0] = 1;
		
		System.out.println("Valor de n en main antes de llamar al método:" + n[0]);
		incrementar(n);

		System.out.println("Valor de n en main después de llamar al método:" + n[0]);
		}

		public static void incrementar(int[] n){
		n[0]++;
		System.out.println("Valor de n en el método después incrementar:" + n[0]);
		}
}
