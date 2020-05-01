package com.example.demo.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.enums.Tipo_ocorrecia;

import lombok.Data;

@Data
@Entity
public class Ocorrencia {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private int id;
	
	@Enumerated(EnumType.STRING)
	private Tipo_ocorrecia tipo_ocorrencia;
	
	@OneToOne
	@Autowired
	private Endereco endereco;
	
	@Column
	private double longitude;
	
	@Column
	private double latitude;
		
	@Column
	private String descricao;
	
	@Column
	private Calendar data;
}
