package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enums.Tipo_ocorrecia;
import com.example.demo.model.Ocorrencia;
import com.example.demo.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {
	
	@Autowired
	OcorrenciaRepository ocorrenciaRepository;

	public Ocorrencia cadastrar(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);
	}
	
	public List<Ocorrencia> findAll() {
		return ocorrenciaRepository.findAll();
	}
	
	public Ocorrencia findByTipo(String tipo) {
		return ocorrenciaRepository.findByTipo(tipo);
	}
}
