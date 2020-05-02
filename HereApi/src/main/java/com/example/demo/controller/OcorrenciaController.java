package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ocorrencia;
import com.example.demo.service.OcorrenciaService;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

	@Autowired
	OcorrenciaService ocorrenciaService;
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, produces = {"application/json"})	
	public Ocorrencia novaOcorrencia(@RequestBody Ocorrencia ocorrencia) {
		return ocorrenciaService.cadastrar(ocorrencia);
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)	
	public List<Ocorrencia> buscarTodos( ) {
  		return ocorrenciaService.findAll( );
	}
	
	@RequestMapping(value = "/buscar/{tipo}")	
	public Ocorrencia buscarOcorrenciaTipo (@PathVariable String tipo) {
  		return ocorrenciaService.findByTipo(tipo);
	}
}
