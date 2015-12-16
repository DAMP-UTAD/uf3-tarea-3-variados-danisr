//Se ingresan por teclado tres números, si todos los valores ingresados son
//menores a 10, imprimir en pantalla la leyenda "Todos los números son menores
//a diez".
package ifElse;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scan.nextInt();

		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los números son menores a diez.");
		}
	}
}
