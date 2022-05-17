package br.com.ambiente.testejava.service;

import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.repositories.ServidorRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class ServidorService {

    private ServidorRepository servidorRepository;
    private final ModelMapper modelMapper;
    public Servidor cadastro(ServidorDto servidorDto){
        Servidor servidor = modelMapper.map(servidorDto, Servidor.class);
        return servidorRepository.save(servidor);
    }

    public Servidor buscarMatricula(String matricula){
        return servidorRepository.findByMatricula(matricula);
    }
}
