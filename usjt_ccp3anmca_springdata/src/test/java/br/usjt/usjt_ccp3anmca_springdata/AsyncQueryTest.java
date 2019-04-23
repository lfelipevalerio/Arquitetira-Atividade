package br.usjt.usjt_ccp3anmca_springdata;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.usjt_ccp3anmca_springdata.model.Aluno;
import br.usjt.usjt_ccp3anmca_springdata.model.Cidade;
import br.usjt.usjt_ccp3anmca_springdata.repository.AlunoRepository;
import br.usjt.usjt_ccp3anmca_springdata.repository.CidadeRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AsyncQueryTest {

	@Autowired
	private AlunoRepository alunoRepo;

	@Test
	public void findOneTest() {
		Aluno a = alunoRepo.findByEmail("ana@usjt.br");
		System.out.println(a);
	}

	@Test
	public void findManyTest() {
		List<Aluno> alunos = alunoRepo.queryByNome("Ana");
		System.out.println(alunos);
	}

	@Test
	public void testePeloNome() throws InterruptedException, ExecutionException {

		Future<List<Aluno>> future = alunoRepo.findByNome("Ana");
		System.out.println("Sucesso");
		System.out.println("Encontrou");

		List<Aluno> alunos = future.get();
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}

	@Test
	public void testePorEmailOuLetra() throws InterruptedException, ExecutionException {

		List<Aluno> alunos1 = alunoRepo.buscarPeloEmail("ana@gmail.com");
		alunos1.forEach(System.out::println);
		System.out.println("Encontrou pelo e-mail");

		List<Aluno> alunos2 = alunoRepo.buscarPorLetraInicialDoNome("a");
		alunos2.forEach(System.out::println);
		System.out.println("Encontrou pela letra");
	}

	@Test
	public void testePorNomeEEmail() {
		Aluno a = alunoRepo.buscarPeloNomeEPeloEmail("Ana", "ana@gmail.com");
		System.out.println(a);
	}
	
	@Autowired
	private CidadeRepository cidadeRepo;
	
	@Test
	public void testePeloNomeCidade() throws InterruptedException, ExecutionException {

		Future<List<Cidade>> fut = cidadeRepo.findByNome("Rio de Janeiro");

		System.out.println("Encontrou");

		}
	}

