package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int num;
		int numMayor;
		int cont = 1;
		int fallos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número inicial");
		numMayor= sc.nextInt();
		System.out.println("Introduzca un número");
		num= sc.nextInt();
		while(num!=0) {
			if(num<numMayor) {
				System.out.println("Fallo. El número introducido es menor");
				fallos++;
			}
			cont++;
			numMayor= num;
			System.out.println("Introduzca un número");
			num= sc.nextInt();
		}
		System.out.println("La cantidad de números introducidos es " + cont);
		System.out.println("La cantidad de números fallidos introducidos es " + fallos);
		sc.close();
	}
}
