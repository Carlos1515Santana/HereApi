package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService{

	@Autowired 
	UsuarioRepository usuarioRepository;
	
	public String usuario;
	public String senha;
	
	public Usuario cadastrar( Usuario usuario ) {
		System.out.println("Cadastrado!!");
		return usuarioRepository.save( usuario );
	}
	
	public Usuario findByUsuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha   = senha;
		Usuario user = usuarioRepository.findByTest(usuario, senha);
		 
		if( user != null )
			return user;
		else
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
 	}
	
	public Usuario findByUsuarioTest( ) {
		return usuarioRepository.findByTest(usuario, senha);
	}
}
