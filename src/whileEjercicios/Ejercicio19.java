//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 -
//24, etc.
package whileEjercicios;

public class Ejercicio19 {

	public static void main(String[] args) {

		int x = 8;
		
		System.out.println("Inicio");
		while (x <= 500) {
			System.out.println(x);
			x = x + 8;
		}
		System.out.println("Fin");
	}
}
