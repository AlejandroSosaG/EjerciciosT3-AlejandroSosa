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
		 * @i Se inicializa con valor 0.
		 */
		for (int i = 0; i <= num; i++) {
			/*
			 * Recorremos el bucle hasta que el valor de j supere al de i a la vez que se va incrementando.
			 * @j Se inicializa con valor 1.
			 */
            for (int j = 1; j <=i; j++) {
            	// Se muestra el valor actual de i.
                System.out.print(i);
                // Imprimimos un espacio en blanco.
                System.out.print(" ");
            }
            // Pasamos a la siguiente línea.
            System.out.println("");
        }
		// Cerramos el escaner.
		sc.close();
    }
}
