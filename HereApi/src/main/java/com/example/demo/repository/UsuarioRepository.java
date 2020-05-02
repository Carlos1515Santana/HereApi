package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

	@Query(value =  "select * from Usuario u where u.nome = :nome and u.senha = :senha", nativeQuery = true)
	public Usuario findByTest( @Param("nome" ) String usuario,
							   @Param("senha") String senha ); 
 }