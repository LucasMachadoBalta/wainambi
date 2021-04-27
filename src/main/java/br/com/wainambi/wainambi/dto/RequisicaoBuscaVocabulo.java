package br.com.wainambi.wainambi.dto;

import javax.validation.constraints.NotBlank;

import br.com.wainambi.wainambi.model.Vocabulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequisicaoBuscaVocabulo {
	
		
	@NotBlank
	private String buscaPalavraPortugues;
	
	
	public Vocabulo buscaPalavraPortugues() {
		
		return null;
	}
}
