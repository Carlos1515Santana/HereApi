package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.OcorrenciaAgrupadoDTO;
import com.example.demo.model.AllObjectOcorrencia;

@Repository
public interface AllObjectOcorrenciaRepository  extends JpaRepository<AllObjectOcorrencia, Long> {
	
	@Query(value="SELECT f.* FROM all_object_ocorrencia f where f.latitude is not null and f.longitude is not null", nativeQuery = true)
	public List<AllObjectOcorrencia> findAll();
	
	@Query(value ="SELECT new com.example.demo.dto.OcorrenciaAgrupadoDTO( f.bairro, COUNT(1)) FROM AllObjectOcorrencia as f WHERE f.rubrica LIKE ('FURTO (ART. 155)%') and f.bairro is not null GROUP BY f.bairro")
	List<OcorrenciaAgrupadoDTO> buscarQtdFurtoPorBairro();
	
	@Query("SELECT new com.example.demo.dto.OcorrenciaAgrupadoDTO( DATE_FORMAT(f.dataocorrencia,'%m/%Y'),  COUNT(1)) FROM AllObjectOcorrencia f WHERE (f.rubrica LIKE('%157%') OR f.rubrica LIKE('%155%')) GROUP BY DATE_FORMAT(f.dataocorrencia,'%m/%Y')")
	public List<OcorrenciaAgrupadoDTO> findFurtoPorMes();
	
	@Query("SELECT new com.example.demo.dto.OcorrenciaAgrupadoDTO(DATE_FORMAT(f.dataocorrencia,'%Y'),  COUNT(1)) FROM AllObjectOcorrencia f WHERE (f.rubrica LIKE('%157%') OR f.rubrica LIKE('%155%')) GROUP BY DATE_FORMAT(f.dataocorrencia,'/%Y')")
	public List<OcorrenciaAgrupadoDTO> findFurtoPorAno();
	
	@Query("SELECT new com.example.demo.dto.OcorrenciaAgrupadoDTO(DATE_FORMAT(f.dataocorrencia,'%d/%m/%Y'),  COUNT(1)) FROM AllObjectOcorrencia f WHERE (f.rubrica LIKE('%157%') OR f.rubrica LIKE('%155%')) GROUP BY DATE_FORMAT(f.dataocorrencia,'%d/%m/%Y')")
	public List<OcorrenciaAgrupadoDTO> findFurtoPorDia();
	
	@Query("SELECT new com.example.demo.dto.OcorrenciaAgrupadoDTO(f.marca_celular,  COUNT(1)) FROM AllObjectOcorrencia f WHERE (f.rubrica LIKE('%157%') OR f.rubrica LIKE('%155%')) AND f.marca_celular is not null GROUP BY f.marca_celular")
	public List<OcorrenciaAgrupadoDTO> findFurtoRouboCelular();
	
	@Query("SELECT new com.example.demo.dto.OcorrenciaAgrupadoDTO(f.descr_marca_veiculo, COUNT(1)) FROM AllObjectOcorrencia f WHERE (f.rubrica LIKE('%157%') OR f.rubrica LIKE('%155%')) AND f.descr_marca_veiculo is not null GROUP BY f.descr_marca_veiculo")
	public List<OcorrenciaAgrupadoDTO> findFurtoRouboCarro();


}
