package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int a; // Esta variable es el primer número que pediremos al usuario.
		int b; // Esta variable es el segundo número que pediremos al usuario.
		int mcd=1;  // Esta variable es el máximo común divisor que hallaremos mediante un cálculo.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario la primera variable.
		System.out.println("Introduzca el valor de a");
		// Asignamos a la variable a el valor escrito por el usuario.
		a = sc.nextInt();
		// Pedimos al usuario la segunda variable.
		System.out.println("Introduzca el valor de b");
		// Asignamos a la variable b el valor escrito por el usuario.
		b=sc.nextInt();
		/*
		 * Recorremos el bucle mientras el valor de b sea distinto de 0.
		 */
	    while (b != 0) {
	    	// Asignamos a la variable mcd el valor de b.
	        mcd = b;
	        // Asignamos a la variable b el valor del resto entre a y b.
	        b = a % b;
	        // Asignamos a la variable a el valor de mcd.
	        a = mcd;
	    }
	     // Mostramos por pantalla un mensaje con el ressultado.
		 System.out.println("El máximo común divisor de a y b es " + mcd);
		// Cerramos el escaner.
		sc.close();
	}

}
