package br.com.ambiente.testejava.service;

import br.com.ambiente.testejava.model.Lotacao;
import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.LotacaoDto;
import br.com.ambiente.testejava.repositories.LotacaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LotacaoService {
    private final LotacaoRepository lotacaoRepository;

    public LotacaoService(LotacaoRepository lotacaoRepository) {
        this.lotacaoRepository = lotacaoRepository;
    }

    public Lotacao cadastrarLotacao(LotacaoDto lotacaoDto){
        Lotacao lotacao = new Lotacao(lotacaoDto.getNome(), lotacaoDto.getDataCadastro());
        return lotacaoRepository.save(lotacao);
    }
    public Lotacao buscarNome(String nome) {
        return lotacaoRepository.findByNome(nome);
    }
}
