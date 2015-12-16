//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar
//un mensaje indicando si el número tiene uno o dos dígitos. (Tener en cuenta
//que condición debe cumplirse para tener dos dígitos, un número entero)
package ifElse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = scan.nextInt();
		String mensaje;
		
		if (numero <= 9) {
			mensaje = "El número introducido es de 1 dígito";
		} else if (numero < 100) {
			mensaje = "El número introducido es de 2 dígitos";
		} else {
			mensaje = "Número incorrecto. Debe introducir un número de 2 dígitos como máximo.";
		}
		System.out.println(mensaje);
	}
}
