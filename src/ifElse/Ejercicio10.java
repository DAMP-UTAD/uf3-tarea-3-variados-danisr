//Se ingresan por teclado tres n�meros, si todos los valores ingresados son
//menores a 10, imprimir en pantalla la leyenda "Todos los n�meros son menores
//a diez".
package ifElse;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer n�mero: ");
		int num3 = scan.nextInt();

		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los n�meros son menores a diez.");
		}
	}
}
