//Se ingresan tres valores por teclado, si todos son iguales se imprime la suma
//del primero con el segundo y a �ste resultado se lo multiplica por el tercero.
package ifElse;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce el primer n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce el segundo n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Introduce el tercer n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 == num2 && num1 == num3) {
			int suma = num1 + num2;
			int multiplicacion = suma * num3;
			System.out
					.println("La suma del n�mero 1 y el n�mero 2 es: "
							+ suma
							+ "\n"
							+ "La suma del n�mero 1 y el n�mero 2 multiplicado por el n�mero 3 es: "
							+ multiplicacion);
		}
	}
}
