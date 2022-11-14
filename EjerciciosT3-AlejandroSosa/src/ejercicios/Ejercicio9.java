package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
		//El número introducido debe ser mayor que 0.
		int num;
		int cifra=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		num = sc.nextInt();
		for (int i = 10; num>9;) {
			num/=i;
			cifra++;
		}
		System.out.println("El número de dígitos que posee el número introducido es " + cifra);
		sc.close();
	}
}
