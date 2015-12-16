//Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) mostrar
//un mensaje indicando si el n�mero tiene uno o dos d�gitos. (Tener en cuenta
//que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero)
package ifElse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		int numero = scan.nextInt();
		String mensaje;
		
		if (numero <= 9) {
			mensaje = "El n�mero introducido es de 1 d�gito";
		} else if (numero < 100) {
			mensaje = "El n�mero introducido es de 2 d�gitos";
		} else {
			mensaje = "N�mero incorrecto. Debe introducir un n�mero de 2 d�gitos como m�ximo.";
		}
		System.out.println(mensaje);
	}
}
