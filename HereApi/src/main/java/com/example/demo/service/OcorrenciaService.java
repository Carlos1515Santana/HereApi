package com.example.demo.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ocorrencia;
import com.example.demo.repository.OcorrenciaRepository;
 
@Service
public class OcorrenciaService implements IOcorrenciaService{
	
	@Autowired
	OcorrenciaRepository ocorrenciaRepository;

	int contador = 0;
	
	public Ocorrencia cadastrar(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);
	}
	
	public List<Ocorrencia> findAll(int id) {
		return ocorrenciaRepository.findAllTodos(id);
	}
	
	public Ocorrencia findByTipo(String tipo, int id) {
		return ocorrenciaRepository.findByTipo(tipo, id);
	}
	
	@Override
	public String decode(String base64Image) {
		String path;
		Path currentPath = Paths.get("");
		Path absolutePath = currentPath.toAbsolutePath();
		String pathBase = absolutePath + "/src/main/resources/static/fotos/Imagem";
		
		if(contador != 0)
			path = geraPath(pathBase);
		else
			path = pathBase + "-01.png";

		path = path.replace("\\", "/");

		try (FileOutputStream imageOutFile = new FileOutputStream(path)) {	
		// Converting a Base64 String into Image byte array
			byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
		    imageOutFile.write(imageByteArray);
		} 
		catch (FileNotFoundException e) {
			System.out.println("Image not found" + e);
		} 
		catch (IOException ioe) {
			System.out.println("Exception while reading the Image " + ioe);
		}
		return path;
	}

	//Padrão 'Imagem-01.jpg'
	@Override
	public String geraPath(String path) {
		contador++;
		int id = ocorrenciaRepository.findLast();
 		String idString = String.valueOf(id+1);
		path = path + "-" + idString + ".png";
		return path;
	}	
}
