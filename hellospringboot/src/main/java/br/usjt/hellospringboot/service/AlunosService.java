package br.usjt.hellospringboot.service;

@Service
public class AlunosService {
	@Autowired
	private AlunosRepository alunosRepo;

	@Autowired
	private Calculadora calculadora;

	public void salvar(Aluno aluno) {
		alunosRepo.save(aluno);
	}

	public List<Aluno> listarTodos() {
		List<Aluno> alunos = alunosRepo.findAll();
		for (Aluno aluno : alunos)
			aluno.setMediaFinal(calculadora.calculaMedia(aluno.getNota1(), aluno.getNota2()));
		return alunos;
	}
}