//Escribir un programa en el cual: dada una lista de tres valores numéricos
//distintos se calcule e informe su rango de variación (debe mostrar el mayor y el
//menor de ellos)
package ifElse;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer número: ");
		int num3 = scan.nextInt();
		int mensaje;

		System.out.print("El rango de los números introducidos es: ");

		if (num1 < num2 && num1 < num3) {
			mensaje = num1;
		} else if (num2 < num3) {
			mensaje = num2;
		} else {
			mensaje = num3;
		}

		System.out.print(mensaje);
		System.out.print("-");

		if (num1 > num2 && num1 > num3) {
			mensaje = num1;
		} else if (num2 > num3) {
			mensaje = num2;
		} else {
			mensaje = num3;
		}
		System.out.print(mensaje);
	}
}