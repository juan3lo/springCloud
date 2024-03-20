package tech.devjc.usuario.exceptions;

/**
* @author juan3lo
* 
*/

public class ResourceNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Recurso no encontrado en el servidor");
	}
	
	public ResourceNotFoundException(String mensaje) {
		super(mensaje);
	}

}


