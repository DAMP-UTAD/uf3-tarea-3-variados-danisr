//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
//$500, realizar un programa que lea los sueldos que cobra cada empleado e
//informe cu�ntos empleados cobran entre $100 y $300 y cu�ntos cobran m�s de
//$300. Adem�s el programa deber� informar el importe que gasta la empresa en
//sueldos al personal.
package whileEjercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Cu�ntas personas trabajan en la empresa: ");
		int personas = scan.nextInt();
		int xPersonas = 0;
		float sueldo;
		int sueldoInferior = 0;
		int sueldoSuperior = 0;
		float gasto = 0;

		while (xPersonas < personas) {
			System.out.print("Introduce el sueldo del empleado: ");
			sueldo = scan.nextFloat();
			if (sueldo >= 100 && sueldo <= 300) {
				sueldoInferior++;
			} else {
				sueldoSuperior++;
			}
			xPersonas = xPersonas + 1;
			gasto = gasto + sueldo;
		}
		System.out.println("Los empleados que ganan entre 100 y 300 son: "
				+ sueldoInferior + "\n"
				+ "Los empleados que ganan m�s de 300 son: " + sueldoSuperior
				+ "\n" + "La empresa gasta en sueldos: " + gasto);
	}
}
