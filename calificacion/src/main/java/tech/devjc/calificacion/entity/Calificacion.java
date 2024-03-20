package tech.devjc.calificacion.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
* @author juan3lo
* 
*/

@Getter
@Setter
@Document("calificacion")
public class Calificacion {
	
	@Id
	private String calificacionId;
	private String usuarioId;
	private String hotelId;
	private String calificacion;
	private String observaciones;

}


