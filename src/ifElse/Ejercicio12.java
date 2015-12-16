//Escribir un programa que pida ingresar la coordenada de un punto en el plano,
//es decir dos valores enteros x e y (distintos a cero).
//Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
//(1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
package ifElse;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce la coordenada X: ");
		int x = scan.nextInt();
		System.out.print("Introduce la coordenada Y: ");
		int y = scan.nextInt();

		if (x > 0 && y > 0) {
			System.out
					.println("Las coordenadas introducidas están en el primer cuadrante");
		} else if (x < 0 && y > 0) {
			System.out
					.println("Las coordenadas introducidas están en el segundo cuadrante");
		} else if (x > 0 && y < 0) {
			System.out
					.println("Las coordenadas introducidas están en el tercer cuadrante");
		} else {
			System.out.println("Las coordenadas introducidas están en el cuarto cuadrante");
		}
	}
}
