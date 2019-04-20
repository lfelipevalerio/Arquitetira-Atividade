package br.usjt.previsoesV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsoesV2.model.Previsao;
import br.usjt.previsoesV2.service.PrevisoesService;

@Controller
public class PrevisoesController {
	
	@Autowired
	public PrevisoesService previsoesService;
	
	@GetMapping ("/previsoes")
	public ModelAndView listarPrevisoes() {
		
		ModelAndView mv = new ModelAndView ("lista_previsoes");
		
		List <Previsao> previsoes = previsoesService.listarTodos();
		
		mv.addObject("previsoes", previsoes);
		
		mv.addObject(new Previsao());
		
		
		return mv;
	}
	@PostMapping 
	public String salvar (Previsao previsao) {
		previsoesService.salvar(previsao);
		return "redirect:/previsoes";
	}
}
