//Escribir un programa en el cual: dada una lista de tres valores num�ricos
//distintos se calcule e informe su rango de variaci�n (debe mostrar el mayor y el
//menor de ellos)
package ifElse;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer n�mero: ");
		int num3 = scan.nextInt();
		int mensaje;

		System.out.print("El rango de los n�meros introducidos es: ");

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