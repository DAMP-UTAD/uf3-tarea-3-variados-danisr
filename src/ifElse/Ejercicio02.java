//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".
package ifElse;

public class Ejercicio02 {

	public static void main(String[] args) {

		int nota1 = 5;
		int nota2 = 7;
		int nota3 = 9;
		
		if ((nota1 + nota2 + nota3) / 3 >= 7) {
			System.out.println("Promocionado");
		}
	}
}
