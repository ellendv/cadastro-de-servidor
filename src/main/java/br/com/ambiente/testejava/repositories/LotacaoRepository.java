package br.com.ambiente.testejava.repositories;

import br.com.ambiente.testejava.model.Lotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotacaoRepository extends JpaRepository<Lotacao, Long> {
     Lotacao findByNome(String nome);
}
