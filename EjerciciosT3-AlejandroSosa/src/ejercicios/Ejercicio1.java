package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	// Creación de variables.
	int hora;
	int min;
	int s;
	int cant;
	// Generación de escaner.
	Scanner sc =new Scanner(System.in);
	// Pedimos al usuario una hora completa.
	System.out.println("Introduzca una hora completa(hora, minutos y segundos)");
	// Asignamos a las variables hora, min y s los valores escritos por el usuario.
	hora = sc.nextInt();
	min = sc.nextInt();
	s = sc.nextInt();
	System.out.println("Introduzca la cantidad de segundos a incrementar");
	cant = sc.nextInt();
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
	if(s<10) {
		if(min<10) {
			if(hora<9) System.out.println("La hora incrementada es " + 0+ hora + ":" + 0 + min + ":" + 0 + s);
			else System.out.println("La hora incrementada es " + hora + ":" + 0 + min + ":" + 0 + s);
		}else System.out.println("La hora incrementada es " + hora + ":" +min + ":" + 0 + s);
	}else System.out.println("La hora incrementada es " + hora + ":" + min + ":" + s);	
	// Cerramos escaner.
	sc.close();
}
}