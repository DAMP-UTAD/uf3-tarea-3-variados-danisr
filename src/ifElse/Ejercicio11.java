//Se ingresan por teclado tres n�meros, si al menos uno de los valores ingresados
//es menor a 10, imprimir en pantalla la leyenda "Alguno de los n�meros es
//menor a diez".
package ifElse;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer n�mero: ");
		int num3 = scan.nextInt();

		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los n�meros es menor a diez.");
		}
	}
}
