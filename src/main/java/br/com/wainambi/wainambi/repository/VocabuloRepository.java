package br.com.wainambi.wainambi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wainambi.wainambi.model.Vocabulo;

@Repository
public interface VocabuloRepository extends JpaRepository<Vocabulo, Long> {

	List<Vocabulo> findAllByPalavraPortugues(String palavraPortugues);
	
	// TODO : pode ser que de errado; então substituir ID (Long) por Usuario (objeto)
    // List<Servicos> findAllByUsuarioId(Long usuarioId);
	
}
