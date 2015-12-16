//Confeccionar un programa que lea n pares de datos, cada par de datos
//corresponde a la medida de la base y la altura de un tri�ngulo. El programa
//deber� informar:
//a) De cada tri�ngulo la medida de su base, su altura y su superficie.
//b) La cantidad de tri�ngulos cuya superficie es mayor a 12.
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
				.print("�De cu�ntos tri�ngulos quieres calcular su superficie?: ");
		n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Introduce la base del tri�ngulo: ");
			base = scan.nextFloat();
			System.out.print("Introduce la altura del tri�ngulo: ");
			altura = scan.nextFloat();
			superficie = (base * altura) / 2;
			System.out.println("La superficie del tri�ngulo es: " + superficie);
			if (superficie > 12) {
				masDoce = masDoce + 1;
				System.out.println("Tri�ngulos con superficie mayor a 12 son: "
						+ masDoce);
			}
		}
	}
}
