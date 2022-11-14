package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int a; // Esta variable es el primer número que pediremos al usuario.
		int b; // Esta variable es el segundo número que pediremos al usuario.
		int mcd=1;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor de a");
		a = sc.nextInt();
		System.out.println("Introduzca el valor de b");
		b=sc.nextInt();
		if(a<b) {
			/*
			 * Recorremos el bucle mientras que el valor de i sea menor a num a la vez que el valor de i va aumentando.
			 * En este bucle for el valor inicial de i será 2.
			 */
			 for (int i = 2; i <= a;) {
				 // Si el resto de dividir num entre i es igual a cero asignamos a la variable primo el valor true.
				 if (a % i == 0) {
					 if(b % i == 0) {
						 a/=i;
						 b/=i;
						 mcd*=i;
					 }
				 }else {
					 i++;
				 }
			 }
		}else {
			/*
			 * Recorremos el bucle mientras que el valor de i sea menor a num a la vez que el valor de i va aumentando.
			 * En este bucle for el valor inicial de i será 2.
			 */
			for (int i = 2; i <= b;) {
				 // Si el resto de dividir num entre i es igual a cero asignamos a la variable primo el valor true.
				 if (b % i == 0) {
					 if(a % i == 0) {
						 a/=i;
						 b/=i;
						 mcd*=i;
					 }
				 }else {
					 i++;
				 }
			 }
		}
		
		 
		 System.out.println("El máximo común divisor de a y b es " + mcd);
		// Cerramos el escaner.
		sc.close();
	}

}
