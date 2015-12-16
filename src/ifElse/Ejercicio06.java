//Confeccionar un programa que permita cargar un n�mero entero positivo de
//hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
//Mostrar un mensaje de error si el n�mero de cifras es mayor.
package ifElse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el n�mero: ");
		int numero = scan.nextInt();
		String mensaje;
		
		if (numero < 10) {
			mensaje = "El n�mero tiene 1 cifra";
		} else if (numero < 100) {
			mensaje = "El n�mero tiene 2 cifras";
		} else if (numero < 1000) {
			mensaje = "El n�mero tiene 3 cifras";
		} else {
			mensaje = "N�mero introducido incorrecto. El n�mero ha de tener como m�ximo 3 cifras";
		}
		System.out.println(mensaje);
	}
}
