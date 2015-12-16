//Se cuenta con la siguiente información:
//Las edades de 50 estudiantes del turno mañana.
//Las edades de 60 estudiantes del turno tarde.
//Las edades de 110 estudiantes del turno noche.
//Las edades de cada estudiante deben ingresarse por teclado.
//Se desea:
//a) Obtener el promedio de las edades de cada turno (tres promedios)
//b) Imprimir dichos promedios (promedio de cada turno)
//c) Mostrar por pantalla un mensaje que indique cual de los tres turnos
//tiene un promedio de edades mayor.
package forEjercicios;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		float mañana;
		float sumaMañana = 0;
		float promedioMañana = 0;
		float tarde;
		float sumaTarde = 0;
		float promedioTarde = 0;
		float noche;
		float sumaNoche = 0;
		float promedioNoche = 0;
		String mensaje;

		for (int i = 1; i <= 50; i++) {
			System.out
					.print("Introduzca la edad del alumno del turno de mañana: ");
			mañana = scan.nextInt();
			sumaMañana = sumaMañana + mañana;
			promedioMañana = sumaMañana / 50;
		}
		System.out
				.println("La edad media de los alumnos del turno de mañana es: "
						+ promedioMañana);

		for (int i = 1; i <= 60; i++) {
			System.out
					.print("Introduzca la edad del alumno del turno de tarde: ");
			tarde = scan.nextInt();
			sumaTarde = sumaTarde + tarde;
			promedioTarde = sumaTarde / 60;
		}
		System.out
				.println("La edad media de los alumnos del turno de tarde es: "
						+ promedioTarde);

		for (int i = 1; i <= 110; i++) {
			System.out
					.print("Introduzca la edad del alumno del turno de noche: ");
			noche = scan.nextInt();
			sumaNoche = sumaNoche + noche;
			promedioNoche = sumaNoche / 110;
		}
		System.out
				.println("La edad media de los alumnos del turno de noche es: "
						+ promedioNoche);

		if (promedioMañana > promedioTarde && promedioMañana > promedioNoche) {
			mensaje = "La media de edad del turno de mañana es superior a las demás.";
		} else if (promedioTarde > promedioMañana
				&& promedioTarde > promedioNoche) {
			mensaje = "La media de edad del turno de tarde es superior a las demás.";
		} else {
			mensaje = "La media de edad del turno de noche es superior a las demás.";
		}
		System.out.println(mensaje);
	}
}
