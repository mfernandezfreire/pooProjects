import java.util.Stack;

public class Programa {
	public static void main(String arg[]) {
        	String cadenaSiEquilibrada = "(Cadena equilibrada())";
        	String cadenaNoEquilibrada = "(Cadena no equilibrada (()()()))))";
        	System.out.println(verificaParentesis(cadenaNoEquilibrada));
        	System.out.println(verificaParentesis(cadenaSiEquilibrada));
	}
 
	public static boolean verificaParentesis(String cadena)  {
    	Stack<String> pila = new Stack<String>(); 	  
    	int i = 0;
       	while (i<cadena.length()) {  
		   if(cadena.charAt(i)=='(') {pila.push("(");}            
		   else if  (cadena.charAt(i)==')') {  
				if (!pila.empty()){ pila.pop(); } 
				else { pila.push(")"); break; } 
					}
					i++;
			}
			if(pila.empty()){ return true; } else { return false; }
	}
}
