package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número tope al que llegaremos
		System.out.println("Introduzca un número entero entre 0 y 20");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		/*
		 * Recorremos el bucle mientras que i sea menor o igual a num a la vez que el valor de i va aumentando.
		 */
		for (int i = 0; i <= num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println("");
        }
		// Cerramos el escaner.
		sc.close();
    }
}
