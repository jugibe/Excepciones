package ejercicio3;

public class Persona {
	private String nombre;
	Integer edad;
	/**
	 * @param nombre
	 * @param edad
	 * @throws EdadInvalidaException si la edad es menor que 0
	 */
	public Persona(String nombre, Integer edad) throws EdadInvalidaException {
		if(edad <0) {throw new EdadInvalidaException("mensaje a la clase Excepcion");}
		this.nombre = nombre;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	

}
