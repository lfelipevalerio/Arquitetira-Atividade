package br.usjt.previsoesV2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import br.usjt.previsoesV2.model.Cidade;
import br.usjt.previsoesV2.repositpry.CidadesRepository;

@RunWith (SpringRunner.class)
@SpringBootTest
public class CidadeTest {
	
	@Autowired
	private CidadesRepository cidadesRepository;

	@Test
	public void testBuscaPorNome() {
		Cidade cidade = cidadesRepository.findByNome("São Paulo");
		System.out.println(cidade);
	}
	
	@Test
	public void TestBuscaPorLatitudeELongitude() {
		Cidade cidade = cidadesRepository.findByLatitudeAndLongitude("-23.5489", "-46.6388");
		System.out.println(cidade);
	}
	
	@Test
	public void testBuscaTodos() {
		List<Cidade> list = cidadesRepository.findAll();
		System.out.println(list);
	}
	
}
