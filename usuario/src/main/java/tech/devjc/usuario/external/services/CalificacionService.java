package tech.devjc.usuario.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import tech.devjc.usuario.entity.Calificacion;


/**
* @author juan3lo
* 
*/

@FeignClient(name = "CALIFICACION-SERVICE")
public interface CalificacionService {
	
	@PostMapping
	ResponseEntity<Calificacion> guardarCalificacion( Calificacion calificacion);
	
	@PutMapping("/calificaciones/{calificacionId}")
	ResponseEntity<Calificacion> actualizarCalificacion(@PathVariable String calificacionId);
	
	@DeleteMapping("/calificaciones/{calificacionId}")
	public void eliminarCalificacion(@PathVariable String calificacionId);

}


