package ejercicio7;

public class Main {

	public static void main(String[] args) {
		
		int edad;
		
		try {
			System.out.println("Introduce la edad");
			edad = ValidadorEdad.leerEdad();
		} catch(EdadErroneaException e) {
			System.out.println("Edad no valida");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
