package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService{

	@Autowired 
	UsuarioRepository usuarioRepository;
	
	public Usuario cadastrar( Usuario usuario ) {
		System.out.println("Cadastrado!!");
		return usuarioRepository.save( usuario );
	}
	
	public boolean findByUsuario(String usuario, String senha) {
		if( usuarioRepository.findByTest(usuario, senha) != null )
			return true;
		else
			return false;
 	}
}
