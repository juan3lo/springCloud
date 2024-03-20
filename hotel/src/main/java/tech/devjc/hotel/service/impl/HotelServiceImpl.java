package tech.devjc.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.devjc.hotel.entity.Hotel;
import tech.devjc.hotel.exceptions.ResourceNotFoundException;
import tech.devjc.hotel.repository.HotelRepository;
import tech.devjc.hotel.service.HotelService;

/**
* @author juan3lo
* 
*/

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel no encontrado con el id: "+ id));
	}

}


