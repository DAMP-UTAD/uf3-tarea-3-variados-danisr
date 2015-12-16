//Realizar un programa que lea los lados de n triángulos, e informar:
//a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados
//iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
//b) Cantidad de triángulos de cada tipo.
//c) Tipo de triángulo que posee menor cantidad.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("¿Cuántos triángulos quieres introducir?: ");
		int n;
		n = scan.nextInt();
		double x;
		double y;
		double z;
		String mensaje = null;
		int equilatero = 0;
		int isosceles = 0;
		int escaleno = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Introduce el primer lado del triángulo: ");
			x = scan.nextInt();
			System.out.print("Introduce el segundo lado del triángulo: ");
			y = scan.nextInt();
			System.out.print("Introduce el tercer lado del triángulo: ");
			z = scan.nextInt();

			if (x == y && x == z) {
				mensaje = "El triángulo introducido es equilátero";
				equilatero++;
			} else if (x == y) {
				mensaje = "El triángulo introducido es isósceles";
				isosceles++;
			} else if (x != y && x != z && y != z) {
				mensaje = "El triángulo introducido es escaleno";
				escaleno++;
			}
			System.out.println(mensaje);
		}
		System.out.println("La cantidad de triángulos equiláteros es: "
				+ equilatero + ". "
				+ "La cantidad de triángulos isósceles es: " + isosceles + ". "
				+ "La cantidad de triángulos escalenos es: " + escaleno + ".");
	}
}
