package br.com.ambiente.testejava.controller;

import br.com.ambiente.testejava.model.Servidor;
import br.com.ambiente.testejava.model.dto.ServidorDto;
import br.com.ambiente.testejava.service.ServidorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/servidor")
@AllArgsConstructor
public class ServidorContoller {

    private ServidorService servidorService;

    @PostMapping("/cadastro")
    public ResponseEntity cadastro(@Valid @RequestBody ServidorDto servidorDto){
        Servidor servidor = servidorService.cadastro(servidorDto);
        return ResponseEntity.status(CREATED).body(servidor);
    }
}
