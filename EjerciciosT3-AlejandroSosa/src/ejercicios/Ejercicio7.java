package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número tope al que llegaremos
		System.out.println("Introduzca un número de filas para la pirámide de números");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		/*
		 * Recorremos el bucle mientras que i sea menor o igual a num a la vez que el valor de i va aumentando.
		 * @i Se inicializa con valor 1.
		 */
		for (int i = 1; i <= num; i++){
			/*
			 * Recorremos el bucle hasta que el valor de j supere al de num menos el valor actual de i mientras que el de j se va incrementando
			 * @j Se inicializa con valor 1.
			 */
			for (int j = 1; j <= num - i; j++) System.out.print(" ");
			/*
			 * Recorremos el bucle mientras el valor de k sea menor al de i a la vez que va aumentando.
			 * Dentro del bucle se imprime el valor actual de k.
			 * @k Se inicializa con valor 1.
			 */
			for (int k = 1; k <i; k++) System.out.print(k);
			/*
			 * Recorremos el bucle hasta que k sea menor a 1 mientras que su valor se va decrementando.
			 * Dentro del bucle se imprime el valor actual de k.
			 * @k Se inicializa con valor igual a i.
			 */
			for (int k = i; k >= 1; k--) System.out.print(k);
			// Pasamos a la siguiente línea.
			System.out.println(); 
			}
		// Cerramos el escaner.
		sc.close();
	}
}
