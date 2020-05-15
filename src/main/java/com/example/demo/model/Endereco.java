package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Endereco {
	
	public Endereco( ) {
		
	}
	
	public Endereco(int id_enreco, String nome_rua, int cep) {
		this.id_enreco = id_enreco;
		this.nome_rua  = nome_rua;
		this.cep       = cep;
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	int id_enreco;
	
	@Column
	String nome_rua;
	
	@Column
	int cep;

	public int getId_enreco() {
		return id_enreco;
	}

	public void setId_enreco(int id_enreco) {
		this.id_enreco = id_enreco;
	}

	public String getNome_rua() {
		return nome_rua;
	}

	public void setNome_rua(String nome_rua) {
		this.nome_rua = nome_rua;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
}
