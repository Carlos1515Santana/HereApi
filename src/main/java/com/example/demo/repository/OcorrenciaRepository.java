package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Integer>{
	
//	@Query(value =  "select * from Ocorrencia o where o.tipo_ocorrencia = :tipo and o.usuario_id = :id", nativeQuery = true)
//	public Ocorrencia findByTipo(@Param("tipo") String tipo, @Param("id" ) int id);
//	
//	@Query(value =  "select * from Ocorrencia o where o.usuario_id = :id", nativeQuery = true)
//	public List<Ocorrencia> findAllTodos(@Param("id") int id); 
//	
//	@Query(value =  "SELECT id FROM ocorrencia ORDER BY id DESC LIMIT 1", nativeQuery = true)
//	public Integer findLast(); 
}
