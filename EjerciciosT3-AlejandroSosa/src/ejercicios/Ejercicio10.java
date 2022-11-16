package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {		
        int num; // Esta es la variable que pediermos al usuario.
        int num2; // Esta variable la utilizaremos para calcular el número introducido dado la vuelta.
        int aux; // Esta es la variable que nos ayudará a calcular el número introducido dado la vualta.
        int capicua; // Esta variable es el número introducido dado la vuelta.
        // Generación de escaner.
        Scanner sc = new Scanner(System.in);
        /*
         * Recorremos el bucle al menos una vez hasta que el valor de num sea mayor o igual a 0.
         */
        do {
        	// Pedimos al usuario un número entero mayor de 0.
            System.out.println("Escriba un número mayor a 0");
            // Asignamos a num el valor escrito por el usuario.
            num = sc.nextInt();
            // Asignamos a num2 el valor de num.
            num2 = num;
            // Asignamos a la variable capicúa el valor 0.
            capicua=0;
            // Si el valor de num es menor a 10 mostramos por pantalla un mensaje diciendo que el número es capicúa.
            if (num < 10) {
                System.out.println("Su número es capicúa");
            // Sino seguimos el programa.
            } else {
            	/*
            	 * Recorremos el bucle mientras que el valor de num2 sea distinto a 0.
            	 */
            	while (num2 != 0) {
            		// Asignamos a aux el valor del resto entre num2 y 10.
                    aux = num2 % 10;
                    // Asignamos a la variable capicua su valor por 10 y a eso le sumamos el valor de aux.
                    capicua = (capicua * 10) + aux;
                    // Asignamos a num2 su valor entre 10.
                    num2 /= 10;
                }
            }
            // Si el valor de num es mayor a 9 y es igual a la variable capicua mostramos por pantalla un mensaje diciendo que es capiúa.
            if(num>9 && num==capicua) System.out.println("El número es capicúa");
            // Sino y si el valor de num es mayor a 9 y distinto a la variable capicua mostramos por pantalla diciendo que no es capicúa.
            else if(num>9 && num!=capicua)System.out.println("El número no es capicúa");
        }while(num>=0);
        // Cerramos el escaner.
        sc.close();
	}

}
