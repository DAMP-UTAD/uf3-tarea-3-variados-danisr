//Realizar un programa que permita cargar dos listas de 15 valores cada una.
//Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor
//(mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
//Tener en cuenta que puede haber dos o más estructuras repetitivas en un
//algoritmo.
package whileEjercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int valor;
		int xValor = 1;
		int sumaValor = 0;
		int xValor2 = 1;
		int sumaValor2 = 0;
		String mensaje;

		while (xValor <= 15) {
			System.out.print("Introduce el valor de la lista 1: ");
			valor = scan.nextInt();
			xValor++;
			sumaValor = sumaValor + valor;
		}
		while (xValor2 <= 15) {
			System.out.print("Introduce el valor de la lista 2: ");
			valor = scan.nextInt();
			xValor2++;
			sumaValor2 = sumaValor2 + valor;
		}
		if (sumaValor > sumaValor2) {
			mensaje = "La lista 1 es mayor";
		} else if (sumaValor < sumaValor2) {
			mensaje = "La lista 2 es mayor";
		} else {
			mensaje = "Listas iguales";
		}
		System.out.println(mensaje);
	}
}