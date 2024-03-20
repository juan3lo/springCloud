package tech.devjc.calificacion.service;

import java.util.List;

import tech.devjc.calificacion.entity.Calificacion;

/**
* @author juan3lo
* 
*/

public interface CalificacionService {
	
	Calificacion create(Calificacion calificacion);
	List<Calificacion> getCalifiaciones();
	List<Calificacion> getCalifiacionesByUsuarioId(String usuarioId);
	List<Calificacion> getCalifiacionesByHotelId(String usuarioId);
	
}


