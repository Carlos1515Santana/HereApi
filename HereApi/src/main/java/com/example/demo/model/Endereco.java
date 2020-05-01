package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Endereco {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	int id_enreco;
	
	@Column
	String nome_rua;
	
	@Column
	int cep;
}
