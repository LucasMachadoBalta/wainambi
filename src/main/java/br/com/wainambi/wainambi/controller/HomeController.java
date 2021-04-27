package br.com.wainambi.wainambi.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.wainambi.wainambi.model.Vocabulo;
import br.com.wainambi.wainambi.repository.VocabuloRepository;

@Controller
//@SpringBootApplication
public class HomeController {
	
	@Autowired
	private VocabuloRepository vocabuloRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Vocabulo> vocabulos = vocabuloRepository.findAll();		
		model.addAttribute("vocabulos", vocabulos);
		
		return "home"; 
	}
	
	@GetMapping("vocabulo/busca/{palavraPortugues}")
	public String busca(@PathParam(value = "") String palavraPortugues, Model model) { //, BindingResult result
		
		
		List<Vocabulo> vocabulos = vocabuloRepository.findAllByPalavraPortugues(palavraPortugues);
//		List<Vocabulo> vocabulos = vocabuloRepository.findAll();
		
		
//		List<Long> resultadoBusca = vocabulos.stream()
//					.filter(p -> vocabulos.contains(p.getPalavraPortugues()))
//					.map(Vocabulo::getId).collect(Collectors.toList());
		
		model.addAttribute("vocabulos", vocabulos);
	
		return "home";
	}
	
}