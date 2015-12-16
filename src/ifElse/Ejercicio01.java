//Realizar un programa que lea por teclado dos n�meros, si el primero es mayor
//al segundo informar su suma y diferencia, en caso contrario informar el
//producto y la divisi�n del primero respecto al segundo.
package ifElse;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce los n�meros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String mensaje;
		
		if (num1 > num2) {
			int suma = num1 + num2;
			int diferencia = num1 - num2;
			mensaje = "La suma de los dos n�meros es: " + suma + "\n"
					+ "La diferencia de los dos n�meros es: " + diferencia;
		} else {
			int producto = num1 * num2;
			double division = (double) num1 / num2;
			mensaje = "El producto de los dos n�meros es: " + producto + "\n"
					+ "La divisi�n de los dos n�meros es: " + division;
		}
		System.out.println(mensaje);
	}
}
