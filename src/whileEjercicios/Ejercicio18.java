//Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
//(No se ingresan valores por teclado)

package whileEjercicios;

public class Ejercicio18 {

	public static void main(String[] args) {

		int x= 1;
		int serie=11;
		
		System.out.println("Inicio");
		while (x <=25) {
			System.out.println(serie);
			x = x+1;
			serie = serie+11;
		}
		System.out.println("Fin");
	}
}
