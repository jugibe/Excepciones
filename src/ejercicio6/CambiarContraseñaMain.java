package ejercicio6;

import java.util.Scanner;

public class CambiarContraseñaMain {
	//faltaria pedir la contraseña hasta que sea correcta
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario u=new Usuario();
		
		boolean salir=false;
		do {
		System.out.println("Introduce la nueva contraseña");
		String nuevaContraseña=sc.nextLine();
		try {
			u.cambiarPassword(nuevaContraseña);
			salir =true;
		} catch (PasswordInvalidaException e) {
			
			System.out.println("Contraseña erronea");
		}
		}while(!salir);
		System.out.println(u.getPassword());
	}

}
