//Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el
//número es positivo, nulo o negativo.
package ifElse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		int numero = scan.nextInt();
		String mensaje;
		
		if (numero > 0) {
			mensaje = "El número es positivo";
		} else if (numero < 0) {
			mensaje = "El número es negativo";
		} else {
			mensaje = "El número es el cero";
		}
		System.out.println(mensaje);
	}
}
