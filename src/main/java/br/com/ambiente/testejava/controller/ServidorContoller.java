package br.com.ambiente.testejava.controller;

import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.service.ServidorService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/servidor")
@RequiredArgsConstructor
public class ServidorContoller {

    private ServidorService servidorService;

    @PostMapping("/cadastro")
    public ResponseEntity<Servidor> cadastro(@Valid @RequestBody ServidorDto servidorDto) {
        Servidor servidor = servidorService.cadastrarServidor(servidorDto);
        return ResponseEntity.status(CREATED).body(servidor);
    }

    @GetMapping("/{matricula}")
    public Servidor buscarPorMatricula(@PathVariable("matricula") String matricula) {
        try {
            return servidorService.buscarMatricula(matricula);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "mátricula invalida");
        }
    }

}

