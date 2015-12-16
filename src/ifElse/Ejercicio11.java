//Se ingresan por teclado tres números, si al menos uno de los valores ingresados
//es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es
//menor a diez".
package ifElse;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scan.nextInt();

		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los números es menor a diez.");
		}
	}
}
