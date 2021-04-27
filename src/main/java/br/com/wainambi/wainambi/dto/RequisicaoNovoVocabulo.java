package br.com.wainambi.wainambi.dto;

import javax.validation.constraints.NotBlank;

import br.com.wainambi.wainambi.model.Vocabulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequisicaoNovoVocabulo {
	
	@NotBlank
	private String palavraPortugues;
	
	@NotBlank
	private String palavraNheengatu;
	
	@NotBlank
	private String frasePortugues;
	
	@NotBlank
	private String fraseNheengatu;
	
	public Vocabulo toVocabulo() {
		Vocabulo vocabulo = new Vocabulo();
		
		vocabulo.setPalavraPortugues(palavraPortugues);
		vocabulo.setPalavraNheengatu(palavraNheengatu);
		vocabulo.setFrasePortugues(frasePortugues);
		vocabulo.setFraseNheengatu(fraseNheengatu);
		
		return vocabulo;
	}
}
