package model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.web.multipart.MultipartFile;

import enums.Tipo_ocorrecia;
import lombok.Data;

@Data
public class Ocorrencia {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	int id_ocorrencia;
	
	@Enumerated(EnumType.STRING)
	Tipo_ocorrecia tipo_ocorrencia;
	
	@OneToOne
	Endereco endereco;
	
	@Column
	double longitude;
	
	@Column
	double latitude;
	
	MultipartFile imagem;
	
	@Column
	String descricao;
	
	@Column
	Calendar data;
}
