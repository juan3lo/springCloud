package tech.devjc.calificacion.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import tech.devjc.calificacion.entity.Calificacion;

/**
* @author juan3lo
* 
*/

public interface CalificacionRepository extends MongoRepository<Calificacion, Long>{
	
	List<Calificacion> findByUsuarioId(String usuarioId);
	List<Calificacion> findByHotelId(String hotelId);

}


