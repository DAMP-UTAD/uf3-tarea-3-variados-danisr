//Realizar un programa que acumule (sume) valores ingresados por teclado hasta
//ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
//Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o
//menor a cero.
package doWhile;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int valor;
		int sumaValores = 0;
		String mensaje;

		do {
			System.out.print("Introducza el valor: ");
			valor = scan.nextInt();
			if (valor != 9999) {
				sumaValores = sumaValores + valor;
			}
		} while (valor != 9999);

		System.out.println("El valor acumulado es: " + sumaValores);
		
		if (sumaValores == 0) {
			mensaje = "El valor acumulado es cero";
		} else if (sumaValores < 0) {
			mensaje = "El valor acumulado es menor a cero";
		} else {
			mensaje = "El valor acumulado es mayor a cero";
		}
		System.out.println(mensaje);
	}
}
