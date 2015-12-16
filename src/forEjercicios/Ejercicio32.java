//Se cuenta con la siguiente informaci�n:
//Las edades de 50 estudiantes del turno ma�ana.
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
		float ma�ana;
		float sumaMa�ana = 0;
		float promedioMa�ana = 0;
		float tarde;
		float sumaTarde = 0;
		float promedioTarde = 0;
		float noche;
		float sumaNoche = 0;
		float promedioNoche = 0;
		String mensaje;

		for (int i = 1; i <= 50; i++) {
			System.out
					.print("Introduzca la edad del alumno del turno de ma�ana: ");
			ma�ana = scan.nextInt();
			sumaMa�ana = sumaMa�ana + ma�ana;
			promedioMa�ana = sumaMa�ana / 50;
		}
		System.out
				.println("La edad media de los alumnos del turno de ma�ana es: "
						+ promedioMa�ana);

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

		if (promedioMa�ana > promedioTarde && promedioMa�ana > promedioNoche) {
			mensaje = "La media de edad del turno de ma�ana es superior a las dem�s.";
		} else if (promedioTarde > promedioMa�ana
				&& promedioTarde > promedioNoche) {
			mensaje = "La media de edad del turno de tarde es superior a las dem�s.";
		} else {
			mensaje = "La media de edad del turno de noche es superior a las dem�s.";
		}
		System.out.println(mensaje);
	}
}
