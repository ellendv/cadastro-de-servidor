package br.com.ambiente.testejava.service;

import br.com.ambiente.testejava.model.Lotacao;
import br.com.ambiente.testejava.model.dto.LotacaoDto;
import br.com.ambiente.testejava.repositories.LotacaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LotacaoService {
    private final LotacaoRepository lotacaoRepository;
    private final ModelMapper modelMapper;

    public LotacaoService(LotacaoRepository lotacaoRepository, ModelMapper modelMapper) {
        this.lotacaoRepository = lotacaoRepository;
        this.modelMapper = modelMapper;
    }

    public Lotacao cadastrarLotacao(LotacaoDto lotacaoDto){
        Lotacao lotacao = modelMapper.map(lotacaoDto, Lotacao.class);
        return lotacaoRepository.save(lotacao);
    }
    public Lotacao buscarNome(String nome) {
        return lotacaoRepository.findByNome(nome);
    }
}
