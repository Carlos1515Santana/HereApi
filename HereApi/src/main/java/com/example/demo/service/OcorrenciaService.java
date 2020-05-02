package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ocorrencia;
import com.example.demo.repository.OcorrenciaRepository;
 
@Service
public class OcorrenciaService {
	
	@Autowired
	OcorrenciaRepository ocorrenciaRepository;

	public Ocorrencia cadastrar(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);
	}
	
	public List<Ocorrencia> findAll(int id) {
		return ocorrenciaRepository.findAllTodos(id);
	}
	
	public Ocorrencia findByTipo(String tipo, int id) {
		return ocorrenciaRepository.findByTipo(tipo, id);
	}
}
