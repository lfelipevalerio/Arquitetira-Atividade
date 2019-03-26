package br.usjt.appprevisoes.controller;

import java.util.List;
//Out project
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
//In project
import br.usjt.appprevisoes.model.Previsao;
import br.usjt.appprevisoes.repository.PrevisoesRepository;

@Controller
public class PrevisoesController {

	@Autowired
	private PrevisoesRepository previsaoRepo;

	@Autowired
	private PrevisoesService previsoesService;

	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_previsoes");
		// Busque a coleção com o repositório
		List<Previsao> previsoes = previsoesService.findAll();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("previsoes", previsoes);
		// devolva o ModelAndView
		return mv;
	}

	@PostMapping("/previsoes")
	public String salvar(Previsao previsoes) {
		// salvando com o service
		previsoesService.salvar(previsoes);
		return "redirect:/previsoes";
	}

}
