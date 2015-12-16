//Realizar un programa que lea los lados de n tri�ngulos, e informar:
//a) De cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados
//iguales), is�sceles (dos lados iguales), o escaleno (ning�n lado igual)
//b) Cantidad de tri�ngulos de cada tipo.
//c) Tipo de tri�ngulo que posee menor cantidad.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("�Cu�ntos tri�ngulos quieres introducir?: ");
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
			System.out.print("Introduce el primer lado del tri�ngulo: ");
			x = scan.nextInt();
			System.out.print("Introduce el segundo lado del tri�ngulo: ");
			y = scan.nextInt();
			System.out.print("Introduce el tercer lado del tri�ngulo: ");
			z = scan.nextInt();

			if (x == y && x == z) {
				mensaje = "El tri�ngulo introducido es equil�tero";
				equilatero++;
			} else if (x == y) {
				mensaje = "El tri�ngulo introducido es is�sceles";
				isosceles++;
			} else if (x != y && x != z && y != z) {
				mensaje = "El tri�ngulo introducido es escaleno";
				escaleno++;
			}
			System.out.println(mensaje);
		}
		System.out.println("La cantidad de tri�ngulos equil�teros es: "
				+ equilatero + ". "
				+ "La cantidad de tri�ngulos is�sceles es: " + isosceles + ". "
				+ "La cantidad de tri�ngulos escalenos es: " + escaleno + ".");
	}
}
