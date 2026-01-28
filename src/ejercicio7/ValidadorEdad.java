package ejercicio7;

import java.util.Scanner;

public class ValidadorEdad {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static int leerEdad() throws EdadErroneaException{
		// Aqui se propagara la excepcion
		int edad = sc.nextInt();
		validarEdad(edad);
		return edad;
	}
	public static void validarEdad(int edad) throws EdadErroneaException{
		// Aqui lanzamos la excepcion
		if (edad < 0) {
			throw new EdadErroneaException();
		}
		
	}
}
