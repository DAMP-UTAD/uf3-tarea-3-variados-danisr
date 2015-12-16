//Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
package forEjercicios;

public class Ejercicio26 {

	public static void main(String[] args) {

		int n = 5;
		int multiplicar;
		System.out.println("Tabla de multiplicar del 5");
		for (int i = 5; i <= 50; i++) {
			multiplicar = n * i;
			System.out.println(n + "*" + i + " = " + multiplicar);
		}
	}
}
