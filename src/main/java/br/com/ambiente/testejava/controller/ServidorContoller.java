package br.com.ambiente.testejava.controller;

import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.service.ServidorService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/servidor")
public class ServidorContoller {

    private final ServidorService servidorService;

    public ServidorContoller(ServidorService servidorService) {
        this.servidorService = servidorService;
    }

    @PostMapping
    public Servidor cadastro(@RequestBody @Valid ServidorDto servidorDto) {
        return servidorService.cadastrarServidor(servidorDto);
    }

    @GetMapping("/{matricula}")
    public Servidor buscarPorMatricula(@PathVariable("matricula") String matricula) {
        return servidorService.buscarMatricula(matricula);

    }

    @PutMapping("{id}")
    public Servidor atualizar(@PathVariable("id") Long id, @RequestBody @Valid ServidorDto servidorDto) {
        return servidorService.atualizarServidor(id, servidorDto);
    }
}

