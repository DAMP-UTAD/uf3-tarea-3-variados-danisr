//Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura
//promedio de las personas.
package whileEjercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("De cuántas personas quieres introducir su altura: ");
		int personas = scan.nextInt();
		int xPersonas = 0;
		float altura, suma, promedio;
		suma = 0;

		while (xPersonas < personas) {
			System.out.print("Introduce su altura: ");
			altura = scan.nextFloat();
			suma = suma + altura;
			xPersonas = xPersonas + 1;
		}
		promedio = suma / personas;
		System.out.println("El altura media es: " + promedio);
	}
}
