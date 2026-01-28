package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Eder Gracia
 * @version 1.0 26/01/26
 * Pide dos números enteros por teclado y realiza la división.
• Captura:
• ArithmeticException (división por 0)
• InputMismatchException
El programa no debe terminar, debe volver a pedir los datos
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner (System.in);
		int cociente=0;
		boolean salir = false;
		do {
		try {
		//pedimos 2 numeros
		System.out.println("introduce el primer numero");
		n1=sc.nextInt();
		System.out.println("introduce el segundo numero");
		n2=sc.nextInt();
		
		//calculamos el cociente
		cociente = n1/n2;
		salir = true;
		System.out.println("el cociente es: " + cociente);
		} catch (InputMismatchException e) {
			System.out.println("dato erroneo");
			sc.nextLine();
		} catch (ArithmeticException e) {
			System.out.println("dividir por 0 no");
			sc.nextLine();
		}
		} while (!salir);
		System.out.println("fin de programa");
	
	}

}
