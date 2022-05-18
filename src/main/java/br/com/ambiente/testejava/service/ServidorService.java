package br.com.ambiente.testejava.service;

import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.repositories.ServidorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ServidorService {

    private final ServidorRepository servidorRepository;
    private final ModelMapper modelMapper;

    public ServidorService(ServidorRepository servidorRepository, ModelMapper modelMapper) {
        this.servidorRepository = servidorRepository;
        this.modelMapper = modelMapper;
    }

    public Servidor cadastrarServidor(ServidorDto servidorDto){
        final var servidor = new Servidor(
                servidorDto.getNome(),
                servidorDto.getMatricula(),
                servidorDto.getDataCadastro()
        );
        return servidorRepository.save(servidor);

    }

    public Servidor buscarMatricula(String matricula){
        return servidorRepository.findByMatricula(matricula);

    }
}

