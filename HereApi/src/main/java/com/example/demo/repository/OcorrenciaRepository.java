package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends CrudRepository<Ocorrencia, Integer>{
	
	Optional<Ocorrencia> findById( Integer id );
	
//	public List<Ocorrencia> findAll( );
//	public  Ocorrencia save( Ocorrencia o );
	
//	void    delete         ( Integer id   );
//	boolean exists         ( Integer id   );
	
	
}
