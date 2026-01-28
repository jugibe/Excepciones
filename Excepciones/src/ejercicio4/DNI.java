package ejercicio4;

public class DNI {
	// Atributos del DNI
	//Podemos elegir otros atributos
	private Integer numero;
	private  char letra;
	
	//constructor que recibe como parámetro un string
	
	public DNI(String dni) throws DniInvalidoException {
		//Primero lo valido y si no es valido lanzoo la excepcion
		 if(validarDNI(dni)==false) {
			 throw new DniInvalidoException();
		 }
		this.numero=Integer.parseInt(dni.substring(0,8));
		this.letra=dni.charAt(8);
		
	}
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}
	/**
	 * Este metodo me devuelve el DNI como un string
	 */
	public String getDni() {
		return numero+""+letra;
	}
	private boolean validarDNI(String dni) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		boolean letrasNumero=dni.matches("[0-9]{8}[A-Z]");
		if (!letrasNumero)return false;
		int numeroDNI=Integer.parseInt(dni.substring(0, dni.length()-1));
		boolean digitoControl= (dni.charAt(8)==letras.charAt(numeroDNI%23));
		return letrasNumero&&digitoControl;	
	}
	
	
	

}
