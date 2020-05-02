package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ocorrencia;
import com.example.demo.model.Usuario;
import com.example.demo.service.OcorrenciaService;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

	@Autowired
	OcorrenciaService ocorrenciaService;
	
	@Autowired
	UsuarioService usuarioService;
	
	Usuario user;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, produces = {"application/json"})	
	public Ocorrencia novaOcorrencia(@RequestBody Ocorrencia ocorrencia) {
		ocorrencia.setUsuario(usuarioService.findByUsuarioTest());
		if(ocorrencia.getUsuario() != null)
			return ocorrenciaService.cadastrar(ocorrencia);
		else
			return null;
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)	
	public List<Ocorrencia> buscarTodos( ) {
		user = usuarioService.findByUsuarioTest();
		if(user != null)
			return ocorrenciaService.findAll(user.getId());
		else
			return null;
	}
	
	@RequestMapping(value = "/buscar/{tipo}")	
	public Ocorrencia buscarOcorrenciaTipo (@PathVariable String tipo) {
   		return ocorrenciaService.findByTipo(tipo, user.getId());
	}
}
