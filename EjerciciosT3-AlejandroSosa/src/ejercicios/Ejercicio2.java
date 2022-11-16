package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		int cont=0; // Esta variable es el contador de de números primos introducidos.
		boolean primo; // Esta es la variable que nos dirá si un número es primo o no.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número tope al que llegaremos
		System.out.println("¿Hasta que número desea llegar?");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		/*
		 * Recorremos el bucle mientras que i sea menor a num a la vez que el valor de i va aumentando.
		 */
		for (int i = 2; i < num; i++) {
			// Asignamos a la variable primo el valor true.
			primo = true;
			/*
			 * Recorremos el bucle mientras que j sea menor a i más uno, a la vez que el valor de j va incrementando.
			 */
			for (int j = 2; j < i+1 / 2; j++) {
				 // Si el resto de dividir num entre i es igual a cero asignamos a la variable primo el valor false.
				 if (i % j == 0) {
					 primo=false;
				 }
			 }
			// Si el valor de primo es true aumentamos el de la variable cont.
			if(primo) cont++;
		}
		// Si el valor de cont es mayor a cero mostramos por pantalla un mensaje diciendo cuántos número primos hay.
		 if(cont>0) System.out.println("Entre 1 y " + num + " hay " + cont + " números primos");
		 // Sino mostramos mensaje por pantalla diciendo que no hay ningún número primo.
		 else System.out.println("No hay ningún número primo entre 1 y " + num);
		// Cerramos el escaner.
		sc.close();
	}
}
