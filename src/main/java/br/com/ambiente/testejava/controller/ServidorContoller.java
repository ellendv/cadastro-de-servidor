package br.com.ambiente.testejava.controller;

import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.service.ServidorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/servidor")
public class ServidorContoller {

    private final ServidorService servidorService;

    public ServidorContoller(ServidorService servidorService) {
        this.servidorService = servidorService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Servidor> cadastro(@RequestBody @Valid ServidorDto servidorDto) {
        Servidor servidor = servidorService.cadastrarServidor(servidorDto);
        return ResponseEntity.status(CREATED).body(servidor);
    }

    @GetMapping("/{matricula}")
    public Servidor buscarPorMatricula(@PathVariable("matricula") String matricula) {
        return servidorService.buscarMatricula(matricula);

    }
}

