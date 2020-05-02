package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Integer>{
	
	@Query(value =  "select * from Ocorrencia o where o.tipo_ocorrencia = :tipo ", nativeQuery = true)
	public Ocorrencia findByTipo( @Param("tipo" ) String tipo ); 
}
