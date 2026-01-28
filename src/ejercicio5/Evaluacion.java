package ejercicio5;

import java.util.Scanner;

public class Evaluacion {	
	static Scanner sc = new Scanner(System.in); 
	public static int pedirNota() throws NotaInvalidaException{
		int nota=0;
		try {
			System.out.println("Introduce una nota");
			nota=sc.nextInt();

			if (nota<0||nota>10){
				throw new NotaInvalidaException();

			}
		}catch(Exception e) {
			sc.nextLine();
			e.printStackTrace();
			throw new NotaInvalidaException();
		}
		return nota;

	}
}


