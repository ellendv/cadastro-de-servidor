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

    public Servidor cadastrarServidor(ServidorDto servidorDto) {
        Lotacao lotacao = lotacaoRepository.findById(servidorDto.getLotacaoId()).orElseThrow(() -> new RuntimeException("lotacão não encontrada"));
        final var servidor = new Servidor(servidorDto.getNome(), servidorDto.getMatricula(), lotacao);
        return servidorRepository.save(servidor);
    }

    public Servidor buscarMatricula(String matricula) {
        return servidorRepository.findByMatricula(matricula);

    }

    public Servidor atualizarServidor(Long id, ServidorDto servidorDto) {
        Servidor servidor = servidorRepository.findById(id).orElseThrow(() -> new RuntimeException("Servidor não encontrado"));
            Lotacao lotacao = lotacaoRepository.findById(servidorDto.getLotacaoId()).orElseThrow(() -> new RuntimeException("lotacão não encontrada"));
            servidor.setNome(servidorDto.getNome());
            servidor.setMatricula(servidor.getMatricula());
            servidor.setLotacao(lotacao);
            return servidorRepository.save(servidor);
    }
}

