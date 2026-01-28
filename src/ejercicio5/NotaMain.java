package ejercicio5;

public class NotaMain {

	public static void main(String[] args) {
		int nota=0;
		boolean salir=false;
		do {
			try {
		
			nota=Evaluacion.pedirNota();
			salir=true;
		} catch (NotaInvalidaException e) {
			// TODO Auto-generated catch block
			System.out.println("Nota no valida");
			e.printStackTrace();
			
		} 
		}while (salir==false);
		System.out.println(nota);
		

	}

}
