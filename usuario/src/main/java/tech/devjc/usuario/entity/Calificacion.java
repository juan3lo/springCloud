package tech.devjc.usuario.entity;

import lombok.Getter;
import lombok.Setter;

/**
* @author juan3lo
* 
*/

@Getter
@Setter
public class Calificacion {
	
	private String calificacionId;
	private String usuarioId;
	private String hotelId;
	private String calificacion;
	private String observaciones;
	private Hotel hotel;
	
}


