package br.com.wainambi.wainambi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vocabulario")
@NoArgsConstructor
@AllArgsConstructor
@Data
//@EqualsAndHashCode(exclude = { "" })
@Builder
public class Vocabulo {
	
	@Id
	@Column(name = "palavra_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String palavraPortugues;
	private String palavraNheengatu;
	private String frasePortugues;
	private String fraseNheengatu;
	 	
}
