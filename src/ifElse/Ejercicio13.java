//De un operario se conoce su sueldo y los a�os de antig�edad. Se pide
//confeccionar un programa que lea los datos de entrada e informe:
//a) Si el sueldo es inferior a 500 y su antig�edad es igual o superior a 10 a�os,
//otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
//b)Si el sueldo es inferior a 500 pero su antig�edad es menor a 10 a�os,
//otorgarle un aumento de 5 %.
//c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
package ifElse;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el sueldo del operario: ");
		int sueldo = scan.nextInt();
		System.out.print("Introduce la antig�edad del operario: ");
		int antiguedad = scan.nextInt();

		String mensaje;
		if (sueldo < 500 && antiguedad >= 10) {
			int aumento20 = (sueldo * 20) / 100;
			int nuevoSueldo = sueldo + aumento20;
			mensaje = "El nuevo sueldo del operario ser�: " + nuevoSueldo;
		} else if (sueldo < 500 && antiguedad < 10) {
			int aumento5 = (sueldo * 5) / 100;
			int nuevoSueldo = sueldo + aumento5;
			mensaje = "El nuevo sueldo del operario ser�: " + nuevoSueldo;
		} else {
			mensaje = "El sueldo no tendr� ning�n cambio y ser�: " + sueldo;
		}
		System.out.println(mensaje);
	}
}
