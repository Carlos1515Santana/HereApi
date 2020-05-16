package com.example.demo.service;

import java.io.File;
import java.io.FileInputStream;
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
	
	public Ocorrencia cadastrar(Ocorrencia ocorrencia) {
		ocorrencia.setPathFoto(decode(ocorrencia.getPathFoto()));
//		return ocorrenciaRepository.save(ocorrencia);
		return null;
	}
	
	public List<Ocorrencia> findAll(int id) {
//		List<Ocorrencia> ocorrencias = ocorrenciaRepository.findAllTodos(id);
//		for(Ocorrencia c: ocorrencias) {
//			c.setImage(encoder(c.getPathFoto()));
//		}
//		return ocorrencias;
		return null;
	}
	
	public Ocorrencia findByTipo(String tipo, int id) {
//		Ocorrencia ocorrencia = ocorrenciaRepository.findByTipo(tipo, id);
//		ocorrencia.setImage(encoder(ocorrencia.getPathFoto()));
//		return ocorrencia;
		return null;
	}
	
	@Override
	public String decode(String base64Image) {
//		String path;
//		Path currentPath = Paths.get("");
//		Path absolutePath = currentPath.toAbsolutePath();
//		String pathBase = absolutePath + "/src/main/resources/static/fotos/Imagem";
// 		path = geraPath(pathBase);
// 		
//		path = path.replace("\\", "/");
//
//		try (FileOutputStream imageOutFile = new FileOutputStream(path)) {	
// 			byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
//		    imageOutFile.write(imageByteArray);
//		} 
//		catch (FileNotFoundException e) {
//			System.out.println("Image not found" + e);
//		} 
//		catch (IOException ioe) {
//			System.out.println("Exception while reading the Image " + ioe);
//		}
//		return path;
		return null;
	}

	//Padrão 'Imagem-1.jpg'
	@Override
	public String geraPath(String path) {
//		String idString;
// 		Integer id = ocorrenciaRepository.findLast();
// 		if(id != null)
// 			idString = String.valueOf(id+1);
// 		else
// 			idString = String.valueOf(01);
// 		
//		path = path + "-" + idString + ".png";	
//		return path;
		return null;
	}

	@Override
	public String encoder(String imagePath) {
//	    String base64Image = "";
//	    File file = new File(imagePath);
//	    try (FileInputStream imageInFile = new FileInputStream(file)) {
// 	      byte imageData[] = new byte[(int) file.length()];
//	      imageInFile.read(imageData);
//	      base64Image = Base64.getEncoder().encodeToString(imageData);
//	    } catch (FileNotFoundException e) {
//	      System.out.println("Image not found" + e);
//	    } catch (IOException ioe) {
//	      System.out.println("Exception while reading the Image " + ioe);
//	    }
//	    return base64Image;
		return null;
	  }
}
