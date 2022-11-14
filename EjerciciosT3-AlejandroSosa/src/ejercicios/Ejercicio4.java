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
	    while (b != 0) {
	        mcd = b;
	        b = a % b;
	        a = mcd;
	    }
		 System.out.println("El máximo común divisor de a y b es " + a);
		// Cerramos el escaner.
		sc.close();
	}

}
