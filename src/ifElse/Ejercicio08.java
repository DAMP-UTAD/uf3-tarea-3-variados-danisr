//Realizar un programa que pida cargar una fecha cualquiera, luego verificar si
//dicha fecha corresponde a Navidad.
package ifElse;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el día: ");
		int dia = scan.nextInt();
		System.out.print("Introduce el mes: ");
		int mes = scan.nextInt();
		System.out.print("Introduce el año: ");
		@SuppressWarnings("unused")
		int año = scan.nextInt();
		
		if (dia == 25 && mes == 12) {
			System.out.println("La fecha introducida es Navidad");
		} else {
			System.out.println("La fecha introducida no es Navidad");
		}
	}
}