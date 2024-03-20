package tech.devjc.usuario.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import tech.devjc.usuario.response.ApiResponse;

/**
* @author juan3lo
* 
*/

@RestControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
		String mensaje = resourceNotFoundException.getMessage();
		
		@SuppressWarnings("static-access")
		ApiResponse response = new ApiResponse().builder()
				.mensaje(mensaje)
				.success(true)
				.status(HttpStatus.NOT_FOUND)
				.build();
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

}


