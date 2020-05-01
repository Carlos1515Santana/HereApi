package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	public Usuario( ){
		
	}
	
	public Usuario( int id, String usuario, String email, int idade ) {
		this.id      = id;
		this.usuario = usuario;
		this.email   = email;
		this.idade   = idade;
	}

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;

	@Column
	private String usuario;
	
	@Column
	private String email;
	
	@Column
	private int idade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
