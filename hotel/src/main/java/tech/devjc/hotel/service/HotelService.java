package tech.devjc.hotel.service;

import java.util.List;

import tech.devjc.hotel.entity.Hotel;

/**
* @author juan3lo
* 
*/

public interface HotelService {
	
	Hotel create(Hotel hotel);
	List<Hotel> getAll();
	Hotel get(String id);

}


