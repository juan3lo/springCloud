package tech.devjc.usuario.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import tech.devjc.usuario.entity.Calificacion;
import tech.devjc.usuario.entity.Usuario;
import tech.devjc.usuario.entity.Hotel;
import tech.devjc.usuario.exceptions.ResourceNotFoundException;
import tech.devjc.usuario.repository.UsuarioRepository;
import tech.devjc.usuario.service.UsuarioService;

/**
* @author juan3lo
* 
*/

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		String randomUsuarioId = UUID.randomUUID().toString();
		usuario.setUsuarioId(randomUsuarioId);
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override	
	public Usuario getUsuario(String usuarioId) {
		Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con el ID: " + usuarioId));
		
		Calificacion[] calificacionUsuario = restTemplate.getForObject("http://localhost:8083/calificaciones/usuarios/"+usuario.getUsuarioId(), Calificacion[].class);
		List<Calificacion> calificaciones = Arrays.stream(calificacionUsuario).collect(Collectors.toList());
		
		List<Calificacion> listaCalificaciones = calificaciones.stream().map(c ->{
			log.info(c.getHotelId());
			ResponseEntity<Hotel> foreEntity = restTemplate.getForEntity("http://localhost:8082/hoteles/"+c.getHotelId(), Hotel.class);
			Hotel hotel = foreEntity.getBody();
			log.info("Respuesta con codigo de estado: {}", foreEntity.getStatusCode());
			c.setHotel(hotel);
			return c;
		}).collect(Collectors.toList());
		
		usuario.setCalificaciones(listaCalificaciones);
		return usuario;
	}
}


