package br.usjt.previsoesV2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsoesV2.model.*;
import br.usjt.previsoesV2.repositpry.*;

@Service
public class DiaSemanaService {

	
	@Autowired
	private DiaSemanaRepository diaSemanaRepo;
	
	public void salvar (DiaSemana diaSemana) {
		diaSemanaRepo.save(diaSemana);
	}
	
	public List<DiaSemana> listarTodos(){
		return diaSemanaRepo.findAll();
	}
}
