package tech.devjc.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.devjc.hotel.entity.Hotel;
import tech.devjc.hotel.service.HotelService;

/**
* @author juan3lo
* 
*/

@RestController
@RequestMapping("/hoteles")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> guardarHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> listarHoteles(){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.getAll());
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> obtenerHotel(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.get(hotelId));
	}
}


