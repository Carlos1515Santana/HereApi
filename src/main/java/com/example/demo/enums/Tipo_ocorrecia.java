package com.example.demo.enums;

public enum Tipo_ocorrecia {
	Frt( "Furto"   ),
	RBU( "Roubo"   ),
	ASS( "Assalto" );

	String tipo_ocorrencia;
	
	Tipo_ocorrecia( String tipo_ocorrencia ) {
		this.tipo_ocorrencia = tipo_ocorrencia;
	}
}
