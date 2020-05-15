package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OcorrenciaAgrupadoDTO;
import com.example.demo.model.AllObjectOcorrencia;
import com.example.demo.service.AllObjectOcorrenciaService;

@RestController
@RequestMapping("/OcorrenciaListagem")
@CrossOrigin
public class AllObjectOcorrenciaController {
	
	@Autowired
	private AllObjectOcorrenciaService service;
	
	@RequestMapping(value = "/buscarFurtoAgrupBairro", method = RequestMethod.GET)	
	public List<OcorrenciaAgrupadoDTO> BuscarOcorrencia() {
		return service.listaOcorrencia();
	}
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public List<AllObjectOcorrencia> BuscarTodasOcorrencia(){
		return service.listar();
	}
	@RequestMapping(value= "/listarOcorrenciaPorDia", method= RequestMethod.GET)
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorDia(){
		return this.service.listarOcorrenciaPorMes();
	}
	@RequestMapping(value= "/listarOcorrenciaPorMes", method= RequestMethod.GET)
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorMes(){
		return this.service.listarOcorrenciaPorMes();
	}
	@RequestMapping(value= "/listarOcorrenciaPorAno", method= RequestMethod.GET)
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorAno(){
		return this.service.listarOcorrenciaPorMes();
	}
	@RequestMapping(value= "/listarOcorrenciaPorMarcaVeiculo", method= RequestMethod.GET)
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorMarcaVeiculo(){
		return this.service.listarOcorrenciaPorMarcaVeiculo();
	}
	
	@RequestMapping(value= "/listarOcorrenciaPorMarcaCelular", method= RequestMethod.GET)
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorMarcaCelular(){
		return this.service.listarOcorrenciaPorMarcaCelular();
	}

}
