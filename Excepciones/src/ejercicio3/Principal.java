package ejercicio3;

public class Principal {

	public static void main(String[] args) throws EdadInvalidaException {
		Persona p=null;
		p=new Persona("Ana",-95);
		try {
			p=new Persona("Juan",3);
			System.out.println(p);
		}catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(p);
		
	}

}
