package br.com.ambiente.testejava.service;

import br.com.ambiente.testejava.model.Lotacao;
import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.repositories.LotacaoRepository;
import br.com.ambiente.testejava.repositories.ServidorRepository;
import org.springframework.stereotype.Service;

@Service
public class ServidorService {

    private final ServidorRepository servidorRepository;
    private final LotacaoRepository lotacaoRepository;

    public ServidorService(ServidorRepository servidorRepository, LotacaoRepository lotacaoRepository) {
        this.servidorRepository = servidorRepository;
        this.lotacaoRepository = lotacaoRepository;
    }

    public Servidor cadastrarServidor(ServidorDto servidorDto){
        Lotacao lotacao = new Lotacao();
        lotacaoRepository.findById(servidorDto.getId()).orElseThrow(()-> new RuntimeException("lotacão não encontrada"));
        final var servidor = new Servidor(
                servidorDto.getNome(),
                servidorDto.getMatricula(),
                servidorDto.getDataCadastro(),
                servidorDto.getLotacaoId()
        );
        return servidorRepository.save(servidor);

    }

    public Servidor buscarMatricula(String matricula){
        return servidorRepository.findByMatricula(matricula);

    }
}

