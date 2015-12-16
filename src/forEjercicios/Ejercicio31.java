//Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
//a) La cantidad de valores ingresados negativos.
//b) La cantidad de valores ingresados positivos.
//c) La cantidad de múltiplos de 15.
//d) El valor acumulado de los números ingresados que son pares.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numero;
		int numPositivos = 0;
		int numNegativos = 0;
		int multiplo15 = 0;
		int sumaPares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduzca el siguiente número: ");
			numero = scan.nextInt();
			if (numero > 0) {
				numPositivos++;
			} else if (numero < 0) {
				numNegativos++;
			}
			if (numero % 15 == 0) {
				multiplo15++;
			}
			if (numero % 2 == 0) {
				sumaPares++;
			}
		}
		System.out.println("Se han introducido " + numPositivos
				+ " números positivos y " + numNegativos
				+ " números negativos." + "\n" + "Se han introducido "
				+ multiplo15 + " números multiplos de 15." + "\n"
				+ "Hay un total de " + sumaPares + " números pares.");
	}
}
