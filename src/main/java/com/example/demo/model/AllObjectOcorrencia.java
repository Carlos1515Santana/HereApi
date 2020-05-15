package com.example.demo.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AllObjectOcorrencia implements Serializable  {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long id_ocorrencia;
	
	@Column(name="RUBRICA")
	private String rubrica;
	
	@Column(name="DELEGACIA_NOME")
	private String delegacia_nome;
	
	@Column(name="HORA_OCORRENCIA")
	private Calendar hora_ocorrencia;
	
	@Column(name="DATAOCORRENCIA")
	private Calendar dataocorrencia;
	
	@Column(name="DESCRICAO_LOCAL")
	private String descricao_local;
	
	@Column(name="PERIODO_OCORRENCIA")
	private String periodo_ocorrencia;
	
	@Column(name="BAIRRO")
	private String bairro;
	
	@Column(name="CIDADE")
	private String cidade;
	
	@Column(name="LATITUDE")
	private double latitude;
	
	@Column(name="LONGITUDE")
	private double longitude;
	
	@Column(name="LOUGRADOURO")
	private String lougradouro;
	
	@Column(name="MARCACELULAR")
	private String marca_celular;
	
	@Column(name="DESCR_MARCA_VEICULO")
	private String descr_marca_veiculo;
	

	public AllObjectOcorrencia() {
		super();
	}
	
	

	public AllObjectOcorrencia(long id_ocorrencia, String rubrica, String delegacia_nome, Calendar hora_ocorrencia,
			String descricao_local, String periodo_ocorrencia, String bairro, String cidade, double latitude,
			double longitude, String lougradouro, String marca_celular, String descr_marca_veiculo) {
		super();
		this.id_ocorrencia = id_ocorrencia;
		this.rubrica = rubrica;
		this.delegacia_nome = delegacia_nome;
		this.hora_ocorrencia = hora_ocorrencia;
		this.descricao_local = descricao_local;
		this.periodo_ocorrencia = periodo_ocorrencia;
		this.bairro = bairro;
		this.cidade = cidade;
		this.latitude = latitude;
		this.longitude = longitude;
		this.lougradouro = lougradouro;
		this.marca_celular = marca_celular;
		this.descr_marca_veiculo = descr_marca_veiculo;
	}



	public long getId_ocorrencia() {
		return id_ocorrencia;
	}



	public void setId_ocorrencia(long id_ocorrencia) {
		this.id_ocorrencia = id_ocorrencia;
	}



	public String getRubrica() {
		return rubrica;
	}



	public void setRubrica(String rubrica) {
		this.rubrica = rubrica;
	}



	public String getDelegacia_nome() {
		return delegacia_nome;
	}



	public void setDelegacia_nome(String delegacia_nome) {
		this.delegacia_nome = delegacia_nome;
	}



	public Calendar getHora_ocorrencia() {
		return hora_ocorrencia;
	}



	public void setHora_ocorrencia(Calendar hora_ocorrencia) {
		this.hora_ocorrencia = hora_ocorrencia;
	}



	public String getDescricao_local() {
		return descricao_local;
	}



	public void setDescricao_local(String descricao_local) {
		this.descricao_local = descricao_local;
	}



	public String getPeriodo_ocorrencia() {
		return periodo_ocorrencia;
	}



	public void setPeriodo_ocorrencia(String periodo_ocorrencia) {
		this.periodo_ocorrencia = periodo_ocorrencia;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public String getLougradouro() {
		return lougradouro;
	}



	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}



	public String getMarca_celular() {
		return marca_celular;
	}



	public void setMarca_celular(String marca_celular) {
		this.marca_celular = marca_celular;
	}



	public String getDescr_marca_veiculo() {
		return descr_marca_veiculo;
	}



	public void setDescr_marca_veiculo(String descr_marca_veiculo) {
		this.descr_marca_veiculo = descr_marca_veiculo;
	}

	
	
}
