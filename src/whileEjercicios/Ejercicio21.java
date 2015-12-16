//Desarrollar un programa que permita cargar n n�meros enteros y luego nos
//informe cu�ntos valores fueron pares y cu�ntos impares.
//Emplear el operador ?%? en la condici�n de la estructura condicional:
//if (valor%2==0) //Si el if da verdadero luego es par
package whileEjercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Cu�ntos n�meros quieres introducir: ");
		int nNumero = scan.nextInt();
		int xNumeros = 0;
		int numero;
		int pares = 0;
		int impares = 0;

		while (xNumeros < nNumero) {
			System.out.print("Introduce el n�mero: ");
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			xNumeros = xNumeros + 1;
		}
		System.out.println("La cantidad de n�meros pares es: " + pares + "\n"
				+ "La cantidad de n�meros impares es: " + impares);
	}
}
