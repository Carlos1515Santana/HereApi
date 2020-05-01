package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	int id;

	@Column
	String usuario;
	
	@Column
	String email;
	
	@Column
	int idade;
}
