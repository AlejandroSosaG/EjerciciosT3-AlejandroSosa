package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		int numMayor; // Esta variable es el número que el usuario debera superar.
		int cont = 1; // Esta variable es l cantidad de números introducidos por el usuario.
		int fallos = 0; // Esta variable es la cantidad de números fallidos que el usuario ha introducido.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor inicial del número a superar.
		System.out.println("Introduzca un número inicial");
		// Asignamos a numMayor el valor escrito por el usuario.
		numMayor= sc.nextInt();
		// Pedimos al usuario la varable num.
		System.out.println("Introduzca un número");
		// Asignamos a num el valor escrito por el usuario.
		num= sc.nextInt();
		/*
		 * Recorremos el bucle mientras que num sea distinto a 0.
		 */
		while(num!=0) {
			// Si el valor de num es menor al de numMayor mostramos por pantalla un mensaje de fallo y aumentamos el valor de fallos.
			if(num<numMayor) {
				System.out.println("Fallo. El número introducido es menor");
				fallos++;
			}
			// Aumentamos el valor de cont.
			cont++;
			// Asignamos a numMayor el valor de num.
			numMayor= num;
			// Pedimos al usuario el valor del siguiente número.
			System.out.println("Introduzca un número");
			// Asignamos a num el nuevo valor escrito por el usuario.
			num= sc.nextInt();
		}
		// Mostramos por pantalla un mensaje con la cantidad de números introducidos.
		System.out.println("La cantidad de números introducidos es " + cont);
		// Mostramos por pantalla un mensaje con el número de fallos introducidos.
		System.out.println("La cantidad de números fallidos introducidos es " + fallos);
		// Cerramos el escaner.
		sc.close();
	}
}
