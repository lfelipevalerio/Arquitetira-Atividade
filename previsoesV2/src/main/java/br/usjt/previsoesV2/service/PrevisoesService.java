package br.usjt.previsoesV2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsoesV2.model.Previsao;
import br.usjt.previsoesV2.repositpry.PrevisoesRepository;

@Service
public class PrevisoesService {
	
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	public void salvar (Previsao previsao) {
		previsoesRepo.save(previsao);
	}
	
	public List<Previsao> listarTodos(){
		return previsoesRepo.findAll();
	}

}
