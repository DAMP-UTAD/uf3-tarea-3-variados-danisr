//Escribir un programa que pida ingresar coordenadas (x,y) que representan
//puntos en el plano.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out
				.print("¿Cuántas coordenadas 'X' e 'Y' quieres introducir?: ");
		int n;
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Introduce la coordenada 'X':");
			int x = scan.nextInt();
			System.out.print("Introduce la coordenada 'Y':");
			int y = scan.nextInt();

			if (x > 0 && y > 0) {
				System.out
						.println("Has introducido las coordenadas del primer cuadrante");
			} else if (x < 0 && y > 0) {
				System.out
						.println("Has introducido las coordenadas del segundo cuadrante");
			} else if (x > 0 && y < 0) {
				System.out
						.println("Has introducido las coordenadas del tercer cuadrante");
			} else
				System.out
						.println("Has introducido las coordenadas del cuarto cuadrante");
		}
	}
}
