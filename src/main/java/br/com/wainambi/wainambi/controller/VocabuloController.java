package br.com.wainambi.wainambi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.wainambi.wainambi.dto.RequisicaoNovoVocabulo;
import br.com.wainambi.wainambi.model.Vocabulo;
import br.com.wainambi.wainambi.repository.VocabuloRepository;

@Controller
@RequestMapping("vocabulo")
public class VocabuloController {

	@Autowired
	private VocabuloRepository vocabuloRepository;
	
	@GetMapping("formulario")
	public String formulario(RequisicaoNovoVocabulo requisicao) {
		return "vocabulo/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoVocabulo requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "vocabulo/formulario";
		}
		
		
		Vocabulo vocabulo = requisicao.toVocabulo();
		vocabuloRepository.save(vocabulo);		
		
		return "home";
	}
}
