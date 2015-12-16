//Confeccionar un programa que lea n pares de datos, cada par de datos
//corresponde a la medida de la base y la altura de un triángulo. El programa
//deberá informar:
//a) De cada triángulo la medida de su base, su altura y su superficie.
//b) La cantidad de triángulos cuya superficie es mayor a 12.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		float base;
		float altura;
		float superficie = 0;
		int masDoce = 0;

		System.out
				.print("¿De cuántos triángulos quieres calcular su superficie?: ");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Introduce la base del triángulo: ");
			base = scan.nextFloat();
			System.out.print("Introduce la altura del triángulo: ");
			altura = scan.nextFloat();
			superficie = (base * altura) / 2;
			System.out.println("La superficie del triángulo es: " + superficie);
			if (superficie > 12) {
				masDoce = masDoce + 1;
				System.out.println("Triángulos con superficie mayor a 12 son: "
						+ masDoce);
			}
		}
	}
}
