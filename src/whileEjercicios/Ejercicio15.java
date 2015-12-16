//Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
//cuántos tienen notas mayores o iguales a 7 y cuántos menores.
package whileEjercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int alumno = 1;
		int notaIgualMas7 = 0;
		int notaMenos7 = 0;
		int nota;
		
		while (alumno <= 10) {
			System.out.print("Introduce la nota del alumno: ");
			nota = scan.nextInt();
			if (nota >= 7) {
				notaIgualMas7++;
			} else {
				notaMenos7++;
			}
			alumno++;
		}
		System.out.println("Los alumnos con un 7 o más son: " + notaIgualMas7
				+ "\n" + "Los alumnos con menos de un 7 son: " + notaMenos7);
	}
}
