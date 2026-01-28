package ejercicio6;

public class Usuario {
	String password="12345678";

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	public void cambiarPassword(String nuevaPassword)throws PasswordInvalidaException {
		if(nuevaPassword.length()<6) {
			throw new PasswordInvalidaException();
		}
		this.password=nuevaPassword;
	}
}
