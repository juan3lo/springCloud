package tech.devjc.hotel.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



/**
* @author juan3lo
* 
*/

@RestControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handlerResourceNotFoundException(ResourceNotFoundException resourceNotFoundException){
		Map<String, Object> map = new HashMap<>();
		map.put("mensaje", resourceNotFoundException.getMessage());
		map.put("success", false);
		map.put("status", HttpStatus.NOT_FOUND);
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}

}


