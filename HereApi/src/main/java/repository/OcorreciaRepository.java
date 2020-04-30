package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Ocorrencia;

@Repository
public interface OcorreciaRepository extends JpaRepository<Ocorrencia, Integer>{
	
	public Ocorrencia findByOcorrencia( Ocorrencia ocorrecia );
	public List<Ocorrencia> findAll( );
	public  Ocorrencia save( Ocorrencia o );
	void    delete         ( Integer id   );
	boolean exists         ( Integer id   );
}
