package tech.devjc.usuario.service;

import java.util.List;

import tech.devjc.usuario.entity.Usuario;

/**
* @author juan3lo
* 
*/

public interface UsuarioService {
	
	Usuario saveUsuario(Usuario usuario);
	List<Usuario> getAllUsuarios();
	Usuario getUsuario(String usuarioId);

}


