package ejercicios;

import java.util.Scanner;

/**
 * @author Eder Gracia
 * @version 1.0 26/01/26 
 * Ejercicio 2.- 
Pide una cadena y conviértela a entero usando Integer.parseInt.
• Captura NumberFormatException
• Repite hasta que el número sea válido
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner (System.in);
		boolean salir =false;
		int n;
		int contador = 0;
		do {
		try {
		System.out.println("introduce una cadena que contenga un numero");
		s = sc.nextLine();
		
		//transformamos s a entero
		n=Integer.parseInt(s);
		salir = true;
		System.out.println("el numero que has introducido es " + n);
		} catch (NumberFormatException e) {
			System.out.println("formato de numero erroneo");
		} finally {
			contador++;
			if (contador>=3) {
				salir= true;
			}
			System.out.println("salida por el finally " + contador);
		}
		}while (!salir);
		
		System.out.println("fin de programa");
	}

}
