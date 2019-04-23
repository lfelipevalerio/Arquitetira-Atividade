package br.usjt.usjt_ccp3anmca_springdata.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	public Aluno findByEmail (String email);
	
	public List <Aluno> queryByNome (String nome);

	@Async
	public Future<List<Aluno>> findByNome(String nome);

	@Query("SELECT a FROM Aluno a WHERE a.email = ?1")
	public List<Aluno> buscarPeloEmail(String email);

	@Query("SELECT a FROM Aluno a WHERE a.nome LIKE ?1%")
	public List<Aluno> buscarPorLetraInicialDoNome(String letra);
	
	@Query ("SELECT a FROM Aluno a WHERE a.fone = :fone")
	public List <Aluno> buscarPorTelefone (@Param ("fone") String fone);
	
	public Aluno buscarPeloNomeEPeloEmail (@Param ("nome") String nome, @Param ("email") String email);


}
