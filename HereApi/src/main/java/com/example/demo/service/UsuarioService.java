package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired 
	UsuarioRepository usuarioRepository;
	
	public Usuario cadastrar( Usuario usuario ) {
		return usuarioRepository.save( usuario );
	}
	
	public Usuario findByUsuario( Usuario usuario ) {
		return usuarioRepository.findByUsuario( usuario.getUsuario( ) );
	}

}
