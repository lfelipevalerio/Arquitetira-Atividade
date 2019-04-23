package br.usjt.usjt_ccp3anmca_springdata.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import br.usjt.usjt_ccp3anmca_springdata.model.Cidade;


public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	@Async
	public Future<List<Cidade>> findByNome(String nome);
	
	@Query("SELECT a FROM Cidade a WHERE a.nome = ?1")
	public List<Cidade> buscarPeloNome(String nome);
	
	public Cidade buscarPorLatitudeELongitude (@Param ("longitude") String longitude, @Param ("latitude") String latitude);

}
