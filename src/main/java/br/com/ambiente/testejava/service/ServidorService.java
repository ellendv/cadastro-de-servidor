package br.com.ambiente.testejava.service;

import br.com.ambiente.testejava.model.Lotacao;
import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.LotacaoDto;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.repositories.LotacaoRepository;
import br.com.ambiente.testejava.repositories.ServidorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Service
public class ServidorService {

    private final ServidorRepository servidorRepository;
    private final LotacaoRepository lotacaoRepository;

    public ServidorService(ServidorRepository servidorRepository, LotacaoRepository lotacaoRepository) {
        this.servidorRepository = servidorRepository;
        this.lotacaoRepository = lotacaoRepository;
    }

    public Servidor cadastrarServidor(ServidorDto servidorDto){
        Lotacao lotacao = lotacaoRepository.findById(servidorDto.getId()).orElseThrow(()-> new RuntimeException("lotacão não encontrada"));
        Calendar c = Calendar.getInstance();
        final var servidor = new Servidor(servidorDto.getNome(), servidorDto.getMatricula(), c.getTime(), lotacao);
        return servidorRepository.save(servidor);
    }

    public Servidor buscarMatricula(String matricula){
        return servidorRepository.findByMatricula(matricula);

    }
}

