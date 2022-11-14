package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		int num; // Esta es la variable que pediremos al usuario.
		int cont=0;
		boolean primo;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el número tope al que llegaremos
		System.out.println("¿Hasta que número desea llegar?");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		/*
		 * Recorremos el bucle mientras que i sea menor o igual a num a la vez que el valor de i va aumentando.
		 */
		for (int i = 2; i < num; i++) {
			primo = true;
			for (int j = 2; j < i+1 / 2; j++) {
				 // Si el resto de dividir num entre i es igual a cero asignamos a la variable primo el valor true.
				 if (i % j == 0) {
					 primo=false;
				 }
			 }
			if(primo) cont++;
		}
		// Si el valor de primo es true mostramos por pantalla un mensaje diciendo que el número introducido es primo.
		 if(cont>0) System.out.println("Entre 1 y " + num + " hay " + cont + " números primos");
		 else System.out.println("No hay ningún número primo entre 1 y " + num);
		// Cerramos el escaner.
		sc.close();
	}
}
