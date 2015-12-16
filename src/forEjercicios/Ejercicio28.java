//Informar cuántos puntos se han ingresado en el primer, segundo, tercer y
//cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad
//de puntos a procesar.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Cuántos puntos quieres introducir: ");
		int n;
		n = scan.nextInt();
		int cuadrante1 = 0;
		int cuadrante2 = 0;
		int cuadrante3 = 0;
		int cuadrante4 = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Introduce el punto 1: ");
			int punto1 = scan.nextInt();
			System.out.print("Introduce el punto 2: ");
			int punto2 = scan.nextInt();

			if (punto1 > 0 && punto2 > 0) {
				cuadrante1++;
			} else if (punto1 < 0 && punto2 > 0) {
				cuadrante2++;
			} else if (punto1 > 0 && punto2 < 0) {
				cuadrante3++;
			} else
				cuadrante4++;
		}
		System.out.println("En el cuadrante 1 hay: " + cuadrante1 + " puntos. "
				+ "En el cuadrante 2 hay: " + cuadrante2 + " puntos. "
				+ "En el cuadrante 3 hay: " + cuadrante3 + " puntos. "
				+ "En el cuadrante 4 hay: " + cuadrante4 + " puntos.");
	}
}
