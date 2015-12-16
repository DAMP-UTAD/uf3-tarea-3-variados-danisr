//Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de
//ellos.
package ifElse;

import java.util.Scanner;

public class Ejercicio04 {

	//METODO COMPARAR
	private static int comparar(int x, int y) {
		return Integer.compare(x, y);
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce los números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		//Se inicializa el número máximo a la variable num1
		int maximo = num1;
		if (comparar(maximo, num2) < 0) {
			maximo = num2;
		}
		if (comparar(maximo, num3) < 0) {
			maximo = num3;
		}
		System.out.println("El número mayor es el: " + maximo);
	}
}
