//Desarrollar un programa que solicite la carga de 10 n�meros e imprima la suma
//de los �ltimos 5 valores ingresados.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numero;
		int suma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduce el n�mero: ");
			numero = scan.nextInt();
			if (i > 5) {
				suma = suma + numero;
			}
		}
		System.out
				.println("La suma de los �ltimos 5 n�meros introducidos es: " + suma);
	}
}