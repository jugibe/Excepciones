package ejercicio4;

import java.util.Scanner;

public class ProbarDNI {

	public static void main(String[] args) {
		String dniString;
		Scanner sc = new Scanner(System.in);
		boolean salir= false;
		DNI miDNI=null;
		do {
			try {
		
			System.out.println("Introduce un DNI");
			dniString= sc.nextLine();
		    miDNI= new DNI (dniString);
		    salir=true;
		} catch (DniInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		}while (salir==false);
		System.out.println(miDNI.getDni());
	}

}
