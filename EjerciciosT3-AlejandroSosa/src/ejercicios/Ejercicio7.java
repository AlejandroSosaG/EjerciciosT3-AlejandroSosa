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
		 */
		for (int i = 1; i <= num; i++){
			for (int j = 1; j <= num - i; j++) System.out.print(" ");
			for (int k = 1; k <i; k++) System.out.print(k);
			for (int k = i; k >= 1; k--) System.out.print(k);
			System.out.println(); 
			}
		// Cerramos el escaner.
		sc.close();
	}
}
