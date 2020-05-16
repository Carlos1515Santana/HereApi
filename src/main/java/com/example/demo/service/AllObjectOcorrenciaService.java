package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OcorrenciaAgrupadoDTO;
import com.example.demo.model.AllObjectOcorrencia;
import com.example.demo.repository.AllObjectOcorrenciaRepository;

@Service
public class AllObjectOcorrenciaService {
	
	@Autowired
	AllObjectOcorrenciaRepository repository;
	
	public  List<OcorrenciaAgrupadoDTO> listaOcorrencia() {
	// return	repository.buscarQtdFurtoPorBairro();
		return null;
	}
	
	
	public List<AllObjectOcorrencia> listar(){
		return repository.findAll();
	}
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorDia(){
//		return this.repository.findFurtoPorDia();
		return null;
	}
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorMes(){
//		return this.repository.findFurtoPorMes();
		return null;
	}
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorAno(){
//		return this.repository.findFurtoPorAno();
		return null;
	}
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorMarcaVeiculo(){
//		return this.repository.findFurtoRouboCarro();
		return null;
	}
	public List<OcorrenciaAgrupadoDTO> listarOcorrenciaPorMarcaCelular(){
//		return this.repository.findFurtoRouboCelular();
		return null;
	}

}
