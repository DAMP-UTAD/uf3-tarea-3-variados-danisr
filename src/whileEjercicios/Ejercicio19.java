//Mostrar los m�ltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 -
//24, etc.
package whileEjercicios;

public class Ejercicio19 {

	public static void main(String[] args) {

		int x = 8;

		while (x <= 500) {
			System.out.print(x);
			x = x + 8;
			System.out.print(" - ");
		}
	}
}
