package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	// Creación de variables.
	int hora; // Esta es la variable que utilizaremos para contar las horas.
	int min; // Esta es la variable que utilizaremos para contar los minutos.
	int s; // Esta es la variable que utilizaremos para contar los segundos.
	int cant; // Esta variable es la cantidad de segundos que incrementaremos.
	// Generación de escaner.
	Scanner sc =new Scanner(System.in);
	// Pedimos al usuario una hora completa.
	System.out.println("Introduzca una hora completa(hora, minutos y segundos)");
	// Asignamos a las variables hora, min y s los valores escritos por el usuario.
	hora = sc.nextInt();
	min = sc.nextInt();
	s = sc.nextInt();
	// Pedimos al usuario la cantidad de segundos que quiere aumentar.
	System.out.println("Introduzca la cantidad de segundos a incrementar");
	// Asignamos a cant el valor escrito por el usuario.
	cant = sc.nextInt();
	/*
	 * Recorremos el bucle hasta que i deje de ser menor a cant, a la vez que el valor de i va incrementandose.
	 */
	for (int i = 0; i < cant; i++) {
		// Si los segundos son 59 lo ponemos a cero, sino aumentamos su valor en 1.
		if(s==59) {
			s=0;
			// Si los minutos son 59 los ponemos a cero, sino aumentamos su valor en 1.
			if(min==59) {
				min=0;
				// Si las horas son 23 las ponemos a cero, sino aumentamos su valor en 1.
				if(hora==23) hora=0;
				else hora++;
			}else min++;
		}else s++;
	}
	// Si los segundos son menores a 10 seguimos el programa, sino mostramos un mensaje con la hora incrementada.
	if(s<10) {
		// Si los minutos son menores de 10 seguimos el programa, sino mostramos un mensaje distinto con la hora incrementada.
		if(min<10) {
			// Si las horas son menores de 10 seguimos el programa, sino mostramos un mensaje distinto con la hora incrementada.
			if(hora<10) System.out.println("La hora incrementada es " + 0+ hora + ":" + 0 + min + ":" + 0 + s);
			else System.out.println("La hora incrementada es " + hora + ":" + 0 + min + ":" + 0 + s);
		}else System.out.println("La hora incrementada es " + hora + ":" +min + ":" + 0 + s);
	}else System.out.println("La hora incrementada es " + hora + ":" + min + ":" + s);	
	// Cerramos escaner.
	sc.close();
}
}