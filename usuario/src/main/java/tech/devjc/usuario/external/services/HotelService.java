package tech.devjc.usuario.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tech.devjc.usuario.entity.Hotel;

/**
 * @author juan3lo
 * 
 */

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

	@GetMapping("/hoteles/{hotelId}")
	Hotel getHotel(@PathVariable String hotelId);
}
