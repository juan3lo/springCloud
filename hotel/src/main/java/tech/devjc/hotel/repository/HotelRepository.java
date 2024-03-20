package tech.devjc.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.devjc.hotel.entity.Hotel;

/**
* @author juan3lo
* 
*/

public interface HotelRepository extends JpaRepository<Hotel, String>{

}


