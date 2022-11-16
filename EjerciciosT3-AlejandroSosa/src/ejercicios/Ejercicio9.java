package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		int cifra=1; // Esta variable es la cantidad de dígitos que tiene el número introducido.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de num.
		System.out.println("Introduzca un número entero");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		/*
		 * Recorremos el bucle mientras que num sea mayor a 9.
		 * @i Se inicializa con valor 10.
		 */
		for (int i = 10; num>9;) {
			// Asignamos a num su valor entre el valor actual de i.
			num/=i;
			// Aumentamos el valor de la variale cifra.
			cifra++;
		}
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El número de dígitos que posee el número introducido es " + cifra);
		// Cerramos el escaner.
		sc.close();
	}
}
