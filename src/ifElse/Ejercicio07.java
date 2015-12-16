//Un postulante a un empleo, realiza un test de capacitaci�n, se obtuvo la
//siguiente informaci�n: cantidad total de preguntas que se le realizaron y la
//cantidad de preguntas que contest� correctamente. Se pide confeccionar un
//programa que ingrese los dos datos por teclado e informe el nivel del mismo
//seg�n el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
//Nivel m�ximo: Porcentaje>=90%
//Nivel medio: Porcentaje>=75% y <90%
//Nivel regular: Porcentaje>=50% y <75%
//Fuera de nivel: Porcentaje<50%
package ifElse;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out
				.println("Introduce la cantidad de preguntas que se realizaron: ");
		int nPreguntas = scan.nextInt();
		System.out
				.println("Introduce la cantidad de preguntas que contest� correctamente: ");
		int nPreguntasCorrectas = scan.nextInt();
		int porcentaje = (nPreguntasCorrectas * 100) / nPreguntas;
		String mensaje;
		
		if (porcentaje >= 90) {
			mensaje = "Nivel m�ximo";
		} else if (porcentaje >= 75) {
			mensaje = "Nivel medio";
		} else if (porcentaje >= 50) {
			mensaje = "Nivel regular";
		} else {
			mensaje = "Fuera de nivel";
		}
		System.out.println(mensaje);
	}
}
