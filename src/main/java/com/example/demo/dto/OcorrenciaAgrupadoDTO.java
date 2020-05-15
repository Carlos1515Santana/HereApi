package com.example.demo.dto;

import java.util.Collection;
import java.util.List;

public class OcorrenciaAgrupadoDTO {

	private String descricao;
	private long valorAgrupado;
	private Collection<OcorrenciaAgrupadoDTO> list;
	
	public OcorrenciaAgrupadoDTO(String descricao, long v){
		this.descricao = descricao;
		this.valorAgrupado = v;
	}
	public OcorrenciaAgrupadoDTO() {
		
	}
    public OcorrenciaAgrupadoDTO(Collection<OcorrenciaAgrupadoDTO> list) {
		this.list = list;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public long getValorAgrupado() {
		return this.valorAgrupado;
	}
}
