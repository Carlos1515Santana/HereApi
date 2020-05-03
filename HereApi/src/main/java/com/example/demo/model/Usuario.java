package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Usuario {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;

	@Column
	@UniqueElements
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String senha;
	
	@Column
	private int idade;
	
	@OneToMany(mappedBy="usuario", targetEntity=Ocorrencia.class, cascade=CascadeType.PERSIST)
	@JsonIgnoreProperties
	private List<Ocorrencia> ocorrencias;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return nome;
	}

	public void setUsuario(String usuario) {
		this.nome = usuario;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
