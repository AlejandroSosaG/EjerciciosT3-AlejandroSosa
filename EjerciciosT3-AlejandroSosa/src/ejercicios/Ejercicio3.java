package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del triángulo");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
		sc.close();
	}

}
