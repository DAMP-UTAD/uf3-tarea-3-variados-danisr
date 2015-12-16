//Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos
//muestre la tabla de multiplicar del mismo (los primeros 12 términos)
//Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el
//36.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;
		int multiplicar = 0;
		System.out.print("Introduce un valor del 1 al 10: ");
		n = scan.nextInt();

		for (int i = 1; i <= 12; i++) {
			multiplicar = n * i;
			System.out.println(n + "*" + i + " = " + multiplicar);
		}
	}
}



// CONDICION DE SI SE METE MENOS DE 0 ó MAYOR QUE 10 EL PROGRAMA TERMINE

//if (n < 1 || n > 10) {
//	System.out.println("El número introducido es incorrecto.");
//	return;
//}