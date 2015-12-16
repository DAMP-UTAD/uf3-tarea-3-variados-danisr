//En un banco se procesan datos de las cuentas corrientes de sus clientes. De
//cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso
//de datos debe finalizar al ingresar un valor negativo en el número de cuenta. Se
//pide confeccionar un programa que lea los datos de las cuentas corrientes e
//informe:
//a) De cada cuenta: número de cuenta y estado de la cuenta según su
//saldo, sabiendo que:
//Estado de la cuenta'Acreedor' si el saldo es >0.
//'Deudor' si el saldo es <0.
//'Nulo' si el saldo es =0.
//b) La suma total de los saldos acreedores
package doWhile;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int cuenta;
		float saldo;
		float sumaSaldo = 0;
		String mensaje = null;

		do {
			System.out.print("Introduzca el número de cuenta: ");
			cuenta = scan.nextInt();
			if (cuenta >= 0) {
				System.out.print("Introduzca el saldo: ");
				saldo = scan.nextFloat();
				if (saldo > 0) {
					mensaje = "El estado de su cuenta es: 'Acreedor'";
					sumaSaldo = sumaSaldo + saldo;
				} else {
					if (saldo < 0) {
						mensaje = "El estado de su cuenta es: 'Deudor'";
					} else {
						mensaje = "El estado de su cuenta es: 'Nulo'";
					}
				}
			}
			System.out.println(mensaje);
		} while (cuenta >= 0);

		System.out.print("La suma total de los saldos Acreedores es: "
				+ sumaSaldo);
	}
}
