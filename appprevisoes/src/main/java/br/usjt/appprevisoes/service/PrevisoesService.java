package br.usjt.appprevisoes.service;

public class PrevisoesService {
	@Autowired
	private PrevisoesRepository previsaoRepo;

	public void salvar(Previsao previsao) {
		previsaoRepo.save(previsao);
	}

	public List<Previsao> listarTodos() {
		return previsaoRepo.findAll();
	}

}
