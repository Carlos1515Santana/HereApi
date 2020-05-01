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

@Entity
public class Ocorrencia {
	
	public Ocorrencia( ) {
		
	}

	public Ocorrencia(int id, Tipo_ocorrecia tipo_ocorrencia, Endereco endereco, double longitude, double latitude, String descricao, Calendar data) {
		this.id              = id;
		this.tipo_ocorrencia = tipo_ocorrencia;
		this.endereco        = endereco;
		this.longitude       = longitude;
		this.latitude        = latitude;
		this.descricao       = descricao;
		this.data            = data;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tipo_ocorrecia getTipo_ocorrencia() {
		return tipo_ocorrencia;
	}

	public void setTipo_ocorrencia(Tipo_ocorrecia tipo_ocorrencia) {
		this.tipo_ocorrencia = tipo_ocorrencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}
