//Confeccionar un programa que permita cargar un número entero positivo de
//hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
//Mostrar un mensaje de error si el número de cifras es mayor.
package ifElse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		int numero = scan.nextInt();
		String mensaje;
		
		if (numero < 10) {
			mensaje = "El número tiene 1 cifra";
		} else if (numero < 100) {
			mensaje = "El número tiene 2 cifras";
		} else if (numero < 1000) {
			mensaje = "El número tiene 3 cifras";
		} else {
			mensaje = "Número introducido incorrecto. El número ha de tener como máximo 3 cifras";
		}
		System.out.println(mensaje);
	}
}
