package tech.devjc.calificacion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.devjc.calificacion.entity.Calificacion;
import tech.devjc.calificacion.repository.CalificacionRepository;
import tech.devjc.calificacion.service.CalificacionService;

/**
* @author juan3lo
* 
*/

@Service
public class CalificacionServiceImpl implements CalificacionService{
	
	@Autowired
	private CalificacionRepository calificacionRepository;

	@Override
	public Calificacion create(Calificacion calificacion) {
		return calificacionRepository.save(calificacion);
	}

	@Override
	public List<Calificacion> getCalifiaciones() {
		return calificacionRepository.findAll();
	}

	@Override
	public List<Calificacion> getCalifiacionesByUsuarioId(String usuarioId) {
		return calificacionRepository.findByUsuarioId(usuarioId);
	}

	@Override
	public List<Calificacion> getCalifiacionesByHotelId(String hotelId) {
		return calificacionRepository.findByHotelId(hotelId);
	}

}


