package tech.devjc.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
* @author juan3lo
* 
*/

@Getter
@Setter
@Entity
@Table(name = "hotel")
public class Hotel {
	
	@Id
	private String id;
	private String nombre;
	private String ubicacion;
	private String informacion;
	
}


