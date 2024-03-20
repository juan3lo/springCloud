package tech.devjc.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.devjc.usuario.entity.Usuario;

/**
* @author juan3lo
* 
*/

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}


