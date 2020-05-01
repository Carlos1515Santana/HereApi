package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
 		System.out.println("Cadastrado!!");
		return userService.cadastrar(user);
	}

}
