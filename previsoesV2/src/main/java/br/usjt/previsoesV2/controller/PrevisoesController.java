package br.usjt.previsoesV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsoesV2.model.Previsao;
import br.usjt.previsoesV2.repositpry.PrevisoesRepository;

@Controller
public class PrevisoesController {

	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	@GetMapping ("/previsoes")
	public ModelAndView listarPrevisoes() {
		
		ModelAndView mv = new ModelAndView ("lista_previsoes");
		
		List <Previsao> previsoes = previsoesRepo.findAll();
		
		mv.addObject("previsoes", previsoes);
		
		return mv;
	}
}
