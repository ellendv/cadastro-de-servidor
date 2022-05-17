package br.com.ambiente.testejava.repositories;

import br.com.ambiente.testejava.model.Lotacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotacaoRepository extends JpaRepository<Lotacao, Long> {
}
