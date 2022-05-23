package br.com.ambiente.testejava.service;

import br.com.ambiente.testejava.model.Lotacao;
import br.com.ambiente.testejava.model.dto.LotacaoDto;
import br.com.ambiente.testejava.repositories.LotacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class LotacaoService {
    private final LotacaoRepository lotacaoRepository;

    public LotacaoService(LotacaoRepository lotacaoRepository) {
        this.lotacaoRepository = lotacaoRepository;
    }

    public Lotacao cadastrarLotacao(LotacaoDto lotacaoDto){
        Calendar c = Calendar.getInstance();
        Lotacao lotacao = new Lotacao(lotacaoDto.getNome(), c.getTime());
        return lotacaoRepository.save(lotacao);
    }
    public Lotacao buscarNome(String nome) {
        Lotacao lotacao=lotacaoRepository.findByNome(nome);
        return lotacao;
    }

    public Lotacao atualizarLotacao(Long id, LotacaoDto lotacaoDto) {
        Lotacao lotacao = lotacaoRepository.findById(id).orElseThrow(() -> new RuntimeException("lotacão não encontrada"));
        lotacao.setNome(lotacaoDto.getNome());
        return lotacao;
    }
}
