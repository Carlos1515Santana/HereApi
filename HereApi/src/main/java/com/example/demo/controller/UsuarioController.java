package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/cadastro")
public class UsuarioController {
	
	@Autowired
	private UsuarioService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.POST, produces = {"application/json"})	
	public Usuario addNewUser(@RequestBody Usuario user) {
		return userService.cadastrar(user);
	}
	
	@RequestMapping(value = "/login/{usuario}/{senha}")	
	public boolean login (@PathVariable String usuario, @PathVariable String senha) {
  		return userService.findByUsuario(usuario,senha);
	}
}
