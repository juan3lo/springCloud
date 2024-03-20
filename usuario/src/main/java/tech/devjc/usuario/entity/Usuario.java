package tech.devjc.usuario.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

/**
* @author juan3lo
* 
*/

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@Column(name = "id")
	private String usuarioId;
	
	@Column(name = "nombre", length = 20)
	private String nombre;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "informacion")
	private String informacion;
	
	//@Column(name = "informacion")
	@Transient
	private List<Calificacion> calificaciones = new ArrayList<>();
	}


