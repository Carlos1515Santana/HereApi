package com.example.demo.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Ocorrencia {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
    
	@Column
	private String tipo_ocorrencia;
	
	@OneToOne(cascade = CascadeType.PERSIST)
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
	
	@Column
	private String pathFoto;
	
	@ManyToOne 
	@JsonIgnoreProperties
	private Usuario usuario;
	
	@Column
	@JsonIgnoreProperties
	private String image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo_ocorrencia() {
		return tipo_ocorrencia;
	}

	public void setTipo_ocorrencia(String tipo_ocorrencia) {
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getPathFoto() {
		return pathFoto;
	}

	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
