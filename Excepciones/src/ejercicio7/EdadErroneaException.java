package ejercicio7;
/**
 *  Excepcion que se lanzara cuando la edad no sea valida
 *  Considerariamos edad no valida cuando es negativa
 *  Esta clase extiende la clase exception con lo cual la excepcion es checkeable
 *  
 */
public class EdadErroneaException extends Exception{

	public EdadErroneaException() {
		super();
	}
	
}
