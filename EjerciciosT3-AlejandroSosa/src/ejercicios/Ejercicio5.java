package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int a; // Esta variable es el primer número que pediremos al usuario.
		int b; // Esta variable es el segundo número que pediremos al usuario.
		int mcm=1; // Esta variable es el mínimo común múltiplo que hallaremos mediante un cálculo.
		int mcd = 1; // Esta variable es el máximo común divisor que nos ayudará a conseguir el valor de mcm.
		int a1; // Esta es la variable que utilizaremos para hallar el valor de mcd.
		int b1; // Esta es la variable que utilizaremos para hallar el valor de mcd.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de a.
		System.out.println("Introduzca el valor de a");
		// Asignamos a la variable a el valor escrito por el usuario.
		a = sc.nextInt();
		// Asignamos a la variable a1 el valor de a.
		a1=a;
		// Pedimos al usuario el valor de b.
		System.out.println("Introduzca el valor de b");
		// Asignamos a la variable a el valor escrito por el usuario.
		b=sc.nextInt();
		// Asignamos a la vvariable b1 el valor de b.
		b1=b;
		/*
		 * Recorremos el bucle mientras el valor de b1 sea distinto de 0.
		 */
		while (b1 != 0) {
	    	// Asignamos a la variable mcd el valor de b.
	        mcd = b1;
	        // Asignamos a la variable b el valor del resto entre a y b.
	        b1 = a1 % b1;
	        // Asignamos a la variable a el valor de mcd.
	        a1 = mcd;
	    }
		// Asignamos a mcm el valor de la multiplicación entre a y b dividido entre el valor de mcd.
		mcm = (a * b) / mcd;		 
		// Mostramos por pantalla un mensaje con el resultado.
		System.out.println("El máximo común divisor de a y b es " + mcm);
		// Cerramos el escaner.
		sc.close();
	}

}
